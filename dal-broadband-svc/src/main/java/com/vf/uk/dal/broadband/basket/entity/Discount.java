package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * Discount
 */

public class Discount   {
  private String productLineId = null;

  private String action = null;

  private String skuId = null;

  private String tag = null;

  private String label = null;

  private String tenure = null;

  private String duration = null;

  private String confirmedRequired = null;

  private List<MediaLink> merchandisingMedia = new ArrayList<>();

  private DiscountValue discountValue = null;

 

   /**
   * line id of the discount in the package
   * @return productLineId
  **/
  public String getProductLineId() {
    return productLineId;
  }

  public void setProductLineId(String productLineId) {
    this.productLineId = productLineId;
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
   * Id of the discount as given in the product catalogue
   * @return skuId
  **/
  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }



   /**
   * Name of the discount as provided in the product catalogue
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

 

   /**
   * Label of the discount as provided in the product catalogue
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


   /**
   * Tenure of the discount as provided in the product catalogue (can possibly take the values - PARTIAL or FULL)
   * @return tenure
  **/
  public String getTenure() {
    return tenure;
  }

  public void setTenure(String tenure) {
    this.tenure = tenure;
  }



   /**
   * Duration from the start of the subscription for which the discount would be applicable
   * @return duration
  **/
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }



   /**
   * Flag to indicate whether user consent should be taken before applying the discount
   * @return confirmedRequired
  **/
  public String getConfirmedRequired() {
    return confirmedRequired;
  }

  public void setConfirmedRequired(String confirmedRequired) {
    this.confirmedRequired = confirmedRequired;
  }



   /**
   * Get merchandisingMedia
   * @return merchandisingMedia
  **/
  public List<MediaLink> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  public void setMerchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }

 
   /**
   * Get discountValue
   * @return discountValue
  **/
  public DiscountValue getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(DiscountValue discountValue) {
    this.discountValue = discountValue;
  }

}

