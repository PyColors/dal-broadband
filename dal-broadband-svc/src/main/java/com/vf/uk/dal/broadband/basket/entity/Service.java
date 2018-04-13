package com.vf.uk.dal.broadband.basket.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Service
 */

public class Service {
	private String packageLineId = null;

	private String action = null;

	private String skuId = null;

	private String name = null;

	private String description = null;

	private String displayName = null;

	private String displayDescription = null;

	private List<Specifications> specificationGroup = new ArrayList<>();

	private List<MediaLink> merchandisingMedia = new ArrayList<>();

	private List<Attribute> attributes = new ArrayList<>();

	private ServicePrice priceDetails = null;

	private boolean isChanged;
	
	private boolean freeGift;
	
	private String productClass = null;
	
	private String dataRollover = null;
	@JsonIgnore
	private BigDecimal servicePrice = null;

	
	@JsonIgnore
	private String voucherFreeGiftMerchandising = null;
	
	@JsonIgnore
	private String coherenceSavedServicePrice=null;

	private List<Allowance> allowances = null;

	private String rewardPoints = null;

	private CommitmentPeriod planDuration = null;

	public List<Allowance> getAllowances() {
		return allowances;
	}

	public void setAllowances(List<Allowance> allowances) {
		this.allowances = allowances;
	}

	public String getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(String rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public CommitmentPeriod getPlanDuration() {
		return planDuration;
	}

	public void setPlanDuration(CommitmentPeriod planDuration) {
		this.planDuration = planDuration;
	}

	public String getDataRollover() {
		return dataRollover;
	}

	public void setDataRollover(String dataRollover) {
		this.dataRollover = dataRollover;
	}


	public String getCoherenceSavedServicePrice() {
		return coherenceSavedServicePrice;
	}

	public void setCoherenceSavedServicePrice(String coherenceSavedServicePrice) {
		this.coherenceSavedServicePrice = coherenceSavedServicePrice;
	}

	public String getProductClass() {
		return productClass;
	}

	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}

	public String getVoucherFreeGiftMerchandising() {
		return voucherFreeGiftMerchandising;
	}

	public void setVoucherFreeGiftMerchandising(String voucherFreeGiftMerchandising) {
		this.voucherFreeGiftMerchandising = voucherFreeGiftMerchandising;
	}

	public boolean isFreeGift() {
		return freeGift;
	}

	public void setFreeGift(boolean freeGift) {
		this.freeGift = freeGift;
	}

	public BigDecimal getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice;
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
	 * Get specificationGroup
	 * 
	 * @return specificationGroup
	 **/
	public List<Specifications> getSpecificationGroup() {
		return specificationGroup;
	}

	public void setSpecificationGroup(List<Specifications> specificationGroup) {
		this.specificationGroup = specificationGroup;
	}

	/**
	 * Get merchandisingMedia
	 * 
	 * @return merchandisingMedia
	 **/
	public List<MediaLink> getMerchandisingMedia() {
		return merchandisingMedia;
	}

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
	public ServicePrice getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(ServicePrice priceDetails) {
		this.priceDetails = priceDetails;
	}

}
