package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchandisingPromotionsWrapper.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")

public class MerchandisingPromotionsWrapper   {
  
  /** The conditional sash banner promotion. */
  @JsonProperty("conditionalSashBannerPromotion")
  private MerchandisingPromotion conditionalSashBannerPromotion = null;

  /** The data promotion. */
  @JsonProperty("dataPromotion")
  private MerchandisingPromotion dataPromotion = null;

  /** The entertainment pack promotion. */
  @JsonProperty("entertainmentPackPromotion")
  private MerchandisingPromotion entertainmentPackPromotion = null;

  /** The free accessory promotion. */
  @JsonProperty("freeAccessoryPromotion")
  private MerchandisingPromotion freeAccessoryPromotion = null;

  /** The free extra promotion. */
  @JsonProperty("freeExtraPromotion")
  private MerchandisingPromotion freeExtraPromotion = null;

  /** The price promotion. */
  @JsonProperty("pricePromotion")
  private MerchandisingPromotion pricePromotion = null;

  /** The sash banner promotion. */
  @JsonProperty("sashBannerPromotion")
  private MerchandisingPromotion sashBannerPromotion = null;

  /** The secure net promotion. */
  @JsonProperty("secureNetPromotion")
  private MerchandisingPromotion secureNetPromotion = null;

  /** The talk time promotion. */
  @JsonProperty("talkTimePromotion")
  private MerchandisingPromotion talkTimePromotion = null;

  /** The text promotion. */
  @JsonProperty("textPromotion")
  private MerchandisingPromotion textPromotion = null;

  /**
   * Conditional sash banner promotion.
   *
   * @param conditionalSashBannerPromotion the conditional sash banner promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper conditionalSashBannerPromotion(MerchandisingPromotion conditionalSashBannerPromotion) {
    this.conditionalSashBannerPromotion = conditionalSashBannerPromotion;
    return this;
  }

  /**
   * Get conditionalSashBannerPromotion.
   *
   * @return conditionalSashBannerPromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getConditionalSashBannerPromotion() {
    return conditionalSashBannerPromotion;
  }

  /**
   * Sets the conditional sash banner promotion.
   *
   * @param conditionalSashBannerPromotion the new conditional sash banner promotion
   */
  public void setConditionalSashBannerPromotion(MerchandisingPromotion conditionalSashBannerPromotion) {
    this.conditionalSashBannerPromotion = conditionalSashBannerPromotion;
  }

  /**
   * Data promotion.
   *
   * @param dataPromotion the data promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper dataPromotion(MerchandisingPromotion dataPromotion) {
    this.dataPromotion = dataPromotion;
    return this;
  }

  /**
   * Get dataPromotion.
   *
   * @return dataPromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getDataPromotion() {
    return dataPromotion;
  }

  /**
   * Sets the data promotion.
   *
   * @param dataPromotion the new data promotion
   */
  public void setDataPromotion(MerchandisingPromotion dataPromotion) {
    this.dataPromotion = dataPromotion;
  }

  /**
   * Entertainment pack promotion.
   *
   * @param entertainmentPackPromotion the entertainment pack promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper entertainmentPackPromotion(MerchandisingPromotion entertainmentPackPromotion) {
    this.entertainmentPackPromotion = entertainmentPackPromotion;
    return this;
  }

  /**
   * Get entertainmentPackPromotion.
   *
   * @return entertainmentPackPromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getEntertainmentPackPromotion() {
    return entertainmentPackPromotion;
  }

  /**
   * Sets the entertainment pack promotion.
   *
   * @param entertainmentPackPromotion the new entertainment pack promotion
   */
  public void setEntertainmentPackPromotion(MerchandisingPromotion entertainmentPackPromotion) {
    this.entertainmentPackPromotion = entertainmentPackPromotion;
  }

  /**
   * Free accessory promotion.
   *
   * @param freeAccessoryPromotion the free accessory promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper freeAccessoryPromotion(MerchandisingPromotion freeAccessoryPromotion) {
    this.freeAccessoryPromotion = freeAccessoryPromotion;
    return this;
  }

  /**
   * Get freeAccessoryPromotion.
   *
   * @return freeAccessoryPromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getFreeAccessoryPromotion() {
    return freeAccessoryPromotion;
  }

  /**
   * Sets the free accessory promotion.
   *
   * @param freeAccessoryPromotion the new free accessory promotion
   */
  public void setFreeAccessoryPromotion(MerchandisingPromotion freeAccessoryPromotion) {
    this.freeAccessoryPromotion = freeAccessoryPromotion;
  }

