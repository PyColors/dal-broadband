package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OptimizePackageResponse {

	@JsonProperty("hasPackageOptimized")
	private Boolean hasPackageOptimized;

	public Boolean getHasPackageOptimized() {
		return hasPackageOptimized;
	}

	public void setHasPackageOptimized(Boolean hasPackageOptimized) {
		this.hasPackageOptimized = hasPackageOptimized;
	}
	
	
	
}
