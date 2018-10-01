package com.vf.uk.dal.broadband.entity.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ContactCharacteristic.
 */
@Data
public class ContactCharacteristic {

	/**
	 * name -GCPL e.g. ShareLocationData, ShareTrafficData, FullAccess,
	 * Capability
	 */
	@JsonProperty("name")
	private String name;

	/**
	 * value -GCPL e.g. true,false, no,Level1
	 */
	@JsonProperty("value")
	private String value;

}
