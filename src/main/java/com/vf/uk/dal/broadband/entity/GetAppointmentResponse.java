package com.vf.uk.dal.broadband.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * GetAppointmentResponse.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-14T14:47:09.485Z")
@Data
public class GetAppointmentResponse extends ResourceSupport {

	/** The appointment window list. */
	@JsonProperty("appointmentWindowList")
	@Valid
	private List<AppointmentList> appointmentWindowList = null;

}
