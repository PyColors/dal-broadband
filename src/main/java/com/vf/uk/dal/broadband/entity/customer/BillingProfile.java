package com.vf.uk.dal.broadband.entity.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class BillingProfile.
 */
@Data
public class BillingProfile {

	/** The Constant serialVersionUID. */

	/**
	 * Field boolean preferredIndicator -GCPL Indicates if the billing profile
	 * is the primary billing profile.
	 */
	@JsonProperty("preferredIndicator")
	private boolean preferredIndicator;

	/** Field String note -GCPL Note for this billing profile. */
	@JsonProperty("note")
	private String note;

	/**
	 * Field String billingProfileEmailId -GCPL Email address to be used for
	 * billing clarifications.
	 */
	@JsonProperty("billingProfileEmailId")
	private String billingProfileEmailId;

	/**
	 * Field String billingInquiryPhoneNumber -GCPL Mobile Number to send Bill
	 * ready Notification.
	 */
	@JsonProperty("billingInquiryPhoneNumber")
	private String billingInquiryPhoneNumber;

	/** Field String billingProfileName -GCPL Name of the billing profile. */
	@JsonProperty("billingProfileName")
	private String billingProfileName;

	/**
	 * Field String billingProfileStatus -GCPL Status of the Billing profile.
	 */
	@JsonProperty("billingProfileStatus")
	private String billingProfileStatus;

	/**
	 * Field String billingProfileId -GCPL Contains the unique billing Id. e.g.
	 * 1-13CIA Identification/ApplicationObjectKey/ID
	 */
	@JsonProperty("billingProfileId")
	private String billingProfileId;

	/**
	 * Field String dayOfMonthCode -GCPL The date in a month when the bill is
	 * created. e.g. 3
	 */
	@JsonProperty("dayOfMonthCode")
	private String dayOfMonthCode;

	/**
	 * Field String frequencyCode -GCPL this field shows the frequency of the
	 * bill like monthly , weekly etc.
	 */
	@JsonProperty("frequencyCode")
	private String frequencyCode;

	/**
	 * Field String billTypeCode -GCPL Indicates whether the bill is Detail or
	 * Summary.
	 */
	@JsonProperty("billTypeCode")
	private String billTypeCode;

	/**
	 * Field String mediaTypeCode -GCPL The type of media on which the bill is
	 * to be presented. Multiple preferred values are avaliable if the customer
	 * wishes to obtain the Invoice / Bill via more than one medium. For e.g.
	 * Online and Paper, the value would be "Online|Paper".
	 */
	@JsonProperty("mediaTypeCode")
	private String mediaTypeCode;

	/**
	 * Field String paymentType -GCPL Type of payment. Prepaid/Postpaid
	 */
	@JsonProperty("paymentType")
	private String paymentType;

	/** Field boolean prepaidAutoTopUp -GCPL Flag to indicate an Auto top-up. */
	@JsonProperty("prepaidAutoTopUp")
	private Boolean prepaidAutoTopUp;

	/**
	 * Field String prepaidTopUpUOM -GCPL Unit of measure of top up. e.g. Pence
	 */
	@JsonProperty("prepaidTopUpUOM")
	private String prepaidTopUpUOM;

	/**
	 * Field String prepaidTopUpAmount -GCPL Amount of top up e.g. 10
	 */
	@JsonProperty("prepaidTopUpAmount")
	private String prepaidTopUpAmount;

	/**
	 * Field boolean prepaidSMSNotification -GCPL Indicate a sms notification
	 * has to be sent.
	 */
	@JsonProperty("prepaidSMSNotification")
	private Boolean prepaidSMSNotification;

	/**
	 * Field String prepaidThresholdAmount -GCPL Threshold amount e.g. 10
	 */
	@JsonProperty("prepaidThresholdAmount")
	private String prepaidThresholdAmount;

	/**
	 * Field String prepaidThresholdUOM -GCPL Threshold unit of measure. e.g.
	 * pounds, pence
	 */
	@JsonProperty("prepaidThresholdUOM")
	private String prepaidThresholdUOM;

	/**
	 * Field String preferredContactId -GCPL ID of the preferred contact
	 * associated to this Billing Profile. It's a reference to
	 * /CreateCustomerPartyResponseEBM/DataArea/CreateCustomerParty/PartyContact
	 * /Identification//ApplicationObjectKey/ID
	 */
	@JsonProperty("preferredContactId")
	private String preferredContactId;

	/**
	 * Field String preferredAddressId -GCPL ID of the preferred address
	 * associated to this Billing Profile. It's a reference to
	 * /QueryCustomerPartyListResponseEBM/DataArea/
	 * QueryCustomerPartyListResponse/PartyLocation/LocationReference/
	 * LocationIdentification/ApplicationObjectKey/ID
	 */
	@JsonProperty("preferredAddressId")
	private String preferredAddressId;

	/**
	 * Field String legalGroupOwnerStatus -GCPL Status of the Billing Profile of
	 * the legal group owner.
	 */
	@JsonProperty("legalGroupOwnerStatus")
	private String legalGroupOwnerStatus;

	/**
	 * Field String legalGroupOwnerStatus -GCPL Billing Profile ID of the legal
	 * group owner.
	 */
	@JsonProperty("legalGroupOwnerBillingProfileId")
	private String legalGroupOwnerBillingProfileId;

	/** Field PaymentMethod paymentMethod -GCPL. */
	@JsonProperty("paymentMethod")
	private PaymentMethod paymentMethod;

	/** Field BankAccountDetails bankAccountDetails -GCPL. */
	@JsonProperty("bankAccountDetails")
	private BankAccountDetails bankAccountDetails;

}
