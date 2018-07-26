package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Line Request.
 */

public class UpdateLineRequest {
	
	/** The line treatment type. */
	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType;
	
	/**
	 * Gets the line treatment type.
	 *
	 * @return the line treatment type
	 */
	public String getLineTreatmentType() {
		return lineTreatmentType;
	}

	/**
	 * Sets the line treatment type.
	 *
	 * @param lineTreatmentType the new line treatment type
	 */
	public void setLineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}
	

}
