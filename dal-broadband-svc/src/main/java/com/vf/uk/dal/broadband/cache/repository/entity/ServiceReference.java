package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ServiceReference.
 */
@Data
public class ServiceReference implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 282132187520321378L;

	/** The Constant SERVICELINELIST. */
	private static final String SERVICELINELIST = "serviceLinesList";

	/** The service lines list. */
	@JsonProperty(SERVICELINELIST)
	private List<ServiceLines> serviceLinesList = new ArrayList<>();

}
