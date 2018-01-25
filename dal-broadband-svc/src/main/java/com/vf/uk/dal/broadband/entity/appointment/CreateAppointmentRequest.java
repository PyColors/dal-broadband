package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAppointmentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class CreateAppointmentRequest implements RequestMessage{
	@JsonProperty("existing")
	private Boolean existing = null;

	@JsonProperty("appointmentDetails")
	private AppointmentDetails appointmentDetails = null;

	public CreateAppointmentRequest existing(Boolean existing) {
		this.existing = existing;
		return this;
	}

	/**
	 * Get existing
	 * 
	 * @return existing
	 **/

	public Boolean getExisting() {
		return existing;
	}

	public void setExisting(Boolean existing) {
		this.existing = existing;
	}

	public CreateAppointmentRequest appointmentDetails(AppointmentDetails appointmentDetails) {
		this.appointmentDetails = appointmentDetails;
		return this;
	}

	/**
	 * Get appointmentDetails
	 * 
	 * @return appointmentDetails
	 **/

	@Valid

	public AppointmentDetails getAppointmentDetails() {
		return appointmentDetails;
	}

	public void setAppointmentDetails(AppointmentDetails appointmentDetails) {
		this.appointmentDetails = appointmentDetails;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateAppointmentRequest createAppointmentRequest = (CreateAppointmentRequest) o;
		return Objects.equals(this.existing, createAppointmentRequest.existing)
				&& Objects.equals(this.appointmentDetails, createAppointmentRequest.appointmentDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(existing, appointmentDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateAppointmentRequest {\n");

		sb.append("    existing: ").append(toIndentedString(existing)).append("\n");
		sb.append("    appointmentDetails: ").append(toIndentedString(appointmentDetails)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
