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

/*
 * I_Directory_Administration
 * REST Schnittstelle zur Pflege der Verzeichniseinträge. Über diese Schnittstelle können Verzeichniseinträge inklusive Zertifikaten erzeugt, aktualisiert und gelöscht werden. Die Administration von Fachdaten erfolgt über Schnittstelle I_Directory_Application_Maintenance und wird durch die Fachanwendungen durchgeführt. Lesender Zugriff auf die Fachdaten ist mit Operation getDirectoryEntries in vorliegender Schnittstelle möglich.
 *
 * The version of the OpenAPI document: 1.1.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.gematik.ti.epa.vzd.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.gematik.ti.epa.vzd.client.model.BaseDirectoryEntry;
import de.gematik.ti.epa.vzd.client.model.Fachdaten;
import de.gematik.ti.epa.vzd.client.model.UserCertificate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DirectoryEntry
 */

public class DirectoryEntry {

    public static final String SERIALIZED_NAME_DIRECTORY_ENTRY_BASE = "DirectoryEntryBase";
    @SerializedName(SERIALIZED_NAME_DIRECTORY_ENTRY_BASE)
    private BaseDirectoryEntry directoryEntryBase;

    public static final String SERIALIZED_NAME_USER_CERTIFICATES = "userCertificates";
    @SerializedName(SERIALIZED_NAME_USER_CERTIFICATES)
    private List<UserCertificate> userCertificates = null;

    public static final String SERIALIZED_NAME_FACHDATEN = "Fachdaten";
    @SerializedName(SERIALIZED_NAME_FACHDATEN)
    private List<Fachdaten> fachdaten = null;


    public DirectoryEntry directoryEntryBase(BaseDirectoryEntry directoryEntryBase) {

        this.directoryEntryBase = directoryEntryBase;
        return this;
    }

    /**
     * Get directoryEntryBase
     *
     * @return directoryEntryBase
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public BaseDirectoryEntry getDirectoryEntryBase() {
        return directoryEntryBase;
    }


    public void setDirectoryEntryBase(BaseDirectoryEntry directoryEntryBase) {
        this.directoryEntryBase = directoryEntryBase;
    }


    public DirectoryEntry userCertificates(List<UserCertificate> userCertificates) {

        this.userCertificates = userCertificates;
        return this;
    }

    public DirectoryEntry addUserCertificatesItem(UserCertificate userCertificatesItem) {
        if (this.userCertificates == null) {
            this.userCertificates = new ArrayList<>();
        }
        this.userCertificates.add(userCertificatesItem);
        return this;
    }

    /**
     * Get userCertificates
     *
     * @return userCertificates
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<UserCertificate> getUserCertificates() {
        return userCertificates;
    }


    public void setUserCertificates(List<UserCertificate> userCertificates) {
        this.userCertificates = userCertificates;
    }


    public DirectoryEntry fachdaten(List<Fachdaten> fachdaten) {

        this.fachdaten = fachdaten;
        return this;
    }

    public DirectoryEntry addFachdatenItem(Fachdaten fachdatenItem) {
        if (this.fachdaten == null) {
            this.fachdaten = new ArrayList<>();
        }
        this.fachdaten.add(fachdatenItem);
        return this;
    }

    /**
     * Get fachdaten
     *
     * @return fachdaten
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<Fachdaten> getFachdaten() {
        return fachdaten;
    }


    public void setFachdaten(List<Fachdaten> fachdaten) {
        this.fachdaten = fachdaten;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DirectoryEntry directoryEntry = (DirectoryEntry) o;
        return Objects.equals(this.directoryEntryBase, directoryEntry.directoryEntryBase) &&
            Objects.equals(this.userCertificates, directoryEntry.userCertificates) &&
            Objects.equals(this.fachdaten, directoryEntry.fachdaten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directoryEntryBase, userCertificates, fachdaten);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectoryEntry {\n");
        sb.append("    directoryEntryBase: ").append(toIndentedString(directoryEntryBase)).append("\n");
        sb.append("    userCertificates: ").append(toIndentedString(userCertificates)).append("\n");
        sb.append("    fachdaten: ").append(toIndentedString(fachdaten)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

