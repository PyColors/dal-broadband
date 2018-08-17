package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class LineLocator.
 */
@Data
public class LineLocator implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8007923495697414332L;

	/** The Constant EXCHANGECODE. */
	private static final String EXCHANGE_CODE = "exchangeCode";

	/** The Constant EXCHANGENAME. */
	private static final String EXCHANGE_NAME = "exchangeName";

	/** The Constant DISTRICTCODE. */
	private static final String DISTRICT_CODE = "districtCode";

	/** The Constant L2SID. */
	private static final String L2S_ID = "l2SID";

	/** The Constant CABLELINKID. */
	private static final String CABLELINK_ID = "cableLinkID";

	/** The Constant DISTRIBUTIONPOINT. */
	private static final String DISTRIBUTION_POINT = "distributionPoint";

	/** The exchange code. */
	@JsonProperty(EXCHANGE_CODE)
	private String exchangeCode;

	/** The exchange name. */
	@JsonProperty(EXCHANGE_NAME)
	private String exchangeName;

	/** The district code. */
	@JsonProperty(DISTRICT_CODE)
	private String districtCode;

	/** The l 2 SID. */
	@JsonProperty(L2S_ID)
	private String l2SID;

	/** The cable link ID. */
	@JsonProperty(CABLELINK_ID)
	private String cableLinkID;

	/** The distribution point. */
	@JsonProperty(DISTRIBUTION_POINT)
	private String distributionPoint;

}
