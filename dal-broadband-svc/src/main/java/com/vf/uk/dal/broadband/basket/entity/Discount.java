package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Discount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Discount   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("confirmedRequired")
  private String confirmedRequired = null;

  @JsonProperty("discountValue")
  private DiscountValue discountValue = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("merchandisingMedia")
  @Valid
  private List<MediaLinks> merchandisingMedia = null;

  @JsonProperty("productLineId")
  private String productLineId = null;

  @JsonProperty("skuId")
  private String skuId = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("tenure")
  private String tenure = null;

  public Discount action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Discount confirmedRequired(String confirmedRequired) {
    this.confirmedRequired = confirmedRequired;
    return this;
  }

  /**
   * Get confirmedRequired
   * @return confirmedRequired
  **/
  @ApiModelProperty(value = "")


  public String getConfirmedRequired() {
    return confirmedRequired;
  }

  public void setConfirmedRequired(String confirmedRequired) {
    this.confirmedRequired = confirmedRequired;
  }

  public Discount discountValue(DiscountValue discountValue) {
    this.discountValue = discountValue;
    return this;
  }

  /**
   * Get discountValue
   * @return discountValue
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DiscountValue getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(DiscountValue discountValue) {
    this.discountValue = discountValue;
  }

  public Discount duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Discount label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Discount merchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }

  public Discount addMerchandisingMediaItem(MediaLinks merchandisingMediaItem) {
    if (this.merchandisingMedia == null) {
      this.merchandisingMedia = new ArrayList<MediaLinks>();
    }
    this.merchandisingMedia.add(merchandisingMediaItem);
    return this;
  }

  /**
   * Get merchandisingMedia
   * @return merchandisingMedia
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MediaLinks> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  public void setMerchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }

  public Discount productLineId(String productLineId) {
    this.productLineId = productLineId;
    return this;
  }

  /**
   * Get productLineId
   * @return productLineId
  **/
  @ApiModelProperty(value = "")


  public String getProductLineId() {
    return productLineId;
  }

  public void setProductLineId(String productLineId) {
    this.productLineId = productLineId;
  }

  public Discount skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Get skuId
   * @return skuId
  **/
  @ApiModelProperty(value = "")


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  public Discount tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public Discount tenure(String tenure) {
    this.tenure = tenure;
    return this;
  }

  /**
   * Get tenure
   * @return tenure
  **/
  @ApiModelProperty(value = "")


  public String getTenure() {
    return tenure;
  }

  public void setTenure(String tenure) {
    this.tenure = tenure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discount discount = (Discount) o;
    return Objects.equals(this.action, discount.action) &&
        Objects.equals(this.confirmedRequired, discount.confirmedRequired) &&
        Objects.equals(this.discountValue, discount.discountValue) &&
        Objects.equals(this.duration, discount.duration) &&
        Objects.equals(this.label, discount.label) &&
        Objects.equals(this.merchandisingMedia, discount.merchandisingMedia) &&
        Objects.equals(this.productLineId, discount.productLineId) &&
        Objects.equals(this.skuId, discount.skuId) &&
        Objects.equals(this.tag, discount.tag) &&
        Objects.equals(this.tenure, discount.tenure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, confirmedRequired, discountValue, duration, label, merchandisingMedia, productLineId, skuId, tag, tenure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    confirmedRequired: ").append(toIndentedString(confirmedRequired)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    merchandisingMedia: ").append(toIndentedString(merchandisingMedia)).append("\n");
    sb.append("    productLineId: ").append(toIndentedString(productLineId)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tenure: ").append(toIndentedString(tenure)).append("\n");
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

