package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CreateAppointmentRequest.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T20:55:40.172Z")
@Data
public class CreateAppointmentRequest {

	/** The start time period. */
	@JsonProperty("startTimePeriod")
	private String startTimePeriod = null;

	/** The time slot. */
	@JsonProperty("timeSlot")
	private String timeSlot = null;

	/** The site note. */
	@JsonProperty("siteNote")
	private SiteNote siteNote = null;

	/** The remove from phone directory. */
	@JsonProperty("removeFromPhoneDirectory")
	private Boolean removeFromPhoneDirectory = null;

	/** The end time. */
	@JsonProperty("endTime")
	private String endTime = null;

	/** The start time. */
	@JsonProperty("startTime")
	private String startTime = null;

}
