package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PriceForPackage
 */

public class PriceForPackage {
	private BundlePrice bundlePrice = null;

	private List<HardwarePrice> hardwarePrice = new ArrayList<HardwarePrice>();

	private List<ServicePrice> servicePrice = new ArrayList<ServicePrice>();

	private Price oneOffPrice = null;

	private Price oneOffDiscountPrice = null;

	private Price monthlyPrice = null;

	private Price monthlyDiscountPrice = null;

	private List<StepPricingInfo> stepPrices = new ArrayList<>();
	
	private String packageId = null;

	
	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	private List<AccessoryDiscount> accessoryDiscountList = new ArrayList<>();

	

	public List<AccessoryDiscount> getAccessoryDiscountList() {
		return accessoryDiscountList;
	}

	public void setAccessoryDiscountList(List<AccessoryDiscount> accessoryDiscountList) {
		this.accessoryDiscountList = accessoryDiscountList;
	}

	public PriceForPackage bundlePrice(BundlePrice bundlePrice) {
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

	public PriceForPackage hardwarePrice(List<HardwarePrice> hardwarePrice) {
		this.hardwarePrice = hardwarePrice;
		return this;
	}

	public PriceForPackage addHardwarePriceItem(HardwarePrice hardwarePriceItem) {
		this.hardwarePrice.add(hardwarePriceItem);
		return this;
	}

	/**
	 * Get hardwarePrice
	 * 
	 * @return hardwarePrice
	 **/
	public List<HardwarePrice> getHardwarePrice() {
		return hardwarePrice;
	}

	public void setHardwarePrice(List<HardwarePrice> hardwarePrice) {
		this.hardwarePrice = hardwarePrice;
	}

	public PriceForPackage servicePrice(List<ServicePrice> servicePrice) {
		this.servicePrice = servicePrice;
		return this;
	}

	public PriceForPackage addServicePriceItem(ServicePrice servicePriceItem) {
		this.servicePrice.add(servicePriceItem);
		return this;
	}

	/**
	 * Get servicePrice
	 * 
	 * @return servicePrice
	 **/
	public List<ServicePrice> getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(List<ServicePrice> servicePrice) {
		this.servicePrice = servicePrice;
	}

	public PriceForPackage oneOffPrice(Price oneOffPrice) {
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

	public PriceForPackage oneOffDiscountPrice(Price oneOffDiscountPrice) {
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

	public PriceForPackage monthlyPrice(Price monthlyPrice) {
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

	public PriceForPackage monthlyDiscountPrice(Price monthlyDiscountPrice) {
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

	public PriceForPackage stepPrices(List<StepPricingInfo> stepPrices) {
		this.stepPrices = stepPrices;
		return this;
	}

	public PriceForPackage addStepPricesItem(StepPricingInfo stepPricesItem) {
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
		PriceForPackage priceForPackage = (PriceForPackage) o;
		return Objects.equals(this.bundlePrice, priceForPackage.bundlePrice)
				&& Objects.equals(this.hardwarePrice, priceForPackage.hardwarePrice)
				&& Objects.equals(this.servicePrice, priceForPackage.servicePrice)
				&& Objects.equals(this.oneOffPrice, priceForPackage.oneOffPrice)
				&& Objects.equals(this.oneOffDiscountPrice, priceForPackage.oneOffDiscountPrice)
				&& Objects.equals(this.monthlyPrice, priceForPackage.monthlyPrice)
				&& Objects.equals(this.monthlyDiscountPrice, priceForPackage.monthlyDiscountPrice)
				&& Objects.equals(this.stepPrices, priceForPackage.stepPrices);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bundlePrice, hardwarePrice, servicePrice, oneOffPrice, oneOffDiscountPrice, monthlyPrice,
				monthlyDiscountPrice, stepPrices);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PriceForPackage {\n");

		sb.append("    bundlePrice: ").append(toIndentedString(bundlePrice)).append("\n");
		sb.append("    hardwarePrice: ").append(toIndentedString(hardwarePrice)).append("\n");
		sb.append("    servicePrice: ").append(toIndentedString(servicePrice)).append("\n");
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
