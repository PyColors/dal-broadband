package com.vf.uk.dal.broadband.entity.journey;

import java.util.Objects;

/**
 * JourneyRequest
 */
public class JourneyRequest {
  private String cryptogram = null;

  private CustomerDetails customerDetails = null;

  public JourneyRequest cryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * Encrypted datagram string
   * @return cryptogram
  **/
  public String getCryptogram() {
    return cryptogram;
  }

  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }

  public JourneyRequest customerDetails(CustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  public CustomerDetails getCustomerDetails() {
    return customerDetails;
  }

  public void setCustomerDetails(CustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(cryptogram, customerDetails);
  }


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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}