package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class SalesOrderAppointment.
 */
@Data
public class BroadbandSalesOrderAppointment implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6512528605127882904L;

	/** The Constant APPOINTMENTWINDOW. */
	private static final String APPOINTMENT_WINDOW = "appointmentWindow";

	/** The Constant SITENOTE. */
	private static final String SITE_NOTE = "siteNote";

	/** The appointment window. */
	@JsonProperty(APPOINTMENT_WINDOW)
	private AppointmentWindow appointmentWindow;

	/** The site note. */
	@JsonProperty(SITE_NOTE)
	private SiteNote siteNote;

}
