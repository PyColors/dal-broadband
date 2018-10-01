package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class OptimizePackageRequest.
 */
@Data
public class OptimizePackageRequest {

	/** The journey id. */
	@JsonProperty("journeyId")
	private String journeyId;

}
