package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Address.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class Address   {
  
  /** The building. */
  @JsonProperty("building")
  private String building = null;

  /** The city name. */
  @JsonProperty("cityName")
  private String cityName = null;

  /** The city sub division name. */
  @JsonProperty("citySubDivisionName")
  private String citySubDivisionName = null;

  /** The country code. */
  @JsonProperty("countryCode")
  private String countryCode = null;

  /** The county name. */
  @JsonProperty("countyName")
  private String countyName = null;

  /** The identification id. */
  @JsonProperty("identificationId")
  private String identificationId = null;

  /** The line four. */
  @JsonProperty("lineFour")
  private String lineFour = null;

  /** The line one. */
  @JsonProperty("lineOne")
  private String lineOne = null;

  /** The line three. */
  @JsonProperty("lineThree")
  private String lineThree = null;

  /** The line two. */
  @JsonProperty("lineTwo")
  private String lineTwo = null;

  /** The postal code. */
  @JsonProperty("postalCode")
  private String postalCode = null;

  /**
   * Building.
   *
   * @param building the building
   * @return the address
   */
  public Address building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Building.
   * @return building
  **/
  @ApiModelProperty(value = "Building.")


  public String getBuilding() {
    return building;
  }

  /**
   * Sets the building.
   *
   * @param building the new building
   */
  public void setBuilding(String building) {
    this.building = building;
  }

  /**
   * City name.
   *
   * @param cityName the city name
   * @return the address
   */
  public Address cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  /**
   * City.
   * @return cityName
  **/
  @ApiModelProperty(value = "City.")


  public String getCityName() {
    return cityName;
  }

  /**
   * Sets the city name.
   *
   * @param cityName the new city name
   */
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  /**
   * City sub division name.
   *
   * @param citySubDivisionName the city sub division name
   * @return the address
   */
  public Address citySubDivisionName(String citySubDivisionName) {
    this.citySubDivisionName = citySubDivisionName;
    return this;
  }

  /**
   * A unique code that identifies the District..
   * @return citySubDivisionName
  **/
  @ApiModelProperty(value = "A unique code that identifies the District..")


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
   * Country code.
   *
   * @param countryCode the country code
   * @return the address
   */
  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * CountryCode.
   * @return countryCode
  **/
  @ApiModelProperty(value = "CountryCode.")


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
   * County name.
   *
   * @param countyName the county name
   * @return the address
   */
  public Address countyName(String countyName) {
    this.countyName = countyName;
    return this;
  }

  /**
   * CountyName.
   * @return countyName
  **/
  @ApiModelProperty(value = "CountyName.")


  public String getCountyName() {
    return countyName;
  }

  /**
   * Sets the county name.
   *
   * @param countyName the new county name
   */
  public void setCountyName(String countyName) {
    this.countyName = countyName;
  }

  /**
   * Identification id.
   *
   * @param identificationId the identification id
   * @return the address
   */
  public Address identificationId(String identificationId) {
    this.identificationId = identificationId;
    return this;
  }

  /**
   * Address reference number that uniquely identifies the address in the address database..
   * @return identificationId
  **/
  @ApiModelProperty(value = "Address reference number that uniquely identifies the address in the address database..")


  public String getIdentificationId() {
    return identificationId;
  }

  /**
   * Sets the identification id.
   *
   * @param identificationId the new identification id
   */
  public void setIdentificationId(String identificationId) {
    this.identificationId = identificationId;
  }

  /**
   * Line four.
   *
   * @param lineFour the line four
   * @return the address
   */
  public Address lineFour(String lineFour) {
    this.lineFour = lineFour;
    return this;
  }

  /**
   * Flat Number.
   * @return lineFour
  **/
  @ApiModelProperty(value = "Flat Number.")


  public String getLineFour() {
    return lineFour;
  }

  /**
   * Sets the line four.
   *
   * @param lineFour the new line four
   */
  public void setLineFour(String lineFour) {
    this.lineFour = lineFour;
  }

  /**
   * Line one.
   *
   * @param lineOne the line one
   * @return the address
   */
  public Address lineOne(String lineOne) {
    this.lineOne = lineOne;
    return this;
  }

  /**
   * Street Name.
   * @return lineOne
  **/
  @ApiModelProperty(value = "Street Name.")


  public String getLineOne() {
    return lineOne;
  }

  /**
   * Sets the line one.
   *
   * @param lineOne the new line one
   */
  public void setLineOne(String lineOne) {
    this.lineOne = lineOne;
  }

  /**
   * Line three.
   *
   * @param lineThree the line three
   * @return the address
   */
  public Address lineThree(String lineThree) {
    this.lineThree = lineThree;
    return this;
  }

  /**
   * House Number.
   * @return lineThree
  **/
  @ApiModelProperty(value = "House Number.")


  public String getLineThree() {
    return lineThree;
  }

  /**
   * Sets the line three.
   *
   * @param lineThree the new line three
   */
  public void setLineThree(String lineThree) {
    this.lineThree = lineThree;
  }

  /**
   * Line two.
   *
   * @param lineTwo the line two
   * @return the address
   */
  public Address lineTwo(String lineTwo) {
    this.lineTwo = lineTwo;
    return this;
  }

  /**
   * Locality.
   * @return lineTwo
  **/
  @ApiModelProperty(value = "Locality.")


  public String getLineTwo() {
    return lineTwo;
  }

  /**
   * Sets the line two.
   *
   * @param lineTwo the new line two
   */
  public void setLineTwo(String lineTwo) {
    this.lineTwo = lineTwo;
  }

  /**
   * Postal code.
   *
   * @param postalCode the postal code
   * @return the address
   */
  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * PostalCode.
   * @return postalCode
  **/
  @ApiModelProperty(value = "PostalCode.")


  public String getPostalCode() {
    return postalCode;
  }

  /**
   * Sets the postal code.
   *
   * @param postalCode the new postal code
   */
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
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
    return Objects.equals(this.building, address.building) &&
        Objects.equals(this.cityName, address.cityName) &&
        Objects.equals(this.citySubDivisionName, address.citySubDivisionName) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.countyName, address.countyName) &&
        Objects.equals(this.identificationId, address.identificationId) &&
        Objects.equals(this.lineFour, address.lineFour) &&
        Objects.equals(this.lineOne, address.lineOne) &&
        Objects.equals(this.lineThree, address.lineThree) &&
        Objects.equals(this.lineTwo, address.lineTwo) &&
        Objects.equals(this.postalCode, address.postalCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(building, cityName, citySubDivisionName, countryCode, countyName, identificationId, lineFour, lineOne, lineThree, lineTwo, postalCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    citySubDivisionName: ").append(toIndentedString(citySubDivisionName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countyName: ").append(toIndentedString(countyName)).append("\n");
    sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
    sb.append("    lineFour: ").append(toIndentedString(lineFour)).append("\n");
    sb.append("    lineOne: ").append(toIndentedString(lineOne)).append("\n");
    sb.append("    lineThree: ").append(toIndentedString(lineThree)).append("\n");
    sb.append("    lineTwo: ").append(toIndentedString(lineTwo)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

