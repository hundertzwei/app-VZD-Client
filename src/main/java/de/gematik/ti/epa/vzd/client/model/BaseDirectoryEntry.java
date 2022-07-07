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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BaseDirectoryEntry
 */

public class BaseDirectoryEntry {

  public static final String SERIALIZED_NAME_DN = "dn";
  @SerializedName(SERIALIZED_NAME_DN)
  private DistinguishedName dn;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "givenName";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_SN = "sn";
  @SerializedName(SERIALIZED_NAME_SN)
  private String sn;

  public static final String SERIALIZED_NAME_CN = "cn";
  @SerializedName(SERIALIZED_NAME_CN)
  private String cn;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "streetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_LOCALITY_NAME = "localityName";
  @SerializedName(SERIALIZED_NAME_LOCALITY_NAME)
  private String localityName;

  public static final String SERIALIZED_NAME_STATE_OR_PROVINCE_NAME = "stateOrProvinceName";
  @SerializedName(SERIALIZED_NAME_STATE_OR_PROVINCE_NAME)
  private String stateOrProvinceName;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_OTHER_NAME = "otherName";
  @SerializedName(SERIALIZED_NAME_OTHER_NAME)
  private String otherName;

  public static final String SERIALIZED_NAME_TELEMATIK_I_D = "telematikID";
  @SerializedName(SERIALIZED_NAME_TELEMATIK_I_D)
  private String telematikID;

  public static final String SERIALIZED_NAME_SPECIALIZATION = "specialization";
  @SerializedName(SERIALIZED_NAME_SPECIALIZATION)
  private List<String> specialization = null;

  public static final String SERIALIZED_NAME_DOMAIN_I_D = "domainID";
  @SerializedName(SERIALIZED_NAME_DOMAIN_I_D)
  private List<String> domainID = null;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private List<String> holder = null;

  public static final String SERIALIZED_NAME_MAX_K_O_M_L_EADR = "maxKOMLEadr";
  @SerializedName(SERIALIZED_NAME_MAX_K_O_M_L_EADR)
  private String maxKOMLEadr;

