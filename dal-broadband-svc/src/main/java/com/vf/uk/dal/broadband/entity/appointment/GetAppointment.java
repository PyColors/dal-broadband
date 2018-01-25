package com.vf.uk.dal.broadband.entity.appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAppointment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class GetAppointment {
	@JsonProperty("resultStatus")
	private String resultStatus = null;

	@JsonProperty("appointmentWindowList")
	private List<AppointmentWindowList> appointmentWindowList = null;

	public GetAppointment resultStatus(String resultStatus) {
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

	public GetAppointment appointmentWindowList(List<AppointmentWindowList> appointmentWindowList) {
		this.appointmentWindowList = appointmentWindowList;
		return this;
	}

	public GetAppointment addAppointmentWindowListItem(AppointmentWindowList appointmentWindowListItem) {
		if (this.appointmentWindowList == null) {
			this.appointmentWindowList = new ArrayList<AppointmentWindowList>();
		}
		this.appointmentWindowList.add(appointmentWindowListItem);
		return this;
	}

	/**
	 * Get appointmentWindowList
	 * 
	 * @return appointmentWindowList
	 **/

	@Valid

	public List<AppointmentWindowList> getAppointmentWindowList() {
		return appointmentWindowList;
	}

	public void setAppointmentWindowList(List<AppointmentWindowList> appointmentWindowList) {
		this.appointmentWindowList = appointmentWindowList;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetAppointment getAppointment = (GetAppointment) o;
		return Objects.equals(this.resultStatus, getAppointment.resultStatus)
				&& Objects.equals(this.appointmentWindowList, getAppointment.appointmentWindowList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resultStatus, appointmentWindowList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAppointment {\n");

		sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
		sb.append("    appointmentWindowList: ").append(toIndentedString(appointmentWindowList)).append("\n");
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
