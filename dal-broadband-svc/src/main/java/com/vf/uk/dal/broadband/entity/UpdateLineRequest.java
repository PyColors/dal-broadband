package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Line Request
 */

public class UpdateLineRequest {
	
	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType;
	
	public String getLineTreatmentType() {
		return lineTreatmentType;
	}

	public void setLineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}
	

}
