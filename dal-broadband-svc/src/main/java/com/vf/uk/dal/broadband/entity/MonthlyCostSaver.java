package com.vf.uk.dal.broadband.entity;

import java.util.Objects;
/**
 * MonthlyCostSaver.
 */

public class MonthlyCostSaver   {
  
  /** The mcs plan id. */
  private String mcsPlanId = null;

  /** The mcs message. */
  private String mcsMessage = null;

  /** The mcs parent id. */
  private String mcsParentId = null;

  /** The one off price. */
  private Price oneOffPrice = null;

  /** The one off discount price. */
  private Price oneOffDiscountPrice = null;

  /** The monthly price. */
  private Price monthlyPrice = null;

  /** The monthly discount price. */
  private Price monthlyDiscountPrice = null;

  /**
   * Mcs plan id.
   *
   * @param mcsPlanId the mcs plan id
   * @return the monthly cost saver
   */
  public MonthlyCostSaver mcsPlanId(String mcsPlanId) {
    this.mcsPlanId = mcsPlanId;
    return this;
  }

   /**
    * PlanId of the MCS.
    *
    * @return mcsPlanId
    */
  public String getMcsPlanId() {
    return mcsPlanId;
  }

  /**
   * Sets the mcs plan id.
   *
   * @param mcsPlanId the new mcs plan id
   */
  public void setMcsPlanId(String mcsPlanId) {
    this.mcsPlanId = mcsPlanId;
  }

  /**
   * Mcs message.
   *
   * @param mcsMessage the mcs message
   * @return the monthly cost saver
   */
  public MonthlyCostSaver mcsMessage(String mcsMessage) {
    this.mcsMessage = mcsMessage;
    return this;
  }

   /**
    * PlanId of the MCS.
    *
    * @return mcsMessage
    */
  public String getMcsMessage() {
    return mcsMessage;
  }

  /**
   * Sets the mcs message.
   *
   * @param mcsMessage the new mcs message
   */
  public void setMcsMessage(String mcsMessage) {
    this.mcsMessage = mcsMessage;
  }

  /**
   * Mcs parent id.
   *
   * @param mcsParentId the mcs parent id
   * @return the monthly cost saver
   */
  public MonthlyCostSaver mcsParentId(String mcsParentId) {
    this.mcsParentId = mcsParentId;
    return this;
  }

   /**
    * PlanId of the MCS.
    *
    * @return mcsParentId
    */
  public String getMcsParentId() {
    return mcsParentId;
  }

  /**
   * Sets the mcs parent id.
   *
   * @param mcsParentId the new mcs parent id
   */
  public void setMcsParentId(String mcsParentId) {
    this.mcsParentId = mcsParentId;
  }

  /**
   * One off price.
   *
   * @param oneOffPrice the one off price
   * @return the monthly cost saver
   */
  public MonthlyCostSaver oneOffPrice(Price oneOffPrice) {
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
   * @return the monthly cost saver
   */
  public MonthlyCostSaver oneOffDiscountPrice(Price oneOffDiscountPrice) {
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
   * Monthly price.
   *
   * @param monthlyPrice the monthly price
   * @return the monthly cost saver
   */
  public MonthlyCostSaver monthlyPrice(Price monthlyPrice) {
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
   * @return the monthly cost saver
   */
  public MonthlyCostSaver monthlyDiscountPrice(Price monthlyDiscountPrice) {
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
    MonthlyCostSaver monthlyCostSaver = (MonthlyCostSaver) o;
    return Objects.equals(this.mcsPlanId, monthlyCostSaver.mcsPlanId) &&
        Objects.equals(this.mcsMessage, monthlyCostSaver.mcsMessage) &&
        Objects.equals(this.mcsParentId, monthlyCostSaver.mcsParentId) &&
        Objects.equals(this.oneOffPrice, monthlyCostSaver.oneOffPrice) &&
        Objects.equals(this.oneOffDiscountPrice, monthlyCostSaver.oneOffDiscountPrice) &&
        Objects.equals(this.monthlyPrice, monthlyCostSaver.monthlyPrice) &&
        Objects.equals(this.monthlyDiscountPrice, monthlyCostSaver.monthlyDiscountPrice);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(mcsPlanId, mcsMessage, mcsParentId, oneOffPrice, oneOffDiscountPrice, monthlyPrice, monthlyDiscountPrice);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyCostSaver {\n");
    
    sb.append("    mcsPlanId: ").append(toIndentedString(mcsPlanId)).append("\n");
    sb.append("    mcsMessage: ").append(toIndentedString(mcsMessage)).append("\n");
    sb.append("    mcsParentId: ").append(toIndentedString(mcsParentId)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    monthlyDiscountPrice: ").append(toIndentedString(monthlyDiscountPrice)).append("\n");
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

