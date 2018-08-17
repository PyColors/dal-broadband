package com.vf.uk.dal.broadband.entity.appointment;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * CreateAppointment.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class CreateAppointment {

	/** The appointment window. */
	@JsonProperty("appointmentWindow")
	private AppointmentWindow appointmentWindow = null;

	/** The result status. */
	@JsonProperty("resultStatus")
	private String resultStatus = null;

	/**
	 * Appointment window.
	 *
	 * @param appointmentWindow
	 *            the appointment window
	 * @return the creates the appointment
	 */
	public CreateAppointment appointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
		return this;
	}

	/**
	 * Get appointmentWindow.
	 *
	 * @return appointmentWindow
	 */
	@ApiModelProperty(value = "")

	@Valid

	public AppointmentWindow getAppointmentWindow() {
		return appointmentWindow;
	}

	/**
	 * Sets the appointment window.
	 *
	 * @param appointmentWindow
	 *            the new appointment window
	 */
	public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
	}

}
