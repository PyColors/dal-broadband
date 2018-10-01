package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Metadata.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Metadata {

	/** The basket status. */
	@JsonProperty("basketStatus")
	private String basketStatus = null;

	/** The reason. */
	@JsonProperty("reason")
	private String reason = null;

	/** The return URL. */
	@JsonProperty("returnURL")
	private String returnURL = null;

	/** The sales order id. */
	@JsonProperty("salesOrderId")
	private String salesOrderId = null;

}
