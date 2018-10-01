package com.vf.uk.dal.broadband.inventory.entity;

import lombok.Data;

/**
 * Price.
 */
@Data
public class DeliveryPrice {

	/** The gross. */
	private Double gross = null;

	/** The net. */
	private Double net = null;

	/** The vat. */
	private Double vat = null;

}
