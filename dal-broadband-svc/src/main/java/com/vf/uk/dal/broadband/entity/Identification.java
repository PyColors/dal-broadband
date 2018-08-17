package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Identification.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class Identification {

	/** The id. */
	@JsonProperty("id")
	private String id = null;

	/** The context id. */
	@JsonProperty("contextId")
	private String contextId = null;

}
