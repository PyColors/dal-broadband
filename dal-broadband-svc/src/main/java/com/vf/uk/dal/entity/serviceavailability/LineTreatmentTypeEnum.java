package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of line treatment
 */
public enum LineTreatmentTypeEnum {
	NEW("NEW"),

	EXISTING("EXISTING");

	private String value;

	LineTreatmentTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

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