package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppointmentWindowList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class AppointmentWindowList {
	@JsonProperty("startTimePeriod")
	private String startTimePeriod = null;

	@JsonProperty("timeSlot")
	private String timeSlot = null;

	public AppointmentWindowList startTimePeriod(String startTimePeriod) {
		this.startTimePeriod = startTimePeriod;
		return this;
	}

	/**
	 * Date on which the appointment should be reserved in case of or Earliest
	 * required appointment date in case of get appointment request.
	 * 
	 * @return startTimePeriod
	 **/

	public String getStartTimePeriod() {
		return startTimePeriod;
	}

	public void setStartTimePeriod(String startTimePeriod) {
		this.startTimePeriod = startTimePeriod;
	}

	public AppointmentWindowList timeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
		return this;
	}

	/**
	 * Time slot at which the appointment should be reserved. LOV - AM, PM, EV,
	 * EM
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
		AppointmentWindowList appointmentWindowList = (AppointmentWindowList) o;
		return Objects.equals(this.startTimePeriod, appointmentWindowList.startTimePeriod)
				&& Objects.equals(this.timeSlot, appointmentWindowList.timeSlot);
	}

	@Override
	public int hashCode() {
		return Objects.hash(startTimePeriod, timeSlot);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppointmentWindowList {\n");

		sb.append("    startTimePeriod: ").append(toIndentedString(startTimePeriod)).append("\n");
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
