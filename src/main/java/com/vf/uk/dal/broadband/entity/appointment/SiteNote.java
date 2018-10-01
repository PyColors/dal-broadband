package com.vf.uk.dal.broadband.entity.appointment;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * SiteNote.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T20:55:40.172Z")
@Data
public class SiteNote {

	/** The notes. */
	@JsonProperty("notes")
	private String notes = null;

	/** The type code. */
	@JsonProperty("typeCode")
	private String typeCode = null;

}
