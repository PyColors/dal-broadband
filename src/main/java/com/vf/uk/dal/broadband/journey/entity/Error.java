package com.vf.uk.dal.broadband.journey.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Error.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T07:23:46.167Z")
@Data
public class Error {

	/** The code. */
	@JsonProperty("code")
	private String code = null;

	/** The message. */
	@JsonProperty("message")
	private String message = null;

	/** The reference id. */
	@JsonProperty("referenceId")
	private String referenceId = null;

}
