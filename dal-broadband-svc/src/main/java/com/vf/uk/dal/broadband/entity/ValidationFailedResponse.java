package com.vf.uk.dal.broadband.entity;

import java.util.List;

import lombok.Value;

@Value
public class ValidationFailedResponse {
	private final String errorCode;
	private final String errorMessage;
	private final String referenceId;
	private final List<ValidationMessage> validationMessages;

	@Value
	public static class ValidationMessage {
		private final String parameter;
		private final String reason;
	}
}
