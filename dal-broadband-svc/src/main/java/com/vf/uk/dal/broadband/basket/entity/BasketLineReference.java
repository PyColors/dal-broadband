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

public class BasketLineReference   {
  @JsonProperty("availableServices")
  private AvailableServices availableServices = null;

  @JsonProperty("lineDirectory")
  @Valid
  private List<BasketLineDirectory> lineDirectory = null;

  @JsonProperty("lineLocator")
  private BasketLineLocator lineLocator = null;

  @JsonProperty("lineSettings")
  private BasketLineSettings lineSettings = null;

  @JsonProperty("lineStatus")
  private BasketLineStatus lineStatus = null;

  public BasketLineReference availableServices(AvailableServices availableServices) {
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

  public BasketLineReference lineDirectory(List<BasketLineDirectory> lineDirectory) {
    this.lineDirectory = lineDirectory;
    return this;
  }

  public BasketLineReference addLineDirectoryItem(BasketLineDirectory lineDirectoryItem) {
    if (this.lineDirectory == null) {
      this.lineDirectory = new ArrayList<>();
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

  public List<BasketLineDirectory> getLineDirectory() {
    return lineDirectory;
  }

  public void setLineDirectory(List<BasketLineDirectory> lineDirectory) {
    this.lineDirectory = lineDirectory;
  }

  public BasketLineReference lineLocator(BasketLineLocator lineLocator) {
    this.lineLocator = lineLocator;
    return this;
  }

  /**
   * Get lineLocator
   * @return lineLocator
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasketLineLocator getLineLocator() {
    return lineLocator;
  }

  public void setLineLocator(BasketLineLocator lineLocator) {
    this.lineLocator = lineLocator;
  }

  public BasketLineReference lineSettings(BasketLineSettings lineSettings) {
    this.lineSettings = lineSettings;
    return this;
  }

  /**
   * Get lineSettings
   * @return lineSettings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasketLineSettings getLineSettings() {
    return lineSettings;
  }

  public void setLineSettings(BasketLineSettings lineSettings) {
    this.lineSettings = lineSettings;
  }

  public BasketLineReference lineStatus(BasketLineStatus lineStatus) {
    this.lineStatus = lineStatus;
    return this;
  }

  /**
   * Get lineStatus
   * @return lineStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasketLineStatus getLineStatus() {
    return lineStatus;
  }

  public void setLineStatus(BasketLineStatus lineStatus) {
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
    BasketLineReference lineReference = (BasketLineReference) o;
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

