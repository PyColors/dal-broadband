package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AppointmentWindow.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class AppointmentWindow {

	/** The application id. */
	@JsonProperty("applicationId")
	private String applicationId = null;

	/** The end time. */
	@JsonProperty("endTime")
	private String endTime = null;

	/** The operational preference code. */
	@JsonProperty("operationalPreferenceCode")
	private String operationalPreferenceCode = null;

	/** The start time. */
	@JsonProperty("startTime")
	private String startTime = null;

	/** The start time period. */
	@JsonProperty("startTimePeriod")
	private String startTimePeriod = null;

	/** The time slot. */
	@JsonProperty("timeSlot")
	private String timeSlot = null;

}
