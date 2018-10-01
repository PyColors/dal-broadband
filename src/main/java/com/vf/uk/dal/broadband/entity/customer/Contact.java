package com.vf.uk.dal.broadband.entity.customer;

import java.util.List;

import org.springframework.data.redis.core.index.Indexed;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class Contact.
 */
@Data
public class Contact {

	/** statusCode -GCPL LOV:New/Not Validated/Validated *. */
	@JsonProperty("statusCode")
	private String statusCode;

	/**
	 * preferredCommunicationChannelCode -GCPL LOV: Home Phone/Mobile/Pager/Work
	 * Phone/Email/Mail.
	 */
	@JsonProperty("preferredCommunicationChannelCode")
	private String preferredCommunicationChannelCode;

	/**
	 * Field boolean criticallyIll -GCPL Flag which indicates if the contact is
	 * marked as critically ill on the CRM system. This field is managed
	 * internally on the CRM System.
	 */
	@JsonProperty("criticallyIll")
	private String criticallyIll;

	/** Field Timestamp birthDateTime -GCPL Date the person was born. */
	@JsonProperty("birthDateTime")
	private String birthDateTime;

	/** jobTitle -GCPL Job position title assigned by an employer. */
	@JsonProperty("jobTitle")
	private String jobTitle;

	/**
	 * title -GCPL Is the title of the person. For example Dr.
	 */
	@JsonProperty("title")
	private String title;

	/** firstName -GCPL Is the Persons given name or first name. */
	@JsonProperty("firstName")
	private String firstName;

	/** familyName -GCPL Is the persons family name. */
	@JsonProperty("familyName")
	private String familyName;

	/**
	 * salutation -GCPL Way the person is addressed e.g. Honorable etc?
	 */
	@JsonProperty("salutation")
	private String salutation;

	/** maritalStatusCode -GCPL Martial status of the person. */
	@JsonProperty("maritalStatusCode")
	private String maritalStatusCode;

	/** middleName -GCPL Is the persons middle name. */
	@JsonProperty("middleName")
	private String middleName;

	/** genderCode -GCPL The gender (male, female, unknown) of the person. */
	@JsonProperty("genderCode")
	private String genderCode;

	/**
	 * Field boolean deceasedIndicator -GCPL Flag to show if the contact is
	 * deceased or not.
	 */
	@JsonProperty("deceasedIndicator")
	private Boolean deceasedIndicator;

	/** ageProof -GCPL Proven age of the contact. */
	@JsonProperty("ageProof")
	private String ageProof;

	/**
	 * userName -GCPL A username is supposed to be the unique identifier of the
	 * Identity.
	 */
	@JsonProperty("userName")
	@Indexed
	private String userName;

	/**
	 * type -GCPL Identity type. Not used for Release
	 */
	@JsonProperty("type")
	private String type;

	/**
	 * identityStatus -GCPL Identity Status e.g. Active�
	 */
	@JsonProperty("identityStatus")
	private String identityStatus;

	/**
	 * pin -GCPL PIN related to Identity. It is 4 digit long
	 */
	@JsonProperty("pin")
	private String pin;

	/**
	 * memorableWord -GCPL Memorable word. Max of 50 characters.
	 */
	@JsonProperty("memorableWord")
	private String memorableWord;

	/** hint -GCPL Hint question for the MemorableWord. */
	@JsonProperty("hint")
	private String hint;

	/**
	 * contactId -GCPL This field contains the unique contactId of the customer.
	 * e.g. 1-13CIA. Identification/ApplicationObjectKey/ID
	 */
	@JsonProperty("contactId")
	@Indexed
	private String contactId;

	/** Field EmailDetails emailDetails -GCPL. */
	/**
	 * Field EmailDetails emailDetails -GCPL
	 */
	@JsonProperty("emailDetails")
	private EmailDetails emailDetails;

	/** Field List<ContactCharacteristic> ContactCharacteristic -GCPL. */
	@JsonProperty("contactCharacteristic")
	private List<ContactCharacteristic> contactCharacteristic;

	/** Field AccountContactRelationship accountcontactrelationship -GCPL. */
	@JsonProperty("accountcontactrelationship")
	private AccountContactRelationship accountcontactrelationship;

	/**
	 * Field List<ContactCommunicationDetails> contactCommunicationDetails
	 * -GCPL.
	 */
	@JsonProperty("contactCommunicationDetails")
	private List<ContactCommunicationDetails> contactCommunicationDetails;

}
