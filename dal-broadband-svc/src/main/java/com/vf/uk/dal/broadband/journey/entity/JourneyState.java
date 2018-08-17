package com.vf.uk.dal.broadband.journey.entity;

import lombok.Data;

/**
 * JourneyState.
 */
@Data
public class JourneyState {

	/** The name. */
	private String name = null;

	/** The state. */
	private String state = null;

	/** The basket id. */
	private String basketId = null;

	/** The context MSISDN. */
	private String contextMSISDN = null;

}
