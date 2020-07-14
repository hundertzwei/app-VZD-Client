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
import de.gematik.ti.epa.vzd.client.model.DistinguishedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FAD1
 */

public class FAD1 {

    public static final String SERIALIZED_NAME_DN = "dn";
    @SerializedName(SERIALIZED_NAME_DN)
    private DistinguishedName dn;

    public static final String SERIALIZED_NAME_MAIL = "mail";
    @SerializedName(SERIALIZED_NAME_MAIL)
    private List<String> mail = null;


    public FAD1 dn(DistinguishedName dn) {

        this.dn = dn;
        return this;
    }

    /**
     * Get dn
     *
     * @return dn
     **/
    @ApiModelProperty(required = true, value = "")

    public DistinguishedName getDn() {
        return dn;
    }


    public void setDn(DistinguishedName dn) {
        this.dn = dn;
    }


    /**
     * Get mail
     *
     * @return mail
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<String> getMail() {
        return mail;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FAD1 FAD1 = (FAD1) o;
        return Objects.equals(this.dn, FAD1.dn) &&
            Objects.equals(this.mail, FAD1.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dn, mail);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FAD1 {\n");
        sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
        sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
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

