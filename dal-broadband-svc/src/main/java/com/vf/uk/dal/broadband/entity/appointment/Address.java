package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class Address {
	@JsonProperty("lineOne")
	private String lineOne = null;

	@JsonProperty("lineTwo")
	private String lineTwo = null;

	@JsonProperty("lineThree")
	private String lineThree = null;

	@JsonProperty("lineFour")
	private String lineFour = null;

	@JsonProperty("building")
	private String building = null;
	
	@JsonProperty("cityName")
	private String cityName = null;

	@JsonProperty("countyName")
	private String countyName = null;

	@JsonProperty("countryCode")
	private String countryCode = null;

	@JsonProperty("citySubDivisionName")
	private String citySubDivisionName = null;

	@JsonProperty("PostalCode")
	private String postalCode = null;

	@JsonProperty("identificationId")
	private String identificationId = null;

	public Address lineOne(String lineOne) {
		this.lineOne = lineOne;
		return this;
	}

	/**
	 * Street Name.
	 * 
	 * @return lineOne
	 **/

	public String getLineOne() {
		return lineOne;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public Address lineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
		return this;
	}

	/**
	 * Locality.
	 * 
	 * @return lineTwo
	 **/

	public String getLineTwo() {
		return lineTwo;
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	public Address lineThree(String lineThree) {
		this.lineThree = lineThree;
		return this;
	}

	/**
	 * House Number.
	 * 
	 * @return lineThree
	 **/

	public String getLineThree() {
		return lineThree;
	}

	public void setLineThree(String lineThree) {
		this.lineThree = lineThree;
	}

	public Address lineFour(String lineFour) {
		this.lineFour = lineFour;
		return this;
	}

	/**
	 * Flat Number.
	 * 
	 * @return lineFour
	 **/

	public String getLineFour() {
		return lineFour;
	}

	public void setLineFour(String lineFour) {
		this.lineFour = lineFour;
	}

	public Address cityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	/**
	 * City.
	 * 
	 * @return cityName
	 **/

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Address countyName(String countyName) {
		this.countyName = countyName;
		return this;
	}

	/**
	 * CountyName.
	 * 
	 * @return countyName
	 **/

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public Address countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * CountryCode.
	 * 
	 * @return countryCode
	 **/

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Address citySubDivisionName(String citySubDivisionName) {
		this.citySubDivisionName = citySubDivisionName;
		return this;
	}

	/**
	 * A unique code that identifies the District..
	 * 
	 * @return citySubDivisionName
	 **/

	public String getCitySubDivisionName() {
		return citySubDivisionName;
	}

	public void setCitySubDivisionName(String citySubDivisionName) {
		this.citySubDivisionName = citySubDivisionName;
	}

	public Address postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * PostalCode.
	 * 
	 * @return postalCode
	 **/

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Address identificationId(String identificationId) {
		this.identificationId = identificationId;
		return this;
	}

	/**
	 * Address reference number that uniquely identifies the address in the
	 * address database..
	 * 
	 * @return identificationId
	 **/

	public String getIdentificationId() {
		return identificationId;
	}

	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
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
		return Objects.equals(this.lineOne, address.lineOne) && Objects.equals(this.lineTwo, address.lineTwo)
				&& Objects.equals(this.lineThree, address.lineThree) && Objects.equals(this.lineFour, address.lineFour)
				&& Objects.equals(this.cityName, address.cityName)
				&& Objects.equals(this.countyName, address.countyName)
				&& Objects.equals(this.countryCode, address.countryCode)
				&& Objects.equals(this.citySubDivisionName, address.citySubDivisionName)
				&& Objects.equals(this.postalCode, address.postalCode)
				&& Objects.equals(this.identificationId, address.identificationId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineOne, lineTwo, lineThree, lineFour, cityName, countyName, countryCode,
				citySubDivisionName, postalCode, identificationId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Address {\n");

		sb.append("    lineOne: ").append(toIndentedString(lineOne)).append("\n");
		sb.append("    lineTwo: ").append(toIndentedString(lineTwo)).append("\n");
		sb.append("    lineThree: ").append(toIndentedString(lineThree)).append("\n");
		sb.append("    lineFour: ").append(toIndentedString(lineFour)).append("\n");
		sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
		sb.append("    countyName: ").append(toIndentedString(countyName)).append("\n");
		sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
		sb.append("    citySubDivisionName: ").append(toIndentedString(citySubDivisionName)).append("\n");
		sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
		sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
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
