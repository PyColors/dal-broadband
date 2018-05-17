package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchandisingPromotionsWrapper
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")

public class RouterMerchandisingPromotionsWrapper {
	@JsonProperty("conditionalSashBannerPromotion")
	private MerchandisingPromotion conditionalSashBannerPromotion = null;

	@JsonProperty("freeAccessoryPromotion")
	private MerchandisingPromotion freeAccessoryPromotion = null;

	@JsonProperty("freeExtraPromotion")
	private MerchandisingPromotion freeExtraPromotion = null;

	@JsonProperty("pricePromotion")
	private MerchandisingPromotion pricePromotion = null;

	@JsonProperty("sashBannerPromotion")
	private MerchandisingPromotion sashBannerPromotion = null;

	public RouterMerchandisingPromotionsWrapper conditionalSashBannerPromotion(
			MerchandisingPromotion conditionalSashBannerPromotion) {
		this.conditionalSashBannerPromotion = conditionalSashBannerPromotion;
		return this;
	}

	/**
	 * Get conditionalSashBannerPromotion
	 * 
	 * @return conditionalSashBannerPromotion
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public MerchandisingPromotion getConditionalSashBannerPromotion() {
		return conditionalSashBannerPromotion;
	}

	public void setConditionalSashBannerPromotion(MerchandisingPromotion conditionalSashBannerPromotion) {
		this.conditionalSashBannerPromotion = conditionalSashBannerPromotion;
	}

	public RouterMerchandisingPromotionsWrapper freeAccessoryPromotion(MerchandisingPromotion freeAccessoryPromotion) {
		this.freeAccessoryPromotion = freeAccessoryPromotion;
		return this;
	}

	/**
	 * Get freeAccessoryPromotion
	 * 
	 * @return freeAccessoryPromotion
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public MerchandisingPromotion getFreeAccessoryPromotion() {
		return freeAccessoryPromotion;
	}

	public void setFreeAccessoryPromotion(MerchandisingPromotion freeAccessoryPromotion) {
		this.freeAccessoryPromotion = freeAccessoryPromotion;
	}

	public RouterMerchandisingPromotionsWrapper freeExtraPromotion(MerchandisingPromotion freeExtraPromotion) {
		this.freeExtraPromotion = freeExtraPromotion;
		return this;
	}

	/**
	 * Get freeExtraPromotion
	 * 
	 * @return freeExtraPromotion
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public MerchandisingPromotion getFreeExtraPromotion() {
		return freeExtraPromotion;
	}

	public void setFreeExtraPromotion(MerchandisingPromotion freeExtraPromotion) {
		this.freeExtraPromotion = freeExtraPromotion;
	}

	public RouterMerchandisingPromotionsWrapper pricePromotion(MerchandisingPromotion pricePromotion) {
		this.pricePromotion = pricePromotion;
		return this;
	}

	/**
	 * Get pricePromotion
	 * 
	 * @return pricePromotion
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public MerchandisingPromotion getPricePromotion() {
		return pricePromotion;
	}

	public void setPricePromotion(MerchandisingPromotion pricePromotion) {
		this.pricePromotion = pricePromotion;
	}

	public RouterMerchandisingPromotionsWrapper sashBannerPromotion(MerchandisingPromotion sashBannerPromotion) {
		this.sashBannerPromotion = sashBannerPromotion;
		return this;
	}

	/**
	 * Get sashBannerPromotion
	 * 
	 * @return sashBannerPromotion
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public MerchandisingPromotion getSashBannerPromotion() {
		return sashBannerPromotion;
	}

	public void setSashBannerPromotion(MerchandisingPromotion sashBannerPromotion) {
		this.sashBannerPromotion = sashBannerPromotion;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RouterMerchandisingPromotionsWrapper merchandisingPromotionsWrapper = (RouterMerchandisingPromotionsWrapper) o;
		return Objects.equals(this.conditionalSashBannerPromotion,
				merchandisingPromotionsWrapper.conditionalSashBannerPromotion) &&

				Objects.equals(this.freeAccessoryPromotion, merchandisingPromotionsWrapper.freeAccessoryPromotion)
				&& Objects.equals(this.freeExtraPromotion, merchandisingPromotionsWrapper.freeExtraPromotion)
				&& Objects.equals(this.pricePromotion, merchandisingPromotionsWrapper.pricePromotion)
				&& Objects.equals(this.sashBannerPromotion, merchandisingPromotionsWrapper.sashBannerPromotion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conditionalSashBannerPromotion, freeAccessoryPromotion, freeExtraPromotion, pricePromotion,
				sashBannerPromotion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MerchandisingPromotionsWrapper {\n");

		sb.append("    conditionalSashBannerPromotion: ").append(toIndentedString(conditionalSashBannerPromotion))
				.append("\n");
		sb.append("    freeAccessoryPromotion: ").append(toIndentedString(freeAccessoryPromotion)).append("\n");
		sb.append("    freeExtraPromotion: ").append(toIndentedString(freeExtraPromotion)).append("\n");
		sb.append("    pricePromotion: ").append(toIndentedString(pricePromotion)).append("\n");
		sb.append("    sashBannerPromotion: ").append(toIndentedString(sashBannerPromotion)).append("\n");
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
