package com.vf.uk.dal.broadband.entity;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AvailabilityCheckResponse.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-26T12:06:28.563Z")
@Data
public class SelectedAvailabilityCheckResponse extends ResourceSupport {

	/** The installation address. */
	@JsonProperty("installationAddress")
	private InstallationAddress installationAddress = null;

	/** The appointment and availability detail. */
	@JsonProperty("appointmentAndAvailabilityDetail")
	private AppointmentAndAvailabilityDetail appointmentAndAvailabilityDetail = null;

	/** The line speeds. */
	@JsonProperty("lineSpeeds")
	private List<LineSpeeds> lineSpeeds = null;
	
	
	@JsonProperty("packageNames")
	private List<String> packageNames = null;
	
	@JsonProperty("phoneNumber")
	private String phoneNumber = null;
	
	
	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

}
