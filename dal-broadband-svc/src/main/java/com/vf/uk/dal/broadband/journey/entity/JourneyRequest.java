package com.vf.uk.dal.broadband.journey.entity;

import java.util.Objects;

/**
 * JourneyRequest.
 */
public class JourneyRequest {
  
  /** The cryptogram. */
  private String cryptogram = null;

  /** The customer details. */
  private CustomerDetails customerDetails = null;

  /**
   * Cryptogram.
   *
   * @param cryptogram the cryptogram
   * @return the journey request
   */
  public JourneyRequest cryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
    return this;
  }

   /**
    * Encrypted datagram string.
    *
    * @return cryptogram
    */
  public String getCryptogram() {
    return cryptogram;
  }

  /**
   * Sets the cryptogram.
   *
   * @param cryptogram the new cryptogram
   */
  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }

  /**
   * Customer details.
   *
   * @param customerDetails the customer details
   * @return the journey request
   */
  public JourneyRequest customerDetails(CustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
    return this;
  }

   /**
    * Get customerDetails.
    *
    * @return customerDetails
    */
  public CustomerDetails getCustomerDetails() {
    return customerDetails;
  }

  /**
   * Sets the customer details.
   *
   * @param customerDetails the new customer details
   */
  public void setCustomerDetails(CustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
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
    JourneyRequest journeyRequest = (JourneyRequest) o;
    return Objects.equals(this.cryptogram, journeyRequest.cryptogram) &&
        Objects.equals(this.customerDetails, journeyRequest.customerDetails);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(cryptogram, customerDetails);
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyRequest {\n");
    
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
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