package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InstallationAddress.
 */
public class InstallationAddress {
	
	/** The house number. */
	@JsonProperty("houseNumber")
	private String houseNumber = null;

	/** The flat number. */
	@JsonProperty("flatNumber")
	private String flatNumber = null;

	/** The house name. */
	@JsonProperty("houseName")
	private String houseName = null;

	/** The street name. */
	@JsonProperty("streetName")
	private String streetName = null;

	/** The locality. */
	@JsonProperty("locality")
	private String locality = null;

	/** The city. */
	@JsonProperty("city")
	private String city = null;

	/** The post code. */
	@NotNull
	@Size(min=1)
	@JsonProperty("postCode")
	private String postCode = null;

	/** The county. */
	@JsonProperty("county")
	private String county = null;

	/** The country code. */
	@JsonProperty("countryCode")
	private String countryCode = null;

	/** The city sub division name. */
	@JsonProperty("citySubDivisionName")
	private String citySubDivisionName = null;

	/** The address reference number. */
	@JsonProperty("addressReferenceNumber")
	private String addressReferenceNumber = null;

	/** The address type. */
	@JsonProperty("addressType")
	private String addressType = null;

	/** The move type code. */
	@JsonProperty("moveTypeCode")
	private MoveTypeCodeEnum moveTypeCode = null;

