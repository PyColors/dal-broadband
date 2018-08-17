package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AppointmentWindowList.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class AppointmentWindowList {

	/** The end time. */
	@JsonProperty("endTime")
	private String endTime = null;

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
