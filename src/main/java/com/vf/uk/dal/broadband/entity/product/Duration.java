package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Duration.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class Duration {

	/** The starts. */
	@JsonProperty("starts")
	private String starts = null;

	/** The uom. */
	@JsonProperty("uom")
	private String uom = null;

	/** The value. */
	@JsonProperty("value")
	private String value = null;

}
