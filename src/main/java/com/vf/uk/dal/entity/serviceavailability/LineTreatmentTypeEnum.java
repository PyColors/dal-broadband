package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of line treatment.
 */
public enum LineTreatmentTypeEnum {
	
	/** The new. */
	NEW("NEW"),

	/** The existing. */
	EXISTING("EXISTING");

	/** The value. */
	private String value;

	/**
	 * Instantiates a new line treatment type enum.
	 *
	 * @param value the value
	 */
	LineTreatmentTypeEnum(String value) {
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
	 * @return the line treatment type enum
	 */
	@JsonCreator
	public static LineTreatmentTypeEnum fromValue(String text) {
		for (LineTreatmentTypeEnum b : LineTreatmentTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}