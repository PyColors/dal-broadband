package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * GetAppointmentRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class GetAppointmentRequest {

	/** The appointment details. */
	@JsonProperty("appointmentDetails")
	private AppointmentDetails appointmentDetails = null;

	/** The existing. */
	@JsonProperty("existing")
	private Boolean existing = null;

}
