package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddressDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class AddressDetails {
	@JsonProperty("address")
	private Address address = null;

	@JsonProperty("organisation")
	private Organisation organisation = null;

	/**
	 * @param address
	 * @return
	 */
	public AddressDetails address(Address address) {
		this.address = address;
		return this;
	}

	/**
	 * Get address
	 * 
	 * @return address
	 **/

	@Valid

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @param organisation
	 * @return
	 */
	public AddressDetails organisation(Organisation organisation) {
		this.organisation = organisation;
		return this;
	}

	/**
	 * Get organisation
	 * 
	 * @return organisation
	 **/

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
		return Objects.equals(this.address, addressDetails.address)
				&& Objects.equals(this.organisation, addressDetails.organisation);
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
