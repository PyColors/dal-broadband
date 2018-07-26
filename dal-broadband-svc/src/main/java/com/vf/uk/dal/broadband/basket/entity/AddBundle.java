package com.vf.uk.dal.broadband.basket.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBundle {
	
	@JsonProperty("bundleId")
	private String bundleId = null;
	
	@JsonProperty("packageLineId")
	private String packageLineId = null;

	/**
	 * 
	 * @return
	 */
	public String getBundleId() {
		return bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	/**
	 * 
	 * @return
	 */
	public String getPackageLineId() {
		return packageLineId;
	}

	public void setPackageLineId(String packageLineId) {
		this.packageLineId = packageLineId;
	}

}
