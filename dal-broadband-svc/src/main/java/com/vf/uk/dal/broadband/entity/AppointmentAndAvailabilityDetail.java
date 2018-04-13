package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentAndAvailabilityDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class AppointmentAndAvailabilityDetail {
	@JsonProperty("appointmentNeeded")
	private Boolean appointmentNeeded = null;

	@JsonProperty("earliestAvailableDate")
	private String earliestAvailableDate = null;

	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

	@JsonProperty("canNumberBeRetained")
	private String canNumberBeRetained = null;

	/**
	 * 
	 * @param appointmentNeeded
	 * @return AppointmentAndAvailabilityDetail
	 */

	public AppointmentAndAvailabilityDetail appointmentNeeded(Boolean appointmentNeeded) {
		this.appointmentNeeded = appointmentNeeded;
		return this;
	}

	/**
	 * Whether the appointment is needed or not. If appointmenr needed flag is
	 * false, it means customer has existing line if it is true it means
	 * customer does not have existing line and should only take a new line
	 * option
	 * 
	 * @return appointmentNeeded
	 **/
	@ApiModelProperty(value = "Whether the appointment is needed or not. If appointmenr needed flag is false, it means customer has existing line if it is true it means customer does not have existing line and should only take a new line option")

	public Boolean getAppointmentNeeded() {
		return appointmentNeeded;
	}

	public void setAppointmentNeeded(Boolean appointmentNeeded) {
		this.appointmentNeeded = appointmentNeeded;
	}

	/**
	 * 
	 * @param earliestAvailableDate
	 * @return
	 */

	public AppointmentAndAvailabilityDetail earliestAvailableDate(String earliestAvailableDate) {
		this.earliestAvailableDate = earliestAvailableDate;
		return this;
	}

	/**
	 * The earliest available date when the service will be available
	 * 
	 * @return earliestAvailableDate
	 **/
	@ApiModelProperty(value = "The earliest available date when the service will be available")

	public String getEarliestAvailableDate() {
		return earliestAvailableDate;
	}

	public void setEarliestAvailableDate(String earliestAvailableDate) {
		this.earliestAvailableDate = earliestAvailableDate;
	}

	/**
	 * 
	 * @param lineTreatmentType
	 * @return
	 */

	public AppointmentAndAvailabilityDetail lineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
		return this;
	}

	/**
	 * EXISTING OR NEW
	 * 
	 * @return lineTreatmentType
	 **/
	@ApiModelProperty(value = "EXISTING OR NEW")

	public String getLineTreatmentType() {
		return lineTreatmentType;
	}

	public void setLineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	public String getCanNumberBeRetained() {
		return canNumberBeRetained;
	}

	public void setCanNumberBeRetained(String canNumberBeRetained) {
		this.canNumberBeRetained = canNumberBeRetained;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppointmentAndAvailabilityDetail appointmentAndAvailabilityDetail = (AppointmentAndAvailabilityDetail) o;
		return Objects.equals(this.appointmentNeeded, appointmentAndAvailabilityDetail.appointmentNeeded)
				&& Objects.equals(this.earliestAvailableDate, appointmentAndAvailabilityDetail.earliestAvailableDate)
				&& Objects.equals(this.lineTreatmentType, appointmentAndAvailabilityDetail.lineTreatmentType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentNeeded, earliestAvailableDate, lineTreatmentType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppointmentAndAvailabilityDetail {\n");

		sb.append("    appointmentNeeded: ").append(toIndentedString(appointmentNeeded)).append("\n");
		sb.append("    earliestAvailableDate: ").append(toIndentedString(earliestAvailableDate)).append("\n");
		sb.append("    lineTreatmentType: ").append(toIndentedString(lineTreatmentType)).append("\n");
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
