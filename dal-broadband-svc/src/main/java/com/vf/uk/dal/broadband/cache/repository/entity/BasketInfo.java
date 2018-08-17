package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class BasketInfo.
 */
@Data
public class BasketInfo implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5935582094313136574L;

	/** The account category. */
	@JsonProperty("accountCategory")
	private String accountCategory = null;

	/** The package id. */
	@JsonProperty("packageId")
	private String packageId = null;

	/** The plan product line id. */
	@JsonProperty("planProductLineId")
	private String planProductLineId = null;

	/** The hardware product line id. */
	@JsonProperty("hardwareProductLineId")
	private String hardwareProductLineId = null;

	/** The plan id. */
	@JsonProperty("planId")
	private String planId = null;

	/** The plan type. */
	@JsonProperty("planType")
	private String planType = null;

}
