package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Product.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Product {

	/** The action. */
	@JsonProperty("action")
	private String action = null;

	/** The product type. */
	@JsonProperty("productType")
	private String productType = null;

	/** The sku id. */
	@JsonProperty("skuId")
	private String skuId = null;

}
