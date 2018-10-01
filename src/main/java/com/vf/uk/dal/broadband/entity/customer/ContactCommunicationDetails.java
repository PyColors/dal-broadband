package com.vf.uk.dal.broadband.entity.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ContactCommunicationDetails.
 */
@Data
public class ContactCommunicationDetails {

	/**
	 * Field Double contactNumber -GCPL this can be Fax or phone number of
	 * contact. Contact/ContactPhoneCommunication/PhoneCommunication[UseCode =
	 * "XYZ"]/CompleteNumber or Contact/ContactFaxCommunication/
	 */
	@JsonProperty("contactNumber")
	private Double contactNumber;

	/**
	 * phoneNumberType -GCPL e.g. mobile, work, home, fax
	 */
	@JsonProperty("phoneNumberType")
	private String phoneNumberType;

	/** preferenceIndicator -GCPL. */
	@JsonProperty("preferenceIndicator")
	private String preferenceIndicator;

}
