package com.vf.uk.dal.broadband.journey.entity;

import java.util.Objects;

/**
 * CreditDetails.
 */
public class CreditDetails {
  
  /** The price limit. */
  private String priceLimit = null;

  /** The remaining connections. */
  private String remainingConnections = null;

  /**
   * Price limit.
   *
   * @param priceLimit the price limit
   * @return the credit details
   */
  public CreditDetails priceLimit(String priceLimit) {
    this.priceLimit = priceLimit;
    return this;
  }

   /**
   * Price Limit returned from ProcessCreditVet TIL service for the customer in conditional accept scenarios.
   * @return priceLimit
  **/
  public String getPriceLimit() {
    return priceLimit;
  }

  /**
   * Sets the price limit.
   *
   * @param priceLimit the new price limit
   */
  public void setPriceLimit(String priceLimit) {
    this.priceLimit = priceLimit;
  }

  /**
   * Remaining connections.
   *
   * @param remainingConnections the remaining connections
   * @return the credit details
   */
  public CreditDetails remainingConnections(String remainingConnections) {
    this.remainingConnections = remainingConnections;
    return this;
  }

   /**
   * Remaining no. of lines of the customer. e.g., 2
   * @return remainingConnections
  **/
  public String getRemainingConnections() {
    return remainingConnections;
  }

  /**
   * Sets the remaining connections.
   *
   * @param remainingConnections the new remaining connections
   */
  public void setRemainingConnections(String remainingConnections) {
    this.remainingConnections = remainingConnections;
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
    CreditDetails creditDetails = (CreditDetails) o;
    return Objects.equals(this.priceLimit, creditDetails.priceLimit) &&
        Objects.equals(this.remainingConnections, creditDetails.remainingConnections);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(priceLimit, remainingConnections);
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditDetails {\n");
    
    sb.append("    priceLimit: ").append(toIndentedString(priceLimit)).append("\n");
    sb.append("    remainingConnections: ").append(toIndentedString(remainingConnections)).append("\n");
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

