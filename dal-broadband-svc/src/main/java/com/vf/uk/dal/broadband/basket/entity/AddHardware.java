package com.vf.uk.dal.broadband.basket.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddHardware {

	@JsonProperty("hardwareId")
	private String hardwareId = null;
	
	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public String getPackageLineId() {
		return packageLineId;
	}

	public void setPackageLineId(String packageLineId) {
		this.packageLineId = packageLineId;
	}

	@JsonProperty("packageLineId")
	private String packageLineId = null;
	
}
