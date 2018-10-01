package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * MediaURL.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class MediaURL {

	/** The media name. */
	@JsonProperty("mediaName")
	private String mediaName = null;

	/** The media URL. */
	@JsonProperty("mediaURL")
	private String mediaURL = null;

}
