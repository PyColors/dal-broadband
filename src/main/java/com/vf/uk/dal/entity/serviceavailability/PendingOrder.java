package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PendingOrder.
 */
@Data
public class PendingOrder {

	/** The completion date. */
	@JsonProperty("completionDate")
	private String completionDate = null;

	/** The type code. */
	@JsonProperty("typeCode")
	private String typeCode = null;

	/** The third party flag. */
	@JsonProperty("thirdPartyFlag")
	private Boolean thirdPartyFlag = null;

}
