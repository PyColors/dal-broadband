package com.vf.uk.dal.broadband.entity.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class AccountContactRelationship.
 */
@Data
public class AccountContactRelationship {

	/**
	 * Field boolean contactAccountStatus -GCPL - If Contact Status is Associated,
	 * this means Contact is a valid, active contact for the Account. If it is
	 * Disassociated, this means this Contact no longer has any rights on this
	 * account.
	 */
	@JsonProperty("contactAccountStatus")
	private Boolean contactAccountStatus;

	/**
	 * Field boolean preferredcontactIndicator -GCPL Flag for the account preferred
	 * contact. Only one /PartyContact/Contact in the message can have this flag
	 * equal to true. If none has this flag , the first contact in the create
	 * request would have been considered the preferred one
	 */
	@JsonProperty("preferredcontactIndicator")
	private Boolean preferredcontactIndicator;


}
