package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Speed
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")

public class Speed   {
  @JsonProperty("minSpeed")
  private String minSpeed = null;

  @JsonProperty("maxSpeed")
  private String maxSpeed = null;

  @JsonProperty("speed")
  private String speed = null;
  
  @JsonProperty("commercialSpeed")
  private String commercialSpeed = null;

  public Speed minSpeed(String minSpeed) {
    this.minSpeed = minSpeed;
    return this;
  }

  /**
   * Get minSpeed
   * @return minSpeed
  **/
  @ApiModelProperty(value = "")


  public String getMinSpeed() {
    return minSpeed;
  }

  public void setMinSpeed(String minSpeed) {
    this.minSpeed = minSpeed;
  }

  public Speed maxSpeed(String maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

  /**
   * Get maxSpeed
   * @return maxSpeed
  **/
  @ApiModelProperty(value = "")


  public String getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(String maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public Speed speed(String speed) {
    this.speed = speed;
    return this;
  }

  /**
   * Get speed
   * @return speed
  **/
  @ApiModelProperty(value = "")


  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }


  public String getCommercialSpeed() {
	return commercialSpeed;
}

public void setCommercialSpeed(String commercialSpeed) {
	this.commercialSpeed = commercialSpeed;
}

@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Speed speed = (Speed) o;
    return Objects.equals(this.minSpeed, speed.minSpeed) &&
        Objects.equals(this.maxSpeed, speed.maxSpeed) &&
        Objects.equals(this.speed, speed.speed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minSpeed, maxSpeed, speed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Speed {\n");
    
    sb.append("    minSpeed: ").append(toIndentedString(minSpeed)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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


