package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * MediaLink.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class MediaLinks {

	/** The id. */
	@JsonProperty("id")
	private String id = null;

	/** The type. */
	@JsonProperty("type")
	private String type = null;

	/** The value. */
	@JsonProperty("value")
	private String value = null;

}
