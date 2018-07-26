package com.vf.uk.dal.broadband.entity.appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Throwable.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class Throwable   {
  
  /** The cause. */
  @JsonProperty("cause")
  private Throwable cause = null;

  /** The localized message. */
  @JsonProperty("localizedMessage")
  private String localizedMessage = null;

  /** The message. */
  @JsonProperty("message")
  private String message = null;

  /** The stack trace. */
  @JsonProperty("stackTrace")
  @Valid
  private List<StackTraceElement> stackTrace = null;

  /** The suppressed. */
  @JsonProperty("suppressed")
  @Valid
  private List<Throwable> suppressed = null;

  /**
   * Cause.
   *
   * @param cause the cause
   * @return the throwable
   */
  public Throwable cause(Throwable cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause.
   *
   * @return cause
   */
  @ApiModelProperty(value = "")

  @Valid

  public Throwable getCause() {
    return cause;
  }

  /**
   * Sets the cause.
   *
   * @param cause the new cause
   */
  public void setCause(Throwable cause) {
    this.cause = cause;
  }

  /**
   * Localized message.
   *
   * @param localizedMessage the localized message
   * @return the throwable
   */
  public Throwable localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

  /**
   * Get localizedMessage.
   *
   * @return localizedMessage
   */
  @ApiModelProperty(value = "")


  public String getLocalizedMessage() {
    return localizedMessage;
  }

  /**
   * Sets the localized message.
   *
   * @param localizedMessage the new localized message
   */
  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  /**
   * Message.
   *
   * @param message the message
   * @return the throwable
   */
  public Throwable message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message.
   *
   * @return message
   */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  /**
   * Sets the message.
   *
   * @param message the new message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Stack trace.
   *
   * @param stackTrace the stack trace
   * @return the throwable
   */
  public Throwable stackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  /**
   * Adds the stack trace item.
   *
   * @param stackTraceItem the stack trace item
   * @return the throwable
   */
  public Throwable addStackTraceItem(StackTraceElement stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

  /**
   * Get stackTrace.
   *
   * @return stackTrace
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<StackTraceElement> getStackTrace() {
    return stackTrace;
  }

  /**
   * Sets the stack trace.
   *
   * @param stackTrace the new stack trace
   */
  public void setStackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
  }

  /**
   * Suppressed.
   *
   * @param suppressed the suppressed
   * @return the throwable
   */
  public Throwable suppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  /**
   * Adds the suppressed item.
   *
   * @param suppressedItem the suppressed item
   * @return the throwable
   */
  public Throwable addSuppressedItem(Throwable suppressedItem) {
    if (this.suppressed == null) {
      this.suppressed = new ArrayList<>();
    }
    this.suppressed.add(suppressedItem);
    return this;
  }

  /**
   * Get suppressed.
   *
   * @return suppressed
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<Throwable> getSuppressed() {
    return suppressed;
  }

  /**
   * Sets the suppressed.
   *
   * @param suppressed the new suppressed
   */
  public void setSuppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(cause, localizedMessage, message, stackTrace, suppressed);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

