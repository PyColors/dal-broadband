package com.vf.uk.dal.broadband.journey.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * JourneyData
 */
public class JourneyData {
  private String name = null;

  private CreditDetails creditDetails = null;

  private String state = null;

  private String customerPartyID = null;

  private String ssoCreatedDate = null;

  private String ownedCustomerPartyIDs = null;

  private List<OfferDetails> offers = null;

  private String upgradeEligibilityType = null;

  private String commitmentEndDate = null;

  private String earlyUpgradeFeeNet = null;

  private String earlyUpgradeFeeGross = null;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String planDiscount = null;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String subsidyDiscount = null;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String simoDiscount = null;

  private String contextMSISDN = null;

  private List<String> accountRoles = null;

  public JourneyData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Journey type \&quot;Upgrade\&quot;,\&quot;2ndLine\&quot;,\&quot;Offer\&quot;,\&quot;Express\&quot; and \&quot;ConditionalAccept\&quot;
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JourneyData creditDetails(CreditDetails creditDetails) {
    this.creditDetails = creditDetails;
    return this;
  }

   /**
   * Get creditDetails
   * @return creditDetails
  **/
  public CreditDetails getCreditDetails() {
    return creditDetails;
  }

  public void setCreditDetails(CreditDetails creditDetails) {
    this.creditDetails = creditDetails;
  }

  public JourneyData state(String state) {
    this.state = state;
    return this;
  }

   /**
   * \&quot;INPROGRESS\&quot;,\&quot;COMPLETE\&quot;
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public JourneyData customerPartyID(String customerPartyID) {
    this.customerPartyID = customerPartyID;
    return this;
  }

   /**
   * Siebel Account ID – the \&quot;in-context\&quot; account according to eCare
   * @return customerPartyID
  **/
  public String getCustomerPartyID() {
    return customerPartyID;
  }

  public void setCustomerPartyID(String customerPartyID) {
    this.customerPartyID = customerPartyID;
  }

  public JourneyData ssoCreatedDate(String ssoCreatedDate) {
    this.ssoCreatedDate = ssoCreatedDate;
    return this;
  }

   /**
   * Timestamp the SSO datagram was created
   * @return ssoCreatedDate
  **/
  public String getSsoCreatedDate() {
    return ssoCreatedDate;
  }

  public void setSsoCreatedDate(String ssoCreatedDate) {
    this.ssoCreatedDate = ssoCreatedDate;
  }

  public JourneyData ownedCustomerPartyIDs(String ownedCustomerPartyIDs) {
    this.ownedCustomerPartyIDs = ownedCustomerPartyIDs;
    return this;
  }

   /**
   * The Customer Party accounts that are owned by the user
   * @return ownedCustomerPartyIDs
  **/
  public String getOwnedCustomerPartyIDs() {
    return ownedCustomerPartyIDs;
  }

  public void setOwnedCustomerPartyIDs(String ownedCustomerPartyIDs) {
    this.ownedCustomerPartyIDs = ownedCustomerPartyIDs;
  }

  public JourneyData offers(List<OfferDetails> offers) {
    this.offers = offers;
    return this;
  }

  public JourneyData addOffersItem(OfferDetails offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<OfferDetails>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Get offers
   * @return offers
  **/
  public List<OfferDetails> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferDetails> offers) {
    this.offers = offers;
  }

  public JourneyData upgradeEligibilityType(String upgradeEligibilityType) {
    this.upgradeEligibilityType = upgradeEligibilityType;
    return this;
  }

   /**
   * The type of upgrade eligibility the user has
   * @return upgradeEligibilityType
  **/
  public String getUpgradeEligibilityType() {
    return upgradeEligibilityType;
  }

  public void setUpgradeEligibilityType(String upgradeEligibilityType) {
    this.upgradeEligibilityType = upgradeEligibilityType;
  }

  public JourneyData commitmentEndDate(String commitmentEndDate) {
    this.commitmentEndDate = commitmentEndDate;
    return this;
  }

   /**
   * The commitment end date of the contextMSISDN
   * @return commitmentEndDate
  **/
  public String getCommitmentEndDate() {
    return commitmentEndDate;
  }

  public void setCommitmentEndDate(String commitmentEndDate) {
    this.commitmentEndDate = commitmentEndDate;
  }

  public JourneyData earlyUpgradeFeeNet(String earlyUpgradeFeeNet) {
    this.earlyUpgradeFeeNet = earlyUpgradeFeeNet;
    return this;
  }

   /**
   * The Early Upgrade Fee ex VAT
   * @return earlyUpgradeFeeNet
  **/
  public String getEarlyUpgradeFeeNet() {
    return earlyUpgradeFeeNet;
  }

  public void setEarlyUpgradeFeeNet(String earlyUpgradeFeeNet) {
    this.earlyUpgradeFeeNet = earlyUpgradeFeeNet;
  }

  public JourneyData earlyUpgradeFeeGross(String earlyUpgradeFeeGross) {
    this.earlyUpgradeFeeGross = earlyUpgradeFeeGross;
    return this;
  }

   /**
   * The Early Upgrade Fee inc VAT
   * @return earlyUpgradeFeeGross
  **/
  public String getEarlyUpgradeFeeGross() {
    return earlyUpgradeFeeGross;
  }

  public void setEarlyUpgradeFeeGross(String earlyUpgradeFeeGross) {
    this.earlyUpgradeFeeGross = earlyUpgradeFeeGross;
  }

  public JourneyData contextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
    return this;
  }

   /**
   * Subscription id of the customer
   * @return contextMSISDN
  **/
  public String getContextMSISDN() {
    return contextMSISDN;
  }

  public void setContextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
  }

  public JourneyData accountRoles(List<String> accountRoles) {
    this.accountRoles = accountRoles;
    return this;
  }

  public JourneyData addAccountRolesItem(String accountRolesItem) {
    if (this.accountRoles == null) {
      this.accountRoles = new ArrayList<String>();
    }
    this.accountRoles.add(accountRolesItem);
    return this;
  }

   /**
   * Account Roles like \&quot;Owner\&quot;,\&quot;Bill Payer\&quot;, \&quot;Service User\&quot;, \&quot;Admin L1\&quot;, \&quot;Admin L2\&quot;, \&quot;Store Collection\&quot;
   * @return accountRoles
  **/
  public List<String> getAccountRoles() {
    return accountRoles;
  }

  public void setAccountRoles(List<String> accountRoles) {
    this.accountRoles = accountRoles;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(name, creditDetails, state, customerPartyID, ssoCreatedDate, ownedCustomerPartyIDs, offers, upgradeEligibilityType, commitmentEndDate, earlyUpgradeFeeNet, earlyUpgradeFeeGross, contextMSISDN, accountRoles);
  }


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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

public String getPlanDiscount() {
	return planDiscount;
}

public void setPlanDiscount(String planDiscount) {
	this.planDiscount = planDiscount;
}

public String getSubsidyDiscount() {
	return subsidyDiscount;
}

public void setSubsidyDiscount(String subsidyDiscount) {
	this.subsidyDiscount = subsidyDiscount;
}

public String getSimoDiscount() {
	return simoDiscount;
}

public void setSimoDiscount(String simoDiscount) {
	this.simoDiscount = simoDiscount;
}
  
}

