package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerPartyReference.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class CustomerPartyReference   {
  
  /** The customer party account type code. */
  @JsonProperty("customerPartyAccountTypeCode")
  private String customerPartyAccountTypeCode = null;

  /**
   * Customer party account type code.
   *
   * @param customerPartyAccountTypeCode the customer party account type code
   * @return the customer party reference
   */
  public CustomerPartyReference customerPartyAccountTypeCode(String customerPartyAccountTypeCode) {
    this.customerPartyAccountTypeCode = customerPartyAccountTypeCode;
    return this;
  }

  /**
   * The category of the Account based on the profile of the customer. LOV BUSINESS OR INDIVIDUAL.
   * @return customerPartyAccountTypeCode
  **/
  @ApiModelProperty(value = "The category of the Account based on the profile of the customer. LOV BUSINESS OR INDIVIDUAL.")


  public String getCustomerPartyAccountTypeCode() {
    return customerPartyAccountTypeCode;
  }

  /**
   * Sets the customer party account type code.
   *
   * @param customerPartyAccountTypeCode the new customer party account type code
   */
  public void setCustomerPartyAccountTypeCode(String customerPartyAccountTypeCode) {
    this.customerPartyAccountTypeCode = customerPartyAccountTypeCode;
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
    CustomerPartyReference customerPartyReference = (CustomerPartyReference) o;
    return Objects.equals(this.customerPartyAccountTypeCode, customerPartyReference.customerPartyAccountTypeCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(customerPartyAccountTypeCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPartyReference {\n");
    
    sb.append("    customerPartyAccountTypeCode: ").append(toIndentedString(customerPartyAccountTypeCode)).append("\n");
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

