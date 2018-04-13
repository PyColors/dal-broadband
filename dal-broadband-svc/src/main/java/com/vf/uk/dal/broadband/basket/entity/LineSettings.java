package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;


/**
 * LineSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-25T06:31:48.127Z")

public class LineSettings   {
  private String serviceCode = null;

  private String installationCode = null;

  private String terminationCode = null;

  public LineSettings serviceCode(String serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * The type of service this is. LOV - PSTN_SINGLE_LINE, PSTN_MULTI_LINE_AUX
   * @return serviceCode
  **/


  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public LineSettings installationCode(String installationCode) {
    this.installationCode = installationCode;
    return this;
  }

   /**
   * The type of installation. LOV - STANDARD, NSP, SITE, COMPLEX, COMPLEX_HOTSITE, COMPLEX_SHIP, COMPLEX_SITE, STANDARD_NEWHOUSE
   * @return installationCode
  **/


  public String getInstallationCode() {
    return installationCode;
  }

  public void setInstallationCode(String installationCode) {
    this.installationCode = installationCode;
  }

  public LineSettings terminationCode(String terminationCode) {
    this.terminationCode = terminationCode;
    return this;
  }

   /**
   * The type of termination technology the line terminates in LOV - NTTP, LINE_BOX, NTE, SECURE_NTE, TYPE_NINE
   * @return terminationCode
  **/


  public String getTerminationCode() {
    return terminationCode;
  }

  public void setTerminationCode(String terminationCode) {
    this.terminationCode = terminationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineSettings lineSettings = (LineSettings) o;
    return Objects.equals(this.serviceCode, lineSettings.serviceCode) &&
        Objects.equals(this.installationCode, lineSettings.installationCode) &&
        Objects.equals(this.terminationCode, lineSettings.terminationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCode, installationCode, terminationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineSettings {\n");
    
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    installationCode: ").append(toIndentedString(installationCode)).append("\n");
    sb.append("    terminationCode: ").append(toIndentedString(terminationCode)).append("\n");
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

