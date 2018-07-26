package com.vf.uk.dal.broadband.journey.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T07:23:46.167Z")

public class Error   {
  
  /** The code. */
  @JsonProperty("code")
  private String code = null;

  /** The message. */
  @JsonProperty("message")
  private String message = null;

  /** The reference id. */
  @JsonProperty("referenceId")
  private String referenceId = null;

  /**
   * Code.
   *
   * @param code the code
   * @return the error
   */
  public Error code(String code) {
    this.code = code;
    return this;
  }

   /**
    * Get code.
    *
    * @return code
    */
  public String getCode() {
    return code;
  }

  /**
   * Sets the code.
   *
   * @param code the new code
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Message.
   *
   * @param message the message
   * @return the error
   */
  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
    * Get message.
    *
    * @return message
    */
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
   * Reference id.
   *
   * @param referenceId the reference id
   * @return the error
   */
  public Error referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
    * Get referenceId.
    *
    * @return referenceId
    */
  public String getReferenceId() {
    return referenceId;
  }

  /**
   * Sets the reference id.
   *
   * @param referenceId the new reference id
   */
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
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
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.referenceId, error.referenceId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(code, message, referenceId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

