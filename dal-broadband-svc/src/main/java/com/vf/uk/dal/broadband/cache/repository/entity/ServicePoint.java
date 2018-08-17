package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ServicePoint.
 */
@Data
public class ServicePoint implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1543418061981155540L;

	/** The Constant LINEREFERNCE. */
	private static final String LINE_REFERENCE = "lineReference";

	/** The Constant SERVICEREFERENCE. */
	private static final String SERVICE_REFERENCE = "serviceReference";

	/** The line refernce. */
	@JsonProperty(LINE_REFERENCE)
	private LineReference lineReference;

	/** The service reference. */
	@JsonProperty(SERVICE_REFERENCE)
	private ServiceReference serviceReference;

}
