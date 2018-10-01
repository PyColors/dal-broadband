package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class LineTreatment.
 */
@Data
public class LineTreatment implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7678338484729609759L;

	/** The Constant IDENTIFICATION. */
	private static final String IDENTIFICATION = "identification";

	/** The Constant EARLIESTAVAILABLEDATE. */
	private static final String EARLIESTAVAILABLE_DATE = "earliestAvailableDate";

	/** The Constant APPOINTMENTNEEDED. */
	private static final String APPOINTMENT_NEEDED = "appointmentNeeded";

	/** The Constant CONNECTIONCHARGE. */
	private static final String CONNECTION_CHARGE = "connectionCharge";

	/** The identification. */
	@JsonProperty(IDENTIFICATION)
	private String identification;

	/** The earliest available date. */
	@JsonProperty(EARLIESTAVAILABLE_DATE)
	private String earliestAvailableDate;

	/** The appointment needed. */
	@JsonProperty(APPOINTMENT_NEEDED)
	private boolean appointmentNeeded;

	/** The connection charge. */
	@JsonProperty(CONNECTION_CHARGE)
	private String connectionCharge;

	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

	@JsonProperty("preOrder")
	private Boolean preOrder = null;

	@JsonProperty("registerOfInterest")
	private Boolean registerOfInterest = null;

	@JsonProperty("installProcess")
	private String installProcess = null;

}
