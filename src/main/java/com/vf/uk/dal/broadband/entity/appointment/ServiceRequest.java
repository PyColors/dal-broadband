package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ServiceRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class ServiceRequest {

	/** The category code. */
	@JsonProperty("categoryCode")
	private String categoryCode = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	/** The customer party reference. */
	@JsonProperty("customerPartyReference")
	private CustomerPartyReference customerPartyReference = null;

	/** The item reference. */
	@JsonProperty("itemReference")
	private ItemReference itemReference = null;

	/** The priority code. */
	@JsonProperty("priorityCode")
	private String priorityCode = null;

	/** The sub classification code. */
	@JsonProperty("subClassificationCode")
	private String subClassificationCode = null;

	/** The type code. */
	@JsonProperty("typeCode")
	private String typeCode = null;

}
