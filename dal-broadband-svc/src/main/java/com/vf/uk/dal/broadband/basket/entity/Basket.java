package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Basket
 */

public class Basket {
	private String basketId = null;

	private String affiliateId = null;
	
	private boolean affiliateFlag ;

	private String source = null;

	private String customerRequestedDate = null;

	private Metadata metadata = null;

	private Customer customer = null;
	
	private Journey journey = null;

	private List<ModelPackage> packages = new ArrayList<>();

	private VetOutcome vetOutcome = null;

	private PriceDetails priceDetails = null;

	private String totalOneoffPriceSaving = null;

	private String totalMonthlyPriceSaving = null;

	private DeliveryInfo deliveryInfo = null;

	private String voucherCode = null;

	private String voucherDescription = null;

	private Boolean validated = null;

	private String hashvalue = null;

	private boolean isChanged;
	
	private String changeCode = null;
	
	@JsonIgnore
	private String timeToLive = null;

	@JsonIgnore
	private boolean isVoucherApplicable;

	private String voucherErrorMessage;
	
	public String getTimeToLive() {
		return timeToLive;
	}


	public void setTimeToLive(String timeToLive) {
		this.timeToLive = timeToLive;
	}

	
	
	
	public Journey getJourney() {
		return journey;
	}


	public void setJourney(Journey journey) {
		this.journey = journey;
	}

	public Boolean getIsChanged() {
		return isChanged;
	}


	public void setIsChanged(Boolean isChanged) {
		this.isChanged = isChanged;
	}

	/**
	 * Unique identifier for a basket
	 * 
	 * @return basketId
	 **/
	public String getBasketId() {
		return basketId;
	}


	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

	public String getVoucherErrorMessage() {
		return voucherErrorMessage;
	}

	public void setVoucherErrorMessage(String voucherErrorMessage) {
		this.voucherErrorMessage = voucherErrorMessage;
	}

	public void setVoucherApplicable(boolean isVoucherApplicable) {
		this.isVoucherApplicable = isVoucherApplicable;
	}

	public Boolean getIsVoucherApplicable() {
		return isVoucherApplicable;
	}

	public void setIsVoucherApplicable(Boolean isVoucherApplicable) {
		this.isVoucherApplicable = isVoucherApplicable;
	}

	/**
	 * Id of affiliate from which the basket creation was invoked
	 * 
	 * @return affiliateId
	 **/
	public String getAffiliateId() {
		return affiliateId;
	}

	public void setAffiliateId(String affiliateId) {
		this.affiliateId = affiliateId;
	}

	/**
	 * Source system identifier (WCS, MOBAPP etc)
	 * 
	 * @return source
	 **/
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * Service request date specified by the customer
	 * 
	 * @return customerRequestedDate
	 **/
	public String getCustomerRequestedDate() {
		return customerRequestedDate;
	}

	public void setCustomerRequestedDate(String customerRequestedDate) {
		this.customerRequestedDate = customerRequestedDate;
	}

	/**
	 * Get metadata
	 * 
	 * @return metadata
	 **/
	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * Get customer
	 * 
	 * @return customer
	 **/
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
/**
 * 
 * @param packages
 * @return
 */
	public Basket packages(List<ModelPackage> packages) {
		this.packages = packages;
		return this;
	}

	/**
	 * Get packages
	 * 
	 * @return packages
	 **/
	public List<ModelPackage> getPackages() {
		return packages;
	}

	public void setPackages(List<ModelPackage> packages) {
		this.packages = packages;
	}

	/**
	 * Get vetOutcome
	 * 
	 * @return vetOutcome
	 **/
	public VetOutcome getVetOutcome() {
		return vetOutcome;
	}

	public void setVetOutcome(VetOutcome vetOutcome) {
		this.vetOutcome = vetOutcome;
	}

	/**
	 * Get priceDetails
	 * 
	 * @return priceDetails
	 **/
	public PriceDetails getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(PriceDetails priceDetails) {
		this.priceDetails = priceDetails;
	}

	/**
	 * total Oneoff price Saving for basket
	 * 
	 * @return totalOneoffPriceSaving
	 **/
	public String getTotalOneoffPriceSaving() {
		return totalOneoffPriceSaving;
	}

	public void setTotalOneoffPriceSaving(String totalOneoffPriceSaving) {
		this.totalOneoffPriceSaving = totalOneoffPriceSaving;
	}

	/**
	 * total Monthly price Saving for basket
	 * 
	 * @return totalMonthlyPriceSaving
	 **/
	public String getTotalMonthlyPriceSaving() {
		return totalMonthlyPriceSaving;
	}

	public void setTotalMonthlyPriceSaving(String totalMonthlyPriceSaving) {
		this.totalMonthlyPriceSaving = totalMonthlyPriceSaving;
	}

	/**
	 * Get deliveryInfo
	 * 
	 * @return deliveryInfo
	 **/
	public DeliveryInfo getDeliveryInfo() {
		return deliveryInfo;
	}

	public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	/**
	 * voucher code specified by the customer
	 * 
	 * @return voucherCode
	 **/
	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	/**
	 * voucher code description
	 * 
	 * @return voucherDescription
	 **/
	public String getVoucherDescription() {
		return voucherDescription;
	}

	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	/**
	 * Get validated
	 * 
	 * @return validated
	 **/
	public Boolean getValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	/**
	 * Get hashvalue
	 * 
	 * @return hashvalue
	 **/
	public String getHashvalue() {
		return hashvalue;
	}

	public void setHashvalue(String hashvalue) {
		this.hashvalue = hashvalue;
	}
	
	public String getChangeCode() {
	    return changeCode;
	  }

	  public void setChangeCode(String changeCode) {
	    this.changeCode = changeCode;
	  }


	/**
	 * @return the affiliateFlag
	 */
	public boolean isAffiliateFlag() {
		return affiliateFlag;
	}


	/**
	 * @param affiliateFlag the affiliateFlag to set
	 */
	public void setAffiliateFlag(boolean affiliateFlag) {
		this.affiliateFlag = affiliateFlag;
	}
	  
	

}
