/*
 * Copyright (c) 2020 gematik GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.gematik.ti.epa.vzd.gemClient.command;

import de.gematik.ti.epa.vzd.gemClient.CommandNamesEnum;
import de.gematik.ti.epa.vzd.gemClient.command.commandExecutions.ExecutionBase;
import de.gematik.ti.epa.vzd.gemClient.command.commandExecutions.ExecutionCollection;
import de.gematik.ti.epa.vzd.gemClient.exceptions.CommandException;
import generated.CommandType;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class handles the execution process. It orders the commands to the specific executors where they belong and calls the
 */
public class ExecutionController {

    private Logger LOG = LoggerFactory.getLogger(ExecutionController.class);


    /**
     * Order the commands to the specific executions where they belong and than call the execution functions of the specific executors
     *
     * @param commandList
     */
    public void execute(List<CommandType> commandList) {
        Map<String, Boolean> report = new HashMap<>();
        loadCommands(commandList);
        LOG.debug("Execution -> Run executions");
        boolean correctExecution = true;
        for (ExecutionBase executor : ExecutionCollection.getInstance().getExecutors()) {
            String executorName = extractExecutorName(executor);
            if (!executor.executeCommands()) {
                correctExecution = false;
                report.put(executorName, false);
                LOG.error("Error while execute commands in " + executorName);
            } else {
                report.put(executorName, true);
                LOG.debug("All commands of " + executorName + " operated correctly");
            }
            if (!executor.postCheck()) {
                throw new CommandException("Command executed, but postcheck failed!");
            }
        }
        logReport(report, correctExecution);
        return;
    }

    /**
     * Gets the name of the specific executor for logging
     *
     * @param executor
     * @return
     */
    private String extractExecutorName(ExecutionBase executor) {
        String[] splitClass = executor.getClass().getName().split("\\.");
        return splitClass[splitClass.length - 1];
    }

    private void logReport(Map<String, Boolean> report, boolean correctExecution) {
        Iterator<String> keys = report.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            LOG.info(report.get(key) + " <-- All executions for " + key + " run correctly");
        }
        String path = System.getProperties().getProperty("l4j.logDir") == null ?
            System.getProperties().getProperty("java.io.tmpdir") + "logs"
            : System.getProperties().getProperty("l4j.logDir");
        LOG.info("Execution -> All executions done" + (correctExecution ? " correctly"
            : ". Some commands failed. Please look at the logfile at " + path));
    }

    private void loadCommands(List<CommandType> commandList) {
        LOG.debug("Execution -> Precheck started");
        boolean commandError = false;
        for (CommandType command : commandList) {
            boolean unknownCommand = true;
            for (ExecutionBase specificExecutor : ExecutionCollection.getInstance()
                .getExecutors()) {
                if (specificExecutor
                    .canHandleCommand(CommandNamesEnum.getEntry(command.getName()))) {
                    unknownCommand = false;
                    if (!specificExecutor.preCheck(command)) {
                        commandError = true;
                    }
                }
            }
            if (unknownCommand) {
                LOG.error("Unknown command " + command.getName() + "\n" + Transformer
                    .getBaseDirectoryEntryFromCommandType(command));
                commandError = true;
            }
        }
        if (commandError) {
            throw new CommandException("Commands not executed, preCheck failed!");
        }
        LOG.debug("Execution -> Precheck successful");
    }

    /**
     * If a command was identified with the wrong name, the name can be changed and reordered by this function. Only call this in pre-check phase!
     *
     * @param command with another name
     * @return
     */
    public boolean reorder(CommandType command) {
        for (ExecutionBase specificExecutor : ExecutionCollection.getInstance().getExecutors()) {
            if (specificExecutor.canHandleCommand(CommandNamesEnum.getEntry(command.getName()))) {
                return specificExecutor.preCheck(command);
            }
        }
        return false;
    }
}

