package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class LineSettings.
 */
public class LineSettings implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1518759682831766008L;
	
	/** The Constant SERVICECODE. */
	private static final String SERVICECODE = "";
	
	/** The Constant INSTALLATIONCODE. */
	private static final String INSTALLATIONCODE = "";
	
	/** The Constant TERMINATIONCODE. */
	private static final String TERMINATIONCODE = "";

	/** The service code. */
	@JsonProperty(SERVICECODE)
	private String serviceCode;
	
	/** The installation code. */
	@JsonProperty(INSTALLATIONCODE)
	private String installationCode;
	
	/** The termination code. */
	@JsonProperty(TERMINATIONCODE)
	private String terminationCode;
	
	/**
	 * Gets the service code.
	 *
	 * @return the service code
	 */
	public String getServiceCode() {
		return serviceCode;
	}
	
	/**
	 * Sets the service code.
	 *
	 * @param serviceCode the new service code
	 */
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
	/**
	 * Gets the installation code.
	 *
	 * @return the installation code
	 */
	public String getInstallationCode() {
		return installationCode;
	}
	
	/**
	 * Sets the installation code.
	 *
	 * @param installationCode the new installation code
	 */
	public void setInstallationCode(String installationCode) {
		this.installationCode = installationCode;
	}
	
	/**
	 * Gets the termination code.
	 *
	 * @return the termination code
	 */
	public String getTerminationCode() {
		return terminationCode;
	}
	
	/**
	 * Sets the termination code.
	 *
	 * @param terminationCode the new termination code
	 */
	public void setTerminationCode(String terminationCode) {
		this.terminationCode = terminationCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((installationCode == null) ? 0 : installationCode.hashCode());
		result = prime * result + ((serviceCode == null) ? 0 : serviceCode.hashCode());
		result = prime * result + ((terminationCode == null) ? 0 : terminationCode.hashCode());
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
		LineSettings other = (LineSettings) obj;
		if (installationCode == null) {
			if (other.installationCode != null)
				return false;
		} else if (!installationCode.equals(other.installationCode))
			return false;
		if (serviceCode == null) {
			if (other.serviceCode != null)
				return false;
		} else if (!serviceCode.equals(other.serviceCode))
			return false;
		if (terminationCode == null) {
			if (other.terminationCode != null)
				return false;
		} else if (!terminationCode.equals(other.terminationCode))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LineSettings [serviceCode=" + serviceCode + ", installationCode=" + installationCode
				+ ", terminationCode=" + terminationCode + "]";
	}
	
	

}
