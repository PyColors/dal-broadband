package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BundledServiceProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BundledServiceProduct   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("miscellaneous")
  @Valid
  private List<Attribute> miscellaneous = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priceDetail")
  private ServicePrice priceDetail = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("skuId")
  private String skuId = null;

  public BundledServiceProduct description(String description) {
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

  public BundledServiceProduct miscellaneous(List<Attribute> miscellaneous) {
    this.miscellaneous = miscellaneous;
    return this;
  }

  public BundledServiceProduct addMiscellaneousItem(Attribute miscellaneousItem) {
    if (this.miscellaneous == null) {
      this.miscellaneous = new ArrayList<>();
    }
    this.miscellaneous.add(miscellaneousItem);
    return this;
  }

  /**
   * Get miscellaneous
   * @return miscellaneous
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Attribute> getMiscellaneous() {
    return miscellaneous;
  }

  public void setMiscellaneous(List<Attribute> miscellaneous) {
    this.miscellaneous = miscellaneous;
  }

  public BundledServiceProduct name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BundledServiceProduct priceDetail(ServicePrice priceDetail) {
    this.priceDetail = priceDetail;
    return this;
  }

  /**
   * Get priceDetail
   * @return priceDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServicePrice getPriceDetail() {
    return priceDetail;
  }

  public void setPriceDetail(ServicePrice priceDetail) {
    this.priceDetail = priceDetail;
  }

  public BundledServiceProduct productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Get productClass
   * @return productClass
  **/
  @ApiModelProperty(value = "")


  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public BundledServiceProduct skuId(String skuId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledServiceProduct bundledServiceProduct = (BundledServiceProduct) o;
    return Objects.equals(this.description, bundledServiceProduct.description) &&
        Objects.equals(this.miscellaneous, bundledServiceProduct.miscellaneous) &&
        Objects.equals(this.name, bundledServiceProduct.name) &&
        Objects.equals(this.priceDetail, bundledServiceProduct.priceDetail) &&
        Objects.equals(this.productClass, bundledServiceProduct.productClass) &&
        Objects.equals(this.skuId, bundledServiceProduct.skuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, miscellaneous, name, priceDetail, productClass, skuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledServiceProduct {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    miscellaneous: ").append(toIndentedString(miscellaneous)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceDetail: ").append(toIndentedString(priceDetail)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
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

