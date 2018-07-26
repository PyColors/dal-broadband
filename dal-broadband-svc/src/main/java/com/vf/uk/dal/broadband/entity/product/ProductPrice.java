package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductPrice.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductPrice   {
  
  /** The merchandising promotions. */
  @JsonProperty("merchandisingPromotions")
  private MerchandisingPromotion merchandisingPromotions = null;

  /** The monthly discount price. */
  @JsonProperty("monthlyDiscountPrice")
  private Price monthlyDiscountPrice = null;

  /** The monthly price. */
  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  /** The one off discount price. */
  @JsonProperty("oneOffDiscountPrice")
  private Price oneOffDiscountPrice = null;

  /** The one off price. */
  @JsonProperty("oneOffPrice")
  private Price oneOffPrice = null;

  /** The product id. */
  @JsonProperty("productId")
  private String productId = null;

  /**
   * Merchandising promotions.
   *
   * @param merchandisingPromotions the merchandising promotions
   * @return the product price
   */
  public ProductPrice merchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
    this.merchandisingPromotions = merchandisingPromotions;
    return this;
  }

  /**
   * Get merchandisingPromotions.
   *
   * @return merchandisingPromotions
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotion getMerchandisingPromotions() {
    return merchandisingPromotions;
  }

  /**
   * Sets the merchandising promotions.
   *
   * @param merchandisingPromotions the new merchandising promotions
   */
  public void setMerchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
    this.merchandisingPromotions = merchandisingPromotions;
  }

  /**
   * Monthly discount price.
   *
   * @param monthlyDiscountPrice the monthly discount price
   * @return the product price
   */
  public ProductPrice monthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
    return this;
  }

  /**
   * Get monthlyDiscountPrice.
   *
   * @return monthlyDiscountPrice
   */
  @ApiModelProperty(value = "")

  @Valid

  public Price getMonthlyDiscountPrice() {
    return monthlyDiscountPrice;
  }

  /**
   * Sets the monthly discount price.
   *
   * @param monthlyDiscountPrice the new monthly discount price
   */
  public void setMonthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
  }

  /**
   * Monthly price.
   *
   * @param monthlyPrice the monthly price
   * @return the product price
   */
  public ProductPrice monthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
    return this;
  }

  /**
   * Get monthlyPrice.
   *
   * @return monthlyPrice
   */
  @ApiModelProperty(value = "")

  @Valid

  public Price getMonthlyPrice() {
    return monthlyPrice;
  }

  /**
   * Sets the monthly price.
   *
   * @param monthlyPrice the new monthly price
   */
  public void setMonthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
  }

  /**
   * One off discount price.
   *
   * @param oneOffDiscountPrice the one off discount price
   * @return the product price
   */
  public ProductPrice oneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
    return this;
  }

  /**
   * Get oneOffDiscountPrice.
   *
   * @return oneOffDiscountPrice
   */
  @ApiModelProperty(value = "")

  @Valid

  public Price getOneOffDiscountPrice() {
    return oneOffDiscountPrice;
  }

  /**
   * Sets the one off discount price.
   *
   * @param oneOffDiscountPrice the new one off discount price
   */
  public void setOneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
  }

  /**
   * One off price.
   *
   * @param oneOffPrice the one off price
   * @return the product price
   */
  public ProductPrice oneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
    return this;
  }

  /**
   * Get oneOffPrice.
   *
   * @return oneOffPrice
   */
  @ApiModelProperty(value = "")

  @Valid

  public Price getOneOffPrice() {
    return oneOffPrice;
  }

  /**
   * Sets the one off price.
   *
   * @param oneOffPrice the new one off price
   */
  public void setOneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
  }

  /**
   * Product id.
   *
   * @param productId the product id
   * @return the product price
   */
  public ProductPrice productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId.
   *
   * @return productId
   */
  @ApiModelProperty(value = "")


  public String getProductId() {
    return productId;
  }

  /**
   * Sets the product id.
   *
   * @param productId the new product id
   */
  public void setProductId(String productId) {
    this.productId = productId;
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
    ProductPrice productPrice = (ProductPrice) o;
    return Objects.equals(this.merchandisingPromotions, productPrice.merchandisingPromotions) &&
        Objects.equals(this.monthlyDiscountPrice, productPrice.monthlyDiscountPrice) &&
        Objects.equals(this.monthlyPrice, productPrice.monthlyPrice) &&
        Objects.equals(this.oneOffDiscountPrice, productPrice.oneOffDiscountPrice) &&
        Objects.equals(this.oneOffPrice, productPrice.oneOffPrice) &&
        Objects.equals(this.productId, productPrice.productId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(merchandisingPromotions, monthlyDiscountPrice, monthlyPrice, oneOffDiscountPrice, oneOffPrice, productId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPrice {\n");
    
    sb.append("    merchandisingPromotions: ").append(toIndentedString(merchandisingPromotions)).append("\n");
    sb.append("    monthlyDiscountPrice: ").append(toIndentedString(monthlyDiscountPrice)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

