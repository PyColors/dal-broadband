package com.vf.uk.dal.broadband.journey.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * JourneyData.
 */
public class JourneyData {
  
  /** The name. */
  private String name = null;

  /** The credit details. */
  private CreditDetails creditDetails = null;

  /** The state. */
  private String state = null;

  /** The customer party ID. */
  private String customerPartyID = null;

  /** The sso created date. */
  private String ssoCreatedDate = null;

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
  
  /** The plan discount. */
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String planDiscount = null;
  
  /** The subsidy discount. */
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String subsidyDiscount = null;
  
  /** The simo discount. */
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String simoDiscount = null;

  /** The context MSISDN. */
  private String contextMSISDN = null;

  /** The account roles. */
  private List<String> accountRoles = null;

  /**
   * Name.
   *
   * @param name the name
   * @return the journey data
   */
  public JourneyData name(String name) {
    this.name = name;
    return this;
  }

   /**
    * Journey type \&quot;Upgrade\&quot;,\&quot;2ndLine\&quot;,\&quot;Offer\&quot;,\&quot;Express\&quot; and \&quot;ConditionalAccept\&quot;.
    *
    * @return name
    */
  public String getName() {
    return name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Credit details.
   *
   * @param creditDetails the credit details
   * @return the journey data
   */
  public JourneyData creditDetails(CreditDetails creditDetails) {
    this.creditDetails = creditDetails;
    return this;
  }

   /**
    * Get creditDetails.
    *
    * @return creditDetails
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
   * State.
   *
   * @param state the state
   * @return the journey data
   */
  public JourneyData state(String state) {
    this.state = state;
    return this;
  }

   /**
    * \&quot;INPROGRESS\&quot;,\&quot;COMPLETE\&quot;.
    *
    * @return state
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
   * Customer party ID.
   *
   * @param customerPartyID the customer party ID
   * @return the journey data
   */
  public JourneyData customerPartyID(String customerPartyID) {
    this.customerPartyID = customerPartyID;
    return this;
  }

   /**
    * Siebel Account ID – the \&quot;in-context\&quot; account according to eCare.
    *
    * @return customerPartyID
    */
  public String getCustomerPartyID() {
    return customerPartyID;
  }

  /**
   * Sets the customer party ID.
   *
   * @param customerPartyID the new customer party ID
   */
  public void setCustomerPartyID(String customerPartyID) {
    this.customerPartyID = customerPartyID;
  }

  /**
   * Sso created date.
   *
   * @param ssoCreatedDate the sso created date
   * @return the journey data
   */
  public JourneyData ssoCreatedDate(String ssoCreatedDate) {
    this.ssoCreatedDate = ssoCreatedDate;
    return this;
  }

   /**
    * Timestamp the SSO datagram was created.
    *
    * @return ssoCreatedDate
    */
  public String getSsoCreatedDate() {
    return ssoCreatedDate;
  }

  /**
   * Sets the sso created date.
   *
   * @param ssoCreatedDate the new sso created date
   */
  public void setSsoCreatedDate(String ssoCreatedDate) {
    this.ssoCreatedDate = ssoCreatedDate;
  }

  /**
   * Owned customer party I ds.
   *
   * @param ownedCustomerPartyIDs the owned customer party I ds
   * @return the journey data
   */
  public JourneyData ownedCustomerPartyIDs(String ownedCustomerPartyIDs) {
    this.ownedCustomerPartyIDs = ownedCustomerPartyIDs;
    return this;
  }

   /**
    * The Customer Party accounts that are owned by the user.
    *
    * @return ownedCustomerPartyIDs
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
   * Offers.
   *
   * @param offers the offers
   * @return the journey data
   */
  public JourneyData offers(List<OfferDetails> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds the offers item.
   *
   * @param offersItem the offers item
   * @return the journey data
   */
  public JourneyData addOffersItem(OfferDetails offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
    * Get offers.
    *
    * @return offers
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
   * Upgrade eligibility type.
   *
   * @param upgradeEligibilityType the upgrade eligibility type
   * @return the journey data
   */
  public JourneyData upgradeEligibilityType(String upgradeEligibilityType) {
    this.upgradeEligibilityType = upgradeEligibilityType;
    return this;
  }

   /**
    * The type of upgrade eligibility the user has.
    *
    * @return upgradeEligibilityType
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
   * Commitment end date.
   *
   * @param commitmentEndDate the commitment end date
   * @return the journey data
   */
  public JourneyData commitmentEndDate(String commitmentEndDate) {
    this.commitmentEndDate = commitmentEndDate;
    return this;
  }

   /**
    * The commitment end date of the contextMSISDN.
    *
    * @return commitmentEndDate
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
   * Early upgrade fee net.
   *
   * @param earlyUpgradeFeeNet the early upgrade fee net
   * @return the journey data
   */
  public JourneyData earlyUpgradeFeeNet(String earlyUpgradeFeeNet) {
    this.earlyUpgradeFeeNet = earlyUpgradeFeeNet;
    return this;
  }

   /**
    * The Early Upgrade Fee ex VAT.
    *
    * @return earlyUpgradeFeeNet
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
   * Early upgrade fee gross.
   *
   * @param earlyUpgradeFeeGross the early upgrade fee gross
   * @return the journey data
   */
  public JourneyData earlyUpgradeFeeGross(String earlyUpgradeFeeGross) {
    this.earlyUpgradeFeeGross = earlyUpgradeFeeGross;
    return this;
  }

   /**
    * The Early Upgrade Fee inc VAT.
    *
    * @return earlyUpgradeFeeGross
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
   * Context MSISDN.
   *
   * @param contextMSISDN the context MSISDN
   * @return the journey data
   */
  public JourneyData contextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
    return this;
  }

   /**
    * Subscription id of the customer.
    *
    * @return contextMSISDN
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
   * Account roles.
   *
   * @param accountRoles the account roles
   * @return the journey data
   */
  public JourneyData accountRoles(List<String> accountRoles) {
    this.accountRoles = accountRoles;
    return this;
  }

  /**
   * Adds the account roles item.
   *
   * @param accountRolesItem the account roles item
   * @return the journey data
   */
  public JourneyData addAccountRolesItem(String accountRolesItem) {
    if (this.accountRoles == null) {
      this.accountRoles = new ArrayList<>();
    }
    this.accountRoles.add(accountRolesItem);
    return this;
  }

   /**
    * Account Roles like \&quot;Owner\&quot;,\&quot;Bill Payer\&quot;, \&quot;Service User\&quot;, \&quot;Admin L1\&quot;, \&quot;Admin L2\&quot;, \&quot;Store Collection\&quot;.
    *
    * @return accountRoles
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


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyData journeyData = (JourneyData) o;
    return Objects.equals(this.name, journeyData.name) &&
        Objects.equals(this.creditDetails, journeyData.creditDetails) &&
        Objects.equals(this.state, journeyData.state) &&
        Objects.equals(this.customerPartyID, journeyData.customerPartyID) &&
        Objects.equals(this.ssoCreatedDate, journeyData.ssoCreatedDate) &&
        Objects.equals(this.ownedCustomerPartyIDs, journeyData.ownedCustomerPartyIDs) &&
        Objects.equals(this.offers, journeyData.offers) &&
        Objects.equals(this.upgradeEligibilityType, journeyData.upgradeEligibilityType) &&
        Objects.equals(this.commitmentEndDate, journeyData.commitmentEndDate) &&
        Objects.equals(this.earlyUpgradeFeeNet, journeyData.earlyUpgradeFeeNet) &&
        Objects.equals(this.earlyUpgradeFeeGross, journeyData.earlyUpgradeFeeGross) &&
        Objects.equals(this.planDiscount, journeyData.planDiscount) &&
        Objects.equals(this.subsidyDiscount, journeyData.subsidyDiscount) &&
        Objects.equals(this.simoDiscount, journeyData.simoDiscount) &&
        Objects.equals(this.contextMSISDN, journeyData.contextMSISDN) &&
        Objects.equals(this.accountRoles, journeyData.accountRoles);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, creditDetails, state, customerPartyID, ssoCreatedDate, ownedCustomerPartyIDs, offers, upgradeEligibilityType, commitmentEndDate, earlyUpgradeFeeNet, earlyUpgradeFeeGross, contextMSISDN, accountRoles);
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creditDetails: ").append(toIndentedString(creditDetails)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    customerPartyID: ").append(toIndentedString(customerPartyID)).append("\n");
    sb.append("    ssoCreatedDate: ").append(toIndentedString(ssoCreatedDate)).append("\n");
    sb.append("    ownedCustomerPartyIDs: ").append(toIndentedString(ownedCustomerPartyIDs)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    upgradeEligibilityType: ").append(toIndentedString(upgradeEligibilityType)).append("\n");
    sb.append("    commitmentEndDate: ").append(toIndentedString(commitmentEndDate)).append("\n");
    sb.append("    earlyUpgradeFeeNet: ").append(toIndentedString(earlyUpgradeFeeNet)).append("\n");
    sb.append("    earlyUpgradeFeeGross: ").append(toIndentedString(earlyUpgradeFeeGross)).append("\n");
    sb.append("    planDiscount: ").append(toIndentedString(planDiscount)).append("\n");
    sb.append("    simoDiscount: ").append(toIndentedString(simoDiscount)).append("\n");
    sb.append("    subsidyDiscount: ").append(toIndentedString(subsidyDiscount)).append("\n");
    sb.append("    contextMSISDN: ").append(toIndentedString(contextMSISDN)).append("\n");
    sb.append("    accountRoles: ").append(toIndentedString(accountRoles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
 * Gets the plan discount.
 *
 * @return the plan discount
 */
public String getPlanDiscount() {
	return planDiscount;
}

/**
 * Sets the plan discount.
 *
 * @param planDiscount the new plan discount
 */
public void setPlanDiscount(String planDiscount) {
	this.planDiscount = planDiscount;
}

/**
 * Gets the subsidy discount.
 *
 * @return the subsidy discount
 */
public String getSubsidyDiscount() {
	return subsidyDiscount;
}

/**
 * Sets the subsidy discount.
 *
 * @param subsidyDiscount the new subsidy discount
 */
public void setSubsidyDiscount(String subsidyDiscount) {
	this.subsidyDiscount = subsidyDiscount;
}

/**
 * Gets the simo discount.
 *
 * @return the simo discount
 */
public String getSimoDiscount() {
	return simoDiscount;
}

/**
 * Sets the simo discount.
 *
 * @param simoDiscount the new simo discount
 */
public void setSimoDiscount(String simoDiscount) {
	this.simoDiscount = simoDiscount;
}
  
}

