package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PriceForBundleAndHardware.
 */

public class PriceForBundleAndHardware {
	
	/** The bundle price. */
	private BundlePrice bundlePrice = null;

	/** The hardware price. */
	private HardwarePrice hardwarePrice = null;

	/** The one off price. */
	private Price oneOffPrice = null;

	/** The one off discount price. */
	private Price oneOffDiscountPrice = null;

	/** The monthly price. */
	private Price monthlyPrice = null;

	/** The monthly discount price. */
	private Price monthlyDiscountPrice = null;

	/** The step prices. */
	private List<StepPricingInfo> stepPrices = new ArrayList<>();

	/**
	 * Bundle price.
	 *
	 * @param bundlePrice the bundle price
	 * @return the price for bundle and hardware
	 */
	public PriceForBundleAndHardware bundlePrice(BundlePrice bundlePrice) {
		this.bundlePrice = bundlePrice;
		return this;
	}

   /**
    * Get bundlePrice.
    *
    * @return bundlePrice
    */
  public BundlePrice getBundlePrice() {
    return bundlePrice;
  }

  /**
   * Sets the bundle price.
   *
   * @param bundlePrice the new bundle price
   */
  public void setBundlePrice(BundlePrice bundlePrice) {
    this.bundlePrice = bundlePrice;
  }

  /**
   * Hardware price.
   *
   * @param hardwarePrice the hardware price
   * @return the price for bundle and hardware
   */
  public PriceForBundleAndHardware hardwarePrice(HardwarePrice hardwarePrice) {
    this.hardwarePrice = hardwarePrice;
    return this;
  }

   /**
    * Get hardwarePrice.
    *
    * @return hardwarePrice
    */
  public HardwarePrice getHardwarePrice() {
    return hardwarePrice;
  }

  /**
   * Sets the hardware price.
   *
   * @param hardwarePrice the new hardware price
   */
  public void setHardwarePrice(HardwarePrice hardwarePrice) {
    this.hardwarePrice = hardwarePrice;
  }

  /**
   * One off price.
   *
   * @param oneOffPrice the one off price
   * @return the price for bundle and hardware
   */
  public PriceForBundleAndHardware oneOffPrice(Price oneOffPrice) {
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
   * @return the price for bundle and hardware
   */
  public PriceForBundleAndHardware oneOffDiscountPrice(Price oneOffDiscountPrice) {
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
   * @return the price for bundle and hardware
   */
  public PriceForBundleAndHardware monthlyPrice(Price monthlyPrice) {
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
   * @return the price for bundle and hardware
   */
  public PriceForBundleAndHardware monthlyDiscountPrice(Price monthlyDiscountPrice) {
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
   * Step prices.
   *
   * @param stepPrices the step prices
   * @return the price for bundle and hardware
   */
  public PriceForBundleAndHardware stepPrices(List<StepPricingInfo> stepPrices) {
    this.stepPrices = stepPrices;
    return this;
  }

  /**
   * Adds the step prices item.
   *
   * @param stepPricesItem the step prices item
   * @return the price for bundle and hardware
   */
  public PriceForBundleAndHardware addStepPricesItem(StepPricingInfo stepPricesItem) {
    this.stepPrices.add(stepPricesItem);
    return this;
  }

   /**
    * Get stepPrices.
    *
    * @return stepPrices
    */
  public List<StepPricingInfo> getStepPrices() {
    return stepPrices;
  }

  /**
   * Sets the step prices.
   *
   * @param stepPrices the new step prices
   */
  public void setStepPrices(List<StepPricingInfo> stepPrices) {
    this.stepPrices = stepPrices;
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
    PriceForBundleAndHardware priceForBundleAndHardware = (PriceForBundleAndHardware) o;
    return Objects.equals(this.bundlePrice, priceForBundleAndHardware.bundlePrice) &&
        Objects.equals(this.hardwarePrice, priceForBundleAndHardware.hardwarePrice) &&
        Objects.equals(this.oneOffPrice, priceForBundleAndHardware.oneOffPrice) &&
        Objects.equals(this.oneOffDiscountPrice, priceForBundleAndHardware.oneOffDiscountPrice) &&
        Objects.equals(this.monthlyPrice, priceForBundleAndHardware.monthlyPrice) &&
        Objects.equals(this.monthlyDiscountPrice, priceForBundleAndHardware.monthlyDiscountPrice) &&
        Objects.equals(this.stepPrices, priceForBundleAndHardware.stepPrices);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(bundlePrice, hardwarePrice, oneOffPrice, oneOffDiscountPrice, monthlyPrice, monthlyDiscountPrice, stepPrices);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceForBundleAndHardware {\n");
    
    sb.append("    bundlePrice: ").append(toIndentedString(bundlePrice)).append("\n");
    sb.append("    hardwarePrice: ").append(toIndentedString(hardwarePrice)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    monthlyDiscountPrice: ").append(toIndentedString(monthlyDiscountPrice)).append("\n");
    sb.append("    stepPrices: ").append(toIndentedString(stepPrices)).append("\n");
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

