package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

/**
 * BundlePrice.
 */

public class BundlePrice   {
  
  /** The bundle id. */
  private String bundleId = null;

  /** The monthly price. */
  private Price monthlyPrice = null;

  /** The monthly discount price. */
  private Price monthlyDiscountPrice = null;

  /** The merchandising promotions. */
  private MerchandisingPromotion merchandisingPromotions = null;

  /**
   * Bundle id.
   *
   * @param bundleId the bundle id
   * @return the bundle price
   */
  public BundlePrice bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

   /**
    * Bundle id of the price to be calculated.
    *
    * @return bundleId
    */
  public String getBundleId() {
    return bundleId;
  }

  /**
   * Sets the bundle id.
   *
   * @param bundleId the new bundle id
   */
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  /**
   * Monthly price.
   *
   * @param monthlyPrice the monthly price
   * @return the bundle price
   */
  public BundlePrice monthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
    return this;
  }

   /**
    * Get monthlyPrice.
    *
    * @return monthlyPrice
    */
  public Price getMonthlyPrice() {
    return monthlyPrice;
  }

  /**
   * Sets the monthly price.
   *
   * @param monthlyPrice the new monthly price
   */
  public void setMonthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
  }

  /**
   * Monthly discount price.
   *
   * @param monthlyDiscountPrice the monthly discount price
   * @return the bundle price
   */
  public BundlePrice monthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
    return this;
  }

   /**
    * Get monthlyDiscountPrice.
    *
    * @return monthlyDiscountPrice
    */
  public Price getMonthlyDiscountPrice() {
    return monthlyDiscountPrice;
  }

  /**
   * Sets the monthly discount price.
   *
   * @param monthlyDiscountPrice the new monthly discount price
   */
  public void setMonthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
  }

  /**
   * Merchandising promotions.
   *
   * @param merchandisingPromotions the merchandising promotions
   * @return the bundle price
   */
  public BundlePrice merchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
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
    BundlePrice bundlePrice = (BundlePrice) o;
    return Objects.equals(this.bundleId, bundlePrice.bundleId) &&
        Objects.equals(this.monthlyPrice, bundlePrice.monthlyPrice) &&
        Objects.equals(this.monthlyDiscountPrice, bundlePrice.monthlyDiscountPrice) &&
        Objects.equals(this.merchandisingPromotions, bundlePrice.merchandisingPromotions);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(bundleId, monthlyPrice, monthlyDiscountPrice, merchandisingPromotions);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundlePrice {\n");
    
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    monthlyDiscountPrice: ").append(toIndentedString(monthlyDiscountPrice)).append("\n");
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

