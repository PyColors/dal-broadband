package com.vf.uk.dal.broadband.entity.premise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class StatusInfo   {

  private String status = null;

  private List<String> errorCodes = new ArrayList<>();

  
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  
  public List<String> getErrorCodes() {
    return errorCodes;
  }

  public void setErrorCodes(List<String> errorCodes) {
    this.errorCodes = errorCodes;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(status, errorCodes);
  }

}

