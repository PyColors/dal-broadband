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
 * AppointmentWindow.
 */
public class AppointmentWindow implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -668687293347074917L;

	/** The identification id. */
	@JsonProperty("identificationId")
	private String identificationId = null;

	/** The start date time. */
	@JsonProperty("startDateTime")
	private String startDateTime = null;

	/** The operational preference code. */
	@JsonProperty("operationalPreferenceCode")
	private String operationalPreferenceCode = null;

	/** The time slot. */
	@JsonProperty("timeSlot")
	private String timeSlot = null;

	/**
	 * Identification id.
	 *
	 * @param identificationId the identification id
	 * @return the appointment window
	 */
	public AppointmentWindow identificationId(String identificationId) {
		this.identificationId = identificationId;
		return this;
	}

	/**
	 * Get identificationId.
	 *
	 * @return identificationId
	 */
	public String getIdentificationId() {
		return identificationId;
	}

	/**
	 * Sets the identification id.
	 *
	 * @param identificationId the new identification id
	 */
	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
	}

	/**
	 * Start date time.
	 *
	 * @param startDateTime the start date time
	 * @return the appointment window
	 */
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

	/**
	 * Sets the start date time.
	 *
	 * @param startDateTime the new start date time
	 */
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	/**
	 * Operational preference code.
	 *
	 * @param operationalPreferenceCode the operational preference code
	 * @return the appointment window
	 */
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

	/**
	 * Sets the operational preference code.
	 *
	 * @param operationalPreferenceCode the new operational preference code
	 */
	public void setOperationalPreferenceCode(String operationalPreferenceCode) {
		this.operationalPreferenceCode = operationalPreferenceCode;
	}

	/**
	 * Time slot.
	 *
	 * @param timeSlot the time slot
	 * @return the appointment window
	 */
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

	/**
	 * Sets the time slot.
	 *
	 * @param timeSlot the new time slot
	 */
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(identificationId, startDateTime, operationalPreferenceCode, timeSlot);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
	 *
	 * @param o the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
