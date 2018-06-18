package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateAppointmentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T20:55:40.172Z")

public class CreateAppointmentRequest {

	@JsonProperty("startTimePeriod")
	private String startTimePeriod = null;

	@JsonProperty("timeSlot")
	private String timeSlot = null;

	@JsonProperty("siteNote")
	private SiteNote siteNote = null;

	@JsonProperty("removeFromPhoneDirectory")
	private Boolean removeFromPhoneDirectory = null;

	@JsonProperty("endTime")
	private String endTime = null;

	@JsonProperty("startTime")
	private String startTime = null;

	/**
	 * 
	 * @param startTimePeriod
	 * @return
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

	public void setStartTimePeriod(String startTimePeriod) {
		this.startTimePeriod = startTimePeriod;
	}

	/**
	 * 
	 * @param timeSlot
	 * @return
	 */
	public CreateAppointmentRequest timeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
		return this;
	}

	/**
	 * AM PM EV etc
	 * 
	 * @return timeSlot
	 **/
	@ApiModelProperty(value = "AM PM EV etc")

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	/**
	 * 
	 * @param siteNote
	 * @return
	 */
	public CreateAppointmentRequest siteNote(SiteNote siteNote) {
		this.siteNote = siteNote;
		return this;
	}

	/**
	 * Get siteNote
	 * 
	 * @return siteNote
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public SiteNote getSiteNote() {
		return siteNote;
	}

	public void setSiteNote(SiteNote siteNote) {
		this.siteNote = siteNote;
	}

	public Boolean getRemoveFromPhoneDirectory() {
		return removeFromPhoneDirectory;
	}

	public void setRemoveFromPhoneDirectory(Boolean removeFromPhoneDirectory) {
		this.removeFromPhoneDirectory = removeFromPhoneDirectory;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
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
		return Objects.equals(this.startTimePeriod, createAppointmentRequest.startTimePeriod)
				&& Objects.equals(this.timeSlot, createAppointmentRequest.timeSlot)
				&& Objects.equals(this.siteNote, createAppointmentRequest.siteNote);
	}

	@Override
	public int hashCode() {
		return Objects.hash(startTimePeriod, timeSlot, siteNote);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
