package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddressDetails.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class AddressDetails   {
  
  /** The address. */
  @JsonProperty("address")
  private Address address = null;

  /** The organisation. */
  @JsonProperty("organisation")
  private Organisation organisation = null;

  /**
   * Address.
   *
   * @param address the address
   * @return the address details
   */
  public AddressDetails address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address.
   *
   * @return address
   */
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  /**
   * Sets the address.
   *
   * @param address the new address
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * Organisation.
   *
   * @param organisation the organisation
   * @return the address details
   */
  public AddressDetails organisation(Organisation organisation) {
    this.organisation = organisation;
    return this;
  }

  /**
   * Get organisation.
   *
   * @return organisation
   */
  @ApiModelProperty(value = "")

  @Valid

  public Organisation getOrganisation() {
    return organisation;
  }

  /**
   * Sets the organisation.
   *
   * @param organisation the new organisation
   */
  public void setOrganisation(Organisation organisation) {
    this.organisation = organisation;
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
    AddressDetails addressDetails = (AddressDetails) o;
    return Objects.equals(this.address, addressDetails.address) &&
        Objects.equals(this.organisation, addressDetails.organisation);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(address, organisation);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDetails {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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

