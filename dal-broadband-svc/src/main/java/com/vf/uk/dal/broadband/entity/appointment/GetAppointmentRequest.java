package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAppointmentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class GetAppointmentRequest implements RequestMessage{
	@JsonProperty("existing")
	private Boolean existing = null;

	@JsonProperty("appointmentDetails")
	private AppointmentDetails appointmentDetails = null;

	/**
	 * @param existing
	 * @return
	 */
	public GetAppointmentRequest existing(Boolean existing) {
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

	/**
	 * @param appointmentDetails
	 * @return
	 */
	public GetAppointmentRequest appointmentDetails(AppointmentDetails appointmentDetails) {
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
		GetAppointmentRequest getAppointmentRequest = (GetAppointmentRequest) o;
		return Objects.equals(this.existing, getAppointmentRequest.existing)
				&& Objects.equals(this.appointmentDetails, getAppointmentRequest.appointmentDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(existing, appointmentDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAppointmentRequest {\n");

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
