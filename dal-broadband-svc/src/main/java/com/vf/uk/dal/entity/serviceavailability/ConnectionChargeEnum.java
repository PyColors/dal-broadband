package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The connection charge flag, Line, Broadband, Line + Broadband, No Charge
 */
public enum ConnectionChargeEnum {
	LINE("Line"),

	BROADBAND("Broadband"),

	LINE_BROADBAND("Line + Broadband"),

	NO_CHARGE("No Charge");

	private String value;

	ConnectionChargeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static ConnectionChargeEnum fromValue(String text) {
		for (ConnectionChargeEnum b : ConnectionChargeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}