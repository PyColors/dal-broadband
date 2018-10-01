package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class OptimizePackageResponse.
 */
@Data
public class OptimizePackageResponse {

	/** The has package optimized. */
	@JsonProperty("hasPackageOptimized")
	private Boolean hasPackageOptimized;

}
