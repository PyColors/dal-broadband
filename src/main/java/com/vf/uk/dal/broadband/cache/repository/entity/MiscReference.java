package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class MiscReference.
 */
@Data
public class MiscReference implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8859851765986955170L;

	/** The Constant SERVICEPROVIDERNAME. */
	private static final String SERVICEPROVIDER_NAME = "serviceProviderName";

	/** The Constant LINELENGTH. */
	private static final String LINE_LENGTH = "lineLength";

	/** The Constant CUSTOMERAGREEDDATE. */
	private static final String CUSTOMERAGREED_DATE = "customerAgreedDate";

	/** The Constant READYFORSERVICEDATE. */
	private static final String READYFORSERVICE_DATE = "readyForServiceDate";

	/** The Constant ANFP. */
	private static final String AN_FP = "anfp";

	/** The service provider name. */
	@JsonProperty(SERVICEPROVIDER_NAME)
	private String serviceProviderName;

	/** The line length. */
	@JsonProperty(LINE_LENGTH)
	private String lineLength;

	/** The customer agreed date. */
	@JsonProperty(CUSTOMERAGREED_DATE)
	private String customerAgreedDate;

	/** The ready for service date. */
	@JsonProperty(READYFORSERVICE_DATE)
	private String readyForServiceDate;

	/** The anfp. */
	@JsonProperty(AN_FP)
	private String anfp;

	@JsonProperty("installationType")
	private String installationType = null;

}
