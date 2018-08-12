package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * InstallationAddress.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class InstallationAddress   {
  
  /** The identification. */
  @JsonProperty("identification")
  private Identification identification = null;

  /** The post code. */
  @JsonProperty("postCode")
  private String postCode = null;

  /** The house name. */
  @JsonProperty("houseName")
  private String houseName = null;

  /** The house number. */
  @JsonProperty("houseNumber")
  private String houseNumber = null;

  /** The flat number. */
  @JsonProperty("flatNumber")
  private String flatNumber = null;

  /** The street name. */
  @JsonProperty("streetName")
  private String streetName = null;

  /** The town. */
  @JsonProperty("town")
  private String town = null;

  /** The county. */
  @JsonProperty("county")
  private String county = null;

  /** The country. */
  @JsonProperty("country")
  private String country = null;

  /** The locality. */
  @JsonProperty("locality")
  private String locality = null;

  /** The city sub division name. */
  @JsonProperty("citySubDivisionName")
  private String citySubDivisionName = null;

  /** The move type code. */
  @JsonProperty("moveTypeCode")
  private String moveTypeCode = null;

  /**
   * Identification.
   *
   * @param identification the identification
   * @return the installation address
   */
  public InstallationAddress identification(Identification identification) {
    this.identification = identification;
    return this;
  }

   /**
    * Get identification.
    *
    * @return identification
    */
  @ApiModelProperty(value = "")

  @Valid

  public Identification getIdentification() {
    return identification;
  }

  /**
   * Sets the identification.
   *
   * @param identification the new identification
   */
  public void setIdentification(Identification identification) {
    this.identification = identification;
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
    * The postcode of the prospective customer as per the Fixed Line system.
    *
    * @return postCode
    */
  @ApiModelProperty(value = "The postcode of the prospective customer as per the Fixed Line system")


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
  @ApiModelProperty(value = "House Name")


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
    * House number.
    *
    * @return houseNumber
    */
  @ApiModelProperty(value = "House number")


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
    * flat number.
    *
    * @return flatNumber
    */
  @ApiModelProperty(value = "flat number")


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
   * @return the installation address
   */
  public InstallationAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
    * street name.
    *
    * @return streetName
    */
  @ApiModelProperty(value = "street name")


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
   * Town.
   *
   * @param town the town
   * @return the installation address
   */
  public InstallationAddress town(String town) {
    this.town = town;
    return this;
  }

   /**
    * town.
    *
    * @return town
    */
  @ApiModelProperty(value = "town")


  public String getTown() {
    return town;
  }

  /**
   * Sets the town.
   *
   * @param town the new town
   */
  public void setTown(String town) {
    this.town = town;
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
    * county.
    *
    * @return county
    */
  @ApiModelProperty(value = "county")


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
   * @return the installation address
   */
  public InstallationAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
    * country.
    *
    * @return country
    */
  @ApiModelProperty(value = "country")


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
    * locality.
    *
    * @return locality
    */
  @ApiModelProperty(value = "locality")


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
    * city sub division code.
    *
    * @return citySubDivisionName
    */
  @ApiModelProperty(value = "city sub division code")


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
   * Move type code.
   *
   * @param moveTypeCode the move type code
   * @return the installation address
   */
  public InstallationAddress moveTypeCode(String moveTypeCode) {
    this.moveTypeCode = moveTypeCode;
    return this;
  }

   /**
    * Code identifying whether it is change of address scenario.
    *
    * @return moveTypeCode
    */
  @ApiModelProperty(value = "Code identifying whether it is change of address scenario")


  public String getMoveTypeCode() {
    return moveTypeCode;
  }

  /**
   * Sets the move type code.
   *
   * @param moveTypeCode the new move type code
   */
  public void setMoveTypeCode(String moveTypeCode) {
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
    return Objects.equals(this.identification, installationAddress.identification) &&
        Objects.equals(this.postCode, installationAddress.postCode) &&
        Objects.equals(this.houseName, installationAddress.houseName) &&
        Objects.equals(this.houseNumber, installationAddress.houseNumber) &&
        Objects.equals(this.flatNumber, installationAddress.flatNumber) &&
        Objects.equals(this.streetName, installationAddress.streetName) &&
        Objects.equals(this.town, installationAddress.town) &&
        Objects.equals(this.county, installationAddress.county) &&
        Objects.equals(this.country, installationAddress.country) &&
        Objects.equals(this.locality, installationAddress.locality) &&
        Objects.equals(this.citySubDivisionName, installationAddress.citySubDivisionName) &&
        Objects.equals(this.moveTypeCode, installationAddress.moveTypeCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(identification, postCode, houseName, houseNumber, flatNumber, streetName, town, county, country, locality, citySubDivisionName, moveTypeCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallationAddress {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    houseName: ").append(toIndentedString(houseName)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    citySubDivisionName: ").append(toIndentedString(citySubDivisionName)).append("\n");
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

