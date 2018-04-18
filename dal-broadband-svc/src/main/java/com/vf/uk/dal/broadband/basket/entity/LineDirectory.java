package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineDirectory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class LineDirectory   {
  @JsonProperty("directoryCode")
  private String directoryCode = null;

  @JsonProperty("featureCode")
  private String featureCode = null;

  @JsonProperty("locationCode")
  private String locationCode = null;

  public LineDirectory directoryCode(String directoryCode) {
    this.directoryCode = directoryCode;
    return this;
  }

  /**
   * Get directoryCode
   * @return directoryCode
  **/
  @ApiModelProperty(value = "")


  public String getDirectoryCode() {
    return directoryCode;
  }

  public void setDirectoryCode(String directoryCode) {
    this.directoryCode = directoryCode;
  }

  public LineDirectory featureCode(String featureCode) {
    this.featureCode = featureCode;
    return this;
  }

  /**
   * Get featureCode
   * @return featureCode
  **/
  @ApiModelProperty(value = "")


  public String getFeatureCode() {
    return featureCode;
  }

  public void setFeatureCode(String featureCode) {
    this.featureCode = featureCode;
  }

  public LineDirectory locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * Get locationCode
   * @return locationCode
  **/
  @ApiModelProperty(value = "")


  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineDirectory lineDirectory = (LineDirectory) o;
    return Objects.equals(this.directoryCode, lineDirectory.directoryCode) &&
        Objects.equals(this.featureCode, lineDirectory.featureCode) &&
        Objects.equals(this.locationCode, lineDirectory.locationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryCode, featureCode, locationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineDirectory {\n");
    
    sb.append("    directoryCode: ").append(toIndentedString(directoryCode)).append("\n");
    sb.append("    featureCode: ").append(toIndentedString(featureCode)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
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

