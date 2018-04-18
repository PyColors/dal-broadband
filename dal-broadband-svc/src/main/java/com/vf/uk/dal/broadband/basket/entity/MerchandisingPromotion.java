package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchandisingPromotion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class MerchandisingPromotion   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("discountId")
  private String discountId = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("mpType")
  private String mpType = null;

  @JsonProperty("packageType")
  @Valid
  private List<String> packageType = null;

  @JsonProperty("priceEstablishedLabel")
  private String priceEstablishedLabel = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("tag")
  private String tag = null;

  public MerchandisingPromotion description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MerchandisingPromotion discountId(String discountId) {
    this.discountId = discountId;
    return this;
  }

  /**
   * Get discountId
   * @return discountId
  **/
  @ApiModelProperty(value = "")


  public String getDiscountId() {
    return discountId;
  }

  public void setDiscountId(String discountId) {
    this.discountId = discountId;
  }

  public MerchandisingPromotion label(String label) {
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

  public MerchandisingPromotion mpType(String mpType) {
    this.mpType = mpType;
    return this;
  }

  /**
   * Get mpType
   * @return mpType
  **/
  @ApiModelProperty(value = "")


  public String getMpType() {
    return mpType;
  }

  public void setMpType(String mpType) {
    this.mpType = mpType;
  }

  public MerchandisingPromotion packageType(List<String> packageType) {
    this.packageType = packageType;
    return this;
  }

  public MerchandisingPromotion addPackageTypeItem(String packageTypeItem) {
    if (this.packageType == null) {
      this.packageType = new ArrayList<String>();
    }
    this.packageType.add(packageTypeItem);
    return this;
  }

  /**
   * Get packageType
   * @return packageType
  **/
  @ApiModelProperty(value = "")


  public List<String> getPackageType() {
    return packageType;
  }

  public void setPackageType(List<String> packageType) {
    this.packageType = packageType;
  }

  public MerchandisingPromotion priceEstablishedLabel(String priceEstablishedLabel) {
    this.priceEstablishedLabel = priceEstablishedLabel;
    return this;
  }

  /**
   * Get priceEstablishedLabel
   * @return priceEstablishedLabel
  **/
  @ApiModelProperty(value = "")


  public String getPriceEstablishedLabel() {
    return priceEstablishedLabel;
  }

  public void setPriceEstablishedLabel(String priceEstablishedLabel) {
    this.priceEstablishedLabel = priceEstablishedLabel;
  }

  public MerchandisingPromotion priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public MerchandisingPromotion tag(String tag) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchandisingPromotion merchandisingPromotion = (MerchandisingPromotion) o;
    return Objects.equals(this.description, merchandisingPromotion.description) &&
        Objects.equals(this.discountId, merchandisingPromotion.discountId) &&
        Objects.equals(this.label, merchandisingPromotion.label) &&
        Objects.equals(this.mpType, merchandisingPromotion.mpType) &&
        Objects.equals(this.packageType, merchandisingPromotion.packageType) &&
        Objects.equals(this.priceEstablishedLabel, merchandisingPromotion.priceEstablishedLabel) &&
        Objects.equals(this.priority, merchandisingPromotion.priority) &&
        Objects.equals(this.tag, merchandisingPromotion.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, discountId, label, mpType, packageType, priceEstablishedLabel, priority, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchandisingPromotion {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    mpType: ").append(toIndentedString(mpType)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    priceEstablishedLabel: ").append(toIndentedString(priceEstablishedLabel)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

