package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class PendingOrder.
 */
@Data
public class PendingOrder implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7152366378366972739L;

	/** The Constant COMPLETIONDATE. */
	private static final String COMPLETION_DATE = "completionDate";

	/** The Constant TYPECODE. */
	private static final String TYPE_CODE = "typeCode";

	/** The Constant THIRDPARTYFLAG. */
	private static final String THIRDPARTY_FLAG = "thirdPartyFlag";

	/**
	 * Field completionDate - Date.
	 */
	@JsonProperty(COMPLETION_DATE)
	protected String completionDate;
	/**
	 * Field typeCode - String.
	 */
	@JsonProperty(TYPE_CODE)
	protected String typeCode;
	/**
	 * Field thirtyPartyFlag - Boolean.
	 */
	@JsonProperty(THIRDPARTY_FLAG)
	protected boolean thirdPartyFlag;

}