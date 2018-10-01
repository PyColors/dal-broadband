package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * StackTraceElement.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class StackTraceElement {

	/** The class name. */
	@JsonProperty("className")
	private String className = null;

	/** The file name. */
	@JsonProperty("fileName")
	private String fileName = null;

	/** The line number. */
	@JsonProperty("lineNumber")
	private Integer lineNumber = null;

	/** The method name. */
	@JsonProperty("methodName")
	private String methodName = null;

	/** The native method. */
	@JsonProperty("nativeMethod")
	private Boolean nativeMethod = null;

}
