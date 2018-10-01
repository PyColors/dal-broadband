package com.vf.uk.dal.broadband.entity.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class EmailDetails.
 */
@Data
public class EmailDetails {


	/** Field String email -GCPL EmailCommunication[UseCode = "EMAIL"]/URI. */
	@JsonProperty("email")
	private String email;

	

}
