package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PendingOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketPendingOrder {
	@JsonProperty("completionDate")
	private String completionDate = null;

	@JsonProperty("thirdPartyFlag")
	private String thirdPartyFlag = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

}
