package com.vf.uk.dal.broadband.journey.entity;

import java.util.List;

public class JourneyRequestDetails {
	
	  private String basketId = null;
	  
	  private String username = null;

	  private String journeyType = null;

	  private String loginTime = null;

	  private CreditDetails creditDetails = null;

	  private String state = null;

	  private String customerPartyId = null;

	  private String ownedCustomerPartyIDs = null;

	  private List<OfferDetails> offers = null;

	  private String upgradeEligibilityType = null;

	  private String commitmentEndDate = null;

	  private String earlyUpgradeFeeNet = null;

	  private String earlyUpgradeFeeGross = null;

	  private String contextMSISDN = null;

	  private List<String> accountRoles = null;
	  
	public String getBasketId() {
		return basketId;
	}

	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJourneyType() {
		return journeyType;
	}

	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

	public CreditDetails getCreditDetails() {
		return creditDetails;
	}

	public void setCreditDetails(CreditDetails creditDetails) {
		this.creditDetails = creditDetails;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCustomerPartyId() {
		return customerPartyId;
	}

	public void setCustomerPartyId(String customerPartyId) {
		this.customerPartyId = customerPartyId;
	}

	public String getOwnedCustomerPartyIDs() {
		return ownedCustomerPartyIDs;
	}

	public void setOwnedCustomerPartyIDs(String ownedCustomerPartyIDs) {
		this.ownedCustomerPartyIDs = ownedCustomerPartyIDs;
	}

	public List<OfferDetails> getOffers() {
		return offers;
	}

	public void setOffers(List<OfferDetails> offers) {
		this.offers = offers;
	}

	public String getUpgradeEligibilityType() {
		return upgradeEligibilityType;
	}

	public void setUpgradeEligibilityType(String upgradeEligibilityType) {
		this.upgradeEligibilityType = upgradeEligibilityType;
	}

	public String getCommitmentEndDate() {
		return commitmentEndDate;
	}

	public void setCommitmentEndDate(String commitmentEndDate) {
		this.commitmentEndDate = commitmentEndDate;
	}

	public String getEarlyUpgradeFeeNet() {
		return earlyUpgradeFeeNet;
	}

	public void setEarlyUpgradeFeeNet(String earlyUpgradeFeeNet) {
		this.earlyUpgradeFeeNet = earlyUpgradeFeeNet;
	}

	public String getEarlyUpgradeFeeGross() {
		return earlyUpgradeFeeGross;
	}

	public void setEarlyUpgradeFeeGross(String earlyUpgradeFeeGross) {
		this.earlyUpgradeFeeGross = earlyUpgradeFeeGross;
	}

	public String getContextMSISDN() {
		return contextMSISDN;
	}

	public void setContextMSISDN(String contextMSISDN) {
		this.contextMSISDN = contextMSISDN;
	}

	public List<String> getAccountRoles() {
		return accountRoles;
	}

	public void setAccountRoles(List<String> accountRoles) {
		this.accountRoles = accountRoles;
	}
	  
}
