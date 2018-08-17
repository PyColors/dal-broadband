package com.vf.uk.dal.broadband.journey.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CryptogramRequest.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T07:23:46.167Z")
@Data
public class CryptogramRequest {

	/** The cryptogram. */
	@JsonProperty("cryptogram")
	private String cryptogram = null;

}
