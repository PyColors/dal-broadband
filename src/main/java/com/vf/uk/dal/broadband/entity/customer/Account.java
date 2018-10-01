package com.vf.uk.dal.broadband.entity.customer;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class Account.
 */
@Data
public class Account  {


	/**
	 * Instantiates a new account.
	 */
	public Account() {
		super();
	}

	/**
	 * classificationCode- GCPL; Classifications that this Customer Party Account
	 * has been classified into. (e.g. Billing)
	 */
	@JsonProperty("classificationCode")
	private String classificationCode;

	/**
	 * accountStatus -GCPL; Status of the customer party (e.g. Active)
	 */
	@JsonProperty("accountStatus")
	private String accountStatus;

	/** accountName-GCPL;. */
	@JsonProperty("accountName")
	private String accountName;

	/** Field Date accountCreationDateTime-GCPL;. */
	@JsonProperty("accountCreationDateTime")
	private String accountCreationDateTime;
	/**
	 * accountId -GCPL; Identification/ApplicationObjectKey/ID Customer Account
	 * Unique Identifier.
	 */
	@JsonProperty("accountId")
	private String accountId;

	/**
	 * sellingProfileIdentificationScheme -GCPL to be populated using
	 * SellingProfileIdentificationID/ApplicationObjectKey/ContextID@ShemeID
	 * attribute name e.g. CLASSIFICATION_CODE,SERVICE_LEVEL or CHURN
	 * 
	 */
	@JsonProperty("sellingProfileIdentificationScheme")
	private String sellingProfileIdentificationScheme;

	/**
	 * sellingProfileIdentificationID -GCPL e.g. Value of attribute
	 * CLASSIFICATION_CODE,SERVICE_LEVEL or CHURN
	 */
	@JsonProperty("sellingProfileIdentificationID")
	private String sellingProfileIdentificationID;

	/** note -GCPL Note is only set for VIP customer. */
	@JsonProperty("note")
	private String note;

	/**
	 * businessReferenceNumber -GCPL Mandatory for Non Limited Companies
	 * Creditvetting system Business Reference Number used for Credit Vetting
	 * non-limited companies.
	 */
	@JsonProperty("businessReferenceNumber")
	private String businessReferenceNumber;

	/**
	 * registrationCode -GCPL Registered Company ID of the Organisation for whom the
	 * Commercial Credit Vet is being done.
	 */
	@JsonProperty("registrationCode")
	private String registrationCode;

	/**
	 * charityNumber -GCPL Charity number of the Non-Profit organisation as
	 * registered with the UK Charities Comission.
	 */

	@JsonProperty("charityNumber")
	private String charityNumber;

	/**
	 * tradingAs -GCPL Free text field for a Sole Trader to be able to enter his/her
	 * business name. Sole Trader represents a trading entity in the CRM system that
	 * operates on behalf of a single or multiple customers.
	 */
	@JsonProperty("tradingAs")
	private String tradingAs;

	/**
	 * accountCategory -GCPL The category of the account based on the profile of the
	 * customer.
	 */
	@JsonProperty("accountCategory")
	private String accountCategory;

	/**
	 * accountSubCategory -GCPL The sub category which further classifies the
	 * Account Category of the customer again based on the profile of the customer.
	 */
	@JsonProperty("accountSubCategory")
	private String accountSubCategory;

	/**
	 * accountSegment -GCPL Account Segment is the customer value and market segment
	 * combined. Account Segment is managed internally on the CRM system.
	 */
	@JsonProperty("accountSegment")
	private String accountSegment;

	/**
	 * accountSubSegment -GCPL Account Sub-Segment field further classifies the
	 * account segment into a numerical value that is currently the tenure of the
	 * customer in months.
	 */
	@JsonProperty("accountSubSegment")
	private String accountSubSegment;

	/**
	 * Field Double postpayMobileServicecount -GCPL Number of Postpay mobile
	 * subscriptions on the customer account. This field is internally managed by
	 * CRM.
	 */
	@JsonProperty("postpayMobileServicecount")
	private Double postpayMobileServicecount;

	/** The parent account id. */
	@Indexed
	@JsonProperty("parentAccountId")
	private String parentAccountId;

	/**
	 * storeId -GCPL Code identifying origin, for customer creation in case created
	 * by Indirect Partners, retail and telesales agents only. e.g. individual store
	 * code, telesales agent, CPW etc.
	 */
	@JsonProperty("storeId")
	private String storeId;

	/**
	 * Field Double daysSinceLastSuspension -GCPL Number of days since last
	 * suspension of any subscription on the account. This value is managed
	 * internally by the CRM system.
	 */
	@JsonProperty("daysSinceLastSuspension")
	private Double daysSinceLastSuspension;

	/**
	 * Field int suspensionsNumberInLast90Days -GCPL Number of times any
	 * subscription on the account is suspended in last 90 days. This value is
	 * managed internally by the CRM system.
	 */
	@JsonProperty("suspensionsNumberInLast90Days")
	private Double suspensionsNumberInLast90Days;

	/**
	 * Field Double suspensionsNumberInLast180Days -GCPL Number of times any MSISDN
	 * in the account is suspended in last 180 days. This value is managed
	 * internally by the CRM system.
	 */
	@JsonProperty("suspensionsNumberInLast180Days")
	private Double suspensionsNumberInLast180Days;

	/**
	 * typeCode -GCPL Type of Customer Account. Defines if the account is for a
	 * consumer or is a Commercial customer. Consumer accounts need to be specified
	 * using the value "Consumer"
	 */
	@JsonProperty("typeCode")
	private String typeCode;

	/** Field CreditVet creditVet -GCPL. */
	@JsonProperty("creditVet")
	private CreditVet creditVet;

	/** Field Contact contact -GCPL. */
	@JsonProperty("contact")
	private List<Contact> contacts;

	/** Field Address address -GCPL. */
	@JsonProperty("address")
	private List<Address> address;

	/** Field BillingProfile billingProfile -GCPL. */

	@JsonProperty("billingProfile")
	private List<BillingProfile> billingProfile;

	

}
