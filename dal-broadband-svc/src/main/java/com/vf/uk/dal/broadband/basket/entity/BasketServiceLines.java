package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ServiceLines
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketServiceLines {
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	@JsonProperty("lineTreatments")
	@Valid
	private List<BasketLineTreatment> lineTreatments = null;

	@JsonProperty("networkType")
	private String networkType = null;

	@JsonProperty("serviceLines")
	@Valid
	private List<BasketServiceLine> serviceLines = null;

}
