package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Error.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class Error {

	/** The code. */
	@JsonProperty("errorCode")
	private String errorCode = null;

	/** The message. */
	@JsonProperty("errorMessage")
	private String errorMessage = null;

	/** The reference id. */
	@JsonProperty("referenceId")
	private String referenceId = null;

}
