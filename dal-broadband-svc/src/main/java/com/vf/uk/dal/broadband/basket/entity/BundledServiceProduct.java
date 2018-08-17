package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BundledServiceProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data

public class BundledServiceProduct {
	@JsonProperty("description")
	private String description = null;

	@JsonProperty("miscellaneous")
	@Valid
	private List<Attribute> miscellaneous = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("priceDetail")
	private ServicePrice priceDetail = null;

	@JsonProperty("productClass")
	private String productClass = null;

	@JsonProperty("skuId")
	private String skuId = null;

}
