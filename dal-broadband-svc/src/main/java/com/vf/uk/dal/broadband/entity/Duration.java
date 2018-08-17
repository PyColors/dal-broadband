package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Duration.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class Duration {

	/** The uom. */
	@JsonProperty("uom")
	private String uom = null;

	/** The value. */
	@JsonProperty("value")
	private String value = null;

}
