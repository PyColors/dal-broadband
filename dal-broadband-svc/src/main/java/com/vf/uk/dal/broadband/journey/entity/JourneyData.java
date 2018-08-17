package com.vf.uk.dal.broadband.journey.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * JourneyData.
 */
@Data
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

}
