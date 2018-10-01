package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineLocator.
 */

@Data
public class LineLocator {

	/** The exchange code. */
	@JsonProperty("exchangeCode")
	private String exchangeCode = null;

	/** The exchange name. */
	@JsonProperty("exchangeName")
	private String exchangeName = null;

	/** The district code. */
	@JsonProperty("districtCode")
	private String districtCode = null;

	/** The l 2 SID. */
	@JsonProperty("L2SID")
	private String l2SID = null;

	/** The cable link ID. */
	@JsonProperty("cableLinkID")
	private String cableLinkID = null;

	/** The distribution point. */
	@JsonProperty("distributionPoint")
	private String distributionPoint = null;

	/** The cable provider. */
	@JsonProperty("cableProvider")
	private String cableProvider = null;

}
