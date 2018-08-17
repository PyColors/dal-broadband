package com.vf.uk.dal.broadband.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BundleDetails.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")
@Data
public class BundleDetails {

	/** The message. */
	@JsonProperty("message")
	private String message = null;

	/** The plan list. */
	@JsonProperty("planList")
	@Valid
	private List<BundleHeader> planList = null;

}
