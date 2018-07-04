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

public class MerchandisingPromotionsWrapper   {
  @JsonProperty("conditionalSashBannerPromotion")
  private MerchandisingPromotion conditionalSashBannerPromotion = null;

  @JsonProperty("dataPromotion")
  private MerchandisingPromotion dataPromotion = null;

  @JsonProperty("entertainmentPackPromotion")
  private MerchandisingPromotion entertainmentPackPromotion = null;

  @JsonProperty("freeAccessoryPromotion")
  private MerchandisingPromotion freeAccessoryPromotion = null;

  @JsonProperty("freeExtraPromotion")
  private MerchandisingPromotion freeExtraPromotion = null;

  @JsonProperty("pricePromotion")
  private MerchandisingPromotion pricePromotion = null;

  @JsonProperty("sashBannerPromotion")
  private MerchandisingPromotion sashBannerPromotion = null;

  @JsonProperty("secureNetPromotion")
  private MerchandisingPromotion secureNetPromotion = null;

  @JsonProperty("talkTimePromotion")
  private MerchandisingPromotion talkTimePromotion = null;

  @JsonProperty("textPromotion")
  private MerchandisingPromotion textPromotion = null;

  public MerchandisingPromotionsWrapper conditionalSashBannerPromotion(MerchandisingPromotion conditionalSashBannerPromotion) {
    this.conditionalSashBannerPromotion = conditionalSashBannerPromotion;
    return this;
  }

  /**
   * Get conditionalSashBannerPromotion
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

  public MerchandisingPromotionsWrapper dataPromotion(MerchandisingPromotion dataPromotion) {
    this.dataPromotion = dataPromotion;
    return this;
  }

  /**
   * Get dataPromotion
   * @return dataPromotion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getDataPromotion() {
    return dataPromotion;
  }

  public void setDataPromotion(MerchandisingPromotion dataPromotion) {
    this.dataPromotion = dataPromotion;
  }

  public MerchandisingPromotionsWrapper entertainmentPackPromotion(MerchandisingPromotion entertainmentPackPromotion) {
    this.entertainmentPackPromotion = entertainmentPackPromotion;
    return this;
  }

  /**
   * Get entertainmentPackPromotion
   * @return entertainmentPackPromotion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getEntertainmentPackPromotion() {
    return entertainmentPackPromotion;
  }

  public void setEntertainmentPackPromotion(MerchandisingPromotion entertainmentPackPromotion) {
    this.entertainmentPackPromotion = entertainmentPackPromotion;
  }

  public MerchandisingPromotionsWrapper freeAccessoryPromotion(MerchandisingPromotion freeAccessoryPromotion) {
    this.freeAccessoryPromotion = freeAccessoryPromotion;
    return this;
  }

  /**
   * Get freeAccessoryPromotion
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

  public MerchandisingPromotionsWrapper freeExtraPromotion(MerchandisingPromotion freeExtraPromotion) {
    this.freeExtraPromotion = freeExtraPromotion;
    return this;
  }

  /**
   * Get freeExtraPromotion
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

  public MerchandisingPromotionsWrapper pricePromotion(MerchandisingPromotion pricePromotion) {
    this.pricePromotion = pricePromotion;
    return this;
  }

  /**
   * Get pricePromotion
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

  public MerchandisingPromotionsWrapper sashBannerPromotion(MerchandisingPromotion sashBannerPromotion) {
    this.sashBannerPromotion = sashBannerPromotion;
    return this;
  }

  /**
   * Get sashBannerPromotion
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

  public MerchandisingPromotionsWrapper secureNetPromotion(MerchandisingPromotion secureNetPromotion) {
    this.secureNetPromotion = secureNetPromotion;
    return this;
  }

  /**
   * Get secureNetPromotion
   * @return secureNetPromotion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getSecureNetPromotion() {
    return secureNetPromotion;
  }

  public void setSecureNetPromotion(MerchandisingPromotion secureNetPromotion) {
    this.secureNetPromotion = secureNetPromotion;
  }

  public MerchandisingPromotionsWrapper talkTimePromotion(MerchandisingPromotion talkTimePromotion) {
    this.talkTimePromotion = talkTimePromotion;
    return this;
  }

  /**
   * Get talkTimePromotion
   * @return talkTimePromotion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getTalkTimePromotion() {
    return talkTimePromotion;
  }

  public void setTalkTimePromotion(MerchandisingPromotion talkTimePromotion) {
    this.talkTimePromotion = talkTimePromotion;
  }

  public MerchandisingPromotionsWrapper textPromotion(MerchandisingPromotion textPromotion) {
    this.textPromotion = textPromotion;
    return this;
  }

  /**
   * Get textPromotion
   * @return textPromotion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getTextPromotion() {
    return textPromotion;
  }

  public void setTextPromotion(MerchandisingPromotion textPromotion) {
    this.textPromotion = textPromotion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchandisingPromotionsWrapper merchandisingPromotionsWrapper = (MerchandisingPromotionsWrapper) o;
    return Objects.equals(this.conditionalSashBannerPromotion, merchandisingPromotionsWrapper.conditionalSashBannerPromotion) &&
        Objects.equals(this.dataPromotion, merchandisingPromotionsWrapper.dataPromotion) &&
        Objects.equals(this.entertainmentPackPromotion, merchandisingPromotionsWrapper.entertainmentPackPromotion) &&
        Objects.equals(this.freeAccessoryPromotion, merchandisingPromotionsWrapper.freeAccessoryPromotion) &&
        Objects.equals(this.freeExtraPromotion, merchandisingPromotionsWrapper.freeExtraPromotion) &&
        Objects.equals(this.pricePromotion, merchandisingPromotionsWrapper.pricePromotion) &&
        Objects.equals(this.sashBannerPromotion, merchandisingPromotionsWrapper.sashBannerPromotion) &&
        Objects.equals(this.secureNetPromotion, merchandisingPromotionsWrapper.secureNetPromotion) &&
        Objects.equals(this.talkTimePromotion, merchandisingPromotionsWrapper.talkTimePromotion) &&
        Objects.equals(this.textPromotion, merchandisingPromotionsWrapper.textPromotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalSashBannerPromotion, dataPromotion, entertainmentPackPromotion, freeAccessoryPromotion, freeExtraPromotion, pricePromotion, sashBannerPromotion, secureNetPromotion, talkTimePromotion, textPromotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchandisingPromotionsWrapper {\n");
    
    sb.append("    conditionalSashBannerPromotion: ").append(toIndentedString(conditionalSashBannerPromotion)).append("\n");
    sb.append("    dataPromotion: ").append(toIndentedString(dataPromotion)).append("\n");
    sb.append("    entertainmentPackPromotion: ").append(toIndentedString(entertainmentPackPromotion)).append("\n");
    sb.append("    freeAccessoryPromotion: ").append(toIndentedString(freeAccessoryPromotion)).append("\n");
    sb.append("    freeExtraPromotion: ").append(toIndentedString(freeExtraPromotion)).append("\n");
    sb.append("    pricePromotion: ").append(toIndentedString(pricePromotion)).append("\n");
    sb.append("    sashBannerPromotion: ").append(toIndentedString(sashBannerPromotion)).append("\n");
    sb.append("    secureNetPromotion: ").append(toIndentedString(secureNetPromotion)).append("\n");
    sb.append("    talkTimePromotion: ").append(toIndentedString(talkTimePromotion)).append("\n");
    sb.append("    textPromotion: ").append(toIndentedString(textPromotion)).append("\n");
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

