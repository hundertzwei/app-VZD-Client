/*
 * I_Directory_Administration
 * REST Schnittstelle zur Pflege der Verzeichniseinträge. Über diese Schnittstelle können Verzeichniseinträge inklusive Zertifikaten erzeugt, aktualisiert und gelöscht werden. Die Administration von Fachdaten erfolgt über Schnittstelle I_Directory_Application_Maintenance und wird durch die Fachanwendungen durchgeführt. Lesender Zugriff auf die Fachdaten ist mit Operation getDirectoryEntries in vorliegender Schnittstelle möglich.
 *
 * The version of the OpenAPI document: 1.6.3
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
 * Jeder Verzeichniseintrag muss mindestens ein Zertifikat enthalten.
 */
@ApiModel(description = "Jeder Verzeichniseintrag muss mindestens ein Zertifikat enthalten.")

public class UserCertificate {
  public static final String SERIALIZED_NAME_DN = "dn";
  @SerializedName(SERIALIZED_NAME_DN)
  private DistinguishedName dn;

  public static final String SERIALIZED_NAME_ENTRY_TYPE = "entryType";
  @SerializedName(SERIALIZED_NAME_ENTRY_TYPE)
  private String entryType;

  public static final String SERIALIZED_NAME_TELEMATIK_I_D = "telematikID";
  @SerializedName(SERIALIZED_NAME_TELEMATIK_I_D)
  private String telematikID;

  public static final String SERIALIZED_NAME_PROFESSION_O_I_D = "professionOID";
  @SerializedName(SERIALIZED_NAME_PROFESSION_O_I_D)
  private List<String> professionOID = null;

  /**
   * Gets or Sets usage
   */
  @JsonAdapter(UsageEnum.Adapter.class)
  public enum UsageEnum {
    KOM_LE("KOM-LE"),
    
    EPA("ePA");

    private String value;

    UsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UsageEnum fromValue(String value) {
      for (UsageEnum b : UsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UsageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private List<UsageEnum> usage = null;

  public static final String SERIALIZED_NAME_USER_CERTIFICATE = "userCertificate";
  @SerializedName(SERIALIZED_NAME_USER_CERTIFICATE)
  private String userCertificate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public UserCertificate dn(DistinguishedName dn) {
    
    this.dn = dn;
    return this;
  }

   /**
   * Get dn
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
   * Eintragstyp Wird vom VZD anhand der in dem Zertifikat enthaltenen OID (Extension Admission, Attribut ProfessionOID) und der Spalte Eintragstyp in Tab_VZD_Mapping_Eintragstyp_und_ProfessionOID automatisch eingetragen. Siehe auch [gemSpecOID]# Tab_PKI_402 und Tab_PKI_403
   * @return entryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Eintragstyp Wird vom VZD anhand der in dem Zertifikat enthaltenen OID (Extension Admission, Attribut ProfessionOID) und der Spalte Eintragstyp in Tab_VZD_Mapping_Eintragstyp_und_ProfessionOID automatisch eingetragen. Siehe auch [gemSpecOID]# Tab_PKI_402 und Tab_PKI_403")

  public String getEntryType() {
    return entryType;
  }




  public UserCertificate telematikID(String telematikID) {
    
    this.telematikID = telematikID;
    return this;
  }

   /**
   * Wird beim Anlegen des Eintrags vom VZD aus dem Zertifikat übernommen (Feld registrationNumber der Extension Admission). Falls der Basiseintrag (baseDirectoryEntry) ohne Zertifikat angelegt wird, kann in Operation add_Directory_Entry die telematikID angegeben werden. Damit ist der Verzeichniseintrag bereits über die telematikID auffindbar.
   * @return telematikID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wird beim Anlegen des Eintrags vom VZD aus dem Zertifikat übernommen (Feld registrationNumber der Extension Admission). Falls der Basiseintrag (baseDirectoryEntry) ohne Zertifikat angelegt wird, kann in Operation add_Directory_Entry die telematikID angegeben werden. Damit ist der Verzeichniseintrag bereits über die telematikID auffindbar.")

  public String getTelematikID() {
    return telematikID;
  }


  public void setTelematikID(String telematikID) {
    this.telematikID = telematikID;
  }


   /**
   * Get professionOID
   * @return professionOID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProfessionOID() {
    return professionOID;
  }




  public UserCertificate usage(List<UsageEnum> usage) {
    
    this.usage = usage;
    return this;
  }

  public UserCertificate addUsageItem(UsageEnum usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    return this;
  }

   /**
   * Nutzungskennzeichnung kann pro Zertifikat mehrfach vergeben werden. Vorgegebener Wertebereich [KOM-LE, ePA]. Obligatorisch für LEI und KTR mit vorgegebenem Wert usage&#x3D;ePA
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nutzungskennzeichnung kann pro Zertifikat mehrfach vergeben werden. Vorgegebener Wertebereich [KOM-LE, ePA]. Obligatorisch für LEI und KTR mit vorgegebenem Wert usage=ePA")

  public List<UsageEnum> getUsage() {
    return usage;
  }


  public void setUsage(List<UsageEnum> usage) {
    this.usage = usage;
  }


  public UserCertificate userCertificate(String userCertificate) {
    
    this.userCertificate = userCertificate;
    return this;
  }

   /**
   * Zertifikat im DER Format. Base64 kodiert. Die pflegende Stelle erhält das Zertifikat vom TSP oder falls das nicht möglich ist wird ein Ersatzverfahren abgestimmt.
   * @return userCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zertifikat im DER Format. Base64 kodiert. Die pflegende Stelle erhält das Zertifikat vom TSP oder falls das nicht möglich ist wird ein Ersatzverfahren abgestimmt.")

  public String getUserCertificate() {
    return userCertificate;
  }


  public void setUserCertificate(String userCertificate) {
    this.userCertificate = userCertificate;
  }


  public UserCertificate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Dieses Attribut ermöglicht das Zertifikat zu beschreiben, um die Administration des VZD Eintrags zu vereinfachen.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dieses Attribut ermöglicht das Zertifikat zu beschreiben, um die Administration des VZD Eintrags zu vereinfachen.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCertificate userCertificate = (UserCertificate) o;
    return Objects.equals(this.dn, userCertificate.dn) &&
        Objects.equals(this.entryType, userCertificate.entryType) &&
        Objects.equals(this.telematikID, userCertificate.telematikID) &&
        Objects.equals(this.professionOID, userCertificate.professionOID) &&
        Objects.equals(this.usage, userCertificate.usage) &&
        Objects.equals(this.userCertificate, userCertificate.userCertificate) &&
        Objects.equals(this.description, userCertificate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dn, entryType, telematikID, professionOID, usage, userCertificate, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCertificate {\n");
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    telematikID: ").append(toIndentedString(telematikID)).append("\n");
    sb.append("    professionOID: ").append(toIndentedString(professionOID)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    userCertificate: ").append(toIndentedString(userCertificate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

