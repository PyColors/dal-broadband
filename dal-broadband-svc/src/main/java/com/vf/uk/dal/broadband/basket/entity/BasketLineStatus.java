package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineStatus.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketLineStatus   {
  
  /** The access line status. */
  @JsonProperty("accessLineStatus")
  private String accessLineStatus = null;

  /** The gnp status. */
  @JsonProperty("gnpStatus")
  private String gnpStatus = null;

  /** The line option. */
  @JsonProperty("lineOption")
  private String lineOption = null;

  /** The line type. */
  @JsonProperty("lineType")
  private String lineType = null;

  /** The narrow band services available. */
  @JsonProperty("narrowBandServicesAvailable")
  private String narrowBandServicesAvailable = null;

  /** The standby power required. */
  @JsonProperty("standbyPowerRequired")
  private Boolean standbyPowerRequired = null;

  /** The status code. */
  @JsonProperty("statusCode")
  private String statusCode = null;

  /** The technology. */
  @JsonProperty("technology")
  private String technology = null;

  /** The temp structure. */
  @JsonProperty("tempStructure")
  private Boolean tempStructure = null;

  /**
   * Access line status.
   *
   * @param accessLineStatus the access line status
   * @return the basket line status
   */
  public BasketLineStatus accessLineStatus(String accessLineStatus) {
    this.accessLineStatus = accessLineStatus;
    return this;
  }

  /**
   * Get accessLineStatus.
   *
   * @return accessLineStatus
   */
  @ApiModelProperty(value = "")


  public String getAccessLineStatus() {
    return accessLineStatus;
  }

  /**
   * Sets the access line status.
   *
   * @param accessLineStatus the new access line status
   */
  public void setAccessLineStatus(String accessLineStatus) {
    this.accessLineStatus = accessLineStatus;
  }

  /**
   * Gnp status.
   *
   * @param gnpStatus the gnp status
   * @return the basket line status
   */
  public BasketLineStatus gnpStatus(String gnpStatus) {
    this.gnpStatus = gnpStatus;
    return this;
  }

  /**
   * Get gnpStatus.
   *
   * @return gnpStatus
   */
  @ApiModelProperty(value = "")


  public String getGnpStatus() {
    return gnpStatus;
  }

  /**
   * Sets the gnp status.
   *
   * @param gnpStatus the new gnp status
   */
  public void setGnpStatus(String gnpStatus) {
    this.gnpStatus = gnpStatus;
  }

  /**
   * Line option.
   *
   * @param lineOption the line option
   * @return the basket line status
   */
  public BasketLineStatus lineOption(String lineOption) {
    this.lineOption = lineOption;
    return this;
  }

  /**
   * Get lineOption.
   *
   * @return lineOption
   */
  @ApiModelProperty(value = "")


  public String getLineOption() {
    return lineOption;
  }

  /**
   * Sets the line option.
   *
   * @param lineOption the new line option
   */
  public void setLineOption(String lineOption) {
    this.lineOption = lineOption;
  }

  /**
   * Line type.
   *
   * @param lineType the line type
   * @return the basket line status
   */
  public BasketLineStatus lineType(String lineType) {
    this.lineType = lineType;
    return this;
  }

  /**
   * Get lineType.
   *
   * @return lineType
   */
  @ApiModelProperty(value = "")


  public String getLineType() {
    return lineType;
  }

  /**
   * Sets the line type.
   *
   * @param lineType the new line type
   */
  public void setLineType(String lineType) {
    this.lineType = lineType;
  }

  /**
   * Narrow band services available.
   *
   * @param narrowBandServicesAvailable the narrow band services available
   * @return the basket line status
   */
  public BasketLineStatus narrowBandServicesAvailable(String narrowBandServicesAvailable) {
    this.narrowBandServicesAvailable = narrowBandServicesAvailable;
    return this;
  }

  /**
   * Get narrowBandServicesAvailable.
   *
   * @return narrowBandServicesAvailable
   */
  @ApiModelProperty(value = "")


  public String getNarrowBandServicesAvailable() {
    return narrowBandServicesAvailable;
  }

  /**
   * Sets the narrow band services available.
   *
   * @param narrowBandServicesAvailable the new narrow band services available
   */
  public void setNarrowBandServicesAvailable(String narrowBandServicesAvailable) {
    this.narrowBandServicesAvailable = narrowBandServicesAvailable;
  }

  /**
   * Standby power required.
   *
   * @param standbyPowerRequired the standby power required
   * @return the basket line status
   */
  public BasketLineStatus standbyPowerRequired(Boolean standbyPowerRequired) {
    this.standbyPowerRequired = standbyPowerRequired;
    return this;
  }

  /**
   * Get standbyPowerRequired.
   *
   * @return standbyPowerRequired
   */

  public Boolean isStandbyPowerRequired() {
    return standbyPowerRequired;
  }

  /**
   * Sets the standby power required.
   *
   * @param standbyPowerRequired the new standby power required
   */
  public void setStandbyPowerRequired(Boolean standbyPowerRequired) {
    this.standbyPowerRequired = standbyPowerRequired;
  }

  /**
   * Status code.
   *
   * @param statusCode the status code
   * @return the basket line status
   */
  public BasketLineStatus statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode.
   *
   * @return statusCode
   */
  @ApiModelProperty(value = "")


  public String getStatusCode() {
    return statusCode;
  }

  /**
   * Sets the status code.
   *
   * @param statusCode the new status code
   */
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * Technology.
   *
   * @param technology the technology
   * @return the basket line status
   */
  public BasketLineStatus technology(String technology) {
    this.technology = technology;
    return this;
  }

  /**
   * Get technology.
   *
   * @return technology
   */
  @ApiModelProperty(value = "")


  public String getTechnology() {
    return technology;
  }

  /**
   * Sets the technology.
   *
   * @param technology the new technology
   */
  public void setTechnology(String technology) {
    this.technology = technology;
  }

  /**
   * Temp structure.
   *
   * @param tempStructure the temp structure
   * @return the basket line status
   */
  public BasketLineStatus tempStructure(Boolean tempStructure) {
    this.tempStructure = tempStructure;
    return this;
  }

  /**
   * Get tempStructure.
   *
   * @return tempStructure
   */

  public Boolean isTempStructure() {
    return tempStructure;
  }

  /**
   * Sets the temp structure.
   *
   * @param tempStructure the new temp structure
   */
  public void setTempStructure(Boolean tempStructure) {
    this.tempStructure = tempStructure;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessLineStatus, gnpStatus, lineOption, lineType, narrowBandServicesAvailable, standbyPowerRequired, statusCode, technology, tempStructure);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

