package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * CheckOutHardware
 */

public class CheckOutHardware   {
  private String packageLineId = null;

  private String action = null;

  private String skuId = null;

  private String name = null;

  private String description = null;

  private String displayName = null;

  private String productClass = null;

  private Price boxPrice = null;

  private List<Attribute> attributes = new ArrayList<>();

  private HardwarePrice priceDetails = null;

  /**
   * 
   * @param packageLineId
   * @return
   */
  public CheckOutHardware packageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
    return this;
  }

   /**
   * line id of the bundle in the package
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
  public CheckOutHardware action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Expected list is ADD/REMOVE/MODIFY
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
  public CheckOutHardware skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

   /**
   * Id of the device as given in the product catalogue
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
  public CheckOutHardware name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the device as provided in the product catalogue
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
   * @param description
   * @return
   */
  public CheckOutHardware description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the device as provided in the product catalogue
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  /**
   * 
   * @param displayName
   * @return
   */
  public CheckOutHardware displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the device as provided in the merchandising data
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
  public CheckOutHardware productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

   /**
   * Catalogue product class (identifies e.g. Delivery products)
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
   * @param boxPrice
   * @return
   */
  public CheckOutHardware boxPrice(Price boxPrice) {
    this.boxPrice = boxPrice;
    return this;
  }

   /**
   * Get boxPrice
   * @return boxPrice
  **/
  public Price getBoxPrice() {
    return boxPrice;
  }

  public void setBoxPrice(Price boxPrice) {
    this.boxPrice = boxPrice;
  }
  /**
   * 
   * @param attributes
   * @return
   */
  public CheckOutHardware attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  /**
   * 
   * @param attributesItem
   * @return
   */
  public CheckOutHardware addAttributesItem(Attribute attributesItem) {
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
  public CheckOutHardware priceDetails(HardwarePrice priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

   /**
   * Get priceDetails
   * @return priceDetails
  **/
  public HardwarePrice getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(HardwarePrice priceDetails) {
    this.priceDetails = priceDetails;
  }


}

