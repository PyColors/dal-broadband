package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CardinalityIncompatibility
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data

public class CardinalityIncompatibility {
	@JsonProperty("groupCardinality")
	private String groupCardinality = null;

	@JsonProperty("productIds")
	@Valid
	private List<String> productIds = null;

	@JsonProperty("relationCardinality")
	private String relationCardinality = null;

}
