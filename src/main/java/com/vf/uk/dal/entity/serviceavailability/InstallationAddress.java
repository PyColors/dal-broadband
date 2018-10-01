package com.vf.uk.dal.entity.serviceavailability;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * InstallationAddress.
 */
@Data
public class InstallationAddress {

	/** The house number. */
	@JsonProperty("houseNumber")
	private String houseNumber = null;

	/** The flat number. */
	@JsonProperty("flatNumber")
	private String flatNumber = null;

	/** The house name. */
	@JsonProperty("houseName")
	private String houseName = null;

	/** The street name. */
	@JsonProperty("streetName")
	private String streetName = null;

	/** The locality. */
	@JsonProperty("locality")
	private String locality = null;

	/** The city. */
	@JsonProperty("city")
	private String city = null;

	/** The post code. */
	@NotNull
	@Size(min = 1)
	@JsonProperty("postCode")
	private String postCode = null;

	/** The county. */
	@JsonProperty("county")
	private String county = null;

	/** The country code. */
	@JsonProperty("countryCode")
	private String countryCode = null;

	/** The city sub division name. */
	@JsonProperty("citySubDivisionName")
	private String citySubDivisionName = null;

	/** The address reference number. */
	@JsonProperty("addressReferenceNumber")
	private String addressReferenceNumber = null;

	/** The address type. */
	@JsonProperty("addressType")
	private String addressType = null;

	/** The move type code. */
	@JsonProperty("moveTypeCode")
	private MoveTypeCodeEnum moveTypeCode = null;

}
