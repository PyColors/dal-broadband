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

package com.vf.uk.dal.broadband.entity.journey;

import java.util.Objects;

/**
 * SalesOrderAppointment
 */
public class SalesOrderAppointment {
	private AppointmentWindow appointmentWindow = null;

	private SiteNote siteNote = null;

	public SalesOrderAppointment appointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
		return this;
	}

	/**
	 * Get appointmentWindow
	 * 
	 * @return appointmentWindow
	 **/
	public AppointmentWindow getAppointmentWindow() {
		return appointmentWindow;
	}

	public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
	}

	public SalesOrderAppointment siteNote(SiteNote siteNote) {
		this.siteNote = siteNote;
		return this;
	}

	/**
	 * Get siteNote
	 * 
	 * @return siteNote
	 **/
	public SiteNote getSiteNote() {
		return siteNote;
	}

	public void setSiteNote(SiteNote siteNote) {
		this.siteNote = siteNote;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SalesOrderAppointment salesOrderAppointment = (SalesOrderAppointment) o;
		return Objects.equals(this.appointmentWindow, salesOrderAppointment.appointmentWindow)
				&& Objects.equals(this.siteNote, salesOrderAppointment.siteNote);
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentWindow, siteNote);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SalesOrderAppointment {\n");

		sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
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
