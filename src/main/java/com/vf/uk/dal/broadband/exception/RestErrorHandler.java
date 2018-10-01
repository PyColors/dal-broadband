package com.vf.uk.dal.broadband.exception;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientResponseException;

import com.vf.uk.dal.common.context.ServiceContext;
import com.vf.uk.dal.common.exception.ErrorResponse;
import com.vf.uk.dal.common.logger.LogHelper;

/**
 * The Class RestErrorHandler.
 */
@ControllerAdvice
public class RestErrorHandler {

	@ExceptionHandler
	public ResponseEntity<?> handleException(final BroadbandJourneyCustomException err) {
		ErrorResponse error = new ErrorResponse(Integer.valueOf(err.getStatusCode()), err.getErrorCode(),
				err.getMessage());
		error.setReferenceId(ServiceContext.getCorrelationId());
		return ResponseEntity.status(Integer.valueOf(err.getStatusCode())).body(error);
	}

	@ExceptionHandler
	public ResponseEntity<?> handleException(final RestClientResponseException err) {
		ErrorResponse error = errorResponse(err);
		return ResponseEntity.status(err.getRawStatusCode()).body(error);
	}

	@ExceptionHandler
	public ResponseEntity<?> handleException(final MethodArgumentNotValidException err) {
		ObjectError objErr = err.getBindingResult().getAllErrors().get(0);
		ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "BJC_INVALID_INPUT",
				objErr.getDefaultMessage());
		error.setReferenceId(ServiceContext.getCorrelationId());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
	}

	@ExceptionHandler
	protected ResponseEntity<Object> handleServletRequestBindingException(final ServletRequestBindingException err) {
		ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "BJC_MISSING_MANDATORY_INPUT",
				err.getLocalizedMessage());
		error.setReferenceId(ServiceContext.getCorrelationId());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
	}

	private ErrorResponse errorResponse(final RestClientResponseException err) {
		JSONParser parser = new JSONParser();
		JSONObject jsonError = new JSONObject();
		try {
			jsonError = (JSONObject) parser.parse(err.getResponseBodyAsString());
		} catch (org.json.simple.parser.ParseException pe) {
			LogHelper.error(getClass(), "Exception while parsing json object: " + pe);
		}
		String errorMessage = null;
		String errorCode = null;
		if(jsonError.get("message")!=null){
			 errorMessage = (String) jsonError.get("message");
			 errorCode = (String) jsonError.get("code");
		}else if (jsonError.get("errorMessage")!=null){
			 errorMessage = (String) jsonError.get("errorMessage");
			 errorCode = (String) jsonError.get("errorCode");
		}
		int errCode = err.getRawStatusCode();
		ErrorResponse error = new ErrorResponse(errCode, errorCode, errorMessage);
		error.setReferenceId(ServiceContext.getCorrelationId());
		return error;
	}

}
