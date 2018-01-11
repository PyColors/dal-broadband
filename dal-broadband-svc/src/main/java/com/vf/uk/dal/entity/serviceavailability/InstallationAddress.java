package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InstallationAddress
 */
public class InstallationAddress {
	@JsonProperty("houseNumber")
	private String houseNumber = null;

	@JsonProperty("flatNumber")
	private String flatNumber = null;

	@JsonProperty("houseName")
	private String houseName = null;

	@JsonProperty("streetName")
	private String streetName = null;

	@JsonProperty("locality")
	private String locality = null;

	@JsonProperty("city")
	private String city = null;

	@NotNull
	@Size(min=1)
	@JsonProperty("postCode")
	private String postCode = null;

	@JsonProperty("county")
	private String county = null;

	@JsonProperty("countryCode")
	private String countryCode = null;

	@JsonProperty("citySubDivisionName")
	private String citySubDivisionName = null;

	@JsonProperty("addressReferenceNumber")
	private String addressReferenceNumber = null;

	@JsonProperty("addressType")
	private String addressType = null;

	@JsonProperty("moveTypeCode")
	private MoveTypeCodeEnum moveTypeCode = null;

	public InstallationAddress houseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
		return this;
	}

	/**
	 * House Number
	 * 
	 * @return houseNumber
	 **/
	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public InstallationAddress flatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
		return this;
	}

	/**
	 * Flat Number
	 * 
	 * @return flatNumber
	 **/
	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public InstallationAddress houseName(String houseName) {
		this.houseName = houseName;
		return this;
	}

	/**
	 * House Name
	 * 
	 * @return houseName
	 **/
	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public InstallationAddress streetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	/**
	 * Street Name
	 * 
	 * @return streetName
	 **/
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public InstallationAddress locality(String locality) {
		this.locality = locality;
		return this;
	}

	/**
	 * Locality
	 * 
	 * @return locality
	 **/
	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public InstallationAddress city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * City name
	 * 
	 * @return city
	 **/
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public InstallationAddress postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	 * Postal code
	 * 
	 * @return postCode
	 **/
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public InstallationAddress county(String county) {
		this.county = county;
		return this;
	}

	/**
	 * County name
	 * 
	 * @return county
	 **/
	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public InstallationAddress countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * Default Value: United Kingdom
	 * 
	 * @return countryCode
	 **/
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public InstallationAddress citySubDivisionName(String citySubDivisionName) {
		this.citySubDivisionName = citySubDivisionName;
		return this;
	}

	/**
	 * Code identifying the District where the line belongs Required for
	 * addresses qualified as “Gold”
	 * 
	 * @return citySubDivisionName
	 **/
	public String getCitySubDivisionName() {
		return citySubDivisionName;
	}

	public void setCitySubDivisionName(String citySubDivisionName) {
		this.citySubDivisionName = citySubDivisionName;
	}

	public InstallationAddress addressReferenceNumber(String addressReferenceNumber) {
		this.addressReferenceNumber = addressReferenceNumber;
		return this;
	}

	/**
	 * Address Reference Identifier uniquely identifies addresses present in the
	 * address database
	 * 
	 * @return addressReferenceNumber
	 **/
	public String getAddressReferenceNumber() {
		return addressReferenceNumber;
	}

	public void setAddressReferenceNumber(String addressReferenceNumber) {
		this.addressReferenceNumber = addressReferenceNumber;
	}

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

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public InstallationAddress moveTypeCode(MoveTypeCodeEnum moveTypeCode) {
		this.moveTypeCode = moveTypeCode;
		return this;
	}

	/**
	 * Code identifying whether it is change of address scenario
	 * 
	 * @return moveTypeCode
	 **/
	public MoveTypeCodeEnum getMoveTypeCode() {
		return moveTypeCode;
	}

	public void setMoveTypeCode(MoveTypeCodeEnum moveTypeCode) {
		this.moveTypeCode = moveTypeCode;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(houseNumber, flatNumber, houseName, streetName, locality, city, postCode, county,
				countryCode, citySubDivisionName, addressReferenceNumber, addressType, moveTypeCode);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
