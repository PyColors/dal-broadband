package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AppointmentWindow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class AppointmentWindow {
	@JsonProperty("identificationId")
	private String identificationId = null;

	@JsonProperty("operationalPreferenceCode")
	private String operationalPreferenceCode = null;

	@JsonProperty("siteNotes")
	@Valid
	private List<SiteNote> siteNotes = null;

	@JsonProperty("startDateTime")
	private String startDateTime = null;

	@JsonProperty("timeSlot")
	private String timeSlot = null;
	
	@JsonProperty("startTime")
	private String startTime;
	
	@JsonProperty("endTime")
	private String endTime;

}
