package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class Identification.
 */

@Data
public class Identification implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5148507109681131370L;
	
	/** The Constant ID. */
	private static final String ID = "id";
	
	/** The Constant CONTEXTID. */
	private static final String CONTEXT_ID = "contextId";
	
	/** The id. */
	@JsonProperty(ID)
	private String id;
	
	/** The context id. */
	@JsonProperty(CONTEXT_ID)
	private String contextId;
	
	
	
	
	
}
