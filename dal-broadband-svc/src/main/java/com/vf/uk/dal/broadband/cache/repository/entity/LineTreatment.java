package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class LineTreatment.
 */
public class LineTreatment implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7678338484729609759L;

	/** The Constant IDENTIFICATION. */
	private static final String IDENTIFICATION = "identification";

	/** The Constant EARLIESTAVAILABLEDATE. */
	private static final String EARLIESTAVAILABLEDATE = "earliestAvailableDate";

	/** The Constant APPOINTMENTNEEDED. */
	private static final String APPOINTMENTNEEDED = "appointmentNeeded";

	/** The Constant CONNECTIONCHARGE. */
	private static final String CONNECTIONCHARGE = "connectionCharge";

	/** The identification. */
	@JsonProperty(IDENTIFICATION)
	private String identification;

	/** The earliest available date. */
	@JsonProperty(EARLIESTAVAILABLEDATE)
	private String earliestAvailableDate;

	/** The appointment needed. */
	@JsonProperty(APPOINTMENTNEEDED)
	private boolean appointmentNeeded;

	/** The connection charge. */
	@JsonProperty(CONNECTIONCHARGE)
	private String connectionCharge;

	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

	@JsonProperty("preOrder")
	private Boolean preOrder = null;

	@JsonProperty("registerOfInterest")
	private Boolean registerOfInterest = null;

	@JsonProperty("installProcess")
	private String installProcess = null;

	/**
	 * Gets the identification.
	 *
	 * @return the identification
	 */
	public String getIdentification() {
		return identification;
	}

	/**
	 * Sets the identification.
	 *
	 * @param identification
	 *            the new identification
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}

	/**
	 * Gets the earliest available date.
	 *
	 * @return the earliest available date
	 */
	public String getEarliestAvailableDate() {
		return earliestAvailableDate;
	}

	/**
	 * Sets the earliest available date.
	 *
	 * @param earliestAvailableDate
	 *            the new earliest available date
	 */
	public void setEarliestAvailableDate(String earliestAvailableDate) {
		this.earliestAvailableDate = earliestAvailableDate;
	}

	/**
	 * Checks if is appointment needed.
	 *
	 * @return true, if is appointment needed
	 */
	public boolean isAppointmentNeeded() {
		return appointmentNeeded;
	}

	/**
	 * Sets the appointment needed.
	 *
	 * @param appointmentNeeded
	 *            the new appointment needed
	 */
	public void setAppointmentNeeded(boolean appointmentNeeded) {
		this.appointmentNeeded = appointmentNeeded;
	}

	/**
	 * Gets the connection charge.
	 *
	 * @return the connection charge
	 */
	public String getConnectionCharge() {
		return connectionCharge;
	}

	/**
	 * Sets the connection charge.
	 *
	 * @param connectionCharge
	 *            the new connection charge
	 */
	public void setConnectionCharge(String connectionCharge) {
		this.connectionCharge = connectionCharge;
	}

	public String getLineTreatmentType() {
		return lineTreatmentType;
	}

	public void setLineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	public Boolean getPreOrder() {
		return preOrder;
	}

	public void setPreOrder(Boolean preOrder) {
		this.preOrder = preOrder;
	}

	public Boolean getRegisterOfInterest() {
		return registerOfInterest;
	}

	public void setRegisterOfInterest(Boolean registerOfInterest) {
		this.registerOfInterest = registerOfInterest;
	}

	public String getInstallProcess() {
		return installProcess;
	}

	public void setInstallProcess(String installProcess) {
		this.installProcess = installProcess;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (appointmentNeeded ? 1231 : 1237);
		result = prime * result + ((connectionCharge == null) ? 0 : connectionCharge.hashCode());
		result = prime * result + ((earliestAvailableDate == null) ? 0 : earliestAvailableDate.hashCode());
		result = prime * result + ((identification == null) ? 0 : identification.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		LineTreatment other = (LineTreatment) obj;
		if (appointmentNeeded != other.appointmentNeeded)
			return false;
		if (connectionCharge == null) {
			if (other.connectionCharge != null)
				return false;
		} else if (!connectionCharge.equals(other.connectionCharge))
			return false;
		if (earliestAvailableDate == null) {
			if (other.earliestAvailableDate != null)
				return false;
		} else if (!earliestAvailableDate.equals(other.earliestAvailableDate))
			return false;
		if (identification == null) {
			if (other.identification != null)
				return false;
		} else if (!identification.equals(other.identification))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LineTreatment [identification=" + identification + ", earliestAvailableDate=" + earliestAvailableDate
				+ ", appointmentNeeded=" + appointmentNeeded + ", connectionCharge=" + connectionCharge + "]";
	}

}
