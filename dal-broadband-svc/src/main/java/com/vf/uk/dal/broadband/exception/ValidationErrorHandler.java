package com.vf.uk.dal.broadband.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.vf.uk.dal.broadband.entity.ValidationFailedResponse;
import com.vf.uk.dal.broadband.entity.ValidationFailedResponse.ValidationMessage;
import com.vf.uk.dal.common.context.ServiceContext;

/**
 * ValidationErrorHandler enables all controllers to support a common validation failure bean model
 * and localised message interpolation.
 */
@ControllerAdvice
public class ValidationErrorHandler {

  @ExceptionHandler
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ResponseEntity<?> handleBindException(final BindException err) {
    return toValidationFailureResponse(err.getAllErrors());
  }

  @ExceptionHandler
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ResponseEntity<?> handleMethodBindException(final MethodArgumentNotValidException err) {
    return toValidationFailureResponse(err.getBindingResult().getAllErrors());

  }

  private ResponseEntity<?> toValidationFailureResponse(final @Nullable List<ObjectError> errors) {
    List<ValidationMessage> validationMessages = new ArrayList<>();
    if (errors != null) {
      validationMessages = errors.stream().map(e -> new ValidationMessage(getParameterName(e), e.getDefaultMessage()))
          .collect(Collectors
          .toList());
    }
    String errorMessage = validationMessages.stream().map(ValidationMessage::getReason).collect(Collectors.joining(" "));
    //TODO error codes not defined for this service
    ValidationFailedResponse response = new ValidationFailedResponse("ERROR CODE", errorMessage, ServiceContext.getCorrelationId(), validationMessages);

    return ResponseEntity.badRequest().body(response);
  }

  private String getParameterName(final ObjectError error) {
    if (error instanceof FieldError) {
      FieldError fieldError = (FieldError) error;
      return fieldError.getField();
    } else {
      return error.getObjectName();
    }
  }

}