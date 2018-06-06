package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-14T14:47:09.485Z")

public class AppointmentList {
	@JsonProperty("startDate")
	private String startDate = null;

	@JsonProperty("timeSlots")
	@Valid
	private List<String> timeSlots = null;

	public AppointmentList startDate(String startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * Get startDate
	 * 
	 * @return startDate
	 **/
	@ApiModelProperty(value = "")

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public AppointmentList timeSlots(List<String> timeSlots) {
		this.timeSlots = timeSlots;
		return this;
	}

	public AppointmentList addTimeSlotsItem(String timeSlotsItem) {
		if (this.timeSlots == null) {
			this.timeSlots = new ArrayList<String>();
		}
		this.timeSlots.add(timeSlotsItem);
		return this;
	}

	/**
	 * Get timeSlots
	 * 
	 * @return timeSlots
	 **/
	@ApiModelProperty(value = "")

	public List<String> getTimeSlots() {
		return timeSlots;
	}

	public void setTimeSlots(List<String> timeSlots) {
		this.timeSlots = timeSlots;
	}

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
				&& Objects.equals(this.timeSlots, appointmentList.timeSlots);
	}

	@Override
	public int hashCode() {
		return Objects.hash(startDate, timeSlots);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppointmentList {\n");

		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
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
