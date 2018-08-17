package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ServiceLines.
 */
@Data
public class ServiceLines implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3798948156147335358L;

	/** The Constant CLASSIFICATIONCODE. */
	private static final String CLASSIFICATION_CODE = "classificationCode";

	/** The Constant NETWORKTYPE. */
	private static final String NETWORK_TYPE = "networkType";

	/** The Constant LINETREATMENTLIST. */
	private static final String LINETREATMENT_LIST = "lineTreatmentList";

	/** The Constant SERVICELINELIST. */
	private static final String SERVICELINE_LIST = "serviceLineList";

	/** The classification code. */
	@JsonProperty(CLASSIFICATION_CODE)
	private String classificationCode;

	/** The network type. */
	@JsonProperty(NETWORK_TYPE)
	private String networkType;

	/** The line treatment list. */
	@JsonProperty(LINETREATMENT_LIST)
	private List<LineTreatment> lineTreatmentList = new ArrayList<>();

	/** The service line list. */
	@JsonProperty(SERVICELINE_LIST)
	private List<ServieLine> serviceLineList = new ArrayList<>();

}
