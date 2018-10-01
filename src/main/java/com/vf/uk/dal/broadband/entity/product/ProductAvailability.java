package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ProductAvailability.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class ProductAvailability {

	/** The end. */
	@JsonProperty("end")
	private String end = null;

	/** The sales expired. */
	@JsonProperty("salesExpired")
	private String salesExpired = null;

	/** The start. */
	@JsonProperty("start")
	private String start = null;

}
