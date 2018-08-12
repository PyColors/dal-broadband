package com.vf.uk.dal.broadband.entity.premise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * The Class StatusInfo.
 */
public class StatusInfo   {

  /** The status. */
  private String status = null;

  /** The error codes. */
  private List<String> errorCodes = new ArrayList<>();

  
  /**
   * Gets the status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Gets the error codes.
   *
   * @return the error codes
   */
  public List<String> getErrorCodes() {
    return errorCodes;
  }

  /**
   * Sets the error codes.
   *
   * @param errorCodes the new error codes
   */
  public void setErrorCodes(List<String> errorCodes) {
    this.errorCodes = errorCodes;
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
    StatusInfo statusInfo = (StatusInfo) o;
    return Objects.equals(this.status, statusInfo.status) &&
        Objects.equals(this.errorCodes, statusInfo.errorCodes);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(status, errorCodes);
  }

}

