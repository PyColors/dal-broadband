package com.vf.uk.dal.broadband.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ServiceStartDates.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class ServiceStartDates {

	/** The dates. */
	@JsonProperty("dates")
	private List<String> dates = null;

}
