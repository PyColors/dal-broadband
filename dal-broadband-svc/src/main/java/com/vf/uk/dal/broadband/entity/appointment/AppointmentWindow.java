package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppointmentWindow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class AppointmentWindow {
	@JsonProperty("startTimePeriod")
	private String startTimePeriod = null;

	@JsonProperty("operationalPreferenceCode")
	private String operationalPreferenceCode = null;

	@JsonProperty("timeSlot")
	private String timeSlot = null;

	@JsonProperty("applicationId")
	private String applicationId = null;

	public AppointmentWindow startTimePeriod(String startTimePeriod) {
		this.startTimePeriod = startTimePeriod;
		return this;
	}

	/**
	 * Earliest required appointment date. The format should be dd/mm/yyyy or
	 * Date at which appointment needs ot be booked.
	 * 
	 * @return startTimePeriod
	 **/

	public String getStartTimePeriod() {
		return startTimePeriod;
	}

	public void setStartTimePeriod(String startTimePeriod) {
		this.startTimePeriod = startTimePeriod;
	}

	public AppointmentWindow operationalPreferenceCode(String operationalPreferenceCode) {
		this.operationalPreferenceCode = operationalPreferenceCode;
		return this;
	}

	/**
	 * The type of.window retrieved which determines whether the appointment is
	 * made during or outside of working hours LOV - STANDARD OR FLEXIBLE.
	 * 
	 * @return operationalPreferenceCode
	 **/

	public String getOperationalPreferenceCode() {
		return operationalPreferenceCode;
	}

	public void setOperationalPreferenceCode(String operationalPreferenceCode) {
		this.operationalPreferenceCode = operationalPreferenceCode;
	}

	public AppointmentWindow timeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
		return this;
	}

	/**
	 * Time slot by which appointment needs to be booked LOV - AM, PM, EV, EM.
	 * 
	 * @return timeSlot
	 **/

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public AppointmentWindow applicationId(String applicationId) {
		this.applicationId = applicationId;
		return this;
	}

	/**
	 * Get applicationId
	 * 
	 * @return applicationId
	 **/

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppointmentWindow appointmentWindow = (AppointmentWindow) o;
		return Objects.equals(this.startTimePeriod, appointmentWindow.startTimePeriod)
				&& Objects.equals(this.operationalPreferenceCode, appointmentWindow.operationalPreferenceCode)
				&& Objects.equals(this.timeSlot, appointmentWindow.timeSlot)
				&& Objects.equals(this.applicationId, appointmentWindow.applicationId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(startTimePeriod, operationalPreferenceCode, timeSlot, applicationId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppointmentWindow {\n");

		sb.append("    startTimePeriod: ").append(toIndentedString(startTimePeriod)).append("\n");
		sb.append("    operationalPreferenceCode: ").append(toIndentedString(operationalPreferenceCode)).append("\n");
		sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
		sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
