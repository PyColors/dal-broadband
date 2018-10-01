package com.vf.uk.dal.broadband.basket.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class AddHardware.
 */
@Data
public class AddHardware {

	/** The hardware id. */
	@JsonProperty("hardwareId")
	private String hardwareId = null;
	
	/** The package line id. */
	@JsonProperty("packageLineId")
	private String packageLineId = null;
	
}
