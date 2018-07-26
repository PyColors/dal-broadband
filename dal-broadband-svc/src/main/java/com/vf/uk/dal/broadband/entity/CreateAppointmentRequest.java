package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateAppointmentRequest.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T20:55:40.172Z")

public class CreateAppointmentRequest {

	/** The start time period. */
	@JsonProperty("startTimePeriod")
	private String startTimePeriod = null;

	/** The time slot. */
	@JsonProperty("timeSlot")
	private String timeSlot = null;

	/** The site note. */
	@JsonProperty("siteNote")
	private SiteNote siteNote = null;

	/** The remove from phone directory. */
	@JsonProperty("removeFromPhoneDirectory")
	private Boolean removeFromPhoneDirectory = null;

	/** The end time. */
	@JsonProperty("endTime")
	private String endTime = null;

	/** The start time. */
	@JsonProperty("startTime")
	private String startTime = null;

	/**
	 * Start time period.
	 *
	 * @param startTimePeriod the start time period
	 * @return the creates the appointment request
	 */
	public CreateAppointmentRequest startTimePeriod(String startTimePeriod) {
		this.startTimePeriod = startTimePeriod;
		return this;
	}

	/**
	 * Earliest required appointment date. The format should be yyyy-mm-dd
	 * hh:mm:ss or Date at which appointment needs ot be booked.
	 * 
	 * @return startTimePeriod
	 **/
	@ApiModelProperty(value = "Earliest required appointment date. The format should be yyyy-mm-dd hh:mm:ss or Date at which appointment needs ot be booked.")

	public String getStartTimePeriod() {
		return startTimePeriod;
	}

	/**
	 * Sets the start time period.
	 *
	 * @param startTimePeriod the new start time period
	 */
	public void setStartTimePeriod(String startTimePeriod) {
		this.startTimePeriod = startTimePeriod;
	}

	/**
	 * Time slot.
	 *
	 * @param timeSlot the time slot
	 * @return the creates the appointment request
	 */
	public CreateAppointmentRequest timeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
		return this;
	}

	/**
	 * AM PM EV etc.
	 *
	 * @return timeSlot
	 */
	@ApiModelProperty(value = "AM PM EV etc")

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

	/**
	 * Site note.
	 *
	 * @param siteNote the site note
	 * @return the creates the appointment request
	 */
	public CreateAppointmentRequest siteNote(SiteNote siteNote) {
		this.siteNote = siteNote;
		return this;
	}

	/**
	 * Get siteNote.
	 *
	 * @return siteNote
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SiteNote getSiteNote() {
		return siteNote;
	}

	/**
	 * Sets the site note.
	 *
	 * @param siteNote the new site note
	 */
	public void setSiteNote(SiteNote siteNote) {
		this.siteNote = siteNote;
	}

	/**
	 * Gets the removes the from phone directory.
	 *
	 * @return the removes the from phone directory
	 */
	public Boolean getRemoveFromPhoneDirectory() {
		return removeFromPhoneDirectory;
	}

	/**
	 * Sets the removes the from phone directory.
	 *
	 * @param removeFromPhoneDirectory the new removes the from phone directory
	 */
	public void setRemoveFromPhoneDirectory(Boolean removeFromPhoneDirectory) {
		this.removeFromPhoneDirectory = removeFromPhoneDirectory;
	}

	/**
	 * Gets the end time.
	 *
	 * @return the end time
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Sets the end time.
	 *
	 * @param endTime the new end time
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * Gets the start time.
	 *
	 * @return the start time
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the start time.
	 *
	 * @param startTime the new start time
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
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
		CreateAppointmentRequest createAppointmentRequest = (CreateAppointmentRequest) o;
		return Objects.equals(this.startTimePeriod, createAppointmentRequest.startTimePeriod)
				&& Objects.equals(this.timeSlot, createAppointmentRequest.timeSlot)
				&& Objects.equals(this.siteNote, createAppointmentRequest.siteNote);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(startTimePeriod, timeSlot, siteNote);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateAppointmentRequest {\n");

		sb.append("    startTimePeriod: ").append(toIndentedString(startTimePeriod)).append("\n");
		sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
		sb.append("    siteNote: ").append(toIndentedString(siteNote)).append("\n");
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
