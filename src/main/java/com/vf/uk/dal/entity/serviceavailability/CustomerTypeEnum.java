package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of customer INDIVIDUAL or BUSINESS or CONSUMER.
 */
public enum CustomerTypeEnum {
	
	/** The individual. */
	INDIVIDUAL("INDIVIDUAL"),

	/** The business. */
	BUSINESS("BUSINESS"),
    
	/** The consumer. */
	CONSUMER("CONSUMER");
	
	/** The value. */
	private String value;

	/**
	 * Instantiates a new customer type enum.
	 *
	 * @param value the value
	 */
	CustomerTypeEnum(String value) {
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
	 * @return the customer type enum
	 */
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