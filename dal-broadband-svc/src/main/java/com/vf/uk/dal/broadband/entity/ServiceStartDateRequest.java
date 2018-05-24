package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceStartDateRequest {

	@JsonProperty("removeFromPhoneDirectory")
	private Boolean removeFromPhoneDirectory;

	public Boolean getRemoveFromPhoneDirectory() {
		return removeFromPhoneDirectory;
	}

	public void setRemoveFromPhoneDirectory(Boolean removeFromPhoneDirectory) {
		this.removeFromPhoneDirectory = removeFromPhoneDirectory;
	}

}
