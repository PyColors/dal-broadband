package com.vf.uk.dal.broadband.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AvailabilityCheckRequest.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class AvailabilityCheckRequest {

	/** The line ref. */
	@JsonProperty("lineRef")
	private LineRef lineRef = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private List<String> classificationCode = null;

	/** The category. */
	@JsonProperty("category")
	private String category = null;

}
