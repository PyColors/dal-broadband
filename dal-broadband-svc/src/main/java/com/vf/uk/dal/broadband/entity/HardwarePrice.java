package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

/**
 * HardwarePrice.
 */

public class HardwarePrice   {
  
  /** The hardware id. */
  private String hardwareId = null;

  /** The one off price. */
  private Price oneOffPrice = null;

  /** The one off discount price. */
  private Price oneOffDiscountPrice = null;

  
  /** The merchandising promotions. */
  private MerchandisingPromotion merchandisingPromotions = null;

  /**
   * Hardware id.
   *
   * @param hardwareId the hardware id
   * @return the hardware price
   */
  public HardwarePrice hardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
    return this;
  }

   /**
    * Hardware id of the price to be calculated.
    *
    * @return hardwareId
    */
  public String getHardwareId() {
    return hardwareId;
  }

  /**
   * Sets the hardware id.
   *
   * @param hardwareId the new hardware id
   */
  public void setHardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
  }

  /**
   * One off price.
   *
   * @param oneOffPrice the one off price
   * @return the hardware price
   */
  public HardwarePrice oneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
    return this;
  }

   /**
    * Get oneOffPrice.
    *
    * @return oneOffPrice
    */
  public Price getOneOffPrice() {
    return oneOffPrice;
  }

  /**
   * Sets the one off price.
   *
   * @param oneOffPrice the new one off price
   */
  public void setOneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
  }

  /**
   * One off discount price.
   *
   * @param oneOffDiscountPrice the one off discount price
   * @return the hardware price
   */
  public HardwarePrice oneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
    return this;
  }

   /**
    * Get oneOffDiscountPrice.
    *
    * @return oneOffDiscountPrice
    */
  public Price getOneOffDiscountPrice() {
    return oneOffDiscountPrice;
  }

  /**
   * Sets the one off discount price.
   *
   * @param oneOffDiscountPrice the new one off discount price
   */
  public void setOneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
  }

   /**
    * Merchandising promotions applicable for the bundle.
    *
    * @param merchandisingPromotions the merchandising promotions
    * @return merchandisingPromotions
    */
  public HardwarePrice merchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
	    this.merchandisingPromotions = merchandisingPromotions;
	    return this;
	  }

	   /**
   	 * Get merchandisingPromotions.
   	 *
   	 * @return merchandisingPromotions
   	 */


	  public MerchandisingPromotion getMerchandisingPromotions() {
	    return merchandisingPromotions;
	  }

	  /**
  	 * Sets the merchandising promotions.
  	 *
  	 * @param merchandisingPromotions the new merchandising promotions
  	 */
  	public void setMerchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
	    this.merchandisingPromotions = merchandisingPromotions;
	  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(hardwareId, oneOffPrice, oneOffDiscountPrice, merchandisingPromotions);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

