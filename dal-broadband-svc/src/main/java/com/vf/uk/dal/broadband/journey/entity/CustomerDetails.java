package com.vf.uk.dal.broadband.journey.entity;

import lombok.Data;

/**
 * CustomerDetails.
 */
@Data
public class CustomerDetails {

	/** The username. */
	private String username = null;

	/** The journey type. */
	private String journeyType = null;

	/** The basket id. */
	private String basketId = null;

	/** The credit details. */
	private CreditDetails creditDetails = null;

}
