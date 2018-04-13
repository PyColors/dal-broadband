package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * CheckOutBasket
 */

public class CheckOutBasket   {
  private String basketId = null;

  private String affiliateId = null;

  private String source = null;

  private String customerRequestedDate = null;

  private List<CheckOutPackage> packages = new ArrayList<>();

  private VetOutcome vetOutcome = null;

  private PriceDetails priceDetails = null;

  private DeliveryInfo deliveryInfo = null;

  private String voucherCode = null;

  private String voucherDescription = null;

  private Boolean validated = null;

  private String hashvalue = null;
  
  private Journey journey = null;


   public Journey getJourney() {
	return journey;
}

public void setJourney(Journey journey) {
	this.journey = journey;
}

/**
   * Unique identifier for a basket
   * @return basketId
  **/
  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  

   /**
   * Id of affiliate from which the basket creation was invoked
   * @return affiliateId
  **/
  public String getAffiliateId() {
    return affiliateId;
  }

  public void setAffiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
  }

  

   /**
   * Source system identifier (WCS, MOBAPP etc)
   * @return source
  **/
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }



   /**
   * Service request date specified by the customer
   * @return customerRequestedDate
  **/
  public String getCustomerRequestedDate() {
    return customerRequestedDate;
  }

  public void setCustomerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
  }

 

 

   /**
   * Get packages
   * @return packages
  **/
  public List<CheckOutPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<CheckOutPackage> packages) {
    this.packages = packages;
  }
/**
 * 
 * @param vetOutcome
 * @return
 */
  public CheckOutBasket vetOutcome(VetOutcome vetOutcome) {
    this.vetOutcome = vetOutcome;
    return this;
  }

   /**
   * Get vetOutcome
   * @return vetOutcome
  **/
  public VetOutcome getVetOutcome() {
    return vetOutcome;
  }

  public void setVetOutcome(VetOutcome vetOutcome) {
    this.vetOutcome = vetOutcome;
  }
/**
 * 
 * @param priceDetails
 * @return
 */
  public CheckOutBasket priceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

   /**
   * Get priceDetails
   * @return priceDetails
  **/
  public PriceDetails getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
  }
/**
 * 
 * @param deliveryInfo
 * @return
 */
  public CheckOutBasket deliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
    return this;
  }

   /**
   * Get deliveryInfo
   * @return deliveryInfo
  **/
  public DeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }
/**
 * 
 * @param voucherCode
 * @return
 */
  public CheckOutBasket voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * voucher code  specified by the customer
   * @return voucherCode
  **/
  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }
/**
 * 
 * @param voucherDescription
 * @return
 */
  public CheckOutBasket voucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
    return this;
  }

   /**
   * voucher code  description
   * @return voucherDescription
  **/
  public String getVoucherDescription() {
    return voucherDescription;
  }

  public void setVoucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
  }
/**
 * 
 * @param validated
 * @return
 */
  public CheckOutBasket validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

   /**
   * Get validated
   * @return validated
  **/
  public Boolean getValidated() {
    return validated;
  }

  public void setValidated(Boolean validated) {
    this.validated = validated;
  }
/**
 * 
 * @param hashvalue
 * @return
 */
  public CheckOutBasket hashvalue(String hashvalue) {
    this.hashvalue = hashvalue;
    return this;
  }

   /**
   * Get hashvalue
   * @return hashvalue
  **/
  public String getHashvalue() {
    return hashvalue;
  }

  public void setHashvalue(String hashvalue) {
    this.hashvalue = hashvalue;
  }

	

}
