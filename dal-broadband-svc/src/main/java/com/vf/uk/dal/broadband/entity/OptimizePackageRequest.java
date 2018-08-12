package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class OptimizePackageRequest.
 */
public class OptimizePackageRequest {

	/** The journey id. */
	@JsonProperty("journeyId")
	private String journeyId;

	/**
	 * Gets the journey id.
	 *
	 * @return the journey id
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * Sets the journey id.
	 *
	 * @param journeyId the new journey id
	 */
	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

}
