package com.vf.uk.dal.broadband.journey.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CurrentJourney.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-13T09:29:52.184Z")
@Data
public class CurrentJourney {

	/** The id. */
	@JsonProperty("id")
	private String id = null;

	/** The username. */
	@JsonProperty("username")
	private String username = null;

	/** The context MSISDN. */
	@JsonProperty("contextMSISDN")
	private String contextMSISDN = null;

	/** The basket id. */
	@JsonProperty("basketId")
	private String basketId = null;

	/** The journey data. */
	@JsonProperty("journeyData")
	private JourneyData journeyData = null;

}
