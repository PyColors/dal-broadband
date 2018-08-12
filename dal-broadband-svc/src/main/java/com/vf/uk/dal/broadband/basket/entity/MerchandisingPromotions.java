package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchandisingPromotion.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class MerchandisingPromotions   {
  
  /** The description. */
  @JsonProperty("description")
  private String description = null;

  /** The discount id. */
  @JsonProperty("discountId")
  private String discountId = null;

  /** The label. */
  @JsonProperty("label")
  private String label = null;

  /** The mp type. */
  @JsonProperty("mpType")
  private String mpType = null;

  /** The package type. */
  @JsonProperty("packageType")
  @Valid
  private List<String> packageType = null;

  /** The price established label. */
  @JsonProperty("priceEstablishedLabel")
  private String priceEstablishedLabel = null;

  /** The priority. */
  @JsonProperty("priority")
  private String priority = null;

  /** The tag. */
  @JsonProperty("tag")
  private String tag = null;

  /**
   * Description.
   *
   * @param description the description
   * @return the merchandising promotions
   */
  public MerchandisingPromotions description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description.
   *
   * @return description
   */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Discount id.
   *
   * @param discountId the discount id
   * @return the merchandising promotions
   */
  public MerchandisingPromotions discountId(String discountId) {
    this.discountId = discountId;
    return this;
  }

  /**
   * Get discountId.
   *
   * @return discountId
   */
  @ApiModelProperty(value = "")


  public String getDiscountId() {
    return discountId;
  }

  /**
   * Sets the discount id.
   *
   * @param discountId the new discount id
   */
  public void setDiscountId(String discountId) {
    this.discountId = discountId;
  }

  /**
   * Label.
   *
   * @param label the label
   * @return the merchandising promotions
   */
  public MerchandisingPromotions label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label.
   *
   * @return label
   */
  @ApiModelProperty(value = "")


  public String getLabel() {
    return label;
  }

  /**
   * Sets the label.
   *
   * @param label the new label
   */
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Mp type.
   *
   * @param mpType the mp type
   * @return the merchandising promotions
   */
  public MerchandisingPromotions mpType(String mpType) {
    this.mpType = mpType;
    return this;
  }

  /**
   * Get mpType.
   *
   * @return mpType
   */
  @ApiModelProperty(value = "")


  public String getMpType() {
    return mpType;
  }

  /**
   * Sets the mp type.
   *
   * @param mpType the new mp type
   */
  public void setMpType(String mpType) {
    this.mpType = mpType;
  }

  /**
   * Package type.
   *
   * @param packageType the package type
   * @return the merchandising promotions
   */
  public MerchandisingPromotions packageType(List<String> packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * Adds the package type item.
   *
   * @param packageTypeItem the package type item
   * @return the merchandising promotions
   */
  public MerchandisingPromotions addPackageTypeItem(String packageTypeItem) {
    if (this.packageType == null) {
      this.packageType = new ArrayList<>();
    }
    this.packageType.add(packageTypeItem);
    return this;
  }

  /**
   * Get packageType.
   *
   * @return packageType
   */
  @ApiModelProperty(value = "")


  public List<String> getPackageType() {
    return packageType;
  }

  /**
   * Sets the package type.
   *
   * @param packageType the new package type
   */
  public void setPackageType(List<String> packageType) {
    this.packageType = packageType;
  }

  /**
   * Price established label.
   *
   * @param priceEstablishedLabel the price established label
   * @return the merchandising promotions
   */
  public MerchandisingPromotions priceEstablishedLabel(String priceEstablishedLabel) {
    this.priceEstablishedLabel = priceEstablishedLabel;
    return this;
  }

  /**
   * Get priceEstablishedLabel.
   *
   * @return priceEstablishedLabel
   */
  @ApiModelProperty(value = "")


  public String getPriceEstablishedLabel() {
    return priceEstablishedLabel;
  }

  /**
   * Sets the price established label.
   *
   * @param priceEstablishedLabel the new price established label
   */
  public void setPriceEstablishedLabel(String priceEstablishedLabel) {
    this.priceEstablishedLabel = priceEstablishedLabel;
  }

  /**
   * Priority.
   *
   * @param priority the priority
   * @return the merchandising promotions
   */
  public MerchandisingPromotions priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority.
   *
   * @return priority
   */
  @ApiModelProperty(value = "")


  public String getPriority() {
    return priority;
  }

  /**
   * Sets the priority.
   *
   * @param priority the new priority
   */
  public void setPriority(String priority) {
    this.priority = priority;
  }

  /**
   * Tag.
   *
   * @param tag the tag
   * @return the merchandising promotions
   */
  public MerchandisingPromotions tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag.
   *
   * @return tag
   */
  @ApiModelProperty(value = "")


  public String getTag() {
    return tag;
  }

  /**
   * Sets the tag.
   *
   * @param tag the new tag
   */
  public void setTag(String tag) {
    this.tag = tag;
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
    MerchandisingPromotions merchandisingPromotion = (MerchandisingPromotions) o;
    return Objects.equals(this.description, merchandisingPromotion.description) &&
        Objects.equals(this.discountId, merchandisingPromotion.discountId) &&
        Objects.equals(this.label, merchandisingPromotion.label) &&
        Objects.equals(this.mpType, merchandisingPromotion.mpType) &&
        Objects.equals(this.packageType, merchandisingPromotion.packageType) &&
        Objects.equals(this.priceEstablishedLabel, merchandisingPromotion.priceEstablishedLabel) &&
        Objects.equals(this.priority, merchandisingPromotion.priority) &&
        Objects.equals(this.tag, merchandisingPromotion.tag);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(description, discountId, label, mpType, packageType, priceEstablishedLabel, priority, tag);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

