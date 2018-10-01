package com.vf.uk.dal.broadband.journey.entity;

import lombok.Data;

/**
 * JourneyRequest.
 */
@Data
public class JourneyRequest {

	/** The cryptogram. */
	private String cryptogram = null;

	/** The customer details. */
	private CustomerDetails customerDetails = null;

}