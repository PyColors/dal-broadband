package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * CheckOutBundle
 */

public class CheckOutBundle   {
  private String packageLineId = null;

  private String action = null;

  private String skuId = null;

  private String name = null;

  private String displayName = null;

  private String productClass = null;

  private String paymentType = null;

  private String serviceId = null;

  private List<Attribute> attributes = new ArrayList<>();

  private BundlePrice priceDetails = null;
  /**
   * 
   * @param packageLineId
   * @return
   */
  public CheckOutBundle packageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
    return this;
  }

   /**
   * unique id for this line item of the package
   * @return packageLineId
  **/
  public String getPackageLineId() {
    return packageLineId;
  }

  public void setPackageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
  }
  /**
   * 
   * @param action
   * @return
   */
  public CheckOutBundle action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action to indicate the operation requested by the use on this particular bundle. Expected values are ADD/REMOVE/MODIFY
   * @return action
  **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }
  /**
   * 
   * @param skuId
   * @return
   */
  public CheckOutBundle skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

   /**
   * Bundle id from the product catalogue
   * @return skuId
  **/
  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }
  /**
   * 
   * @param name
   * @return
   */
  public CheckOutBundle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the bundle as provided in the product catalogue
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  /**
   * 
   * @param displayName
   * @return
   */
  public CheckOutBundle displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the bundle as provided in the merchandising data
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  /**
   * 
   * @param productClass
   * @return
   */
  public CheckOutBundle productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

   /**
   * Catalogue product class identifies products
   * @return productClass
  **/
  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }
  /**
   * 
   * @param paymentType
   * @return
   */
  public CheckOutBundle paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment type of the bundle. For example, \"postpaid\", \"prepaid\" etc.
   * @return paymentType
  **/
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }
  /**
   * 
   * @param serviceId
   * @return
   */
  public CheckOutBundle serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Type of the bundle. For example, Standard, Red, RedPlus etc.
   * @return serviceId
  **/
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }
  /**
   * 
   * @param attributes
   * @return
   */
  public CheckOutBundle attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  /**
   * 
   * @param attributesItem
   * @return
   */
  public CheckOutBundle addAttributesItem(Attribute attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }
  /**
   * 
   * @param priceDetails
   * @return
   */
  public CheckOutBundle priceDetails(BundlePrice priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

   /**
   * Get priceDetails
   * @return priceDetails
  **/
  public BundlePrice getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(BundlePrice priceDetails) {
    this.priceDetails = priceDetails;
  }

}

