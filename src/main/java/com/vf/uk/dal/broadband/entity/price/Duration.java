package com.vf.uk.dal.broadband.entity.price;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Duration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class Duration {
	@JsonProperty("uOM")
	private String uOM = null;

	@JsonProperty("uom")
	private String uom = null;

	@JsonProperty("value")
	private String value = null;

}
