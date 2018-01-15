package com.vf.uk.dal.broadband.entity;

import java.util.List;

/**
 * The Class GetBundleListSearchCriteria.
 */
public class GetBundleListSearchCriteria {

	/** The bundle id. */
	private String bundleId;

	/** The bundle class. */
	private String bundleClass;

	/** The device id. */
	private String deviceId;

	/** The user type. */
	private String userType;

	/** The sort. */
	private String sortCriteria;

	/** The count. */
	private int count;

	/** The offset. */
	private int offset;

	/** The journey id. */
	private String journeyId;

	/** The bundle id list. */
	private List<String> bundleIdList;

	/** The journey type. */
	private String journeyType;
	
	/** The credit limit. */
	private String creditLimit;
	
	/** The offer code. */
	private String offerCode;
	
	/** The customer identification number. */
	private String customerIdentificationNumber;
	
	/** The skip chordiant. */
	private Boolean skipChordiant;
	
	/** The duration. */
	private String duration;
	
	/** The classification code. */
	private String classificationCode;
	
	/** The status. */
	private String status;

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * Gets the classification code.
	 *
	 * @return the classification code
	 */
	public String getClassificationCode() {
		return classificationCode;
	}

	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @param bundleId
	 *            the new bundle id
	 */
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	/**
	 * Gets the bundle class.
	 *
	 * @return the bundle class
	 */
	public String getBundleClass() {
		return bundleClass;
	}

	/**
	 * Sets the bundle class.
	 *
	 * @param bundleClass
	 *            the new bundle class
	 */
	public void setBundleClass(String bundleClass) {
		this.bundleClass = bundleClass;
	}

	/**
	 * Gets the device id.
	 *
	 * @return the device id
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * Sets the device id.
	 *
	 * @param deviceId
	 *            the new device id
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * Gets the user type.
	 *
	 * @return the user type
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * Sets the user type.
	 *
	 * @param userType
	 *            the new user type
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * Gets the sort.
	 *
	 * @return the sort
	 */
	public String getSortCriteria() {
		return sortCriteria;
	}

	/**
	 * Sets the sort.
	 *
	 * @param sortCriteria
	 *            the new sort criteria
	 */
	public void setSortCriteria(String sortCriteria) {
		this.sortCriteria = sortCriteria;
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Sets the count.
	 *
	 * @param count
	 *            the new count
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * Gets the offset.
	 *
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the offset.
	 *
	 * @param offset
	 *            the new offset
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Gets the journey id.
	 *
	 * @return the journey id
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * Sets the journey id.
	 *
	 * @param journeyId
	 *            the new journey id
	 */
	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	/**
	 * Gets the bundle id list.
	 *
	 * @return the bundle id list
	 */
	public List<String> getBundleIdList() {
		return bundleIdList;
	}

	/**
	 * Sets the bundle id list.
	 *
	 * @param bundleIdList
	 *            the new bundle id list
	 */
	public void setBundleIdList(List<String> bundleIdList) {
		this.bundleIdList = bundleIdList;
	}

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
	 * Gets the credit limit.
	 *
	 * @return the credit limit
	 */
	public String getCreditLimit() {
		return creditLimit;
	}

	/**
	 * Sets the credit limit.
	 *
	 * @param creditLimit the new credit limit
	 */
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	/**
	 * Gets the offer code.
	 *
	 * @return the offer code
	 */
	public String getOfferCode() {
		return offerCode;
	}

	/**
	 * Sets the offer code.
	 *
	 * @param offerCode the new offer code
	 */
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	/**
	 * Gets the customer identification number.
	 *
	 * @return the customer identification number
	 */
	public String getCustomerIdentificationNumber() {
		return customerIdentificationNumber;
	}

	/**
	 * Sets the customer identification number.
	 *
	 * @param customerIdentificationNumber the new customer identification number
	 */
	public void setCustomerIdentificationNumber(String customerIdentificationNumber) {
		this.customerIdentificationNumber = customerIdentificationNumber;
	}

	/**
	 * Gets the skip chordiant.
	 *
	 * @return the skip chordiant
	 */
	public Boolean getSkipChordiant() {
		return skipChordiant;
	}

	/**
	 * Sets the skip chordiant.
	 *
	 * @param skipChordiant the new skip chordiant
	 */
	public void setSkipChordiant(Boolean skipChordiant) {
		this.skipChordiant = skipChordiant;
	}
}
