package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Code identifying whether it is change of address scenario
 */
public enum MoveTypeCodeEnum {
	ADDRESS_MOVE("ADDRESS_MOVE"),

	NEW_CUSTOMER_ADDRESS_MOVE("NEW_CUSTOMER_ADDRESS_MOVE");

	private String value;

	MoveTypeCodeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

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