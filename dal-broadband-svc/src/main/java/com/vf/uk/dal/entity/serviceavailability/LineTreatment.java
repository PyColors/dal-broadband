package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineTreatment
 */

public class LineTreatment {
	@JsonProperty("lineTreatmentType")
	private LineTreatmentTypeEnum lineTreatmentType = null;

	@JsonProperty("earliestAvailabilityDate")
	private String earliestAvailabilityDate = null;

	@JsonProperty("appointmentNeeded")
	private Boolean appointmentNeeded = null;

	@JsonProperty("connectionCharge")
	private ConnectionChargeEnum connectionCharge = null;

	public LineTreatment lineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
		return this;
	}

	/**
	 * Type of line treatment
	 * 
	 * @return lineTreatmentType
	 **/
	public LineTreatmentTypeEnum getLineTreatmentType() {
		return lineTreatmentType;
	}

	public void setLineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	public LineTreatment earliestAvailabilityDate(String earliestAvailabilityDate) {
		this.earliestAvailabilityDate = earliestAvailabilityDate;
		return this;
	}

	/**
	 * The earliest date by which the services offered can be made available to
	 * the prospective customer
	 * 
	 * @return earliestAvailabilityDate
	 **/
	public String getEarliestAvailabilityDate() {
		return earliestAvailabilityDate;
	}

	public void setEarliestAvailabilityDate(String earliestAvailabilityDate) {
		this.earliestAvailabilityDate = earliestAvailabilityDate;
	}

	public LineTreatment appointmentNeeded(Boolean appointmentNeeded) {
		this.appointmentNeeded = appointmentNeeded;
		return this;
	}

	/**
	 * Flag specifying if an appointment is needed or not
	 * 
	 * @return appointmentNeeded
	 **/
	public Boolean getAppointmentNeeded() {
		return appointmentNeeded;
	}

	public void setAppointmentNeeded(Boolean appointmentNeeded) {
		this.appointmentNeeded = appointmentNeeded;
	}

	public LineTreatment connectionCharge(ConnectionChargeEnum connectionCharge) {
		this.connectionCharge = connectionCharge;
		return this;
	}

	/**
	 * The connection charge flag, Line, Broadband, Line + Broadband, No Charge
	 * 
	 * @return connectionCharge
	 **/
	public ConnectionChargeEnum getConnectionCharge() {
		return connectionCharge;
	}

	public void setConnectionCharge(ConnectionChargeEnum connectionCharge) {
		this.connectionCharge = connectionCharge;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineTreatment lineTreatment = (LineTreatment) o;
		return Objects.equals(this.lineTreatmentType, lineTreatment.lineTreatmentType)
				&& Objects.equals(this.earliestAvailabilityDate, lineTreatment.earliestAvailabilityDate)
				&& Objects.equals(this.appointmentNeeded, lineTreatment.appointmentNeeded)
				&& Objects.equals(this.connectionCharge, lineTreatment.connectionCharge);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineTreatmentType, earliestAvailabilityDate, appointmentNeeded, connectionCharge);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineTreatment {\n");

		sb.append("    lineTreatmentType: ").append(toIndentedString(lineTreatmentType)).append("\n");
		sb.append("    earliestAvailabilityDate: ").append(toIndentedString(earliestAvailabilityDate)).append("\n");
		sb.append("    appointmentNeeded: ").append(toIndentedString(appointmentNeeded)).append("\n");
		sb.append("    connectionCharge: ").append(toIndentedString(connectionCharge)).append("\n");
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
