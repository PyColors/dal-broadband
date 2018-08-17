package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ItemReference.
 */
@Data
public class ItemReference implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 815255394624573030L;

	/** The Constant IDENTIFICATIONID. */
	private static final String IDENTIFICATION_ID = "identificationId";

	/** The Constant NAME. */
	private static final String NAME = "name";

	/** The Constant CLASSIFICATIONCODE. */
	private static final String CLASSIFICATION_CODE = "classificationCode";

	/** The identification id. */
	@JsonProperty(IDENTIFICATION_ID)
	private String identificationId;

	/** The name. */
	@JsonProperty(NAME)
	private String name;

	/** The classification code. */
	@JsonProperty(CLASSIFICATION_CODE)
	private String classificationCode;

}
