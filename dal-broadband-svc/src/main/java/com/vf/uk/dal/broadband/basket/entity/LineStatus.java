package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-25T06:31:48.127Z")

public class LineStatus   {
  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("accessLineStatus")
  private String accessLineStatus = null;

  @JsonProperty("gnpStatus")
  private String gnpStatus = null;

  @JsonProperty("lineOption")
  private String lineOption = null;

  @JsonProperty("technology")
  private String technology = null;

  @JsonProperty("lineType")
  private String lineType = null;

  @JsonProperty("tempStructure")
  private boolean tempStructure;

  public boolean isTempStructure() {
	return tempStructure;
}

public void setTempStructure(boolean tempStructure) {
	this.tempStructure = tempStructure;
}

public boolean isStandbyPowerRequired() {
	return standbyPowerRequired;
}

public void setStandbyPowerRequired(boolean standbyPowerRequired) {
	this.standbyPowerRequired = standbyPowerRequired;
}

@JsonProperty("standbyPowerRequired")
  private boolean standbyPowerRequired;

  @JsonProperty("narrowBandServicesAvailable")
  private String narrowBandServicesAvailable = null;

  public LineStatus statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Status of the line LOV - Working, Stopped
   * @return statusCode
  **/


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public LineStatus accessLineStatus(String accessLineStatus) {
    this.accessLineStatus = accessLineStatus;
    return this;
  }

   /**
   * Status of the line (Access Line) LOV - Working, Stopped
   * @return accessLineStatus
  **/


  public String getAccessLineStatus() {
    return accessLineStatus;
  }

  public void setAccessLineStatus(String accessLineStatus) {
    this.accessLineStatus = accessLineStatus;
  }

  public LineStatus gnpStatus(String gnpStatus) {
    this.gnpStatus = gnpStatus;
    return this;
  }

   /**
   * The status of the Geographic Number Portability of the number
   * @return gnpStatus
  **/


  public String getGnpStatus() {
    return gnpStatus;
  }

  public void setGnpStatus(String gnpStatus) {
    this.gnpStatus = gnpStatus;
  }

  public LineStatus lineOption(String lineOption) {
    this.lineOption = lineOption;
    return this;
  }

   /**
   * Identifies whether existing line can be transferred or a new line is required LOV - New, Transfer
   * @return lineOption
  **/


  public String getLineOption() {
    return lineOption;
  }

  public void setLineOption(String lineOption) {
    this.lineOption = lineOption;
  }

  public LineStatus technology(String technology) {
    this.technology = technology;
    return this;
  }

   /**
   * Identifies a technology associated with the installation
   * @return technology
  **/


  public String getTechnology() {
    return technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }

  public LineStatus lineType(String lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * Type of line that is already available LOV - MPF, SMPF, LLU SFI, LLU SFIM, NTEShiftMPF
   * @return lineType
  **/


  public String getLineType() {
    return lineType;
  }

  public void setLineType(String lineType) {
    this.lineType = lineType;
  }

 
 

  public LineStatus narrowBandServicesAvailable(String narrowBandServicesAvailable) {
    this.narrowBandServicesAvailable = narrowBandServicesAvailable;
    return this;
  }

   /**
   * An indicator that specifies whether any Narrow Band Services are available on the line or not
   * @return narrowBandServicesAvailable
  **/


  public String getNarrowBandServicesAvailable() {
    return narrowBandServicesAvailable;
  }

  public void setNarrowBandServicesAvailable(String narrowBandServicesAvailable) {
    this.narrowBandServicesAvailable = narrowBandServicesAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineStatus lineStatus = (LineStatus) o;
    return Objects.equals(this.statusCode, lineStatus.statusCode) &&
        Objects.equals(this.accessLineStatus, lineStatus.accessLineStatus) &&
        Objects.equals(this.gnpStatus, lineStatus.gnpStatus) &&
        Objects.equals(this.lineOption, lineStatus.lineOption) &&
        Objects.equals(this.technology, lineStatus.technology) &&
        Objects.equals(this.lineType, lineStatus.lineType) &&
        Objects.equals(this.tempStructure, lineStatus.tempStructure) &&
        Objects.equals(this.standbyPowerRequired, lineStatus.standbyPowerRequired) &&
        Objects.equals(this.narrowBandServicesAvailable, lineStatus.narrowBandServicesAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, accessLineStatus, gnpStatus, lineOption, technology, lineType, tempStructure, standbyPowerRequired, narrowBandServicesAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineStatus {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    accessLineStatus: ").append(toIndentedString(accessLineStatus)).append("\n");
    sb.append("    gnpStatus: ").append(toIndentedString(gnpStatus)).append("\n");
    sb.append("    lineOption: ").append(toIndentedString(lineOption)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    tempStructure: ").append(toIndentedString(tempStructure)).append("\n");
    sb.append("    standbyPowerRequired: ").append(toIndentedString(standbyPowerRequired)).append("\n");
    sb.append("    narrowBandServicesAvailable: ").append(toIndentedString(narrowBandServicesAvailable)).append("\n");
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

