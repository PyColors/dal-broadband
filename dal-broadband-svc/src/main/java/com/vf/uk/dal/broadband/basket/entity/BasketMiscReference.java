package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BasketMiscReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T09:39:43.102Z")
@Data
public class BasketMiscReference {
	@JsonProperty("anfp")
	private String anfp = null;

	@JsonProperty("classificationCode")
	private String classificationCode = null;

	@JsonProperty("customerAgreedDate")
	private String customerAgreedDate = null;

	@JsonProperty("installationType")
	private String installationType = null;

	@JsonProperty("lineLength")
	private String lineLength = null;

	@JsonProperty("readyForServiceDate")
	private String readyForServiceDate = null;

	@JsonProperty("serviceProviderName")
	private String serviceProviderName = null;

	
}
