package com.vf.uk.dal.broadband.entity.appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Throwable
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class Throwable   {
  @JsonProperty("cause")
  private Throwable cause = null;

  @JsonProperty("localizedMessage")
  private String localizedMessage = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("stackTrace")
  @Valid
  private List<StackTraceElement> stackTrace = null;

  @JsonProperty("suppressed")
  @Valid
  private List<Throwable> suppressed = null;

  public Throwable cause(Throwable cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Throwable getCause() {
    return cause;
  }

  public void setCause(Throwable cause) {
    this.cause = cause;
  }

  public Throwable localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

  /**
   * Get localizedMessage
   * @return localizedMessage
  **/
  @ApiModelProperty(value = "")


  public String getLocalizedMessage() {
    return localizedMessage;
  }

  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  public Throwable message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Throwable stackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public Throwable addStackTraceItem(StackTraceElement stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<StackTraceElement>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

  /**
   * Get stackTrace
   * @return stackTrace
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<StackTraceElement> getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
  }

  public Throwable suppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  public Throwable addSuppressedItem(Throwable suppressedItem) {
    if (this.suppressed == null) {
      this.suppressed = new ArrayList<Throwable>();
    }
    this.suppressed.add(suppressedItem);
    return this;
  }

  /**
   * Get suppressed
   * @return suppressed
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Throwable> getSuppressed() {
    return suppressed;
  }

  public void setSuppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Throwable throwable = (Throwable) o;
    return Objects.equals(this.cause, throwable.cause) &&
        Objects.equals(this.localizedMessage, throwable.localizedMessage) &&
        Objects.equals(this.message, throwable.message) &&
        Objects.equals(this.stackTrace, throwable.stackTrace) &&
        Objects.equals(this.suppressed, throwable.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, localizedMessage, message, stackTrace, suppressed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Throwable {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

