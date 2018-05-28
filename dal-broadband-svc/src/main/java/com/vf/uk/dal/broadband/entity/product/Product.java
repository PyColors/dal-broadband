package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class Product   {
  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("SeoDescription")
  private String seoDescription = null;

  @JsonProperty("imageURLsThumbsFront")
  private String imageURLsThumbsFront = null;

  @JsonProperty("ImageURLsFullFront")
  private String imageURLsFullFront = null;

  public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Product ID
   * @return productId
  **/
  @ApiModelProperty(value = "Product ID")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Product displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Product display name as defined catalogue
   * @return displayName
  **/
  @ApiModelProperty(value = "Product display name as defined catalogue")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Product productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Product name as defined catalogue
   * @return productName
  **/
  @ApiModelProperty(value = "Product name as defined catalogue")


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Product productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Product class
   * @return productClass
  **/
  @ApiModelProperty(value = "Product class")


  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public Product seoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
    return this;
  }

  /**
   * Product short description as defined catalogue
   * @return seoDescription
  **/
  @ApiModelProperty(value = "Product short description as defined catalogue")


  public String getSeoDescription() {
    return seoDescription;
  }

  public void setSeoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
  }

  public Product imageURLsThumbsFront(String imageURLsThumbsFront) {
    this.imageURLsThumbsFront = imageURLsThumbsFront;
    return this;
  }

  /**
   * Product thumbnail image URL imageURLs.thumbs.front
   * @return imageURLsThumbsFront
  **/
  @ApiModelProperty(value = "Product thumbnail image URL imageURLs.thumbs.front")


  public String getImageURLsThumbsFront() {
    return imageURLsThumbsFront;
  }

  public void setImageURLsThumbsFront(String imageURLsThumbsFront) {
    this.imageURLsThumbsFront = imageURLsThumbsFront;
  }

  public Product imageURLsFullFront(String imageURLsFullFront) {
    this.imageURLsFullFront = imageURLsFullFront;
    return this;
  }

  /**
   * Product image URL imageURLs.full.front
   * @return imageURLsFullFront
  **/
  @ApiModelProperty(value = "Product image URL imageURLs.full.front")


  public String getImageURLsFullFront() {
    return imageURLsFullFront;
  }

  public void setImageURLsFullFront(String imageURLsFullFront) {
    this.imageURLsFullFront = imageURLsFullFront;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.displayName, product.displayName) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.productClass, product.productClass) &&
        Objects.equals(this.seoDescription, product.seoDescription) &&
        Objects.equals(this.imageURLsThumbsFront, product.imageURLsThumbsFront) &&
        Objects.equals(this.imageURLsFullFront, product.imageURLsFullFront);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, displayName, productName, productClass, seoDescription, imageURLsThumbsFront, imageURLsFullFront);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    seoDescription: ").append(toIndentedString(seoDescription)).append("\n");
    sb.append("    imageURLsThumbsFront: ").append(toIndentedString(imageURLsThumbsFront)).append("\n");
    sb.append("    imageURLsFullFront: ").append(toIndentedString(imageURLsFullFront)).append("\n");
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

