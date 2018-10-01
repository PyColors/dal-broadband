package com.vf.uk.dal.broadband.entity;

import lombok.Data;

/**
 * MonthlyCostSaver.
 */
@Data
public class MonthlyCostSaver {

	/** The mcs plan id. */
	private String mcsPlanId = null;

	/** The mcs message. */
	private String mcsMessage = null;

	/** The mcs parent id. */
	private String mcsParentId = null;

	/** The one off price. */
	private Price oneOffPrice = null;

	/** The one off discount price. */
	private Price oneOffDiscountPrice = null;

	/** The monthly price. */
	private Price monthlyPrice = null;

	/** The monthly discount price. */
	private Price monthlyDiscountPrice = null;

}
