package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AddressDetails.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class AddressDetails {

	/** The address. */
	@JsonProperty("address")
	private Address address = null;

	/** The organisation. */
	@JsonProperty("organisation")
	private Organisation organisation = null;

}
