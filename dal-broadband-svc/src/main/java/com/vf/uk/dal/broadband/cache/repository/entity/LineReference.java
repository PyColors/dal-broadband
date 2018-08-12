package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class LineReference.
 */
public class LineReference implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6204503232964226221L;
	
	/** The Constant INSTALLATIONADDRESS. */
	private static final String INSTALLATION_ADDRESS = "installationAddress";
	
	/** The Constant LINELOCATOR. */
	private static final String LINE_LOCATOR = "lineLocator";
	
	/** The Constant LINEDIRECTYLIST. */
	private static final String LINEDIRECTYLIST = "lineDirectoryList";
	
	/** The Constant LINESETTINGS. */
	private static final String LINE_SETTINGS = "lineSettings";
	
	/** The Constant LINESTATUS. */
	private static final String LINE_STATUS = "lineStatus";
	
	/** The Constant AVAILABLESERVICES. */
	private static final String AVAILABLE_SERVICES = "availableServices";

	/** The installation address. */
	@JsonProperty(INSTALLATION_ADDRESS)
	private InstallationAddress installationAddress;
	
	/** The line locator. */
	@JsonProperty(LINE_LOCATOR)
	private LineLocator lineLocator;
	
	/** The line directory list. */
	@JsonProperty(LINEDIRECTYLIST)
	private List<LineDirectory> lineDirectoryList = new ArrayList<>();
	
	/** The line settings. */
	@JsonProperty(LINE_SETTINGS)
	private LineSettings lineSettings;
	
	/** The line status. */
	@JsonProperty(LINE_STATUS)
	private LineStatus lineStatus;
	
	/** The available services. */
	@JsonProperty(AVAILABLE_SERVICES)
	private AvailableServices availableServices;

	/**
	 * Gets the installation address.
	 *
	 * @return the installation address
	 */
	public InstallationAddress getInstallationAddress() {
		return installationAddress;
	}

	/**
	 * Sets the installation address.
	 *
	 * @param installationAddress the new installation address
	 */
	public void setInstallationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
	}

	/**
	 * Gets the line locator.
	 *
	 * @return the line locator
	 */
	public LineLocator getLineLocator() {
		return lineLocator;
	}

	/**
	 * Sets the line locator.
	 *
	 * @param lineLocator the new line locator
	 */
	public void setLineLocator(LineLocator lineLocator) {
		this.lineLocator = lineLocator;
	}

	/**
	 * Gets the line directory list.
	 *
	 * @return the line directory list
	 */
	public List<LineDirectory> getLineDirectoryList() {
		return lineDirectoryList;
	}

	/**
	 * Sets the line directory list.
	 *
	 * @param lineDirectoryList the new line directory list
	 */
	public void setLineDirectoryList(List<LineDirectory> lineDirectoryList) {
		this.lineDirectoryList = lineDirectoryList;
	}

	/**
	 * Gets the line settings.
	 *
	 * @return the line settings
	 */
	public LineSettings getLineSettings() {
		return lineSettings;
	}

	/**
	 * Sets the line settings.
	 *
	 * @param lineSettings the new line settings
	 */
	public void setLineSettings(LineSettings lineSettings) {
		this.lineSettings = lineSettings;
	}

	/**
	 * Gets the line status.
	 *
	 * @return the line status
	 */
	public LineStatus getLineStatus() {
		return lineStatus;
	}

	/**
	 * Sets the line status.
	 *
	 * @param lineStatus the new line status
	 */
	public void setLineStatus(LineStatus lineStatus) {
		this.lineStatus = lineStatus;
	}

	/**
	 * Gets the available services.
	 *
	 * @return the available services
	 */
	public AvailableServices getAvailableServices() {
		return availableServices;
	}

	/**
	 * Sets the available services.
	 *
	 * @param availableServices the new available services
	 */
	public void setAvailableServices(AvailableServices availableServices) {
		this.availableServices = availableServices;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableServices == null) ? 0 : availableServices.hashCode());
		result = prime * result + ((installationAddress == null) ? 0 : installationAddress.hashCode());
		result = prime * result + ((lineDirectoryList == null) ? 0 : lineDirectoryList.hashCode());
		result = prime * result + ((lineLocator == null) ? 0 : lineLocator.hashCode());
		result = prime * result + ((lineSettings == null) ? 0 : lineSettings.hashCode());
		result = prime * result + ((lineStatus == null) ? 0 : lineStatus.hashCode());
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
		LineReference other = (LineReference) obj;
		if (availableServices == null) {
			if (other.availableServices != null)
				return false;
		} else if (!availableServices.equals(other.availableServices))
			return false;
		if (installationAddress == null) {
			if (other.installationAddress != null)
				return false;
		} else if (!installationAddress.equals(other.installationAddress))
			return false;
		if (lineDirectoryList == null) {
			if (other.lineDirectoryList != null)
				return false;
		} else if (!lineDirectoryList.equals(other.lineDirectoryList))
			return false;
		if (lineLocator == null) {
			if (other.lineLocator != null)
				return false;
		} else if (!lineLocator.equals(other.lineLocator))
			return false;
		if (lineSettings == null) {
			if (other.lineSettings != null)
				return false;
		} else if (!lineSettings.equals(other.lineSettings))
			return false;
		if (lineStatus == null) {
			if (other.lineStatus != null)
				return false;
		} else if (!lineStatus.equals(other.lineStatus))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LineReference [installationAddress=" + installationAddress + ", lineLocator=" + lineLocator
				+ ", lineDirectoryList=" + lineDirectoryList + ", lineSettings=" + lineSettings + ", lineStatus="
				+ lineStatus + ", availableServices=" + availableServices + "]";
	}

}
