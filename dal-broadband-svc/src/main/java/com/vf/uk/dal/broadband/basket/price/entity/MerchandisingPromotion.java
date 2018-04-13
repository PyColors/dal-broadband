package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.List;
import java.util.Objects;

/**
 * MerchandisingPromotion
 */

public class MerchandisingPromotion   {
  private String tag = null;

  private String label = null;

  private String description = null;

  private String discountId = null;

  private String mpType = null;

  private String priceEstablishedLabel = null;
  
  private String priority = null;
  
  private List<String> packageType = null;

  
public List<String> getPackageType() {
	return packageType;
}

public void setPackageType(List<String> packageType) {
	this.packageType = packageType;
}
/**
 * 
 * @param tag
 * @return
 */
public MerchandisingPromotion tag(String tag) {
    this.tag = tag;
    return this;
  }

   public String getPriority() {
	return priority;
}

public void setPriority(String priority) {
	this.priority = priority;
}

/**
   * Tag value of the merchandising promotion
   * @return tag
  **/


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }
/**
 * 
 * @param label
 * @return
 */
  public MerchandisingPromotion label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label value of the merchandising promotion
   * @return label
  **/


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
/**
 * 
 * @param description
 * @return
 */
  public MerchandisingPromotion description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description value of merchandising promotion
   * @return description
  **/


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
/**
 * 
 * @param discountId
 * @return
 */
  public MerchandisingPromotion discountId(String discountId) {
    this.discountId = discountId;
    return this;
  }

   /**
   * Discount skud Id, if applicable
   * @return discountId
  **/


  public String getDiscountId() {
    return discountId;
  }

  public void setDiscountId(String discountId) {
    this.discountId = discountId;
  }
/**
 * 
 * @param mpType
 * @return
 */
  public MerchandisingPromotion mpType(String mpType) {
    this.mpType = mpType;
    return this;
  }

   /**
   * type of the merchandising promotion
   * @return mpType
  **/


  public String getMpType() {
    return mpType;
  }

  public void setMpType(String mpType) {
    this.mpType = mpType;
  }
/**
 * 
 * @param priceEstablishedLabel
 * @return
 */
  public MerchandisingPromotion priceEstablishedLabel(String priceEstablishedLabel) {
    this.priceEstablishedLabel = priceEstablishedLabel;
    return this;
  }

   /**
   * The Possible values are 'was, previously'
   * @return priceEstablishedLabel
  **/
  public String getPriceEstablishedLabel() {
    return priceEstablishedLabel;
  }
  public void setPriceEstablishedLabel(String priceEstablishedLabel) {
    this.priceEstablishedLabel = priceEstablishedLabel;
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
    return Objects.equals(this.tag, merchandisingPromotion.tag) &&
        Objects.equals(this.label, merchandisingPromotion.label) &&
        Objects.equals(this.description, merchandisingPromotion.description) &&
        Objects.equals(this.discountId, merchandisingPromotion.discountId) &&
        Objects.equals(this.mpType, merchandisingPromotion.mpType) &&
        Objects.equals(this.priceEstablishedLabel, merchandisingPromotion.priceEstablishedLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, label, description, discountId, mpType, priceEstablishedLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchandisingPromotion {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    mpType: ").append(toIndentedString(mpType)).append("\n");
    sb.append("    priceEstablishedLabel: ").append(toIndentedString(priceEstablishedLabel)).append("\n");
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

