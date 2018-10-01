package com.vf.uk.dal.broadband.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ImageURL.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")
@Data
public class ImageURL {

	/** The image name. */
	@JsonProperty("imageName")
	private String imageName = null;

	/** The image URL. */
	@JsonProperty("imageURL")
	private String imageURL = null;

}
