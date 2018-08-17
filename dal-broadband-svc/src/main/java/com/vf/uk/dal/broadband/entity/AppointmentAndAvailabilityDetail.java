package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AppointmentAndAvailabilityDetail.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class AppointmentAndAvailabilityDetail {

	/** The appointment needed. */
	@JsonProperty("appointmentNeeded")
	private Boolean appointmentNeeded = null;

	/** The earliest available date. */
	@JsonProperty("earliestAvailableDate")
	private String earliestAvailableDate = null;

	/** The line treatment type. */
	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

	/** The can number be retained. */
	@JsonProperty("canNumberBeRetained")
	private String canNumberBeRetained = null;

}
