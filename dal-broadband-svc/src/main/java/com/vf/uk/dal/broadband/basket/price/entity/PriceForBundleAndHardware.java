package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PriceForBundleAndHardware
 */

public class PriceForBundleAndHardware {
	private BundlePrice bundlePrice = null;

	private HardwarePrice hardwarePrice = null;

	private Price oneOffPrice = null;

	private Price oneOffDiscountPrice = null;

	private Price monthlyPrice = null;

	private Price monthlyDiscountPrice = null;

	private List<StepPricingInfo> stepPrices = new ArrayList<>();


	private List<AccessoryDiscount> accessoryDiscountList = new ArrayList<>();

	

	public List<AccessoryDiscount> getAccessoryDiscountList() {
		return accessoryDiscountList;
	}

	public void setAccessoryDiscountList(List<AccessoryDiscount> accessoryDiscountList) {
		this.accessoryDiscountList = accessoryDiscountList;
	}
/**
 * 
 * @param bundlePrice
 * @return
 */
	public PriceForBundleAndHardware bundlePrice(BundlePrice bundlePrice) {
		this.bundlePrice = bundlePrice;
		return this;
	}

	/**
	 * Get bundlePrice
	 * 
	 * @return bundlePrice
	 **/
	public BundlePrice getBundlePrice() {
		return bundlePrice;
	}

	public void setBundlePrice(BundlePrice bundlePrice) {
		this.bundlePrice = bundlePrice;
	}
/**
 * 
 * @param hardwarePrice
 * @return
 */
	public PriceForBundleAndHardware hardwarePrice(HardwarePrice hardwarePrice) {
		this.hardwarePrice = hardwarePrice;
		return this;
	}

	/**
	 * Get hardwarePrice
	 * 
	 * @return hardwarePrice
	 **/
	public HardwarePrice getHardwarePrice() {
		return hardwarePrice;
	}

	public void setHardwarePrice(HardwarePrice hardwarePrice) {
		this.hardwarePrice = hardwarePrice;
	}
/**
 * 
 * @param oneOffPrice
 * @return
 */
	public PriceForBundleAndHardware oneOffPrice(Price oneOffPrice) {
		this.oneOffPrice = oneOffPrice;
		return this;
	}

	/**
	 * Get oneOffPrice
	 * 
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
	public PriceForBundleAndHardware oneOffDiscountPrice(Price oneOffDiscountPrice) {
		this.oneOffDiscountPrice = oneOffDiscountPrice;
		return this;
	}

	/**
	 * Get oneOffDiscountPrice
	 * 
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
 * @param monthlyPrice
 * @return
 */
	public PriceForBundleAndHardware monthlyPrice(Price monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
		return this;
	}

	/**
	 * Get monthlyPrice
	 * 
	 * @return monthlyPrice
	 **/
	public Price getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(Price monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
/**
 * 
 * @param monthlyDiscountPrice
 * @return
 */
	public PriceForBundleAndHardware monthlyDiscountPrice(Price monthlyDiscountPrice) {
		this.monthlyDiscountPrice = monthlyDiscountPrice;
		return this;
	}

	/**
	 * Get monthlyDiscountPrice
	 * 
	 * @return monthlyDiscountPrice
	 **/
	public Price getMonthlyDiscountPrice() {
		return monthlyDiscountPrice;
	}

	public void setMonthlyDiscountPrice(Price monthlyDiscountPrice) {
		this.monthlyDiscountPrice = monthlyDiscountPrice;
	}
/**
 * 
 * @param stepPrices
 * @return
 */
	public PriceForBundleAndHardware stepPrices(List<StepPricingInfo> stepPrices) {
		this.stepPrices = stepPrices;
		return this;
	}
/**
 * 
 * @param stepPricesItem
 * @return
 */
	public PriceForBundleAndHardware addStepPricesItem(StepPricingInfo stepPricesItem) {
		this.stepPrices.add(stepPricesItem);
		return this;
	}

	/**
	 * Get stepPrices
	 * 
	 * @return stepPrices
	 **/
	public List<StepPricingInfo> getStepPrices() {
		return stepPrices;
	}

	public void setStepPrices(List<StepPricingInfo> stepPrices) {
		this.stepPrices = stepPrices;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PriceForBundleAndHardware priceForBundleAndHardware = (PriceForBundleAndHardware) o;
		return Objects.equals(this.bundlePrice, priceForBundleAndHardware.bundlePrice)
				&& Objects.equals(this.hardwarePrice, priceForBundleAndHardware.hardwarePrice)
				&& Objects.equals(this.oneOffPrice, priceForBundleAndHardware.oneOffPrice)
				&& Objects.equals(this.oneOffDiscountPrice, priceForBundleAndHardware.oneOffDiscountPrice)
				&& Objects.equals(this.monthlyPrice, priceForBundleAndHardware.monthlyPrice)
				&& Objects.equals(this.monthlyDiscountPrice, priceForBundleAndHardware.monthlyDiscountPrice)
				&& Objects.equals(this.stepPrices, priceForBundleAndHardware.stepPrices);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bundlePrice, hardwarePrice, oneOffPrice, oneOffDiscountPrice, monthlyPrice,
				monthlyDiscountPrice, stepPrices);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
