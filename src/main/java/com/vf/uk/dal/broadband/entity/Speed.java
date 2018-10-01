package com.vf.uk.dal.broadband.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Speed.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")
@Data
public class Speed {

	/** The min speed. */
	@JsonProperty("minSpeed")
	private String minSpeed = null;

	/** The max speed. */
	@JsonProperty("maxSpeed")
	private String maxSpeed = null;

	/** The speed. */
	@JsonProperty("speed")
	private String speed = null;

	/** The commercial speed. */
	@JsonProperty("commercialSpeed")
	private String commercialSpeed = null;

	@JsonProperty("avgUploadSpeed")
	private String avgUploadSpeed = null;

	@JsonProperty("avgDownloadSpeed")
	private String avgDownloadSpeed = null;

}
