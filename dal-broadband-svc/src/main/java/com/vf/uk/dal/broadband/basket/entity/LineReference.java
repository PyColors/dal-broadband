package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class LineReference   {
  @JsonProperty("availableServices")
  private AvailableServices availableServices = null;

  @JsonProperty("lineDirectory")
  @Valid
  private List<LineDirectory> lineDirectory = null;

  @JsonProperty("lineLocator")
  private LineLocator lineLocator = null;

  @JsonProperty("lineSettings")
  private LineSettings lineSettings = null;

  @JsonProperty("lineStatus")
  private LineStatus lineStatus = null;

  public LineReference availableServices(AvailableServices availableServices) {
    this.availableServices = availableServices;
    return this;
  }

  /**
   * Get availableServices
   * @return availableServices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AvailableServices getAvailableServices() {
    return availableServices;
  }

  public void setAvailableServices(AvailableServices availableServices) {
    this.availableServices = availableServices;
  }

  public LineReference lineDirectory(List<LineDirectory> lineDirectory) {
    this.lineDirectory = lineDirectory;
    return this;
  }

  public LineReference addLineDirectoryItem(LineDirectory lineDirectoryItem) {
    if (this.lineDirectory == null) {
      this.lineDirectory = new ArrayList<LineDirectory>();
    }
    this.lineDirectory.add(lineDirectoryItem);
    return this;
  }

  /**
   * Get lineDirectory
   * @return lineDirectory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<LineDirectory> getLineDirectory() {
    return lineDirectory;
  }

  public void setLineDirectory(List<LineDirectory> lineDirectory) {
    this.lineDirectory = lineDirectory;
  }

  public LineReference lineLocator(LineLocator lineLocator) {
    this.lineLocator = lineLocator;
    return this;
  }

  /**
   * Get lineLocator
   * @return lineLocator
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LineLocator getLineLocator() {
    return lineLocator;
  }

  public void setLineLocator(LineLocator lineLocator) {
    this.lineLocator = lineLocator;
  }

  public LineReference lineSettings(LineSettings lineSettings) {
    this.lineSettings = lineSettings;
    return this;
  }

  /**
   * Get lineSettings
   * @return lineSettings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LineSettings getLineSettings() {
    return lineSettings;
  }

  public void setLineSettings(LineSettings lineSettings) {
    this.lineSettings = lineSettings;
  }

  public LineReference lineStatus(LineStatus lineStatus) {
    this.lineStatus = lineStatus;
    return this;
  }

  /**
   * Get lineStatus
   * @return lineStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LineStatus getLineStatus() {
    return lineStatus;
  }

  public void setLineStatus(LineStatus lineStatus) {
    this.lineStatus = lineStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineReference lineReference = (LineReference) o;
    return Objects.equals(this.availableServices, lineReference.availableServices) &&
        Objects.equals(this.lineDirectory, lineReference.lineDirectory) &&
        Objects.equals(this.lineLocator, lineReference.lineLocator) &&
        Objects.equals(this.lineSettings, lineReference.lineSettings) &&
        Objects.equals(this.lineStatus, lineReference.lineStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableServices, lineDirectory, lineLocator, lineSettings, lineStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineReference {\n");
    
    sb.append("    availableServices: ").append(toIndentedString(availableServices)).append("\n");
    sb.append("    lineDirectory: ").append(toIndentedString(lineDirectory)).append("\n");
    sb.append("    lineLocator: ").append(toIndentedString(lineLocator)).append("\n");
    sb.append("    lineSettings: ").append(toIndentedString(lineSettings)).append("\n");
    sb.append("    lineStatus: ").append(toIndentedString(lineStatus)).append("\n");
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

