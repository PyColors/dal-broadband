package com.vf.uk.dal.broadband.entity.appointment;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Error.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class Error {

	/** The cause. */
	@JsonProperty("cause")
	private Throwable cause = null;

	/** The localized message. */
	@JsonProperty("localizedMessage")
	private String localizedMessage = null;

	/** The message. */
	@JsonProperty("message")
	private String message = null;

	/** The stack trace. */
	@JsonProperty("stackTrace")
	@Valid
	private List<StackTraceElement> stackTrace = null;

	/** The suppressed. */
	@JsonProperty("suppressed")
	@Valid
	private List<Throwable> suppressed = null;

}
