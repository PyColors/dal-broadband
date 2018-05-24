package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceStartDateRequest {

	@JsonProperty("removeFromPhoneDirectory")
	private Boolean removeFromPhoneDirectory;

	@JsonProperty("startDateTime")
	private String startDateTime;

	public Boolean getRemoveFromPhoneDirectory() {
		return removeFromPhoneDirectory;
	}

	public void setRemoveFromPhoneDirectory(Boolean removeFromPhoneDirectory) {
		this.removeFromPhoneDirectory = removeFromPhoneDirectory;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

}
