package com.vf.uk.dal.broadband.entity.premise;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Address.
 */
@Data
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

}
