package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AppointmentDetails.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class AppointmentDetails {

	/** The address details. */
	@JsonProperty("addressDetails")
	private AddressDetails addressDetails = null;

	/** The appointment window. */
	@JsonProperty("appointmentWindow")
	private AppointmentWindow appointmentWindow = null;

	/** The service request. */
	@JsonProperty("serviceRequest")
	private ServiceRequest serviceRequest = null;

}
