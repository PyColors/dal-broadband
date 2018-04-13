package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;


/**
 * BundledServiceProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-25T06:31:48.127Z")

public class BundledServiceProduct   {
  private String skuId = null;

  private String name = null;

  private String description = null;

  private String productClass = null;

  private ServicePrice priceDetail = null;

  private List<Attribute> miscellaneous = null;

  public List<Attribute> getMiscellaneous() {
    return miscellaneous;
  }

  public void setMiscellaneous(List<Attribute> miscellaneous) {
    this.miscellaneous = miscellaneous;
  }

  public BundledServiceProduct skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

   /**
   * Get skuId
   * @return skuId
  **/


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  public BundledServiceProduct name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Bundled Service Product
   * @return name
  **/


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BundledServiceProduct description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of Bundled Service Product
   * @return description
  **/


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BundledServiceProduct productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

   /**
   * product Class of of bundled Service Products
   * @return productClass
  **/


  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public BundledServiceProduct priceDetail(ServicePrice priceDetail) {
    this.priceDetail = priceDetail;
    return this;
  }

   /**
   * Get priceDetail
   * @return priceDetail
  **/

  @Valid

  public ServicePrice getPriceDetail() {
    return priceDetail;
  }

  public void setPriceDetail(ServicePrice priceDetail) {
    this.priceDetail = priceDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledServiceProduct bundledServiceProduct = (BundledServiceProduct) o;
    return Objects.equals(this.skuId, bundledServiceProduct.skuId) &&
        Objects.equals(this.name, bundledServiceProduct.name) &&
        Objects.equals(this.description, bundledServiceProduct.description) &&
        Objects.equals(this.productClass, bundledServiceProduct.productClass) &&
        Objects.equals(this.priceDetail, bundledServiceProduct.priceDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, name, description, productClass, priceDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledServiceProduct {\n");
    
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    priceDetail: ").append(toIndentedString(priceDetail)).append("\n");
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