	/**
	 * House number.
	 *
	 * @param houseNumber the house number
	 * @return the installation address
	 */
	public InstallationAddress houseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
		return this;
	}

	/**
	 * House Number.
	 *
	 * @return houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * Sets the house number.
	 *
	 * @param houseNumber the new house number
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * Flat number.
	 *
	 * @param flatNumber the flat number
	 * @return the installation address
	 */
	public InstallationAddress flatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
		return this;
	}

	/**
	 * Flat Number.
	 *
	 * @return flatNumber
	 */
	public String getFlatNumber() {
		return flatNumber;
	}

	/**
	 * Sets the flat number.
	 *
	 * @param flatNumber the new flat number
	 */
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	/**
	 * House name.
	 *
	 * @param houseName the house name
	 * @return the installation address
	 */
	public InstallationAddress houseName(String houseName) {
		this.houseName = houseName;
		return this;
	}

	/**
	 * House Name.
	 *
	 * @return houseName
	 */
	public String getHouseName() {
		return houseName;
	}

	/**
	 * Sets the house name.
	 *
	 * @param houseName the new house name
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	/**
	 * Street name.
	 *
	 * @param streetName the street name
	 * @return the installation address
	 */
	public InstallationAddress streetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	/**
	 * Street Name.
	 *
	 * @return streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Sets the street name.
	 *
	 * @param streetName the new street name
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Locality.
	 *
	 * @param locality the locality
	 * @return the installation address
	 */
	public InstallationAddress locality(String locality) {
		this.locality = locality;
		return this;
	}

	/**
	 * Locality.
	 *
	 * @return locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * Sets the locality.
	 *
	 * @param locality the new locality
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * City.
	 *
	 * @param city the city
	 * @return the installation address
	 */
	public InstallationAddress city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * City name.
	 *
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Post code.
	 *
	 * @param postCode the post code
	 * @return the installation address
	 */
	public InstallationAddress postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	 * Postal code.
	 *
	 * @return postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * Sets the post code.
	 *
	 * @param postCode the new post code
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * County.
	 *
	 * @param county the county
	 * @return the installation address
	 */
	public InstallationAddress county(String county) {
		this.county = county;
		return this;
	}

	/**
	 * County name.
	 *
	 * @return county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * Sets the county.
	 *
	 * @param county the new county
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * Country code.
	 *
	 * @param countryCode the country code
	 * @return the installation address
	 */
	public InstallationAddress countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * Default Value: United Kingdom.
	 *
	 * @return countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the country code.
	 *
	 * @param countryCode the new country code
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * City sub division name.
	 *
	 * @param citySubDivisionName the city sub division name
	 * @return the installation address
	 */
	public InstallationAddress citySubDivisionName(String citySubDivisionName) {
		this.citySubDivisionName = citySubDivisionName;
		return this;
	}

	/**
	 * Code identifying the District where the line belongs Required for
	 * addresses qualified as “Gold”.
	 *
	 * @return citySubDivisionName
	 */
	public String getCitySubDivisionName() {
		return citySubDivisionName;
	}

	/**
	 * Sets the city sub division name.
	 *
	 * @param citySubDivisionName the new city sub division name
	 */
	public void setCitySubDivisionName(String citySubDivisionName) {
		this.citySubDivisionName = citySubDivisionName;
	}

	/**
	 * Address reference number.
	 *
	 * @param addressReferenceNumber the address reference number
	 * @return the installation address
	 */
	public InstallationAddress addressReferenceNumber(String addressReferenceNumber) {
		this.addressReferenceNumber = addressReferenceNumber;
		return this;
	}

	/**
	 * Address Reference Identifier uniquely identifies addresses present in the
	 * address database.
	 *
	 * @return addressReferenceNumber
	 */
	public String getAddressReferenceNumber() {
		return addressReferenceNumber;
	}

	/**
	 * Sets the address reference number.
	 *
	 * @param addressReferenceNumber the new address reference number
	 */
	public void setAddressReferenceNumber(String addressReferenceNumber) {
		this.addressReferenceNumber = addressReferenceNumber;
	}

	/**
	 * Address type.
	 *
	 * @param addressType the address type
	 * @return the installation address
	 */
	public InstallationAddress addressType(String addressType) {
		this.addressType = addressType;
		return this;
	}

	/**
	 * Qualifier indicates whether the number is present in the address
	 * database. “Gold” indicates that the address has a Fixed Line service or
	 * has recently had a service and is therefore present in the Fixed Line
	 * address database “Silver” indicates that the address needs to be added to
	 * the Fixed Line address database; however, it has been found in the Post
	 * Office Addresses
	 * 
	 * @return addressType
	 **/
	public String getAddressType() {
		return addressType;
	}

	/**
	 * Sets the address type.
	 *
	 * @param addressType the new address type
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	/**
	 * Move type code.
	 *
	 * @param moveTypeCode the move type code
	 * @return the installation address
	 */
	public InstallationAddress moveTypeCode(MoveTypeCodeEnum moveTypeCode) {
		this.moveTypeCode = moveTypeCode;
		return this;
	}

	/**
	 * Code identifying whether it is change of address scenario.
	 *
	 * @return moveTypeCode
	 */
	public MoveTypeCodeEnum getMoveTypeCode() {
		return moveTypeCode;
	}

	/**
	 * Sets the move type code.
	 *
	 * @param moveTypeCode the new move type code
	 */
	public void setMoveTypeCode(MoveTypeCodeEnum moveTypeCode) {
		this.moveTypeCode = moveTypeCode;
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
		InstallationAddress installationAddress = (InstallationAddress) o;
		return Objects.equals(this.houseNumber, installationAddress.houseNumber)
				&& Objects.equals(this.flatNumber, installationAddress.flatNumber)
				&& Objects.equals(this.houseName, installationAddress.houseName)
				&& Objects.equals(this.streetName, installationAddress.streetName)
				&& Objects.equals(this.locality, installationAddress.locality)
				&& Objects.equals(this.city, installationAddress.city)
				&& Objects.equals(this.postCode, installationAddress.postCode)
				&& Objects.equals(this.county, installationAddress.county)
				&& Objects.equals(this.countryCode, installationAddress.countryCode)
				&& Objects.equals(this.citySubDivisionName, installationAddress.citySubDivisionName)
				&& Objects.equals(this.addressReferenceNumber, installationAddress.addressReferenceNumber)
				&& Objects.equals(this.addressType, installationAddress.addressType)
				&& Objects.equals(this.moveTypeCode, installationAddress.moveTypeCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(houseNumber, flatNumber, houseName, streetName, locality, city, postCode, county,
				countryCode, citySubDivisionName, addressReferenceNumber, addressType, moveTypeCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InstallationAddress {\n");

		sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
		sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
		sb.append("    houseName: ").append(toIndentedString(houseName)).append("\n");
		sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
		sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
		sb.append("    county: ").append(toIndentedString(county)).append("\n");
		sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
		sb.append("    citySubDivisionName: ").append(toIndentedString(citySubDivisionName)).append("\n");
		sb.append("    addressReferenceNumber: ").append(toIndentedString(addressReferenceNumber)).append("\n");
		sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
		sb.append("    moveTypeCode: ").append(toIndentedString(moveTypeCode)).append("\n");
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
