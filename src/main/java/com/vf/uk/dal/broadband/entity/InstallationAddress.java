package com.vf.uk.dal.broadband.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * InstallationAddress.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class InstallationAddress {

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

}
