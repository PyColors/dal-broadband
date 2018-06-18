package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddressDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class AddressDetails   {
  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("organisation")
  private Organisation organisation = null;

  public AddressDetails address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public AddressDetails organisation(Organisation organisation) {
    this.organisation = organisation;
    return this;
  }

  /**
   * Get organisation
   * @return organisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Organisation getOrganisation() {
    return organisation;
  }

  public void setOrganisation(Organisation organisation) {
    this.organisation = organisation;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(address, organisation);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

