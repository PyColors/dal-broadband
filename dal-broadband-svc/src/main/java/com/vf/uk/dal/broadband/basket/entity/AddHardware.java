package com.vf.uk.dal.broadband.basket.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class AddHardware.
 */
public class AddHardware {

	/** The hardware id. */
	@JsonProperty("hardwareId")
	private String hardwareId = null;
	
	/**
	 * Gets the hardware id.
	 *
	 * @return the hardware id
	 */
	public String getHardwareId() {
		return hardwareId;
	}

	/**
	 * Sets the hardware id.
	 *
	 * @param hardwareId the new hardware id
	 */
	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	/**
	 * Gets the package line id.
	 *
	 * @return the package line id
	 */
	public String getPackageLineId() {
		return packageLineId;
	}

	/**
	 * Sets the package line id.
	 *
	 * @param packageLineId the new package line id
	 */
	public void setPackageLineId(String packageLineId) {
		this.packageLineId = packageLineId;
	}

	/** The package line id. */
	@JsonProperty("packageLineId")
	private String packageLineId = null;
	
}
