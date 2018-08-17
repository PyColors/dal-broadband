package com.vf.uk.dal.broadband.journey.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Journey.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T14:15:49.915Z")
@Data
public class Journey {

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
	private List<JourneyData> journeyData = null;

}
