package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Address.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class Address {

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

}
