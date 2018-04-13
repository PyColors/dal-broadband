package com.vf.uk.dal.broadband.basket.price.entity;
/**
 * 
 * @author Infosys
 *
 */
public class AccessoryDiscount {

	private String tag = null;
	private String label = null;
	private String descreption = null;
	private Integer discountId = null;
	private boolean isApplicableOnBundle = false;
	private boolean isApplicableOnHardware = false;
	private String bundleSkuId = null;
	private String deviceSkuId = null;
	private String type = null;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBundleSkuId() {
		return bundleSkuId;
	}

	public void setBundleSkuId(String bundleSkuId) {
		this.bundleSkuId = bundleSkuId;
	}

	public String getDeviceSkuId() {
		return deviceSkuId;
	}

	public void setDeviceSkuId(String deviceSkuId) {
		this.deviceSkuId = deviceSkuId;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

	public Integer getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public boolean isApplicableOnBundle() {
		return isApplicableOnBundle;
	}

	public void setApplicableOnBundle(boolean isApplicableOnBundle) {
		this.isApplicableOnBundle = isApplicableOnBundle;
	}

	public boolean isApplicableOnHardware() {
		return isApplicableOnHardware;
	}

	public void setApplicableOnHardware(boolean isApplicableOnHardware) {
		this.isApplicableOnHardware = isApplicableOnHardware;
	}
}
