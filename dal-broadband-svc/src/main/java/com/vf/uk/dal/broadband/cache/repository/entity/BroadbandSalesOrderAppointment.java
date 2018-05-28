package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class SalesOrderAppointment.
 */
public class BroadbandSalesOrderAppointment implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6512528605127882904L;
	
	/** The Constant APPOINTMENTWINDOW. */
	private static final String APPOINTMENTWINDOW = "appointmentWindow";
	
	/** The Constant SITENOTE. */
	private static final String SITENOTE = "siteNote";
	
	/** The appointment window. */
	@JsonProperty(APPOINTMENTWINDOW)
	private AppointmentWindow appointmentWindow;
	
	/** The site note. */
	@JsonProperty(SITENOTE)
	private SiteNote siteNote;
	
	/**
	 * Gets the appointment window.
	 *
	 * @return the appointment window
	 */
	public AppointmentWindow getAppointmentWindow() {
		return appointmentWindow;
	}
	
	/**
	 * Sets the appointment window.
	 *
	 * @param appointmentWindow the new appointment window
	 */
	public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
	}
	
	/**
	 * Gets the site note.
	 *
	 * @return the site note
	 */
	public SiteNote getSiteNote() {
		return siteNote;
	}
	
	/**
	 * Sets the site note.
	 *
	 * @param siteNote the new site note
	 */
	public void setSiteNote(SiteNote siteNote) {
		this.siteNote = siteNote;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointmentWindow == null) ? 0 : appointmentWindow.hashCode());
		result = prime * result + ((siteNote == null) ? 0 : siteNote.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BroadbandSalesOrderAppointment other = (BroadbandSalesOrderAppointment) obj;
		if (appointmentWindow == null) {
			if (other.appointmentWindow != null)
				return false;
		} else if (!appointmentWindow.equals(other.appointmentWindow))
			return false;
		if (siteNote == null) {
			if (other.siteNote != null)
				return false;
		} else if (!siteNote.equals(other.siteNote))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SalesOrderAppointment [appointmentWindow=" + appointmentWindow + ", siteNote=" + siteNote + "]";
	}
	
}
