package com.vf.uk.dal.broadband.exception;

public class BroadbandJourneyCustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final String errorCode;
	private final String statusCode;

	public BroadbandJourneyCustomException(String errorCode, String message, String statusCode) {
		super(message);
		this.errorCode = errorCode;
		this.statusCode = statusCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getStatusCode() {
		return statusCode;
	}
}