package com.vf.uk.dal.broadband.entity;

/**
 * The Class ErrorInfo.
 */
public class ErrorInfo {
	
	/** The error code. */
	protected String errorCode;
	
	/** The error message. */
	protected String errorMessage;

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public String getErrorCode() {
		return this.errorCode;
	}

	/**
	 * Sets the error code.
	 *
	 * @param value the new error code
	 */
	public void setErrorCode(String value) {
		this.errorCode = value;
	}

	/**
	 * Gets the error message.
	 *
	 * @return the error message
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}

	/**
	 * Sets the error message.
	 *
	 * @param value the new error message
	 */
	public void setErrorMessage(String value) {
		this.errorMessage = value;
	}
}
