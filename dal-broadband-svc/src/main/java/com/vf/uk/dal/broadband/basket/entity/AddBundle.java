package com.vf.uk.dal.broadband.basket.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class AddBundle.
 */
@Data
public class AddBundle {
	
	/** The bundle id. */
	@JsonProperty("bundleId")
	private String bundleId = null;
	
	/** The package line id. */
	@JsonProperty("packageLineId")
	private String packageLineId = null;
}
