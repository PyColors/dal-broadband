package com.vf.uk.dal.broadband.exception;

/**
 * The Class TILException.
 */
public class TILException extends RuntimeException {
	
	/** The error code. */
	private final String errorCode;
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new TIL exception.
	 *
	 * @param errorCode the error code
	 * @param message the message
	 */
	public TILException(String errorCode, String message){
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public String getErrorCode() {
		return errorCode;
	}

}