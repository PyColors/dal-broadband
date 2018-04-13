package com.vf.uk.dal.broadband.basket.entity;

/**
 * Metadata
 */

public class Metadata   {
  private String returnURL = null;

  private String basketStatus = null;

  private String salesOrderId = null;

  private String reason = null;



   /**
   * WCS URL to be used by checkout to redirect back
   * @return returnURL
  **/
  public String getReturnURL() {
    return returnURL;
  }

  public void setReturnURL(String returnURL) {
    this.returnURL = returnURL;
  }



   /**
   * Status of the basket. Expected list of values; INCOMPLETE, IN_CHECKOUT, PROCESSING, PENDING_CUSTOMER_ACTION, SUBMITTED
   * @return basketStatus
  **/
  public String getBasketStatus() {
    return basketStatus;
  }

  public void setBasketStatus(String basketStatus) {
    this.basketStatus = basketStatus;
  }

 

   /**
   * Order Id of the siebel order created for this basket
   * @return salesOrderId
  **/
  public String getSalesOrderId() {
    return salesOrderId;
  }

  public void setSalesOrderId(String salesOrderId) {
    this.salesOrderId = salesOrderId;
  }

  

   /**
   * Reason - to be set by checkout process along with basket status
   * @return reason
  **/
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

}

