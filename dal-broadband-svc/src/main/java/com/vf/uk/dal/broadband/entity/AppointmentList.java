package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentList.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-14T14:47:09.485Z")

public class AppointmentList {
	
	/** The start date. */
	@JsonProperty("startDate")
	private String startDate = null;

	/** The time slots. */
	@JsonProperty("timeSlots")
	@Valid
	private List<String> timeSlots = null;
	
	/** The start time. */
	@JsonProperty("startTime")
	private String startTime = null;
	
	/** The end time. */
	@JsonProperty("endTime")
	private String endTime = null;

	/**
	 * Start date.
	 *
	 * @param startDate the start date
	 * @return the appointment list
	 */
	public AppointmentList startDate(String startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * Get startDate.
	 *
	 * @return startDate
	 */
	@ApiModelProperty(value = "")

	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Time slots.
	 *
	 * @param timeSlots the time slots
	 * @return the appointment list
	 */
	public AppointmentList timeSlots(List<String> timeSlots) {
		this.timeSlots = timeSlots;
		return this;
	}

	/**
	 * Adds the time slots item.
	 *
	 * @param timeSlotsItem the time slots item
	 * @return the appointment list
	 */
	public AppointmentList addTimeSlotsItem(String timeSlotsItem) {
		if (this.timeSlots == null) {
			this.timeSlots = new ArrayList<>();
		}
		this.timeSlots.add(timeSlotsItem);
		return this;
	}

	/**
	 * Get timeSlots.
	 *
	 * @return timeSlots
	 */
	@ApiModelProperty(value = "")

	public List<String> getTimeSlots() {
		return timeSlots;
	}

	/**
	 * Sets the time slots.
	 *
	 * @param timeSlots the new time slots
	 */
	public void setTimeSlots(List<String> timeSlots) {
		this.timeSlots = timeSlots;
	}
	
	/**
	 * Start time.
	 *
	 * @param startTime the start time
	 * @return the appointment list
	 */
	public AppointmentList startTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Time on which the appointment should be reserved.
	 * 
	 * @return startTime
	 **/

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
	
	/**
	 * End time.
	 *
	 * @param endTime the end time
	 * @return the appointment list
	 */
	public AppointmentList endTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	/**
	 * Time on which the appointment should be reserved.
	 * 
	 * @return endTime
	 **/

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
		AppointmentList appointmentList = (AppointmentList) o;
		return Objects.equals(this.startDate, appointmentList.startDate)
				&& Objects.equals(this.timeSlots, appointmentList.timeSlots)
				&& Objects.equals(this.startTime, appointmentList.startTime)
				&& Objects.equals(this.endTime, appointmentList.endTime);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(startDate, timeSlots, startTime, endTime);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppointmentList {\n");

		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
		sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
		sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
