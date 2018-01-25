package com.vf.uk.dal.broadband.entity.journey;

import java.util.Objects;

/**
 * JourneyState
 */
public class JourneyState {
  private String name = null;

  private String state = null;

  private String basketId = null;
  
  private String contextMSISDN = null;

  public JourneyState name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Journey type \&quot;Upgrade\&quot;,\&quot;2ndLine\&quot;,\&quot;Offer\&quot;,\&quot;Express\&quot;
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JourneyState state(String state) {
    this.state = state;
    return this;
  }

   /**
   * INPROGRESS,COMPLETE,ABANDONED
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public JourneyState basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

   /**
   * To be sent by basket API when the current journey is moved to COMPLETED. The basket Id would not be sent for an INPROGRESS state update
   * @return basketId
  **/
  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }
  
  public JourneyState contextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
    return this;
  }

   /**
   * Subscription id of the customer
   * @return contextMSISDN
  **/
  public String getContextMSISDN() {
    return contextMSISDN;
  }

  public void setContextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyState journeyState = (JourneyState) o;
    return Objects.equals(this.name, journeyState.name) &&
        Objects.equals(this.state, journeyState.state) &&
        Objects.equals(this.basketId, journeyState.basketId) &&
    	Objects.equals(this.contextMSISDN, journeyState.contextMSISDN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state, basketId, contextMSISDN);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyState {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    contextMSISDN: ").append(toIndentedString(contextMSISDN)).append("\n");
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

