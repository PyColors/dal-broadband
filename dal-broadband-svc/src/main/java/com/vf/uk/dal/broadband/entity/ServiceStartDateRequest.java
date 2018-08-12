package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ServiceStartDateRequest.
 */
public class ServiceStartDateRequest {

	/** The remove from phone directory. */
	@JsonProperty("removeFromPhoneDirectory")
	private Boolean removeFromPhoneDirectory;

	/** The start date time. */
	@JsonProperty("startDateTime")
	private String startDateTime;

	/**
	 * Gets the removes the from phone directory.
	 *
	 * @return the removes the from phone directory
	 */
	public Boolean getRemoveFromPhoneDirectory() {
		return removeFromPhoneDirectory;
	}

	/**
	 * Sets the removes the from phone directory.
	 *
	 * @param removeFromPhoneDirectory the new removes the from phone directory
	 */
	public void setRemoveFromPhoneDirectory(Boolean removeFromPhoneDirectory) {
		this.removeFromPhoneDirectory = removeFromPhoneDirectory;
	}

	/**
	 * Gets the start date time.
	 *
	 * @return the start date time
	 */
	public String getStartDateTime() {
		return startDateTime;
	}

	/**
	 * Sets the start date time.
	 *
	 * @param startDateTime the new start date time
	 */
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

}
