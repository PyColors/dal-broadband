package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Journey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Journey   {
  @JsonProperty("journeyType")
  private String journeyType = null;

  @JsonProperty("offerCode")
  private String offerCode = null;

  public Journey journeyType(String journeyType) {
    this.journeyType = journeyType;
    return this;
  }

  /**
   * Get journeyType
   * @return journeyType
  **/
  @ApiModelProperty(value = "")


  public String getJourneyType() {
    return journeyType;
  }

  public void setJourneyType(String journeyType) {
    this.journeyType = journeyType;
  }

  public Journey offerCode(String offerCode) {
    this.offerCode = offerCode;
    return this;
  }

  /**
   * Get offerCode
   * @return offerCode
  **/
  @ApiModelProperty(value = "")


  public String getOfferCode() {
    return offerCode;
  }

  public void setOfferCode(String offerCode) {
    this.offerCode = offerCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Journey journey = (Journey) o;
    return Objects.equals(this.journeyType, journey.journeyType) &&
        Objects.equals(this.offerCode, journey.offerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journeyType, offerCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journey {\n");
    
    sb.append("    journeyType: ").append(toIndentedString(journeyType)).append("\n");
    sb.append("    offerCode: ").append(toIndentedString(offerCode)).append("\n");
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