  /**
   * Free extra promotion.
   *
   * @param freeExtraPromotion the free extra promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper freeExtraPromotion(MerchandisingPromotion freeExtraPromotion) {
    this.freeExtraPromotion = freeExtraPromotion;
    return this;
  }

  /**
   * Get freeExtraPromotion.
   *
   * @return freeExtraPromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getFreeExtraPromotion() {
    return freeExtraPromotion;
  }

  /**
   * Sets the free extra promotion.
   *
   * @param freeExtraPromotion the new free extra promotion
   */
  public void setFreeExtraPromotion(MerchandisingPromotion freeExtraPromotion) {
    this.freeExtraPromotion = freeExtraPromotion;
  }

  /**
   * Price promotion.
   *
   * @param pricePromotion the price promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper pricePromotion(MerchandisingPromotion pricePromotion) {
    this.pricePromotion = pricePromotion;
    return this;
  }

  /**
   * Get pricePromotion.
   *
   * @return pricePromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getPricePromotion() {
    return pricePromotion;
  }

  /**
   * Sets the price promotion.
   *
   * @param pricePromotion the new price promotion
   */
  public void setPricePromotion(MerchandisingPromotion pricePromotion) {
    this.pricePromotion = pricePromotion;
  }

  /**
   * Sash banner promotion.
   *
   * @param sashBannerPromotion the sash banner promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper sashBannerPromotion(MerchandisingPromotion sashBannerPromotion) {
    this.sashBannerPromotion = sashBannerPromotion;
    return this;
  }

  /**
   * Get sashBannerPromotion.
   *
   * @return sashBannerPromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getSashBannerPromotion() {
    return sashBannerPromotion;
  }

  /**
   * Sets the sash banner promotion.
   *
   * @param sashBannerPromotion the new sash banner promotion
   */
  public void setSashBannerPromotion(MerchandisingPromotion sashBannerPromotion) {
    this.sashBannerPromotion = sashBannerPromotion;
  }

  /**
   * Secure net promotion.
   *
   * @param secureNetPromotion the secure net promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper secureNetPromotion(MerchandisingPromotion secureNetPromotion) {
    this.secureNetPromotion = secureNetPromotion;
    return this;
  }

  /**
   * Get secureNetPromotion.
   *
   * @return secureNetPromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getSecureNetPromotion() {
    return secureNetPromotion;
  }

  /**
   * Sets the secure net promotion.
   *
   * @param secureNetPromotion the new secure net promotion
   */
  public void setSecureNetPromotion(MerchandisingPromotion secureNetPromotion) {
    this.secureNetPromotion = secureNetPromotion;
  }

  /**
   * Talk time promotion.
   *
   * @param talkTimePromotion the talk time promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper talkTimePromotion(MerchandisingPromotion talkTimePromotion) {
    this.talkTimePromotion = talkTimePromotion;
    return this;
  }

  /**
   * Get talkTimePromotion.
   *
   * @return talkTimePromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getTalkTimePromotion() {
    return talkTimePromotion;
  }

  /**
   * Sets the talk time promotion.
   *
   * @param talkTimePromotion the new talk time promotion
   */
  public void setTalkTimePromotion(MerchandisingPromotion talkTimePromotion) {
    this.talkTimePromotion = talkTimePromotion;
  }

  /**
   * Text promotion.
   *
   * @param textPromotion the text promotion
   * @return the merchandising promotions wrapper
   */
  public MerchandisingPromotionsWrapper textPromotion(MerchandisingPromotion textPromotion) {
    this.textPromotion = textPromotion;
    return this;
  }

  /**
   * Get textPromotion.
   *
   * @return textPromotion
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getTextPromotion() {
    return textPromotion;
  }

  /**
   * Sets the text promotion.
   *
   * @param textPromotion the new text promotion
   */
  public void setTextPromotion(MerchandisingPromotion textPromotion) {
    this.textPromotion = textPromotion;
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(conditionalSashBannerPromotion, dataPromotion, entertainmentPackPromotion, freeAccessoryPromotion, freeExtraPromotion, pricePromotion, sashBannerPromotion, secureNetPromotion, talkTimePromotion, textPromotion);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

