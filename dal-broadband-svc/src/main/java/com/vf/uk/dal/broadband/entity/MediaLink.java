package com.vf.uk.dal.broadband.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * MediaLink.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class MediaLink {

	/** The id. */
	@JsonProperty("id")
	private String id = null;

	/** The value. */
	@JsonProperty("value")
	private String value = null;

	/** The type. */
	@JsonProperty("type")
	private String type = null;

	/** The priority. */
	@JsonProperty("priority")
	private Integer priority = null;

	/** The package type. */
	@JsonProperty("packageType")
	private List<String> packageType = null;

}
