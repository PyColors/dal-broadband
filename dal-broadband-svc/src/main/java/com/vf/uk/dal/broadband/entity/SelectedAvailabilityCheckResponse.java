package com.vf.uk.dal.broadband.entity;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AvailabilityCheckResponse.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-26T12:06:28.563Z")

public class SelectedAvailabilityCheckResponse extends ResourceSupport {

	/** The installation address. */
	@JsonProperty("installationAddress")
	private InstallationAddress installationAddress = null;

	/** The appointment and availability detail. */
	@JsonProperty("appointmentAndAvailabilityDetail")
	private AppointmentAndAvailabilityDetail appointmentAndAvailabilityDetail = null;

	/** The line speeds. */
	@JsonProperty("lineSpeeds")
	private LineSpeeds lineSpeeds = null;

	public AppointmentAndAvailabilityDetail getAppointmentAndAvailabilityDetail() {
		return appointmentAndAvailabilityDetail;
	}

	public void setAppointmentAndAvailabilityDetail(AppointmentAndAvailabilityDetail appointmentAndAvailabilityDetail) {
		this.appointmentAndAvailabilityDetail = appointmentAndAvailabilityDetail;
	}

	public InstallationAddress getInstallationAddress() {
		return installationAddress;
	}

	public void setInstallationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
	}

	public LineSpeeds getLineSpeeds() {
		return lineSpeeds;
	}

	public void setLineSpeeds(LineSpeeds lineSpeeds) {
		this.lineSpeeds = lineSpeeds;
	}

}