  public static final String SERIALIZED_NAME_PERSONAL_ENTRY = "personalEntry";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ENTRY)
  private Boolean personalEntry;

  public static final String SERIALIZED_NAME_DATA_FROM_AUTHORITY = "dataFromAuthority";
  @SerializedName(SERIALIZED_NAME_DATA_FROM_AUTHORITY)
  private Boolean dataFromAuthority;

  public static final String SERIALIZED_NAME_CHANGE_DATE_TIME = "changeDateTime";
  @SerializedName(SERIALIZED_NAME_CHANGE_DATE_TIME)
  private String changeDateTime;

  public static final String SERIALIZED_NAME_PROFESSION_O_I_D = "professionOID";
  @SerializedName(SERIALIZED_NAME_PROFESSION_O_I_D)
  private List<String> professionOID = null;

  public static final String SERIALIZED_NAME_ENTRY_TYPE = "entryType";
  @SerializedName(SERIALIZED_NAME_ENTRY_TYPE)
  private List<String> entryType = null;


  public BaseDirectoryEntry dn(DistinguishedName dn) {

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
   * HBA: Vorname, obligatorisch, wird aus dem Zertifikat übernommen / SMC-B: nicht verwendet
   *
   * @return givenName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vorname", value = "HBA: Vorname, obligatorisch, wird aus dem Zertifikat übernommen / SMC-B: nicht verwendet")

  public String getGivenName() {
    return givenName;
  }


  /**
   * HBA: Name, obligatorisch, wird aus dem Zertifikat übernommen / SMC-B: nicht verwendet
   *
   * @return sn
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nachname", value = "HBA: Name, obligatorisch, wird aus dem Zertifikat übernommen / SMC-B: nicht verwendet")

  public String getSn() {
    return sn;
  }


  /**
   * HBA: Vorname und Nachname / SMC-B: Bezeichner: Name Wird vom VZD aus dem Zertifikatsattribut
   * commonName übernommen.
   *
   * @return cn
   **/
  @ApiModelProperty(example = "Vorname Nachname", required = true, value = "HBA: Vorname und Nachname / SMC-B: Bezeichner: Name Wird vom VZD aus dem Zertifikatsattribut commonName übernommen.")

  public String getCn() {
    return cn;
  }


  public BaseDirectoryEntry displayName(String displayName) {

    this.displayName = displayName;
    return this;
  }

  /**
   * Anzeigename, kann geändert werden. Dieses Attribut wird genutzt um den Namen der Organisation
   * gegenüber dem Anwender darzustellen (Verwendung als Filter-Attribut um die Suche einzuschränken
   * und bei der Darstellung des Ergebnisses). Der Wert wird von der pflegenden Stelle festgelegt.
   * Konvention für HBA Einträge: Name, Vorname
   *
   * @return displayName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Name, Vorname", value = "Anzeigename, kann geändert werden. Dieses Attribut wird genutzt um den Namen der Organisation gegenüber dem Anwender darzustellen (Verwendung als Filter-Attribut um die Suche einzuschränken und bei der Darstellung des Ergebnisses). Der Wert wird von der pflegenden Stelle festgelegt. Konvention für HBA Einträge: Name, Vorname")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public BaseDirectoryEntry streetAddress(String streetAddress) {

    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Straße und Hausnummer Der Wert wird von der pflegenden Stelle festgelegt
   *
   * @return streetAddress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Friedrichstraße 136", value = "Straße und Hausnummer Der Wert wird von der pflegenden Stelle festgelegt")

  public String getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public BaseDirectoryEntry postalCode(String postalCode) {

    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postleitzahl Der Wert wird von der pflegenden Stelle festgelegt
   *
   * @return postalCode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10117", value = "Postleitzahl Der Wert wird von der pflegenden Stelle festgelegt")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public BaseDirectoryEntry countryCode(String countryCode) {

    this.countryCode = countryCode;
    return this;
  }

  /**
   * Ländercode Entsprechend ISO-3166-1 ALPHA-2
   *
   * @return countryCode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DE", value = "Ländercode Entsprechend ISO-3166-1 ALPHA-2")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public BaseDirectoryEntry localityName(String localityName) {

    this.localityName = localityName;
    return this;
  }

  /**
   * Ort Der Wert wird von der pflegenden Stelle festgelegt
   *
   * @return localityName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Berlin", value = "Ort Der Wert wird von der pflegenden Stelle festgelegt")

  public String getLocalityName() {
    return localityName;
  }


  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }


  public BaseDirectoryEntry stateOrProvinceName(String stateOrProvinceName) {

    this.stateOrProvinceName = stateOrProvinceName;
    return this;
  }

  /**
   * Bundesland Der Wert wird von der pflegenden Stelle festgelegt
   *
   * @return stateOrProvinceName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Berlin", value = "Bundesland Der Wert wird von der pflegenden Stelle festgelegt")

  public String getStateOrProvinceName() {
    return stateOrProvinceName;
  }


  public void setStateOrProvinceName(String stateOrProvinceName) {
    this.stateOrProvinceName = stateOrProvinceName;
  }


  public BaseDirectoryEntry title(String title) {

    this.title = title;
    return this;
  }

  /**
   * HBA: Titel, optional / SMC-B: nicht verwendet
   *
   * @return title
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HBA: Titel, optional / SMC-B: nicht verwendet")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public BaseDirectoryEntry organization(String organization) {

    this.organization = organization;
    return this;
  }

  /**
   * Organisation Der Wert wird von der pflegenden Stelle festgelegt
   *
   * @return organization
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345670", value = "Organisation Der Wert wird von der pflegenden Stelle festgelegt")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public BaseDirectoryEntry otherName(String otherName) {

    this.otherName = otherName;
    return this;
  }

  /**
   * Anderer Name. Wird vom VZD aus dem Zertifikatsattribut otherName übernommen.
   *
   * @return otherName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anderer Name. Wird vom VZD aus dem Zertifikatsattribut otherName übernommen.")

  public String getOtherName() {
    return otherName;
  }


  public void setOtherName(String otherName) {
    this.otherName = otherName;
  }


  public BaseDirectoryEntry telematikID(String telematikID) {

    this.telematikID = telematikID;
    return this;
  }

  /**
   * Wird beim Anlegen des Eintrags vom VZD aus dem Zertifikat übernommen (Feld registrationNumber
   * der Extension Admission). Falls der Basiseintrag (baseDirectoryEntry) ohne Zertifikat angelegt
   * wird, kann in Operation add_Directory_Entry die telematikID angegeben werden. Damit ist der
   * Verzeichniseintrag bereits über die telematikID im baseDirectoryEntry auffindbar. Diese
   * telematikID muss mit der telematikID aus dem Zertifikatseintrag (userCertificate)
   * übereinstimmen. Simmten die telematikIDs nicht überein, wird die Operation mit Fehlercode 422
   * abgelehnt
   *
   * @return telematikID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wird beim Anlegen des Eintrags vom VZD aus dem Zertifikat übernommen (Feld registrationNumber der Extension Admission). Falls der Basiseintrag (baseDirectoryEntry) ohne Zertifikat angelegt wird, kann in Operation add_Directory_Entry die telematikID angegeben werden. Damit ist der Verzeichniseintrag bereits über die telematikID im baseDirectoryEntry auffindbar. Diese telematikID muss mit der telematikID aus dem Zertifikatseintrag (userCertificate) übereinstimmen. Simmten die telematikIDs nicht überein, wird die Operation mit Fehlercode 422 abgelehnt")

  public String getTelematikID() {
    return telematikID;
  }


  public void setTelematikID(String telematikID) {
    this.telematikID = telematikID;
  }


  public BaseDirectoryEntry specialization(List<String> specialization) {

    this.specialization = specialization;
    return this;
  }

  public BaseDirectoryEntry addSpecializationItem(String specializationItem) {
    if (this.specialization == null) {
      this.specialization = new ArrayList<>();
    }
    this.specialization.add(specializationItem);
    return this;
  }

  /**
   * Fachgebiet Der Wert wird von der pflegenden Stelle festgelegt
   *
   * @return specialization
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fachgebiet Der Wert wird von der pflegenden Stelle festgelegt")

  public List<String> getSpecialization() {
    return specialization;
  }


  public void setSpecialization(List<String> specialization) {
    this.specialization = specialization;
  }


  public BaseDirectoryEntry domainID(List<String> domainID) {

    this.domainID = domainID;
    return this;
  }

  public BaseDirectoryEntry addDomainIDItem(String domainIDItem) {
    if (this.domainID == null) {
      this.domainID = new ArrayList<>();
    }
    this.domainID.add(domainIDItem);
    return this;
  }

  /**
   * Ärzte-&gt; Betriebsstättennummer Der Wert wird aus dem Zertifikat übernommen (Attribut
   * organizationName)
   *
   * @return domainID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ärzte-> Betriebsstättennummer Der Wert wird aus dem Zertifikat übernommen (Attribut organizationName)")

  public List<String> getDomainID() {
    return domainID;
  }


  public void setDomainID(List<String> domainID) {
    this.domainID = domainID;
  }


  public BaseDirectoryEntry holder(List<String> holder) {

    this.holder = holder;
    return this;
  }

  public BaseDirectoryEntry addHolderItem(String holderItem) {
    if (this.holder == null) {
      this.holder = new ArrayList<>();
    }
    this.holder.add(holderItem);
    return this;
  }

  /**
   * Identifiziert den Eigentümer dieses Verzeichniseintrags, der Änderungen an ihm vornehmen darf.
   * Hat keinen Einfluss auf Fachdaten und Zertifikatsdaten. Beim Anlegen eines neuen
   * Verzeichniseintrags (add_Directory_Entry) - Ist im add_Directory_Entry Request das Attribut
   * \&quot;holder\&quot; nicht vorhanden oder enthält keine Werte o Wird vom VZD aus dem ID_TOKEN
   * claim scope der Wert entnommen und als \&quot;holder\&quot; in dieses Attribut eingetragen. -
   * Ist im add_Directory_Entry Request das Attribut \&quot;holder\&quot; vorhanden und mit Inhalten
   * gefüllt o Übernimmt der VZD die Werte aus dem Request und trägt sie - nach Prüfung ihrer
   * Gültigkeit - in den Verzeuichniseintrag ein. Ist ein Wert aus dem Request nicht gültig, weist
   * der VZD die Operation mit HTTP-Status-Code 422 ab. Beim Ändern eines neuen Verzeichniseintrags
   * (modify_Directory_Entry) - Ist im modify_Directory_Entry Request das Attribut
   * \&quot;holder\&quot; nicht vorhanden oder enthält keine Werte o Die Werte im aktuellen
   * \&quot;holder\&quot; Attribut des Verzeichniseintrags bleiben erhalten. - Ist im
   * add_Directory_Entry Request das Attribut \&quot;holder\&quot; vorhanden und mit Inhalten
   * gefüllt o Übernimmt der VZD die Werte aus dem Request und trägt sie - nach Prüfung ihrer
   * Gültigkeit - in den Verzeuichniseintrag ein. Ist ein Wert aus dem Request nicht gültig, weist
   * der VZD die Operation mit HTTP-Status-Code 422 ab.
   *
   * @return holder
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifiziert den Eigentümer dieses Verzeichniseintrags, der Änderungen an ihm vornehmen darf. Hat keinen Einfluss auf Fachdaten und Zertifikatsdaten. Beim Anlegen eines neuen Verzeichniseintrags (add_Directory_Entry) - Ist im add_Directory_Entry Request das Attribut \"holder\" nicht vorhanden oder enthält keine Werte o Wird vom VZD aus dem ID_TOKEN claim scope der Wert entnommen und als \"holder\" in dieses Attribut eingetragen. - Ist im add_Directory_Entry Request das Attribut \"holder\" vorhanden und mit Inhalten gefüllt o Übernimmt der VZD die Werte aus dem Request und trägt sie - nach Prüfung ihrer Gültigkeit - in den Verzeuichniseintrag ein. Ist ein Wert aus dem Request nicht gültig, weist der VZD die Operation mit HTTP-Status-Code 422 ab. Beim Ändern eines neuen Verzeichniseintrags (modify_Directory_Entry) - Ist im modify_Directory_Entry Request das Attribut \"holder\" nicht vorhanden oder enthält keine Werte o Die Werte im aktuellen \"holder\" Attribut des Verzeichniseintrags bleiben erhalten. - Ist im add_Directory_Entry Request das Attribut \"holder\" vorhanden und mit Inhalten gefüllt o Übernimmt der VZD die Werte aus dem Request und trägt sie - nach Prüfung ihrer Gültigkeit - in den Verzeuichniseintrag ein. Ist ein Wert aus dem Request nicht gültig, weist der VZD die Operation mit HTTP-Status-Code 422 ab.")

  public List<String> getHolder() {
    return holder;
  }


  public void setHolder(List<String> holder) {
    this.holder = holder;
  }


  public BaseDirectoryEntry maxKOMLEadr(String maxKOMLEadr) {

    this.maxKOMLEadr = maxKOMLEadr;
    return this;
  }

  /**
   * Maximale Anzahl von mail Adressen in den KOM-LE Fachdaten. Falls kein Wert eingetragen wurde,
   * können beliebig viele mail Adressen in den KOM-LE Fachdaten eingetragen werden. Falls ein Wert
   * eingetragen wurde, können maximal so viele mail Adressen in den KOM-LE Fachdaten eingetragen
   * werden.
   *
   * @return maxKOMLEadr
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Maximale Anzahl von mail Adressen in den KOM-LE Fachdaten. Falls kein Wert eingetragen wurde, können beliebig viele mail Adressen in den KOM-LE Fachdaten eingetragen werden. Falls ein Wert eingetragen wurde, können maximal so viele mail Adressen in den KOM-LE Fachdaten eingetragen werden.")

  public String getMaxKOMLEadr() {
    return maxKOMLEadr;
  }


  public void setMaxKOMLEadr(String maxKOMLEadr) {
    this.maxKOMLEadr = maxKOMLEadr;
  }


  /**
   * Wird vom VZD eingetragen / Wert &#x3D;&#x3D; TRUE, wenn alle Zertifikate den entryType 1 haben
   * (Berufsgruppe), Wert &#x3D;&#x3D; FALSE sonst
   *
   * @return personalEntry
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Wird vom VZD eingetragen / Wert == TRUE, wenn alle Zertifikate den entryType 1 haben (Berufsgruppe), Wert == FALSE sonst")

  public Boolean getPersonalEntry() {
    return personalEntry;
  }

  public void setEntryType(List<String> entryType) {
    this.entryType = entryType;
  }


  /**
   * Wird vom VZD eingetragen / Wert &#x3D;&#x3D; TRUE, wenn der Verzeichnisdienst_Eintrag von dem
   * Kartenherausgeber geschrieben wurde, Wert &#x3D;&#x3D; FALSE sonst
   *
   * @return dataFromAuthority
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Wird vom VZD eingetragen / Wert == TRUE, wenn der Verzeichnisdienst_Eintrag von dem Kartenherausgeber geschrieben wurde, Wert == FALSE sonst")

  public Boolean getDataFromAuthority() {
    return dataFromAuthority;
  }


  /**
   * Der VZD setzt dieses Attribut bei jeder Schreiboperation für den Datensatz (Basisdaten) auf die
   * aktuelle Zeit. Format entsprechend RFC 3339, section 5.6.
   *
   * @return changeDateTime
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Der VZD setzt dieses Attribut bei jeder Schreiboperation für den Datensatz (Basisdaten) auf die aktuelle Zeit. Format entsprechend RFC 3339, section 5.6.")

  public String getChangeDateTime() {
    return changeDateTime;
  }


  /**
   * Get professionOID
   *
   * @return professionOID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProfessionOID() {
    return professionOID;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  /**
   * Get entryType
   *
   * @return entryType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEntryType() {
    return entryType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseDirectoryEntry baseDirectoryEntry = (BaseDirectoryEntry) o;
    return Objects.equals(this.dn, baseDirectoryEntry.dn) &&
        Objects.equals(this.givenName, baseDirectoryEntry.givenName) &&
        Objects.equals(this.sn, baseDirectoryEntry.sn) &&
        Objects.equals(this.cn, baseDirectoryEntry.cn) &&
        Objects.equals(this.displayName, baseDirectoryEntry.displayName) &&
        Objects.equals(this.streetAddress, baseDirectoryEntry.streetAddress) &&
        Objects.equals(this.postalCode, baseDirectoryEntry.postalCode) &&
        Objects.equals(this.countryCode, baseDirectoryEntry.countryCode) &&
        Objects.equals(this.localityName, baseDirectoryEntry.localityName) &&
        Objects.equals(this.stateOrProvinceName, baseDirectoryEntry.stateOrProvinceName) &&
        Objects.equals(this.title, baseDirectoryEntry.title) &&
        Objects.equals(this.organization, baseDirectoryEntry.organization) &&
        Objects.equals(this.otherName, baseDirectoryEntry.otherName) &&
        Objects.equals(this.telematikID, baseDirectoryEntry.telematikID) &&
        Objects.equals(this.specialization, baseDirectoryEntry.specialization) &&
        Objects.equals(this.domainID, baseDirectoryEntry.domainID) &&
        Objects.equals(this.holder, baseDirectoryEntry.holder) &&
        Objects.equals(this.maxKOMLEadr, baseDirectoryEntry.maxKOMLEadr) &&
        Objects.equals(this.personalEntry, baseDirectoryEntry.personalEntry) &&
        Objects.equals(this.dataFromAuthority, baseDirectoryEntry.dataFromAuthority) &&
        Objects.equals(this.changeDateTime, baseDirectoryEntry.changeDateTime) &&
        Objects.equals(this.professionOID, baseDirectoryEntry.professionOID) &&
        Objects.equals(this.entryType, baseDirectoryEntry.entryType);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(dn, givenName, sn, cn, displayName, streetAddress, postalCode, countryCode,
            localityName, stateOrProvinceName, title, organization,
            otherName, telematikID, specialization, domainID, holder, maxKOMLEadr, personalEntry,
            dataFromAuthority, changeDateTime,
            professionOID, entryType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseDirectoryEntry {\n");
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
    sb.append("    cn: ").append(toIndentedString(cn)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
    sb.append("    stateOrProvinceName: ").append(toIndentedString(stateOrProvinceName))
        .append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    telematikID: ").append(toIndentedString(telematikID)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
    sb.append("    domainID: ").append(toIndentedString(domainID)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    maxKOMLEadr: ").append(toIndentedString(maxKOMLEadr)).append("\n");
    sb.append("    personalEntry: ").append(toIndentedString(personalEntry)).append("\n");
    sb.append("    dataFromAuthority: ").append(toIndentedString(dataFromAuthority)).append("\n");
    sb.append("    changeDateTime: ").append(toIndentedString(changeDateTime)).append("\n");
    sb.append("    professionOID: ").append(toIndentedString(professionOID)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first
   * line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
