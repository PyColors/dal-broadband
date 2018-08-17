package com.vf.uk.dal.broadband.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AppointmentList.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-14T14:47:09.485Z")
@Data
public class AppointmentList {

	/** The start date. */
	@JsonProperty("startDate")
	private String startDate = null;

	/** The time slots. */
	@JsonProperty("timeSlots")
	@Valid
	private List<String> timeSlots = null;

	/** The start time. */
	@JsonProperty("startTime")
	private String startTime = null;

	/** The end time. */
	@JsonProperty("endTime")
	private String endTime = null;

}
