package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * InstallationAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class InstallationAddress {
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

}
