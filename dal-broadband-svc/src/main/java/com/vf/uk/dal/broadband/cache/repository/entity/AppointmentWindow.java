/*
 * Journey APIs
 * Journey APIs for Authenticated Journeys
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppointmentWindow
 */
public class AppointmentWindow implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -668687293347074917L;

	@JsonProperty("identificationId")
	private String identificationId = null;

	@JsonProperty("startDateTime")
	private String startDateTime = null;

	@JsonProperty("operationalPreferenceCode")
	private String operationalPreferenceCode = null;

	@JsonProperty("timeSlot")
	private String timeSlot = null;

	public AppointmentWindow identificationId(String identificationId) {
		this.identificationId = identificationId;
		return this;
	}

	/**
	 * Get identificationId
	 * 
	 * @return identificationId
	 **/
	public String getIdentificationId() {
		return identificationId;
	}

	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
	}

	public AppointmentWindow startDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
		return this;
	}

	/**
	 * Earliest required appointment date.
	 * 
	 * @return startDateTime
	 **/
	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public AppointmentWindow operationalPreferenceCode(String operationalPreferenceCode) {
		this.operationalPreferenceCode = operationalPreferenceCode;
		return this;
	}

	/**
	 * The type of.window retrieved which determines whether the appointment is
	 * made during or outside of working hours
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
	 * Time slot at which the appointment should be reserved.
	 * 
	 * @return timeSlot
	 **/
	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
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
		return Objects.equals(this.identificationId, appointmentWindow.identificationId)
				&& Objects.equals(this.startDateTime, appointmentWindow.startDateTime)
				&& Objects.equals(this.operationalPreferenceCode, appointmentWindow.operationalPreferenceCode)
				&& Objects.equals(this.timeSlot, appointmentWindow.timeSlot);
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificationId, startDateTime, operationalPreferenceCode, timeSlot);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppointmentWindow {\n");

		sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
		sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
		sb.append("    operationalPreferenceCode: ").append(toIndentedString(operationalPreferenceCode)).append("\n");
		sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
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
