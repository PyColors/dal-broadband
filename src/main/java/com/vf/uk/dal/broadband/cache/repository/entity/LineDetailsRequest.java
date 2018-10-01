package com.vf.uk.dal.broadband.cache.repository.entity;

import lombok.Data;

/**
 * LineDetailsRequest
 */
@Data

public class LineDetailsRequest {
	private String lineTreatmentType = null;

	private String flbbNumber = null;

	private String classificationCode = null;

	private String earliestAvailableDate = null;

}
