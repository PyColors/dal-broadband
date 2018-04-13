package com.vf.uk.dal.broadband.basket.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Hardware
 */

public class Hardware {
	private String packageLineId = null;

	private String action = null;

	private String skuId = null;

	private String name = null;

	private String description = null;

	private String displayName = null;

	private String displayDescription = null;

	private List<DeviceBriefDescription> deviceBriefDescription = new ArrayList<>();

	private String deviceColor = null;

	private String memorySize = null;

	private String make = null;

	private String model = null;

	private String groupType = null;

	private String productClass = null;

	private Integer displayOrder = null;

	private Boolean showInSummary = null;

	private List<MediaLink> merchandisingMedia = new ArrayList<>();

	private List<Attribute> attributes = new ArrayList<>();

	private HardwarePrice priceDetails = null;

	private boolean isChanged;
	
	 private Price boxPrice = null;
	

	private boolean freeGift;

	@JsonIgnore
	private BigDecimal hardwarePrice = null;
	
	@JsonIgnore
	private String coherenceSavedHardwarePrice=null;
	
	@JsonIgnore
	private String voucherFreeGiftMerchandising = null;
	
	

	public String getCoherenceSavedHardwarePrice() {
		return coherenceSavedHardwarePrice;
	}


	public void setCoherenceSavedHardwarePrice(String coherenceSavedHardwarePrice) {
		this.coherenceSavedHardwarePrice = coherenceSavedHardwarePrice;
	}


	public BigDecimal getHardwarePrice() {
		return hardwarePrice;
	}
	
	
	public Price getBoxPrice() {
		return boxPrice;
	}

	public void setBoxPrice(Price boxPrice) {
		this.boxPrice = boxPrice;
	}
	
	public void setHardwarePrice(BigDecimal hardwarePrice) {
		this.hardwarePrice = hardwarePrice;
	}

	public String getVoucherFreeGiftMerchandising() {
		return voucherFreeGiftMerchandising;
	}

	public void setVoucherFreeGiftMerchandising(String voucherFreeGiftMerchandising) {
		this.voucherFreeGiftMerchandising = voucherFreeGiftMerchandising;
	}

	/**
	 * line id of the bundle in the package
	 * 
	 * @return packageLineId
	 **/
	public String getPackageLineId() {
		return packageLineId;
	}

	public void setPackageLineId(String packageLineId) {
		this.packageLineId = packageLineId;
	}

	public Boolean getIsChanged() {
		return isChanged;
	}

	public void setIsChanged(Boolean isChanged) {
		this.isChanged = isChanged;
	}

	public boolean isFreeGift() {
		return freeGift;
	}

	public void setFreeGift(boolean freeGift) {
		this.freeGift = freeGift;
	}

	/**
	 * Expected list is ADD/REMOVE/MODIFY
	 * 
	 * @return action
	 **/
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * Id of the device as given in the product catalogue
	 * 
	 * @return skuId
	 **/
	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	/**
	 * Name of the device as provided in the product catalogue
	 * 
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Description of the device as provided in the product catalogue
	 * 
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Name of the device as provided in the merchandising data
	 * 
	 * @return displayName
	 **/
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Description of the device as provided in the merchandising data
	 * 
	 * @return displayDescription
	 **/
	public String getDisplayDescription() {
		return displayDescription;
	}

	public void setDisplayDescription(String displayDescription) {
		this.displayDescription = displayDescription;
	}

	/**
	 * Get deviceBriefDescription
	 * 
	 * @return deviceBriefDescription
	 **/
	public List<DeviceBriefDescription> getDeviceBriefDescription() {
		return deviceBriefDescription;
	}

	public void setDeviceBriefDescription(List<DeviceBriefDescription> deviceBriefDescription) {
		this.deviceBriefDescription = deviceBriefDescription;
	}
/**
 * 
 * @param deviceColor
 * @return
 */
	public Hardware deviceColor(String deviceColor) {
		this.deviceColor = deviceColor;
		return this;
	}

	/**
	 * Color of the HandSet
	 * 
	 * @return deviceColor
	 **/
	public String getDeviceColor() {
		return deviceColor;
	}

	public void setDeviceColor(String deviceColor) {
		this.deviceColor = deviceColor;
	}

	/**
	 * Storage Capacity of the Device
	 * 
	 * @return memorySize
	 **/
	public String getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(String memorySize) {
		this.memorySize = memorySize;
	}

	/**
	 * Device company name
	 * 
	 * @return make
	 **/
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * Device Model
	 * 
	 * @return model
	 **/
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Device group type
	 * 
	 * @return groupType
	 **/
	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	/**
	 * Catalogue product class (identifies e.g. Delivery products)
	 * 
	 * @return productClass
	 **/
	public String getProductClass() {
		return productClass;
	}

	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * Will be the \"order\" priority of the product from the catalogue
	 * 
	 * @return displayOrder
	 **/
	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	/**
	 * Should the product be shown in basket summary
	 * 
	 * @return showInSummary
	 **/
	public Boolean getShowInSummary() {
		return showInSummary;
	}

	public void setShowInSummary(Boolean showInSummary) {
		this.showInSummary = showInSummary;
	}
/**
 * 
 * @param merchandisingMedia
 * @return
 */
	public Hardware merchandisingMedia(List<MediaLink> merchandisingMedia) {
		this.merchandisingMedia = merchandisingMedia;
		return this;
	}
/**
 * 
 * @param merchandisingMediaItem
 * @return
 */
	public Hardware addMerchandisingMediaItem(MediaLink merchandisingMediaItem) {
		this.merchandisingMedia.add(merchandisingMediaItem);
		return this;
	}

	/**
	 * Get merchandisingMedia
	 * 
	 * @return merchandisingMedia
	 **/
	public List<MediaLink> getMerchandisingMedia() {
		return merchandisingMedia;
	}
/**
 * 
 * @param merchandisingMedia
 */
	public void setMerchandisingMedia(List<MediaLink> merchandisingMedia) {
		this.merchandisingMedia = merchandisingMedia;
	}

	/**
	 * Get attributes
	 * 
	 * @return attributes
	 **/
	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	/**
	 * Get priceDetails
	 * 
	 * @return priceDetails
	 **/
	public HardwarePrice getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(HardwarePrice priceDetails) {
		this.priceDetails = priceDetails;
	}

}
