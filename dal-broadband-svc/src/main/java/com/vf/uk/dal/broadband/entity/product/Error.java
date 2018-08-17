package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Error.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
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
