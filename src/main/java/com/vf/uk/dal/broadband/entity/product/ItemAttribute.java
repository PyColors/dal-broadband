package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ItemAttribute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class ItemAttribute {
	@JsonProperty("key")
	private String key = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("valueUOM")
	private String valueUOM = null;

}
