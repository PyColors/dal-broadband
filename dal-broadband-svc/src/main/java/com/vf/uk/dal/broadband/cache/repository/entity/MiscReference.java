package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class MiscReference.
 */
public class MiscReference implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8859851765986955170L;

	/** The Constant SERVICEPROVIDERNAME. */
	private static final String SERVICEPROVIDERNAME = "serviceProviderName";

	/** The Constant LINELENGTH. */
	private static final String LINELENGTH = "lineLength";

	/** The Constant CUSTOMERAGREEDDATE. */
	private static final String CUSTOMERAGREEDDATE = "customerAgreedDate";

	/** The Constant READYFORSERVICEDATE. */
	private static final String READYFORSERVICEDATE = "readyForServiceDate";

	/** The Constant ANFP. */
	private static final String ANFP = "anfp";

	/** The service provider name. */
	@JsonProperty(SERVICEPROVIDERNAME)
	private String serviceProviderName;

	/** The line length. */
	@JsonProperty(LINELENGTH)
	private String lineLength;

	/** The customer agreed date. */
	@JsonProperty(CUSTOMERAGREEDDATE)
	private String customerAgreedDate;

	/** The ready for service date. */
	@JsonProperty(READYFORSERVICEDATE)
	private String readyForServiceDate;

	/** The anfp. */
	@JsonProperty(ANFP)
	private String anfp;

	@JsonProperty("installationType")
	private String installationType = null;

	/**
	 * Gets the service provider name.
	 *
	 * @return the service provider name
	 */
	public String getServiceProviderName() {
		return serviceProviderName;
	}

	/**
	 * Sets the service provider name.
	 *
	 * @param serviceProviderName
	 *            the new service provider name
	 */
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	/**
	 * Gets the line length.
	 *
	 * @return the line length
	 */
	public String getLineLength() {
		return lineLength;
	}

	/**
	 * Sets the line length.
	 *
	 * @param lineLength
	 *            the new line length
	 */
	public void setLineLength(String lineLength) {
		this.lineLength = lineLength;
	}

	/**
	 * Gets the customer agreed date.
	 *
	 * @return the customer agreed date
	 */
	public String getCustomerAgreedDate() {
		return customerAgreedDate;
	}

	/**
	 * Sets the customer agreed date.
	 *
	 * @param customerAgreedDate
	 *            the new customer agreed date
	 */
	public void setCustomerAgreedDate(String customerAgreedDate) {
		this.customerAgreedDate = customerAgreedDate;
	}

	/**
	 * Gets the ready for service date.
	 *
	 * @return the ready for service date
	 */
	public String getReadyForServiceDate() {
		return readyForServiceDate;
	}

	/**
	 * Sets the ready for service date.
	 *
	 * @param readyForServiceDate
	 *            the new ready for service date
	 */
	public void setReadyForServiceDate(String readyForServiceDate) {
		this.readyForServiceDate = readyForServiceDate;
	}

	/**
	 * Gets the anfp.
	 *
	 * @return the anfp
	 */
	public String getAnfp() {
		return anfp;
	}

	/**
	 * Sets the anfp.
	 *
	 * @param anfp
	 *            the new anfp
	 */
	public void setAnfp(String anfp) {
		this.anfp = anfp;
	}

	public String getInstallationType() {
		return installationType;
	}

	public void setInstallationType(String installationType) {
		this.installationType = installationType;
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
		result = prime * result + ((anfp == null) ? 0 : anfp.hashCode());
		result = prime * result + ((customerAgreedDate == null) ? 0 : customerAgreedDate.hashCode());
		result = prime * result + ((lineLength == null) ? 0 : lineLength.hashCode());
		result = prime * result + ((readyForServiceDate == null) ? 0 : readyForServiceDate.hashCode());
		result = prime * result + ((serviceProviderName == null) ? 0 : serviceProviderName.hashCode());
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
		MiscReference other = (MiscReference) obj;
		if (anfp == null) {
			if (other.anfp != null)
				return false;
		} else if (!anfp.equals(other.anfp))
			return false;
		if (customerAgreedDate == null) {
			if (other.customerAgreedDate != null)
				return false;
		} else if (!customerAgreedDate.equals(other.customerAgreedDate))
			return false;
		if (lineLength == null) {
			if (other.lineLength != null)
				return false;
		} else if (!lineLength.equals(other.lineLength))
			return false;
		if (readyForServiceDate == null) {
			if (other.readyForServiceDate != null)
				return false;
		} else if (!readyForServiceDate.equals(other.readyForServiceDate))
			return false;
		if (serviceProviderName == null) {
			if (other.serviceProviderName != null)
				return false;
		} else if (!serviceProviderName.equals(other.serviceProviderName))
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
		return "MiscReference [serviceProviderName=" + serviceProviderName + ", lineLength=" + lineLength
				+ ", customerAgreedDate=" + customerAgreedDate + ", readyForServiceDate=" + readyForServiceDate
				+ ", anfp=" + anfp + "]";
	}

}
