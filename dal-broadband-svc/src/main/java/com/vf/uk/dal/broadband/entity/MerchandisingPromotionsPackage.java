package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A composite object which holds all the details about the various types of
 * promotions applicable on the selected plan or hardware or the combination of
 * both.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-02T14:46:40.485Z")

public class MerchandisingPromotionsPackage {
	
	/** The plan id. */
	@JsonProperty("planId")
	private String planId = null;

	/** The hardware id. */
	@JsonProperty("hardwareId")
	private String hardwareId = null;

	/** The bundle promotions. */
	@JsonProperty("bundlePromotions")
	private MerchandisingPromotionsWrapper bundlePromotions = null;

	/** The hardware promotions. */
	@JsonProperty("hardwarePromotions")
	private MerchandisingPromotionsWrapper hardwarePromotions = null;

	/**
	 * Plan id.
	 *
	 * @param planId the plan id
	 * @return the merchandising promotions package
	 */
	public MerchandisingPromotionsPackage planId(String planId) {
		this.planId = planId;
		return this;
	}

	/**
	 * Unique identfier of the plan that was selected. Values are defined in
	 * Product Catalogue
	 * 
	 * @return planId
	 **/
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
	 * Hardware id.
	 *
	 * @param hardwareId the hardware id
	 * @return the merchandising promotions package
	 */
	public MerchandisingPromotionsPackage hardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
		return this;
	}

	/**
	 * Unique identfier of the hardware that was selected. Values are defined in
	 * Product Catalogue
	 * 
	 * @return hardwareId
	 **/
	public String getHardwareId() {
		return hardwareId;
	}

	/**
	 * Sets the hardware id.
	 *
	 * @param hardwareId the new hardware id
	 */
	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	/**
	 * Bundle promotions.
	 *
	 * @param bundlePromotions the bundle promotions
	 * @return the merchandising promotions package
	 */
	public MerchandisingPromotionsPackage bundlePromotions(MerchandisingPromotionsWrapper bundlePromotions) {
		this.bundlePromotions = bundlePromotions;
		return this;
	}

	/**
	 * Get bundlePromotions.
	 *
	 * @return bundlePromotions
	 */
	public MerchandisingPromotionsWrapper getBundlePromotions() {
		return bundlePromotions;
	}

	/**
	 * Sets the bundle promotions.
	 *
	 * @param bundlePromotions the new bundle promotions
	 */
	public void setBundlePromotions(MerchandisingPromotionsWrapper bundlePromotions) {
		this.bundlePromotions = bundlePromotions;
	}

	/**
	 * Hardware promotions.
	 *
	 * @param hardwarePromotions the hardware promotions
	 * @return the merchandising promotions package
	 */
	public MerchandisingPromotionsPackage hardwarePromotions(MerchandisingPromotionsWrapper hardwarePromotions) {
		this.hardwarePromotions = hardwarePromotions;
		return this;
	}

	/**
	 * Get hardwarePromotions.
	 *
	 * @return hardwarePromotions
	 */
	public MerchandisingPromotionsWrapper getHardwarePromotions() {
		return hardwarePromotions;
	}

	/**
	 * Sets the hardware promotions.
	 *
	 * @param hardwarePromotions the new hardware promotions
	 */
	public void setHardwarePromotions(MerchandisingPromotionsWrapper hardwarePromotions) {
		this.hardwarePromotions = hardwarePromotions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MerchandisingPromotionsPackage merchandisingPromotionsPackage = (MerchandisingPromotionsPackage) o;
		return Objects.equals(this.planId, merchandisingPromotionsPackage.planId)
				&& Objects.equals(this.hardwareId, merchandisingPromotionsPackage.hardwareId)
				&& Objects.equals(this.bundlePromotions, merchandisingPromotionsPackage.bundlePromotions)
				&& Objects.equals(this.hardwarePromotions, merchandisingPromotionsPackage.hardwarePromotions);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(planId, hardwareId, bundlePromotions, hardwarePromotions);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MerchandisingPromotionsPackage {\n");

		sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
		sb.append("    hardwareId: ").append(toIndentedString(hardwareId)).append("\n");
		sb.append("    bundlePromotions: ").append(toIndentedString(bundlePromotions)).append("\n");
		sb.append("    hardwarePromotions: ").append(toIndentedString(hardwarePromotions)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 *
	 * @param o the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
