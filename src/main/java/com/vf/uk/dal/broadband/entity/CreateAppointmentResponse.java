package com.vf.uk.dal.broadband.entity;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CreateAppointmentResponse.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T15:53:15.171Z")
@Data
public class CreateAppointmentResponse extends ResourceSupport {

	/** The application id. */
	@JsonProperty("applicationId")
	private String applicationId = null;

}
