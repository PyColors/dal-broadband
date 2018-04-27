package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineSpeeds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class LineSpeeds   {
  @JsonProperty("avgDownSpeed")
  private String avgDownSpeed = null;

  @JsonProperty("bandwidthMeasure")
  private String bandwidthMeasure = null;

  @JsonProperty("maxDownSpeed")
  private String maxDownSpeed = null;

  @JsonProperty("maxUpSpeed")
  private String maxUpSpeed = null;

  @JsonProperty("minDownSpeed")
  private String minDownSpeed = null;

  @JsonProperty("minGuaranteedDownSpeed")
  private String minGuaranteedDownSpeed = null;

  @JsonProperty("minUpSpeed")
  private String minUpSpeed = null;

  public LineSpeeds avgDownSpeed(String avgDownSpeed) {
    this.avgDownSpeed = avgDownSpeed;
    return this;
  }

  /**
   * Get avgDownSpeed
   * @return avgDownSpeed
  **/
  @ApiModelProperty(value = "")


  public String getAvgDownSpeed() {
    return avgDownSpeed;
  }

  public void setAvgDownSpeed(String avgDownSpeed) {
    this.avgDownSpeed = avgDownSpeed;
  }

  public LineSpeeds bandwidthMeasure(String bandwidthMeasure) {
    this.bandwidthMeasure = bandwidthMeasure;
    return this;
  }

  /**
   * Get bandwidthMeasure
   * @return bandwidthMeasure
  **/
  @ApiModelProperty(value = "")


  public String getBandwidthMeasure() {
    return bandwidthMeasure;
  }

  public void setBandwidthMeasure(String bandwidthMeasure) {
    this.bandwidthMeasure = bandwidthMeasure;
  }

  public LineSpeeds maxDownSpeed(String maxDownSpeed) {
    this.maxDownSpeed = maxDownSpeed;
    return this;
  }

  /**
   * Get maxDownSpeed
   * @return maxDownSpeed
  **/
  @ApiModelProperty(value = "")


  public String getMaxDownSpeed() {
    return maxDownSpeed;
  }

  public void setMaxDownSpeed(String maxDownSpeed) {
    this.maxDownSpeed = maxDownSpeed;
  }

  public LineSpeeds maxUpSpeed(String maxUpSpeed) {
    this.maxUpSpeed = maxUpSpeed;
    return this;
  }

  /**
   * Get maxUpSpeed
   * @return maxUpSpeed
  **/
  @ApiModelProperty(value = "")


  public String getMaxUpSpeed() {
    return maxUpSpeed;
  }

  public void setMaxUpSpeed(String maxUpSpeed) {
    this.maxUpSpeed = maxUpSpeed;
  }

  public LineSpeeds minDownSpeed(String minDownSpeed) {
    this.minDownSpeed = minDownSpeed;
    return this;
  }

  /**
   * Get minDownSpeed
   * @return minDownSpeed
  **/
  @ApiModelProperty(value = "")


  public String getMinDownSpeed() {
    return minDownSpeed;
  }

  public void setMinDownSpeed(String minDownSpeed) {
    this.minDownSpeed = minDownSpeed;
  }

  public LineSpeeds minGuaranteedDownSpeed(String minGuaranteedDownSpeed) {
    this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
    return this;
  }

  /**
   * Get minGuaranteedDownSpeed
   * @return minGuaranteedDownSpeed
  **/
  @ApiModelProperty(value = "")


  public String getMinGuaranteedDownSpeed() {
    return minGuaranteedDownSpeed;
  }

  public void setMinGuaranteedDownSpeed(String minGuaranteedDownSpeed) {
    this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
  }

  public LineSpeeds minUpSpeed(String minUpSpeed) {
    this.minUpSpeed = minUpSpeed;
    return this;
  }

  /**
   * Get minUpSpeed
   * @return minUpSpeed
  **/
  @ApiModelProperty(value = "")


  public String getMinUpSpeed() {
    return minUpSpeed;
  }

  public void setMinUpSpeed(String minUpSpeed) {
    this.minUpSpeed = minUpSpeed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineSpeeds lineSpeeds = (LineSpeeds) o;
    return Objects.equals(this.avgDownSpeed, lineSpeeds.avgDownSpeed) &&
        Objects.equals(this.bandwidthMeasure, lineSpeeds.bandwidthMeasure) &&
        Objects.equals(this.maxDownSpeed, lineSpeeds.maxDownSpeed) &&
        Objects.equals(this.maxUpSpeed, lineSpeeds.maxUpSpeed) &&
        Objects.equals(this.minDownSpeed, lineSpeeds.minDownSpeed) &&
        Objects.equals(this.minGuaranteedDownSpeed, lineSpeeds.minGuaranteedDownSpeed) &&
        Objects.equals(this.minUpSpeed, lineSpeeds.minUpSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgDownSpeed, bandwidthMeasure, maxDownSpeed, maxUpSpeed, minDownSpeed, minGuaranteedDownSpeed, minUpSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineSpeeds {\n");
    
    sb.append("    avgDownSpeed: ").append(toIndentedString(avgDownSpeed)).append("\n");
    sb.append("    bandwidthMeasure: ").append(toIndentedString(bandwidthMeasure)).append("\n");
    sb.append("    maxDownSpeed: ").append(toIndentedString(maxDownSpeed)).append("\n");
    sb.append("    maxUpSpeed: ").append(toIndentedString(maxUpSpeed)).append("\n");
    sb.append("    minDownSpeed: ").append(toIndentedString(minDownSpeed)).append("\n");
    sb.append("    minGuaranteedDownSpeed: ").append(toIndentedString(minGuaranteedDownSpeed)).append("\n");
    sb.append("    minUpSpeed: ").append(toIndentedString(minUpSpeed)).append("\n");
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

