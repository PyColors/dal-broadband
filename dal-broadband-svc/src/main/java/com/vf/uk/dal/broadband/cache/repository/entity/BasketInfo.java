package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasketInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5935582094313136574L;

	@JsonProperty("accountCategory")
	private String accountCategory = null;

	@JsonProperty("packageId")
	private String packageId = null;

	@JsonProperty("planProductLineId")
	private String planProductLineId = null;

	@JsonProperty("hardwareProductLineId")
	private String hardwareProductLineId = null;

	@JsonProperty("planId")
	private String planId = null;

	@JsonProperty("planType")
	private String planType = null;

	public String getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getPlanProductLineId() {
		return planProductLineId;
	}

	public void setPlanProductLineId(String planProductLineId) {
		this.planProductLineId = planProductLineId;
	}

	public String getHardwareProductLineId() {
		return hardwareProductLineId;
	}

	public void setHardwareProductLineId(String hardwareProductLineId) {
		this.hardwareProductLineId = hardwareProductLineId;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

}
