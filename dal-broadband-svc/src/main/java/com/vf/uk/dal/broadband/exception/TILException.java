package com.vf.uk.dal.broadband.exception;

public class TILException extends RuntimeException {
	
	private final String errorCode;
	
	private static final long serialVersionUID = 1L;

	public TILException(String errorCode, String message){
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

}