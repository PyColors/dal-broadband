package com.vf.uk.dal.broadband.journey.entity;

import java.util.List;

import lombok.Data;

/**
 * The Class JourneyRequestDetails.
 */
@Data
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

}
