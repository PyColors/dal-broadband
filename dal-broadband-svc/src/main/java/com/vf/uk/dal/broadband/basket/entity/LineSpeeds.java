package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;


/**
 * LineSpeeds
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-25T06:31:48.127Z")

public class LineSpeeds   {
  private String maxDownSpeed = null;

  private String minDownSpeed = null;

  private String avgDownSpeed = null;

  private String minGuaranteedDownSpeed = null;

  private String maxUpSpeed = null;

  private String minUpSpeed = null;

  private String bandwidthMeasure = null;

  public LineSpeeds maxDownSpeed(String maxDownSpeed) {
    this.maxDownSpeed = maxDownSpeed;
    return this;
  }

   /**
   * The maximum download speed offered (in kilobits per second [kbps])
   * @return maxDownSpeed
  **/


  public String getMaxDownSpeed() {
    return maxDownSpeed;
  }

  public void setMaxDownSpeed(String maxDownSpeed) {
    this.maxDownSpeed = maxDownSpeed;
  }

  public LineSpeeds minDownSpeed(String minDownSpeed) {
    this.minDownSpeed = minDownSpeed;
    return this;
  }

   /**
   * The minimum download speed offered (in kilobits per second [kbps])
   * @return minDownSpeed
  **/


  public String getMinDownSpeed() {
    return minDownSpeed;
  }

  public void setMinDownSpeed(String minDownSpeed) {
    this.minDownSpeed = minDownSpeed;
  }

  public LineSpeeds avgDownSpeed(String avgDownSpeed) {
    this.avgDownSpeed = avgDownSpeed;
    return this;
  }

   /**
   * The average download speed offered (in kilobits per second [kbps])
   * @return avgDownSpeed
  **/


  public String getAvgDownSpeed() {
    return avgDownSpeed;
  }

  public void setAvgDownSpeed(String avgDownSpeed) {
    this.avgDownSpeed = avgDownSpeed;
  }

  public LineSpeeds minGuaranteedDownSpeed(String minGuaranteedDownSpeed) {
    this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
    return this;
  }

   /**
   * The minimum guaranteed download speed offered (in kilobits per second [kbps])
   * @return minGuaranteedDownSpeed
  **/


  public String getMinGuaranteedDownSpeed() {
    return minGuaranteedDownSpeed;
  }

  public void setMinGuaranteedDownSpeed(String minGuaranteedDownSpeed) {
    this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
  }

  public LineSpeeds maxUpSpeed(String maxUpSpeed) {
    this.maxUpSpeed = maxUpSpeed;
    return this;
  }

   /**
   * The max  upload speed offered (in kilobits per second [kbps])
   * @return maxUpSpeed
  **/


  public String getMaxUpSpeed() {
    return maxUpSpeed;
  }

  public void setMaxUpSpeed(String maxUpSpeed) {
    this.maxUpSpeed = maxUpSpeed;
  }

  public LineSpeeds minUpSpeed(String minUpSpeed) {
    this.minUpSpeed = minUpSpeed;
    return this;
  }

   /**
   * The min upload speed offered (in kilobits per second [kbps])
   * @return minUpSpeed
  **/


  public String getMinUpSpeed() {
    return minUpSpeed;
  }

  public void setMinUpSpeed(String minUpSpeed) {
    this.minUpSpeed = minUpSpeed;
  }

  public LineSpeeds bandwidthMeasure(String bandwidthMeasure) {
    this.bandwidthMeasure = bandwidthMeasure;
    return this;
  }

   /**
   * Indicates whether the best speed is predicted or actual
   * @return bandwidthMeasure
  **/


  public String getBandwidthMeasure() {
    return bandwidthMeasure;
  }

  public void setBandwidthMeasure(String bandwidthMeasure) {
    this.bandwidthMeasure = bandwidthMeasure;
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
    return Objects.equals(this.maxDownSpeed, lineSpeeds.maxDownSpeed) &&
        Objects.equals(this.minDownSpeed, lineSpeeds.minDownSpeed) &&
        Objects.equals(this.avgDownSpeed, lineSpeeds.avgDownSpeed) &&
        Objects.equals(this.minGuaranteedDownSpeed, lineSpeeds.minGuaranteedDownSpeed) &&
        Objects.equals(this.maxUpSpeed, lineSpeeds.maxUpSpeed) &&
        Objects.equals(this.minUpSpeed, lineSpeeds.minUpSpeed) &&
        Objects.equals(this.bandwidthMeasure, lineSpeeds.bandwidthMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDownSpeed, minDownSpeed, avgDownSpeed, minGuaranteedDownSpeed, maxUpSpeed, minUpSpeed, bandwidthMeasure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineSpeeds {\n");
    
    sb.append("    maxDownSpeed: ").append(toIndentedString(maxDownSpeed)).append("\n");
    sb.append("    minDownSpeed: ").append(toIndentedString(minDownSpeed)).append("\n");
    sb.append("    avgDownSpeed: ").append(toIndentedString(avgDownSpeed)).append("\n");
    sb.append("    minGuaranteedDownSpeed: ").append(toIndentedString(minGuaranteedDownSpeed)).append("\n");
    sb.append("    maxUpSpeed: ").append(toIndentedString(maxUpSpeed)).append("\n");
    sb.append("    minUpSpeed: ").append(toIndentedString(minUpSpeed)).append("\n");
    sb.append("    bandwidthMeasure: ").append(toIndentedString(bandwidthMeasure)).append("\n");
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

