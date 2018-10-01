package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Line Request.
 */
@Data
public class UpdateLineRequest {

	/** The line treatment type. */
	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType;

}
