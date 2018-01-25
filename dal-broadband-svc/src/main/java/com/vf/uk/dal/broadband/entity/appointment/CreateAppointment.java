package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAppointment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class CreateAppointment {
	@JsonProperty("resultStatus")
	private String resultStatus = null;

	@JsonProperty("appointmentWindow")
	private AppointmentWindow appointmentWindow = null;

	public CreateAppointment resultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
		return this;
	}

	/**
	 * Get resultStatus
	 * 
	 * @return resultStatus
	 **/

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public CreateAppointment appointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
		return this;
	}

	/**
	 * Get appointmentWindow
	 * 
	 * @return appointmentWindow
	 **/

	@Valid

	public AppointmentWindow getAppointmentWindow() {
		return appointmentWindow;
	}

	public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateAppointment createAppointment = (CreateAppointment) o;
		return Objects.equals(this.resultStatus, createAppointment.resultStatus)
				&& Objects.equals(this.appointmentWindow, createAppointment.appointmentWindow);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resultStatus, appointmentWindow);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateAppointment {\n");

		sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
		sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
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
