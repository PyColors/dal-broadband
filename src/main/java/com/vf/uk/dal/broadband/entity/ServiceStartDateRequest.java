package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ServiceStartDateRequest.
 */
@Data
public class ServiceStartDateRequest {

	/** The remove from phone directory. */
	@JsonProperty("removeFromPhoneDirectory")
	private Boolean removeFromPhoneDirectory;

	/** The start date time. */
	@JsonProperty("startDateTime")
	private String startDateTime;

}
