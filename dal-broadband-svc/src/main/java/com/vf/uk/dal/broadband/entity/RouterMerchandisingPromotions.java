package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A composite object which holds all the details about the various types of
 * promotions applicable on the selected plan or hardware or the combination of
 * both
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-02T14:46:40.485Z")

public class RouterMerchandisingPromotions {
	
	@JsonProperty("hardwarePromotions")
	private RouterMerchandisingPromotionsWrapper hardwarePromotions = null;

	/**
	 * @param planId
	 * @return
	 */
	

	/**
	 * @param hardwarePromotions
	 * @return
	 */
	public RouterMerchandisingPromotions hardwarePromotions(RouterMerchandisingPromotionsWrapper hardwarePromotions) {
		this.hardwarePromotions = hardwarePromotions;
		return this;
	}

	/**
	 * Get hardwarePromotions
	 * 
	 * @return hardwarePromotions
	 **/
	public RouterMerchandisingPromotionsWrapper getHardwarePromotions() {
		return hardwarePromotions;
	}

	public void setHardwarePromotions(RouterMerchandisingPromotionsWrapper hardwarePromotions) {
		this.hardwarePromotions = hardwarePromotions;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RouterMerchandisingPromotions merchandisingPromotionsPackage = (RouterMerchandisingPromotions) o;
		return 
				Objects.equals(this.hardwarePromotions, merchandisingPromotionsPackage.hardwarePromotions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hardwarePromotions);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MerchandisingPromotionsPackage {\n");
		sb.append("    hardwarePromotions: ").append(toIndentedString(hardwarePromotions)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
