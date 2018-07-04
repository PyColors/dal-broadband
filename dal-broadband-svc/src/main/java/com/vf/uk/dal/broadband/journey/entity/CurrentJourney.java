package com.vf.uk.dal.broadband.journey.entity;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * CurrentJourney
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-13T09:29:52.184Z")

public class CurrentJourney   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("contextMSISDN")
  private String contextMSISDN = null;
  
  @JsonProperty("basketId")
  private String basketId = null;

  @JsonProperty("journeyData")
  private JourneyData journeyData = null;
  
  public CurrentJourney id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique journeyId created to track
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CurrentJourney username(String username) {
    this.username = username;
    return this;
  }

   /**
   * IDM Username.
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CurrentJourney contextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
    return this;
  }

   /**
   * The in-context Service Identifier according to eCare
   * @return contextMSISDN
  **/
  public String getContextMSISDN() {
    return contextMSISDN;
  }

  public void setContextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
  }

  public CurrentJourney basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

   /**
   * Get basketId
   * @return basketId
  **/
  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }
  
  public CurrentJourney journeyData(JourneyData journeyData) {
    this.journeyData = journeyData;
    return this;
  }

   /**
   * Get journeyData
   * @return journeyData
  **/
  public JourneyData getJourneyData() {
    return journeyData;
  }

  public void setJourneyData(JourneyData journeyData) {
    this.journeyData = journeyData;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentJourney currentJourney = (CurrentJourney) o;
    return Objects.equals(this.id, currentJourney.id) &&
        Objects.equals(this.username, currentJourney.username) &&
        Objects.equals(this.contextMSISDN, currentJourney.contextMSISDN) &&
        Objects.equals(this.basketId, currentJourney.basketId) &&
        Objects.equals(this.journeyData, currentJourney.journeyData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, contextMSISDN, journeyData, basketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentJourney {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    contextMSISDN: ").append(toIndentedString(contextMSISDN)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    journeyData: ").append(toIndentedString(journeyData)).append("\n");
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

