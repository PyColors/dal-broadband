package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class SiteNote.
 */
@Data
public class SiteNote implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6338036628127368614L;

	/** The Constant NOTES. */
	private static final String ENGG_NOTES = "notes";

	/** The Constant TYPECODE. */
	private static final String TYPE_CODE = "typeCode";

	/** The notes. */
	@JsonProperty(ENGG_NOTES)
	private String notes;

	/** The type code. */
	@JsonProperty(TYPE_CODE)
	private String typeCode;

}
