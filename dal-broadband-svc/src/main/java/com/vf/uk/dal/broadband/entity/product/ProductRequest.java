package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ProductRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class ProductRequest {

	/** The field list. */
	@JsonProperty("fieldList")
	private String fieldList = null;

	/** The ids. */
	@JsonProperty("ids")
	private String ids = null;

}
