package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

/**
 * Journey
 */
public class Journey {
  private String journeyType = null;

  private String offerCode = null;
/**
 * 
 * @param journeyType
 * @return
 */
  public Journey journeyType(String journeyType) {
    this.journeyType = journeyType;
    return this;
  }

   /**
   * The type of the user journey
   * @return journeyType
  **/
  public String getJourneyType() {
    return journeyType;
  }

  public void setJourneyType(String journeyType) {
    this.journeyType = journeyType;
  }
/**
 * 
 * @param offerCode
 * @return
 */
  public Journey offerCode(String offerCode) {
    this.offerCode = offerCode;
    return this;
  }

   /**
   * The type of the user journey
   * @return offerCode
  **/
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

