package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * ApplyVoucherResponse
 */

public class ApplyVoucherResponse   {
  private String voucherCode = null;

  private String voucherDescprition = null;

  private List<PromotionWithConflict> promotionsWithConflict = new ArrayList<>();

  private String voucherSavingsAmount = null;
  
  private Boolean conflictFlag = false;
  
  private String promotionSavingAmount = null;
  

 

   public String getPromotionSavingAmount() {
	return promotionSavingAmount;
}

public void setPromotionSavingAmount(String promotionSavingAmount) {
	this.promotionSavingAmount = promotionSavingAmount;
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
   * voucher Descrption  specified by the customer
   * @return voucherDescprition
  **/
  public String getVoucherDescprition() {
    return voucherDescprition;
  }

  public void setVoucherDescprition(String voucherDescprition) {
    this.voucherDescprition = voucherDescprition;
  }

 

   /**
   * Get promotionsWithConflict
   * @return promotionsWithConflict
  **/
  public List<PromotionWithConflict> getPromotionsWithConflict() {
    return promotionsWithConflict;
  }

  public void setPromotionsWithConflict(List<PromotionWithConflict> promotionsWithConflict) {
    this.promotionsWithConflict = promotionsWithConflict;
  }

  

   /**
   * Get voucherSavingsAmount
   * @return voucherSavingsAmount
  **/
  public String getVoucherSavingsAmount() {
    return voucherSavingsAmount;
  }

  public void setVoucherSavingsAmount(String voucherSavingsAmount) {
    this.voucherSavingsAmount = voucherSavingsAmount;
  }

public Boolean getConflictFlag() {
	return conflictFlag;
}

public void setConflictFlag(Boolean conflictFlag) {
	this.conflictFlag = conflictFlag;
}
}

