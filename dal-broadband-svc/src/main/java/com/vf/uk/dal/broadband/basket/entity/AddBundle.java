package com.vf.uk.dal.broadband.basket.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class AddBundle.
 */
public class AddBundle {
	
	/** The bundle id. */
	@JsonProperty("bundleId")
	private String bundleId = null;
	
	/** The package line id. */
	@JsonProperty("packageLineId")
	private String packageLineId = null;

	/**
	 * Gets the bundle id.
	 *
	 * @return the bundle id
	 */
	public String getBundleId() {
		return bundleId;
	}

	/**
	 * Sets the bundle id.
	 *
	 * @param bundleId the new bundle id
	 */
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
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

}
