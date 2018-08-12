package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Code identifying whether it is change of address scenario.
 */
public enum MoveTypeCodeEnum {
	
	/** The address move. */
	ADDRESS_MOVE("ADDRESS_MOVE"),

	/** The new customer address move. */
	NEW_CUSTOMER_ADDRESS_MOVE("NEW_CUSTOMER_ADDRESS_MOVE");

	/** The value. */
	private String value;

	/**
	 * Instantiates a new move type code enum.
	 *
	 * @param value the value
	 */
	MoveTypeCodeEnum(String value) {
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
	 * @return the move type code enum
	 */
	@JsonCreator
	public static MoveTypeCodeEnum fromValue(String text) {
		for (MoveTypeCodeEnum b : MoveTypeCodeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}