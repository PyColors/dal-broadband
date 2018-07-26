package com.vf.uk.dal.broadband.journey.entity;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CurrentJourney.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-13T09:29:52.184Z")

public class CurrentJourney   {
  
  /** The id. */
  @JsonProperty("id")
  private String id = null;

  /** The username. */
  @JsonProperty("username")
  private String username = null;

  /** The context MSISDN. */
  @JsonProperty("contextMSISDN")
  private String contextMSISDN = null;
  
  /** The basket id. */
  @JsonProperty("basketId")
  private String basketId = null;

  /** The journey data. */
  @JsonProperty("journeyData")
  private JourneyData journeyData = null;
  
  /**
   * Id.
   *
   * @param id the id
   * @return the current journey
   */
  public CurrentJourney id(String id) {
    this.id = id;
    return this;
  }

   /**
    * Unique journeyId created to track.
    *
    * @return id
    */
  public String getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Username.
   *
   * @param username the username
   * @return the current journey
   */
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

  /**
   * Sets the username.
   *
   * @param username the new username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Context MSISDN.
   *
   * @param contextMSISDN the context MSISDN
   * @return the current journey
   */
  public CurrentJourney contextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
    return this;
  }

   /**
    * The in-context Service Identifier according to eCare.
    *
    * @return contextMSISDN
    */
  public String getContextMSISDN() {
    return contextMSISDN;
  }

  /**
   * Sets the context MSISDN.
   *
   * @param contextMSISDN the new context MSISDN
   */
  public void setContextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
  }

  /**
   * Basket id.
   *
   * @param basketId the basket id
   * @return the current journey
   */
  public CurrentJourney basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

   /**
    * Get basketId.
    *
    * @return basketId
    */
  public String getBasketId() {
    return basketId;
  }

  /**
   * Sets the basket id.
   *
   * @param basketId the new basket id
   */
  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }
  
  /**
   * Journey data.
   *
   * @param journeyData the journey data
   * @return the current journey
   */
  public CurrentJourney journeyData(JourneyData journeyData) {
    this.journeyData = journeyData;
    return this;
  }

   /**
    * Get journeyData.
    *
    * @return journeyData
    */
  public JourneyData getJourneyData() {
    return journeyData;
  }

  /**
   * Sets the journey data.
   *
   * @param journeyData the new journey data
   */
  public void setJourneyData(JourneyData journeyData) {
    this.journeyData = journeyData;
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
    CurrentJourney currentJourney = (CurrentJourney) o;
    return Objects.equals(this.id, currentJourney.id) &&
        Objects.equals(this.username, currentJourney.username) &&
        Objects.equals(this.contextMSISDN, currentJourney.contextMSISDN) &&
        Objects.equals(this.basketId, currentJourney.basketId) &&
        Objects.equals(this.journeyData, currentJourney.journeyData);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, username, contextMSISDN, journeyData, basketId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

