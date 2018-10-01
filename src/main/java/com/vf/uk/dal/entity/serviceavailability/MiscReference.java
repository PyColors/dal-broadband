package com.vf.uk.dal.entity.serviceavailability;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * MiscReference.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T12:15:55.201Z")
@Data
public class MiscReference {

	/** The anfp. */
	@JsonProperty("ANFP")
	private String ANFP = null;

	/** The customer agreed date. */
	@JsonProperty("customerAgreedDate")
	private String customerAgreedDate = null;

	/** The installation type. */
	@JsonProperty("installationType")
	private String installationType = null;

	/** The line length. */
	@JsonProperty("lineLength")
	private String lineLength = null;

	/** The ready for service date. */
	@JsonProperty("readyForServiceDate")
	private String readyForServiceDate = null;

	/** The service provider name. */
	@JsonProperty("serviceProviderName")
	private String serviceProviderName = null;

}
