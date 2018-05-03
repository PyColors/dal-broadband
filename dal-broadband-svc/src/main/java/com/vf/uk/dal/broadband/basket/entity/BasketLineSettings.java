package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketLineSettings   {
  @JsonProperty("installationCode")
  private String installationCode = null;

  @JsonProperty("serviceCode")
  private String serviceCode = null;

  @JsonProperty("terminationCode")
  private String terminationCode = null;

  public BasketLineSettings installationCode(String installationCode) {
    this.installationCode = installationCode;
    return this;
  }

  /**
   * Get installationCode
   * @return installationCode
  **/
  @ApiModelProperty(value = "")


  public String getInstallationCode() {
    return installationCode;
  }

  public void setInstallationCode(String installationCode) {
    this.installationCode = installationCode;
  }

  public BasketLineSettings serviceCode(String serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

  /**
   * Get serviceCode
   * @return serviceCode
  **/
  @ApiModelProperty(value = "")


  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public BasketLineSettings terminationCode(String terminationCode) {
    this.terminationCode = terminationCode;
    return this;
  }

  /**
   * Get terminationCode
   * @return terminationCode
  **/
  @ApiModelProperty(value = "")


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
    BasketLineSettings lineSettings = (BasketLineSettings) o;
    return Objects.equals(this.installationCode, lineSettings.installationCode) &&
        Objects.equals(this.serviceCode, lineSettings.serviceCode) &&
        Objects.equals(this.terminationCode, lineSettings.terminationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installationCode, serviceCode, terminationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineSettings {\n");
    
    sb.append("    installationCode: ").append(toIndentedString(installationCode)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
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

