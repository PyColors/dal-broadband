package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of customer INDIVIDUAL or BUSINESS
 */
public enum CustomerTypeEnum {
	INDIVIDUAL("INDIVIDUAL"),

	BUSINESS("BUSINESS"),
    
	CONSUMER("CONSUMER");
	
	private String value;

	CustomerTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static CustomerTypeEnum fromValue(String text) {
		for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}