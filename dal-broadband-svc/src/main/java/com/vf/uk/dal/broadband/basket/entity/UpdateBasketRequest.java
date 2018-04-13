package com.vf.uk.dal.broadband.basket.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateBasketRequest
 */

public class UpdateBasketRequest   {
  private String customerRequestedDate = null;

  private Metadata metadata = null;

  private Customer customer = null;

  private VetOutcome vetOutcome = null;

  private DeliveryInfo deliveryInfo = null;

  private String voucherCode = null;

  private Boolean removeVoucherCode = null;

  private boolean affiliateFlag ;
  

   /**
   * Service request date specified by the customer
   * @return customerRequestedDate
  **/
  @ApiModelProperty(value = "Service request date specified by the customer")
  public String getCustomerRequestedDate() {
    return customerRequestedDate;
  }

  public void setCustomerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
  }

 

   /**
   * Get metadata
   * @return metadata
  **/
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

 
   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

 

   /**
   * Get vetOutcome
   * @return vetOutcome
  **/
  @ApiModelProperty(value = "")
  public VetOutcome getVetOutcome() {
    return vetOutcome;
  }

  public void setVetOutcome(VetOutcome vetOutcome) {
    this.vetOutcome = vetOutcome;
  }

 

   /**
   * Get deliveryInfo
   * @return deliveryInfo
  **/
  @ApiModelProperty(value = "")
  public DeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }

  

   /**
   * voucher code  specified by the customer
   * @return voucherCode
  **/
  @ApiModelProperty(value = "voucher code  specified by the customer")
  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }

  

   /**
   *  remove the voucher code  specified by the customer if you pass true we will remove the voucher from basket
   * @return removeVoucherCode
  **/
  @ApiModelProperty(value = " remove the voucher code  specified by the customer if you pass true we will remove the voucher from basket")
  public Boolean getRemoveVoucherCode() {
    return removeVoucherCode;
  }

  public void setRemoveVoucherCode(Boolean removeVoucherCode) {
    this.removeVoucherCode = removeVoucherCode;
  }

  /**
   * To Specify Affiliated Journey for Customer type with possible values of CONSUMER or BUSINESS
   * @return segment
  **/
  @ApiModelProperty(value = "To Specify Affiliated Journey")
 public boolean isAffiliateFlag() {
	return affiliateFlag;
}

/**
 * @param affiliateFlag the affiliateFlag to set
 */
public void setAffiliateFlag(boolean affiliateFlag) {
	this.affiliateFlag = affiliateFlag;
}

   
 
}