package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketLineStatus   {
  @JsonProperty("accessLineStatus")
  private String accessLineStatus = null;

  @JsonProperty("gnpStatus")
  private String gnpStatus = null;

  @JsonProperty("lineOption")
  private String lineOption = null;

  @JsonProperty("lineType")
  private String lineType = null;

  @JsonProperty("narrowBandServicesAvailable")
  private String narrowBandServicesAvailable = null;

  @JsonProperty("standbyPowerRequired")
  private Boolean standbyPowerRequired = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("technology")
  private String technology = null;

  @JsonProperty("tempStructure")
  private Boolean tempStructure = null;

  public BasketLineStatus accessLineStatus(String accessLineStatus) {
    this.accessLineStatus = accessLineStatus;
    return this;
  }

  /**
   * Get accessLineStatus
   * @return accessLineStatus
  **/
  @ApiModelProperty(value = "")


  public String getAccessLineStatus() {
    return accessLineStatus;
  }

  public void setAccessLineStatus(String accessLineStatus) {
    this.accessLineStatus = accessLineStatus;
  }

  public BasketLineStatus gnpStatus(String gnpStatus) {
    this.gnpStatus = gnpStatus;
    return this;
  }

  /**
   * Get gnpStatus
   * @return gnpStatus
  **/
  @ApiModelProperty(value = "")


  public String getGnpStatus() {
    return gnpStatus;
  }

  public void setGnpStatus(String gnpStatus) {
    this.gnpStatus = gnpStatus;
  }

  public BasketLineStatus lineOption(String lineOption) {
    this.lineOption = lineOption;
    return this;
  }

  /**
   * Get lineOption
   * @return lineOption
  **/
  @ApiModelProperty(value = "")


  public String getLineOption() {
    return lineOption;
  }

  public void setLineOption(String lineOption) {
    this.lineOption = lineOption;
  }

  public BasketLineStatus lineType(String lineType) {
    this.lineType = lineType;
    return this;
  }

  /**
   * Get lineType
   * @return lineType
  **/
  @ApiModelProperty(value = "")


  public String getLineType() {
    return lineType;
  }

  public void setLineType(String lineType) {
    this.lineType = lineType;
  }

  public BasketLineStatus narrowBandServicesAvailable(String narrowBandServicesAvailable) {
    this.narrowBandServicesAvailable = narrowBandServicesAvailable;
    return this;
  }

  /**
   * Get narrowBandServicesAvailable
   * @return narrowBandServicesAvailable
  **/
  @ApiModelProperty(value = "")


  public String getNarrowBandServicesAvailable() {
    return narrowBandServicesAvailable;
  }

  public void setNarrowBandServicesAvailable(String narrowBandServicesAvailable) {
    this.narrowBandServicesAvailable = narrowBandServicesAvailable;
  }

  public BasketLineStatus standbyPowerRequired(Boolean standbyPowerRequired) {
    this.standbyPowerRequired = standbyPowerRequired;
    return this;
  }

  /**
   * Get standbyPowerRequired
   * @return standbyPowerRequired
  **/
  @ApiModelProperty(value = "")


  public Boolean isStandbyPowerRequired() {
    return standbyPowerRequired;
  }

  public void setStandbyPowerRequired(Boolean standbyPowerRequired) {
    this.standbyPowerRequired = standbyPowerRequired;
  }

  public BasketLineStatus statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public BasketLineStatus technology(String technology) {
    this.technology = technology;
    return this;
  }

  /**
   * Get technology
   * @return technology
  **/
  @ApiModelProperty(value = "")


  public String getTechnology() {
    return technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }

  public BasketLineStatus tempStructure(Boolean tempStructure) {
    this.tempStructure = tempStructure;
    return this;
  }

  /**
   * Get tempStructure
   * @return tempStructure
  **/
  @ApiModelProperty(value = "")


  public Boolean isTempStructure() {
    return tempStructure;
  }

  public void setTempStructure(Boolean tempStructure) {
    this.tempStructure = tempStructure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketLineStatus lineStatus = (BasketLineStatus) o;
    return Objects.equals(this.accessLineStatus, lineStatus.accessLineStatus) &&
        Objects.equals(this.gnpStatus, lineStatus.gnpStatus) &&
        Objects.equals(this.lineOption, lineStatus.lineOption) &&
        Objects.equals(this.lineType, lineStatus.lineType) &&
        Objects.equals(this.narrowBandServicesAvailable, lineStatus.narrowBandServicesAvailable) &&
        Objects.equals(this.standbyPowerRequired, lineStatus.standbyPowerRequired) &&
        Objects.equals(this.statusCode, lineStatus.statusCode) &&
        Objects.equals(this.technology, lineStatus.technology) &&
        Objects.equals(this.tempStructure, lineStatus.tempStructure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLineStatus, gnpStatus, lineOption, lineType, narrowBandServicesAvailable, standbyPowerRequired, statusCode, technology, tempStructure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineStatus {\n");
    
    sb.append("    accessLineStatus: ").append(toIndentedString(accessLineStatus)).append("\n");
    sb.append("    gnpStatus: ").append(toIndentedString(gnpStatus)).append("\n");
    sb.append("    lineOption: ").append(toIndentedString(lineOption)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    narrowBandServicesAvailable: ").append(toIndentedString(narrowBandServicesAvailable)).append("\n");
    sb.append("    standbyPowerRequired: ").append(toIndentedString(standbyPowerRequired)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    tempStructure: ").append(toIndentedString(tempStructure)).append("\n");
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

