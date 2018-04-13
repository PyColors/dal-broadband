package com.vf.uk.dal.broadband.basket.entity;

/**
 * VetOutcome
 */

public class VetOutcome   {
  private String outcomeCode = null;

  private String availableRecurringChargeLimit = null;

  private String availableNumberOfConnections = null;

  private String creditVetId = null;

 

   /**
   * credit vet outcome code
   * @return outcomeCode
  **/
  public String getOutcomeCode() {
    return outcomeCode;
  }

  public void setOutcomeCode(String outcomeCode) {
    this.outcomeCode = outcomeCode;
  }

  

   /**
   * Maximum available recurring charge
   * @return availableRecurringChargeLimit
  **/
  public String getAvailableRecurringChargeLimit() {
    return availableRecurringChargeLimit;
  }

  public void setAvailableRecurringChargeLimit(String availableRecurringChargeLimit) {
    this.availableRecurringChargeLimit = availableRecurringChargeLimit;
  }



   /**
   * Maximum number of connections available
   * @return availableNumberOfConnections
  **/
  public String getAvailableNumberOfConnections() {
    return availableNumberOfConnections;
  }

  public void setAvailableNumberOfConnections(String availableNumberOfConnections) {
    this.availableNumberOfConnections = availableNumberOfConnections;
  }

  

   /**
   * Id of the credit vet transaction
   * @return creditVetId
  **/
  public String getCreditVetId() {
    return creditVetId;
  }

  public void setCreditVetId(String creditVetId) {
    this.creditVetId = creditVetId;
  }

}

