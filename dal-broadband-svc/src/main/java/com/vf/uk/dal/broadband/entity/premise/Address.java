package com.vf.uk.dal.broadband.entity.premise;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address.
 */

public class Address {
	
	/** The post code. */
	@JsonProperty("postCode")
	private String postCode = null;
	
	/** The house number. */
	@JsonProperty("houseNumber")
	private String houseNumber = null;
	
	/** The house name. */
	@JsonProperty("houseName")
	private String houseName = null;
	
	/** The flat number. */
	@JsonProperty("flatNumber")
	private String flatNumber = null;
	
	/** The street name. */
	@JsonProperty("streetName")
	private String streetName = null;
	
	/** The locality. */
	@JsonProperty("locality")
	private String locality = null;
	
	/** The city. */
	@JsonProperty("city")
	private String city = null;
	
	/** The county. */
	@JsonProperty("county")
	private String county = null;
	
	/** The country. */
	@JsonProperty("country")
	private String country = null;
	
	/** The city sub division code. */
	@JsonProperty("citySubDivisionCode")
	private String citySubDivisionCode = null;
	
	/** The context id. */
	@JsonProperty("contextId")
	private String contextId = null;
	
	/** The id. */
	@JsonProperty("id")
	private String id = null;

	/**
	 * Post code.
	 *
	 * @param postCode the post code
	 * @return the address
	 */
	public Address postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	 * post code.
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
	 * House number.
	 *
	 * @param houseNumber the house number
	 * @return the address
	 */
	public Address houseNumber(String houseNumber) {
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
	 * House name.
	 *
	 * @param houseName the house name
	 * @return the address
	 */
	public Address houseName(String houseName) {
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
	 * Flat number.
	 *
	 * @param flatNumber the flat number
	 * @return the address
	 */
	public Address flatNumber(String flatNumber) {
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
	 * Street name.
	 *
	 * @param streetName the street name
	 * @return the address
	 */
	public Address streetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	/**
	 * StreetName.
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
	 * @return the address
	 */
	public Address locality(String locality) {
		this.locality = locality;
		return this;
	}

	/**
	 * locality.
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
	 * @return the address
	 */
	public Address city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * city.
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
	 * County.
	 *
	 * @param county the county
	 * @return the address
	 */
	public Address county(String county) {
		this.county = county;
		return this;
	}

	/**
	 * County.
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
	 * Country.
	 *
	 * @param country the country
	 * @return the address
	 */
	public Address country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Country.
	 *
	 * @return country
	 */

	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * City sub division code.
	 *
	 * @param citySubDivisionCode the city sub division code
	 * @return the address
	 */
	public Address citySubDivisionCode(String citySubDivisionCode) {
		this.citySubDivisionCode = citySubDivisionCode;
		return this;
	}

	/**
	 * City Sub Divison Code.
	 *
	 * @return citySubDivisionCode
	 */

	public String getCitySubDivisionCode() {
		return citySubDivisionCode;
	}

	/**
	 * Sets the city sub division code.
	 *
	 * @param citySubDivisionCode the new city sub division code
	 */
	public void setCitySubDivisionCode(String citySubDivisionCode) {
		this.citySubDivisionCode = citySubDivisionCode;
	}

	/**
	 * Context id.
	 *
	 * @param contextId the context id
	 * @return the address
	 */
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

	/**
	 * Sets the context id.
	 *
	 * @param contextId the new context id
	 */
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	/**
	 * Id.
	 *
	 * @param id the id
	 * @return the address
	 */
	public Address id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Address Reference Identifier uniquely identifies addresses present in the
	 * address database.
	 *
	 * @return id
	 */

	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(postCode, houseNumber, houseName, flatNumber, streetName, locality, city, county, country,
				citySubDivisionCode, contextId, id);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
