package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class LineStatus.
 */
public class LineStatus implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2905281855467764206L;
	
	/** The Constant STATUSCODE. */
	private static final String STATUSCODE = "statusCode";
	
	/** The Constant ACCESSLINESTATUS. */
	private static final String ACCESSLINESTATUS = "accessLineStatus";
	
	/** The Constant GNPSTATUS. */
	private static final String GNPSTATUS = "gnpStatus";
	
	/** The Constant LINEOPTION. */
	private static final String LINEOPTION = "lineOption";
	
	/** The Constant TECHNOLOGY. */
	private static final String TECHNOLOGY = "technology";
	
	/** The Constant LINETYPE. */
	private static final String LINETYPE = "lineType";
	
	/** The Constant TEMPSTRUCTURE. */
	private static final String TEMPSTRUCTURE = "tempStructure";
	
	/** The Constant STANDBYPOWERREQUIRED. */
	private static final String STANDBYPOWERREQUIRED = "standbyPowerRequired";
	
	/** The Constant NARROWBANDSERVICESAVAILABLE. */
	private static final String NARROWBANDSERVICESAVAILABLE = "narrowBandServicesAvailable";

	/** The status code. */
	@JsonProperty(STATUSCODE)
	private String statusCode;
	
	/** The access line status. */
	@JsonProperty(ACCESSLINESTATUS)
	private String accessLineStatus;
	
	/** The g NP status. */
	@JsonProperty(GNPSTATUS)
	private String gnpStatus;
	
	/** The line option. */
	@JsonProperty(LINEOPTION)
	private String lineOption;
	
	/** The technology. */
	@JsonProperty(TECHNOLOGY)
	private String technology;
	
	/** The line type. */
	@JsonProperty(LINETYPE)
	private String lineType;
	
	/** The temp structure. */
	@JsonProperty(TEMPSTRUCTURE)
	private String tempStructure;
	
	/** The standby power required. */
	@JsonProperty(STANDBYPOWERREQUIRED)
	private String standbyPowerRequired;
	
	/** The narrow band services available. */
	@JsonProperty(NARROWBANDSERVICESAVAILABLE)
	private String narrowBandServicesAvailable;

	/**
	 * Gets the status code.
	 *
	 * @return the status code
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the status code.
	 *
	 * @param statusCode the new status code
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * Gets the access line status.
	 *
	 * @return the access line status
	 */
	public String getAccessLineStatus() {
		return accessLineStatus;
	}

	/**
	 * Sets the access line status.
	 *
	 * @param accessLineStatus the new access line status
	 */
	public void setAccessLineStatus(String accessLineStatus) {
		this.accessLineStatus = accessLineStatus;
	}

	/**
	 * Gets the g NP status.
	 *
	 * @return the g NP status
	 */
	public String getGnpStatus() {
		return gnpStatus;
	}

	/**
	 * Sets the g NP status.
	 *
	 * @param gNPStatus the new g NP status
	 */
	public void setGnpStatus(String gnpStatus) {
		this.gnpStatus = gnpStatus;
	}

	/**
	 * Gets the line option.
	 *
	 * @return the line option
	 */
	public String getLineOption() {
		return lineOption;
	}

	/**
	 * Sets the line option.
	 *
	 * @param lineOption the new line option
	 */
	public void setLineOption(String lineOption) {
		this.lineOption = lineOption;
	}

	/**
	 * Gets the technology.
	 *
	 * @return the technology
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * Sets the technology.
	 *
	 * @param technology the new technology
	 */
	public void setTechnology(String technology) {
		this.technology = technology;
	}

	/**
	 * Gets the line type.
	 *
	 * @return the line type
	 */
	public String getLineType() {
		return lineType;
	}

	/**
	 * Sets the line type.
	 *
	 * @param lineType the new line type
	 */
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	/**
	 * Gets the temp structure.
	 *
	 * @return the temp structure
	 */
	public String getTempStructure() {
		return tempStructure;
	}

	/**
	 * Sets the temp structure.
	 *
	 * @param tempStructure the new temp structure
	 */
	public void setTempStructure(String tempStructure) {
		this.tempStructure = tempStructure;
	}

	/**
	 * Gets the standby power required.
	 *
	 * @return the standby power required
	 */
	public String getStandbyPowerRequired() {
		return standbyPowerRequired;
	}

	/**
	 * Sets the standby power required.
	 *
	 * @param standbyPowerRequired the new standby power required
	 */
	public void setStandbyPowerRequired(String standbyPowerRequired) {
		this.standbyPowerRequired = standbyPowerRequired;
	}

	/**
	 * Gets the narrow band services available.
	 *
	 * @return the narrow band services available
	 */
	public String getNarrowBandServicesAvailable() {
		return narrowBandServicesAvailable;
	}

	/**
	 * Sets the narrow band services available.
	 *
	 * @param narrowBandServicesAvailable the new narrow band services available
	 */
	public void setNarrowBandServicesAvailable(String narrowBandServicesAvailable) {
		this.narrowBandServicesAvailable = narrowBandServicesAvailable;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessLineStatus == null) ? 0 : accessLineStatus.hashCode());
		result = prime * result + ((gnpStatus == null) ? 0 : gnpStatus.hashCode());
		result = prime * result + ((lineOption == null) ? 0 : lineOption.hashCode());
		result = prime * result + ((lineType == null) ? 0 : lineType.hashCode());
		result = prime * result + ((narrowBandServicesAvailable == null) ? 0 : narrowBandServicesAvailable.hashCode());
		result = prime * result + ((standbyPowerRequired == null) ? 0 : standbyPowerRequired.hashCode());
		result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
		result = prime * result + ((technology == null) ? 0 : technology.hashCode());
		result = prime * result + ((tempStructure == null) ? 0 : tempStructure.hashCode());
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
		LineStatus other = (LineStatus) obj;
		if (accessLineStatus == null) {
			if (other.accessLineStatus != null)
				return false;
		} else if (!accessLineStatus.equals(other.accessLineStatus))
			return false;
		if (gnpStatus == null) {
			if (other.gnpStatus != null)
				return false;
		} else if (!gnpStatus.equals(other.gnpStatus))
			return false;
		if (lineOption == null) {
			if (other.lineOption != null)
				return false;
		} else if (!lineOption.equals(other.lineOption))
			return false;
		if (lineType == null) {
			if (other.lineType != null)
				return false;
		} else if (!lineType.equals(other.lineType))
			return false;
		if (narrowBandServicesAvailable == null) {
			if (other.narrowBandServicesAvailable != null)
				return false;
		} else if (!narrowBandServicesAvailable.equals(other.narrowBandServicesAvailable))
			return false;
		if (standbyPowerRequired == null) {
			if (other.standbyPowerRequired != null)
				return false;
		} else if (!standbyPowerRequired.equals(other.standbyPowerRequired))
			return false;
		if (statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!statusCode.equals(other.statusCode))
			return false;
		if (technology == null) {
			if (other.technology != null)
				return false;
		} else if (!technology.equals(other.technology))
			return false;
		if (tempStructure == null) {
			if (other.tempStructure != null)
				return false;
		} else if (!tempStructure.equals(other.tempStructure))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LineStatus [statusCode=" + statusCode + ", accessLineStatus=" + accessLineStatus + ", gNPStatus="
				+ gnpStatus + ", lineOption=" + lineOption + ", technology=" + technology + ", lineType=" + lineType
				+ ", tempStructure=" + tempStructure + ", standbyPowerRequired=" + standbyPowerRequired
				+ ", narrowBandServicesAvailable=" + narrowBandServicesAvailable + "]";
	}

}
