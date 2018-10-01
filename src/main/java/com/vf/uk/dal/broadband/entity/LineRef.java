package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineRef.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class LineRef {

	/** The line identification. */
	@JsonProperty("lineIdentification")
	private LineIdentification lineIdentification = null;

}
