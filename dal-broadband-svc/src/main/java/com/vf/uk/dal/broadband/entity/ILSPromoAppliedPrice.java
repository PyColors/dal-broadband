package com.vf.uk.dal.broadband.entity;

/**
 * The Class ILSPromoAppliedPrice.
 */
public class ILSPromoAppliedPrice {
	
   /** The ILS promo code. */
   private String iLSPromoCode;
    
	/** The bundle id. */
    private String bundleId;
    
    /** The monthly price. */
    private Price monthlyPrice;

    /** The monthly discount price. */
    private Price monthlyDiscountPrice;
    
    /** The journey type. */
    private String journeyType;

	/**
	 * Gets the journey type.
	 *
	 * @return the journey type
	 */
	public String getJourneyType() {
		return journeyType;
	}

	/**
	 * Sets the journey type.
	 *
	 * @param journeyType the new journey type
	 */
	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}

	

	/**
	 * Gets the bundle id.
	 *
	 * @return the bundle id
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
	 * Gets the monthly price.
	 *
	 * @return the monthly price
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
	 * Gets the monthly discount price.
	 *
	 * @return the monthly discount price
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
  	 * Gets the i LS promo code.
  	 *
  	 * @return the iLSPromoCode
  	 */
	public String getiLSPromoCode() {
		return iLSPromoCode;
	}

	/**
	 * Sets the i LS promo code.
	 *
	 * @param iLSPromoCode the iLSPromoCode to set
	 */
	public void setiLSPromoCode(String iLSPromoCode) {
		this.iLSPromoCode = iLSPromoCode;
	}

}
