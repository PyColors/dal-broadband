package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * InstallationAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class InstallationAddress   {
  @JsonProperty("citySubDivisionName")
  private String citySubDivisionName = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("county")
  private String county = null;

  @JsonProperty("flatNumber")
  private String flatNumber = null;

  @JsonProperty("houseName")
  private String houseName = null;

  @JsonProperty("houseNumber")
  private String houseNumber = null;

  @JsonProperty("identification")
  private Identification identification = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("moveTypeCode")
  private String moveTypeCode = null;

  @JsonProperty("postCode")
  private String postCode = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("town")
  private String town = null;

  /**
   * 
   * @param citySubDivisionName
   * @return
   */
  public InstallationAddress citySubDivisionName(String citySubDivisionName) {
    this.citySubDivisionName = citySubDivisionName;
    return this;
  }

  /**
   * city sub division code
   * @return citySubDivisionName
  **/
  @ApiModelProperty(value = "city sub division code")


  public String getCitySubDivisionName() {
    return citySubDivisionName;
  }

  public void setCitySubDivisionName(String citySubDivisionName) {
    this.citySubDivisionName = citySubDivisionName;
  }

  /**
   * 
   * @param country
   * @return
   */
  public InstallationAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * country
   * @return country
  **/
  @ApiModelProperty(value = "country")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * 
   * @param county
   * @return
   */
  public InstallationAddress county(String county) {
    this.county = county;
    return this;
  }

  /**
   * county
   * @return county
  **/
  @ApiModelProperty(value = "county")


  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  /**
   * 
   * @param flatNumber
   * @return
   */
  public InstallationAddress flatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
    return this;
  }

  /**
   * flat number
   * @return flatNumber
  **/
  @ApiModelProperty(value = "flat number")


  public String getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
  }

  /**
   * 
   * @param houseName
   * @return
   */
  public InstallationAddress houseName(String houseName) {
    this.houseName = houseName;
    return this;
  }

  /**
   * House Name
   * @return houseName
  **/
  @ApiModelProperty(value = "House Name")


  public String getHouseName() {
    return houseName;
  }

  public void setHouseName(String houseName) {
    this.houseName = houseName;
  }

  /**
   * 
   * @param houseNumber
   * @return
   */
  public InstallationAddress houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * House number
   * @return houseNumber
  **/
  @ApiModelProperty(value = "House number")


  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  /**
   * 
   * @param identification
   * @return
   */
  public InstallationAddress identification(Identification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Identification getIdentification() {
    return identification;
  }

  public void setIdentification(Identification identification) {
    this.identification = identification;
  }

  /**
   * 
   * @param locality
   * @return
   */
  public InstallationAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * locality
   * @return locality
  **/
  @ApiModelProperty(value = "locality")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  /**
   * 
   * @param moveTypeCode
   * @return
   */
  public InstallationAddress moveTypeCode(String moveTypeCode) {
    this.moveTypeCode = moveTypeCode;
    return this;
  }

  /**
   * Code iOdentifying whether it is change of address scenario
   * @return moveTypeCode
  **/
  @ApiModelProperty(value = "Code iOdentifying whether it is change of address scenario")


  public String getMoveTypeCode() {
    return moveTypeCode;
  }

  public void setMoveTypeCode(String moveTypeCode) {
    this.moveTypeCode = moveTypeCode;
  }

  /**
   * 
   * @param postCode
   * @return
   */
  public InstallationAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * The postcode of the prospective customer as per the Fixed Line system
   * @return postCode
  **/
  @ApiModelProperty(value = "The postcode of the prospective customer as per the Fixed Line system")


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  /**
   * 
   * @param streetName
   * @return
   */
  public InstallationAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * street name
   * @return streetName
  **/
  @ApiModelProperty(value = "street name")


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public InstallationAddress town(String town) {
    this.town = town;
    return this;
  }

  /**
   * town
   * @return town
  **/
  @ApiModelProperty(value = "town")


  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
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
    return Objects.equals(this.citySubDivisionName, installationAddress.citySubDivisionName) &&
        Objects.equals(this.country, installationAddress.country) &&
        Objects.equals(this.county, installationAddress.county) &&
        Objects.equals(this.flatNumber, installationAddress.flatNumber) &&
        Objects.equals(this.houseName, installationAddress.houseName) &&
        Objects.equals(this.houseNumber, installationAddress.houseNumber) &&
        Objects.equals(this.identification, installationAddress.identification) &&
        Objects.equals(this.locality, installationAddress.locality) &&
        Objects.equals(this.moveTypeCode, installationAddress.moveTypeCode) &&
        Objects.equals(this.postCode, installationAddress.postCode) &&
        Objects.equals(this.streetName, installationAddress.streetName) &&
        Objects.equals(this.town, installationAddress.town);
  }

  @Override
  public int hashCode() {
    return Objects.hash(citySubDivisionName, country, county, flatNumber, houseName, houseNumber, identification, locality, moveTypeCode, postCode, streetName, town);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallationAddress {\n");
    
    sb.append("    citySubDivisionName: ").append(toIndentedString(citySubDivisionName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
    sb.append("    houseName: ").append(toIndentedString(houseName)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    moveTypeCode: ").append(toIndentedString(moveTypeCode)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
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

