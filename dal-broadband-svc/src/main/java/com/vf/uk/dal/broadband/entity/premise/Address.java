package com.vf.uk.dal.broadband.entity.premise;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address
 */

public class Address {
	@JsonProperty("postCode")
	private String postCode = null;
	@JsonProperty("houseNumber")
	private String houseNumber = null;
	@JsonProperty("houseName")
	private String houseName = null;
	@JsonProperty("flatNumber")
	private String flatNumber = null;
	@JsonProperty("streetName")
	private String streetName = null;
	@JsonProperty("locality")
	private String locality = null;
	@JsonProperty("city")
	private String city = null;
	@JsonProperty("county")
	private String county = null;
	@JsonProperty("country")
	private String country = null;
	@JsonProperty("citySubDivisionCode")
	private String citySubDivisionCode = null;
	@JsonProperty("contextId")
	private String contextId = null;
	@JsonProperty("id")
	private String id = null;

	public Address postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	 * post code
	 * 
	 * @return postCode
	 **/

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Address houseNumber(String houseNumber) {
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

	public Address houseName(String houseName) {
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

	public Address flatNumber(String flatNumber) {
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

	public Address streetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	/**
	 * StreetName
	 * 
	 * @return streetName
	 **/

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Address locality(String locality) {
		this.locality = locality;
		return this;
	}

	/**
	 * locality
	 * 
	 * @return locality
	 **/

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Address city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * city
	 * 
	 * @return city
	 **/

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address county(String county) {
		this.county = county;
		return this;
	}

	/**
	 * County
	 * 
	 * @return county
	 **/

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Address country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Country
	 * 
	 * @return country
	 **/

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address citySubDivisionCode(String citySubDivisionCode) {
		this.citySubDivisionCode = citySubDivisionCode;
		return this;
	}

	/**
	 * City Sub Divison Code
	 * 
	 * @return citySubDivisionCode
	 **/

	public String getCitySubDivisionCode() {
		return citySubDivisionCode;
	}

	public void setCitySubDivisionCode(String citySubDivisionCode) {
		this.citySubDivisionCode = citySubDivisionCode;
	}

	public Address contextId(String contextId) {
		this.contextId = contextId;
		return this;
	}

	/**
	 * Qualifier indicates whether the number is present in the address
	 * database.
	 * 
	 * @return contextId
	 **/

	public String getContextId() {
		return contextId;
	}

	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public Address id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Address Reference Identifier uniquely identifies addresses present in the
	 * address database
	 * 
	 * @return id
	 **/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		return Objects.equals(this.postCode, address.postCode) && Objects.equals(this.houseNumber, address.houseNumber)
				&& Objects.equals(this.houseName, address.houseName)
				&& Objects.equals(this.flatNumber, address.flatNumber)
				&& Objects.equals(this.streetName, address.streetName)
				&& Objects.equals(this.locality, address.locality) && Objects.equals(this.city, address.city)
				&& Objects.equals(this.county, address.county) && Objects.equals(this.country, address.country)
				&& Objects.equals(this.citySubDivisionCode, address.citySubDivisionCode)
				&& Objects.equals(this.contextId, address.contextId) && Objects.equals(this.id, address.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(postCode, houseNumber, houseName, flatNumber, streetName, locality, city, county, country,
				citySubDivisionCode, contextId, id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Address {\n");

		sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
		sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
		sb.append("    houseName: ").append(toIndentedString(houseName)).append("\n");
		sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
		sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
		sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    county: ").append(toIndentedString(county)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
		sb.append("    citySubDivisionCode: ").append(toIndentedString(citySubDivisionCode)).append("\n");
		sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
