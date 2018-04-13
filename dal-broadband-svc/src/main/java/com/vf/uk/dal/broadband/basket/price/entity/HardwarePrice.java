package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.Objects;
/**
 * HardwarePrice
 */
/**
 * 
 * @author infosys
 *
 */
public class HardwarePrice   {
  private String hardwareId = null;

  private Price oneOffPrice = null;

  private Price oneOffDiscountPrice = null;

  private MerchandisingPromotion merchandisingPromotions = null;
/**
 * 
 * @param hardwareId
 * @return
 */
  public HardwarePrice hardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
    return this;
  }

   /**
   * Hardware sku id added to the basket
   * @return hardwareId
  **/
  public String getHardwareId() {
    return hardwareId;
  }

  public void setHardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
  }
/**
 * 
 * @param oneOffPrice
 * @return
 */
  public HardwarePrice oneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
    return this;
  }

   /**
   * Get oneOffPrice
   * @return oneOffPrice
  **/
  public Price getOneOffPrice() {
    return oneOffPrice;
  }

  public void setOneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
  }
/**
 * 
 * @param oneOffDiscountPrice
 * @return
 */
  public HardwarePrice oneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
    return this;
  }

   /**
   * Get oneOffDiscountPrice
   * @return oneOffDiscountPrice
  **/
  public Price getOneOffDiscountPrice() {
    return oneOffDiscountPrice;
  }

  public void setOneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
  }

 /**
  * 
  * @param merchandisingPromotions
  * @return
  */
  public HardwarePrice merchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
	    this.merchandisingPromotions = merchandisingPromotions;
	    return this;
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
   


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HardwarePrice hardwarePrice = (HardwarePrice) o;
    return Objects.equals(this.hardwareId, hardwarePrice.hardwareId) &&
        Objects.equals(this.oneOffPrice, hardwarePrice.oneOffPrice) &&
        Objects.equals(this.oneOffDiscountPrice, hardwarePrice.oneOffDiscountPrice) &&
        Objects.equals(this.merchandisingPromotions, hardwarePrice.merchandisingPromotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hardwareId, oneOffPrice, oneOffDiscountPrice, merchandisingPromotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwarePrice {\n");
    
    sb.append("    hardwareId: ").append(toIndentedString(hardwareId)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
    sb.append("    merchandisingPromotions: ").append(toIndentedString(merchandisingPromotions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

