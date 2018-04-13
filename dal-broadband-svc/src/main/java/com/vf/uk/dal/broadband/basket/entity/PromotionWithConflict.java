package com.vf.uk.dal.broadband.basket.entity;

/**
 * PromotionWithConflict
 */

public class PromotionWithConflict   {
  private String packageId = null;

  private String packageLineId = null;

  private MerchandisingPromotion merchandisingPromotions = null;

  private String savingsAmount = null;

 
   /**
   * Get packageId
   * @return packageId
  **/
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  

   /**
   * Get packageLineId
   * @return packageLineId
  **/
  public String getPackageLineId() {
    return packageLineId;
  }

  public void setPackageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
  }

 

   /**
   * Get merchandisingPromotions
   * @return merchandisingPromotions
  **/
  public MerchandisingPromotion getMerchandisingPromotions() {
    return merchandisingPromotions;
  }

  public void setMerchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
    this.merchandisingPromotions = merchandisingPromotions;
  }

 

   /**
   * Get savingsAmount
   * @return savingsAmount
  **/
  public String getSavingsAmount() {
    return savingsAmount;
  }

  public void setSavingsAmount(String savingsAmount) {
    this.savingsAmount = savingsAmount;
  }

}

