package com.vf.uk.dal.broadband.entity.appointment;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * GetAppointment.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class GetAppointment {

	/** The appointment window list. */
	@JsonProperty("appointmentWindowList")
	@Valid
	private List<AppointmentWindowList> appointmentWindowList = null;

	/** The result status. */
	@JsonProperty("resultStatus")
	private String resultStatus = null;

}
