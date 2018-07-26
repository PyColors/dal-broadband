package com.vf.uk.dal.broadband.journey.entity;

import java.util.List;

/**
 * The Class JourneyRequestDetails.
 */
public class JourneyRequestDetails {
	
	  /** The basket id. */
  	private String basketId = null;
	  
	  /** The username. */
  	private String username = null;

	  /** The journey type. */
  	private String journeyType = null;

	  /** The login time. */
  	private String loginTime = null;

	  /** The credit details. */
  	private CreditDetails creditDetails = null;

	  /** The state. */
  	private String state = null;

	  /** The customer party id. */
  	private String customerPartyId = null;

	  /** The owned customer party I ds. */
  	private String ownedCustomerPartyIDs = null;

	  /** The offers. */
  	private List<OfferDetails> offers = null;

	  /** The upgrade eligibility type. */
  	private String upgradeEligibilityType = null;

	  /** The commitment end date. */
  	private String commitmentEndDate = null;

	  /** The early upgrade fee net. */
  	private String earlyUpgradeFeeNet = null;

	  /** The early upgrade fee gross. */
  	private String earlyUpgradeFeeGross = null;

	  /** The context MSISDN. */
  	private String contextMSISDN = null;

	  /** The account roles. */
  	private List<String> accountRoles = null;
	  
	/**
	 * Gets the basket id.
	 *
	 * @return the basket id
	 */
	public String getBasketId() {
		return basketId;
	}

	/**
	 * Sets the basket id.
	 *
	 * @param basketId the new basket id
	 */
	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * Gets the login time.
	 *
	 * @return the login time
	 */
	public String getLoginTime() {
		return loginTime;
	}

	/**
	 * Sets the login time.
	 *
	 * @param loginTime the new login time
	 */
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

	/**
	 * Gets the credit details.
	 *
	 * @return the credit details
	 */
	public CreditDetails getCreditDetails() {
		return creditDetails;
	}

	/**
	 * Sets the credit details.
	 *
	 * @param creditDetails the new credit details
	 */
	public void setCreditDetails(CreditDetails creditDetails) {
		this.creditDetails = creditDetails;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the customer party id.
	 *
	 * @return the customer party id
	 */
	public String getCustomerPartyId() {
		return customerPartyId;
	}

	/**
	 * Sets the customer party id.
	 *
	 * @param customerPartyId the new customer party id
	 */
	public void setCustomerPartyId(String customerPartyId) {
		this.customerPartyId = customerPartyId;
	}

	/**
	 * Gets the owned customer party I ds.
	 *
	 * @return the owned customer party I ds
	 */
	public String getOwnedCustomerPartyIDs() {
		return ownedCustomerPartyIDs;
	}

	/**
	 * Sets the owned customer party I ds.
	 *
	 * @param ownedCustomerPartyIDs the new owned customer party I ds
	 */
	public void setOwnedCustomerPartyIDs(String ownedCustomerPartyIDs) {
		this.ownedCustomerPartyIDs = ownedCustomerPartyIDs;
	}

	/**
	 * Gets the offers.
	 *
	 * @return the offers
	 */
	public List<OfferDetails> getOffers() {
		return offers;
	}

	/**
	 * Sets the offers.
	 *
	 * @param offers the new offers
	 */
	public void setOffers(List<OfferDetails> offers) {
		this.offers = offers;
	}

	/**
	 * Gets the upgrade eligibility type.
	 *
	 * @return the upgrade eligibility type
	 */
	public String getUpgradeEligibilityType() {
		return upgradeEligibilityType;
	}

	/**
	 * Sets the upgrade eligibility type.
	 *
	 * @param upgradeEligibilityType the new upgrade eligibility type
	 */
	public void setUpgradeEligibilityType(String upgradeEligibilityType) {
		this.upgradeEligibilityType = upgradeEligibilityType;
	}

	/**
	 * Gets the commitment end date.
	 *
	 * @return the commitment end date
	 */
	public String getCommitmentEndDate() {
		return commitmentEndDate;
	}

	/**
	 * Sets the commitment end date.
	 *
	 * @param commitmentEndDate the new commitment end date
	 */
	public void setCommitmentEndDate(String commitmentEndDate) {
		this.commitmentEndDate = commitmentEndDate;
	}

	/**
	 * Gets the early upgrade fee net.
	 *
	 * @return the early upgrade fee net
	 */
	public String getEarlyUpgradeFeeNet() {
		return earlyUpgradeFeeNet;
	}

	/**
	 * Sets the early upgrade fee net.
	 *
	 * @param earlyUpgradeFeeNet the new early upgrade fee net
	 */
	public void setEarlyUpgradeFeeNet(String earlyUpgradeFeeNet) {
		this.earlyUpgradeFeeNet = earlyUpgradeFeeNet;
	}

	/**
	 * Gets the early upgrade fee gross.
	 *
	 * @return the early upgrade fee gross
	 */
	public String getEarlyUpgradeFeeGross() {
		return earlyUpgradeFeeGross;
	}

	/**
	 * Sets the early upgrade fee gross.
	 *
	 * @param earlyUpgradeFeeGross the new early upgrade fee gross
	 */
	public void setEarlyUpgradeFeeGross(String earlyUpgradeFeeGross) {
		this.earlyUpgradeFeeGross = earlyUpgradeFeeGross;
	}

	/**
	 * Gets the context MSISDN.
	 *
	 * @return the context MSISDN
	 */
	public String getContextMSISDN() {
		return contextMSISDN;
	}

	/**
	 * Sets the context MSISDN.
	 *
	 * @param contextMSISDN the new context MSISDN
	 */
	public void setContextMSISDN(String contextMSISDN) {
		this.contextMSISDN = contextMSISDN;
	}

	/**
	 * Gets the account roles.
	 *
	 * @return the account roles
	 */
	public List<String> getAccountRoles() {
		return accountRoles;
	}

	/**
	 * Sets the account roles.
	 *
	 * @param accountRoles the new account roles
	 */
	public void setAccountRoles(List<String> accountRoles) {
		this.accountRoles = accountRoles;
	}
	  
}
