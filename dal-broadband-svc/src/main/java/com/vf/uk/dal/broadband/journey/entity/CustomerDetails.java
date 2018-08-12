package com.vf.uk.dal.broadband.journey.entity;

import java.util.Objects;

/**
 * CustomerDetails.
 */
public class CustomerDetails {
  
  /** The username. */
  private String username = null;

  /** The journey type. */
  private String journeyType = null;
  
  /** The basket id. */
  private String basketId = null;
  
  /** The credit details. */
  private CreditDetails creditDetails = null;
  
  /**
   * Username.
   *
   * @param username the username
   * @return the customer details
   */
  public CustomerDetails username(String username) {
    this.username = username;
    return this;
  }

   /**
    * username of the customer.
    *
    * @return username
    */
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
   * Journey type.
   *
   * @param journeyType the journey type
   * @return the customer details
   */
  public CustomerDetails journeyType(String journeyType) {
    this.journeyType = journeyType;
    return this;
  }

   /**
    * type of the customers journey.
    *
    * @return journeyType
    */
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
   * Basket id.
   *
   * @param basketId the basket id
   * @return the customer details
   */
  public CustomerDetails basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

   /**
    * Basket Id.
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
   * Credit details.
   *
   * @param creditDetails the credit details
   * @return the customer details
   */
  public CustomerDetails creditDetails(CreditDetails creditDetails) {
    this.creditDetails = creditDetails;
    return this;
  }

   /**
    * CustomerDetails of the customer.
    *
    * @return creditDetails
    */
  public CreditDetails getCreditDetails() {
    return creditDetails;
  }

  /**
   * Sets the credit details.
   *
   * @param creditDetails the new credit details
   */
  public void setCreditDetails(CreditDetails creditDetails) {
    this.creditDetails = creditDetails;
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
    CustomerDetails customerDetails = (CustomerDetails) o;
    return Objects.equals(this.username, customerDetails.username) &&
        Objects.equals(this.journeyType, customerDetails.journeyType) &&
        Objects.equals(this.basketId, customerDetails.basketId) &&
        Objects.equals(this.creditDetails, customerDetails.creditDetails);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(username, journeyType, basketId, creditDetails);
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDetails {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    journeyType: ").append(toIndentedString(journeyType)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    creditDetails: ").append(toIndentedString(creditDetails)).append("\n");
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

