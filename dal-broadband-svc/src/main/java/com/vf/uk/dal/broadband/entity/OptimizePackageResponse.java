package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class OptimizePackageResponse.
 */
public class OptimizePackageResponse {

	/** The has package optimized. */
	@JsonProperty("hasPackageOptimized")
	private Boolean hasPackageOptimized;

	/**
	 * Gets the checks for package optimized.
	 *
	 * @return the checks for package optimized
	 */
	public Boolean getHasPackageOptimized() {
		return hasPackageOptimized;
	}

	/**
	 * Sets the checks for package optimized.
	 *
	 * @param hasPackageOptimized the new checks for package optimized
	 */
	public void setHasPackageOptimized(Boolean hasPackageOptimized) {
		this.hasPackageOptimized = hasPackageOptimized;
	}
	
	
	
}
