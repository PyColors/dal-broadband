package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Journey.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Journey   {
  
  /** The journey type. */
  @JsonProperty("journeyType")
  private String journeyType = null;

  /** The offer code. */
  @JsonProperty("offerCode")
  private String offerCode = null;

  /**
   * Journey type.
   *
   * @param journeyType the journey type
   * @return the journey
   */
  public Journey journeyType(String journeyType) {
    this.journeyType = journeyType;
    return this;
  }

  /**
   * Get journeyType.
   *
   * @return journeyType
   */
  @ApiModelProperty(value = "")


  public String getJourneyType() {
    return journeyType;
  }

  /**
   * Sets the journey type.
   *
   * @param journeyType the new journey type
   */
  public void setJourneyType(String journeyType) {
    this.journeyType = journeyType;
  }

  /**
   * Offer code.
   *
   * @param offerCode the offer code
   * @return the journey
   */
  public Journey offerCode(String offerCode) {
    this.offerCode = offerCode;
    return this;
  }

  /**
   * Get offerCode.
   *
   * @return offerCode
   */
  @ApiModelProperty(value = "")


  public String getOfferCode() {
    return offerCode;
  }

  /**
   * Sets the offer code.
   *
   * @param offerCode the new offer code
   */
  public void setOfferCode(String offerCode) {
    this.offerCode = offerCode;
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
    Journey journey = (Journey) o;
    return Objects.equals(this.journeyType, journey.journeyType) &&
        Objects.equals(this.offerCode, journey.offerCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(journeyType, offerCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

