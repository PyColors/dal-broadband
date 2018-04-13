package com.vf.uk.dal.broadband.basket.entity;

/**
 * ValidateBasketResponse
 */

public class ValidateBasketResponse   {
  private Boolean result = null;

  private ValidationResultDetails details = null;

 

   /**
   * Result of the basket validation. True if all rules are passed, false otherwise
   * @return result
  **/
  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

 

   /**
   * Get details
   * @return details
  **/
  public ValidationResultDetails getDetails() {
    return details;
  }

  public void setDetails(ValidationResultDetails details) {
    this.details = details;
  }

}

