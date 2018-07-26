package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineSpeeds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketLineSpeeds   {
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

  /**
   * 
   * @param avgDownSpeed
   * @return
   */
  public BasketLineSpeeds avgDownSpeed(String avgDownSpeed) {
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

  /**
   * 
   * @param bandwidthMeasure
   * @return
   */
  public BasketLineSpeeds bandwidthMeasure(String bandwidthMeasure) {
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

  /**
   * 
   * @param maxDownSpeed
   * @return
   */
  public BasketLineSpeeds maxDownSpeed(String maxDownSpeed) {
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

  /**
   * 
   * @param maxUpSpeed
   * @return
   */
  public BasketLineSpeeds maxUpSpeed(String maxUpSpeed) {
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

  /**
   * 
   * @param minDownSpeed
   * @return
   */
  public BasketLineSpeeds minDownSpeed(String minDownSpeed) {
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

  /**
   * 
   * @param minGuaranteedDownSpeed
   * @return
   */
  public BasketLineSpeeds minGuaranteedDownSpeed(String minGuaranteedDownSpeed) {
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

  /**
   * 
   * @param minUpSpeed
   * @return
   */
  public BasketLineSpeeds minUpSpeed(String minUpSpeed) {
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

