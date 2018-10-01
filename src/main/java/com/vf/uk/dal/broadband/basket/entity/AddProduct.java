package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AddProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class AddProduct {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("attributes")
	@Valid
	private List<Attribute> attributes = null;

	@JsonProperty("skuId")
	private String skuId = null;

}
