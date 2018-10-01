package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The connection charge flag, Line, Broadband, Line + Broadband, No Charge.
 */
public enum ConnectionChargeEnum {
	
	/** The line. */
	LINE("Line"),

	/** The broadband. */
	BROADBAND("Broadband"),

	/** The line broadband. */
	LINE_BROADBAND("Line + Broadband"),

	/** The no charge. */
	NO_CHARGE("No Charge");

	/** The value. */
	private String value;

	/**
	 * Instantiates a new connection charge enum.
	 *
	 * @param value the value
	 */
	ConnectionChargeEnum(String value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	/**
	 * From value.
	 *
	 * @param text the text
	 * @return the connection charge enum
	 */
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