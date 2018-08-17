package com.vf.uk.dal.broadband.entity;

import lombok.Data;

/**
 * The Class ILSPromoAppliedPrice.
 */
@Data
public class ILSPromoAppliedPrice {

	/** The ILS promo code. */
	private String iLSPromoCode;

	/** The bundle id. */
	private String bundleId;

	/** The monthly price. */
	private Price monthlyPrice;

	/** The monthly discount price. */
	private Price monthlyDiscountPrice;

	/** The journey type. */
	private String journeyType;

}
