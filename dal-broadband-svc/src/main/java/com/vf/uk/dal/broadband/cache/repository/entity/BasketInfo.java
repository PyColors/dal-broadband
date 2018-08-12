package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class BasketInfo.
 */
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

	/**
	 * Gets the account category.
	 *
	 * @return the account category
	 */
	public String getAccountCategory() {
		return accountCategory;
	}

	/**
	 * Sets the account category.
	 *
	 * @param accountCategory the new account category
	 */
	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	/**
	 * Gets the package id.
	 *
	 * @return the package id
	 */
	public String getPackageId() {
		return packageId;
	}

	/**
	 * Sets the package id.
	 *
	 * @param packageId the new package id
	 */
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	/**
	 * Gets the plan product line id.
	 *
	 * @return the plan product line id
	 */
	public String getPlanProductLineId() {
		return planProductLineId;
	}

	/**
	 * Sets the plan product line id.
	 *
	 * @param planProductLineId the new plan product line id
	 */
	public void setPlanProductLineId(String planProductLineId) {
		this.planProductLineId = planProductLineId;
	}

	/**
	 * Gets the hardware product line id.
	 *
	 * @return the hardware product line id
	 */
	public String getHardwareProductLineId() {
		return hardwareProductLineId;
	}

	/**
	 * Sets the hardware product line id.
	 *
	 * @param hardwareProductLineId the new hardware product line id
	 */
	public void setHardwareProductLineId(String hardwareProductLineId) {
		this.hardwareProductLineId = hardwareProductLineId;
	}

	/**
	 * Gets the plan id.
	 *
	 * @return the plan id
	 */
	public String getPlanId() {
		return planId;
	}

	/**
	 * Sets the plan id.
	 *
	 * @param planId the new plan id
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	/**
	 * Gets the plan type.
	 *
	 * @return the plan type
	 */
	public String getPlanType() {
		return planType;
	}

	/**
	 * Sets the plan type.
	 *
	 * @param planType the new plan type
	 */
	public void setPlanType(String planType) {
		this.planType = planType;
	}

}
