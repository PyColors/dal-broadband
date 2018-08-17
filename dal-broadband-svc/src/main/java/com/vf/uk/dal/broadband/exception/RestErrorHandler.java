package com.vf.uk.dal.broadband.exception;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.vf.uk.dal.common.context.ServiceContext;
import com.vf.uk.dal.common.exception.ErrorResponse;
import com.vf.uk.dal.common.logger.LogHelper;
/**
 * The Class RestErrorHandler.
 */
@ControllerAdvice
public class RestErrorHandler extends ResponseEntityExceptionHandler {
	

	
	@ExceptionHandler
	public ResponseEntity<?> handleException(final BroadbandJourneyCustomException err) {
		ErrorResponse error = new ErrorResponse(Integer.valueOf(err.getStatusCode()) , err.getErrorCode(), err.getMessage());
		error.setReferenceId(ServiceContext.getCorrelationId());
		return ResponseEntity.status(Integer.valueOf(err.getStatusCode())).body(error);
	}
	
	@ExceptionHandler
	public ResponseEntity<?> handleException(final RestClientResponseException err) {
		ErrorResponse error = errorResponse(err);
		return ResponseEntity.status(err.getRawStatusCode()).body(error);
	}
	
	@Override
	protected ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		com.vf.uk.dal.broadband.entity.Error apiError = new com.vf.uk.dal.broadband.entity.Error();
		apiError.setErrorCode(HttpStatus.BAD_REQUEST.toString());
		apiError.setErrorMessage(ex.getMessage());
		apiError.setReferenceId(ServiceContext.getCorrelationId());

		return handleExceptionInternal(ex, apiError, headers, status, request);
	}
	
	
	private ErrorResponse errorResponse(final RestClientResponseException err) {
		JSONParser parser = new JSONParser();
		JSONObject jsonError = new JSONObject();
		try {
			jsonError = (JSONObject) parser.parse(err.getResponseBodyAsString());
		} catch (org.json.simple.parser.ParseException pe) {
			LogHelper.error(getClass(), "Exception while parsing json object: " + pe);
		}
		String errorMessage = (String) jsonError.get("errorMessage");
		String errorCode = (String) jsonError.get("errorCode");
		int errCode = err.getRawStatusCode();
		ErrorResponse error = new ErrorResponse(errCode, errorCode, errorMessage);
		error.setReferenceId(ServiceContext.getCorrelationId());
		return error;
	}
	
}
