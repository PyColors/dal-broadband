package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class PriceForHardware.
 */
@Data
public class PriceForHardware implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6342890537527020273L;

	/** The eng visit product id. */
	@JsonProperty("engVisitProductId")
	private String engVisitProductId = null;

	/** The gross. */
	@JsonProperty("gross")
	private String gross = null;

	/** The net. */
	@JsonProperty("net")
	private String net = null;

	/** The vat. */
	@JsonProperty("vat")
	private String vat = null;

}
