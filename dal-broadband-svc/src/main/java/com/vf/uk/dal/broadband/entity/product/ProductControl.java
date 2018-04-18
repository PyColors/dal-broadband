package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductControl
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-17T20:40:09.952Z")

public class ProductControl   {
  @JsonProperty("isDisplayableinLife")
  private Boolean isDisplayableinLife = null;

  @JsonProperty("isSellableinLife")
  private Boolean isSellableinLife = null;

  @JsonProperty("isDisplayableAcq")
  private Boolean isDisplayableAcq = null;

  @JsonProperty("isSellableRet")
  private Boolean isSellableRet = null;

  @JsonProperty("isDisplayableRet")
  private Boolean isDisplayableRet = null;

  @JsonProperty("isSellableAcq")
  private Boolean isSellableAcq = null;

  @JsonProperty("isDisplayableSavedBasket")
  private Boolean isDisplayableSavedBasket = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("preOrderable")
  private Boolean preOrderable = null;

  @JsonProperty("availableFrom")
  private String availableFrom = null;

  @JsonProperty("compareWith")
  private String compareWith = null;

  @JsonProperty("backOrderMessage")
  private String backOrderMessage = null;

  @JsonProperty("backOrderable")
  private String backOrderable = null;

  @JsonProperty("affiliateExport")
  private Boolean affiliateExport = null;

  public ProductControl isDisplayableinLife(Boolean isDisplayableinLife) {
    this.isDisplayableinLife = isDisplayableinLife;
    return this;
  }

  /**
   * Get isDisplayableinLife
   * @return isDisplayableinLife
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsDisplayableinLife() {
    return isDisplayableinLife;
  }

  public void setIsDisplayableinLife(Boolean isDisplayableinLife) {
    this.isDisplayableinLife = isDisplayableinLife;
  }

  public ProductControl isSellableinLife(Boolean isSellableinLife) {
    this.isSellableinLife = isSellableinLife;
    return this;
  }

  /**
   * Get isSellableinLife
   * @return isSellableinLife
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsSellableinLife() {
    return isSellableinLife;
  }

  public void setIsSellableinLife(Boolean isSellableinLife) {
    this.isSellableinLife = isSellableinLife;
  }

  public ProductControl isDisplayableAcq(Boolean isDisplayableAcq) {
    this.isDisplayableAcq = isDisplayableAcq;
    return this;
  }

  /**
   * Get isDisplayableAcq
   * @return isDisplayableAcq
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsDisplayableAcq() {
    return isDisplayableAcq;
  }

  public void setIsDisplayableAcq(Boolean isDisplayableAcq) {
    this.isDisplayableAcq = isDisplayableAcq;
  }

  public ProductControl isSellableRet(Boolean isSellableRet) {
    this.isSellableRet = isSellableRet;
    return this;
  }

  /**
   * Get isSellableRet
   * @return isSellableRet
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsSellableRet() {
    return isSellableRet;
  }

  public void setIsSellableRet(Boolean isSellableRet) {
    this.isSellableRet = isSellableRet;
  }

  public ProductControl isDisplayableRet(Boolean isDisplayableRet) {
    this.isDisplayableRet = isDisplayableRet;
    return this;
  }

  /**
   * Get isDisplayableRet
   * @return isDisplayableRet
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsDisplayableRet() {
    return isDisplayableRet;
  }

  public void setIsDisplayableRet(Boolean isDisplayableRet) {
    this.isDisplayableRet = isDisplayableRet;
  }

  public ProductControl isSellableAcq(Boolean isSellableAcq) {
    this.isSellableAcq = isSellableAcq;
    return this;
  }

  /**
   * Get isSellableAcq
   * @return isSellableAcq
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsSellableAcq() {
    return isSellableAcq;
  }

  public void setIsSellableAcq(Boolean isSellableAcq) {
    this.isSellableAcq = isSellableAcq;
  }

  public ProductControl isDisplayableSavedBasket(Boolean isDisplayableSavedBasket) {
    this.isDisplayableSavedBasket = isDisplayableSavedBasket;
    return this;
  }

  /**
   * Get isDisplayableSavedBasket
   * @return isDisplayableSavedBasket
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsDisplayableSavedBasket() {
    return isDisplayableSavedBasket;
  }

  public void setIsDisplayableSavedBasket(Boolean isDisplayableSavedBasket) {
    this.isDisplayableSavedBasket = isDisplayableSavedBasket;
  }

  public ProductControl order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public ProductControl preOrderable(Boolean preOrderable) {
    this.preOrderable = preOrderable;
    return this;
  }

  /**
   * Get preOrderable
   * @return preOrderable
  **/
  @ApiModelProperty(value = "")


  public Boolean isPreOrderable() {
    return preOrderable;
  }

  public void setPreOrderable(Boolean preOrderable) {
    this.preOrderable = preOrderable;
  }

  public ProductControl availableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
    return this;
  }

  /**
   * Get availableFrom
   * @return availableFrom
  **/
  @ApiModelProperty(value = "")


  public String getAvailableFrom() {
    return availableFrom;
  }

  public void setAvailableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
  }

  public ProductControl compareWith(String compareWith) {
    this.compareWith = compareWith;
    return this;
  }

  /**
   * Get compareWith
   * @return compareWith
  **/
  @ApiModelProperty(value = "")


  public String getCompareWith() {
    return compareWith;
  }

  public void setCompareWith(String compareWith) {
    this.compareWith = compareWith;
  }

  public ProductControl backOrderMessage(String backOrderMessage) {
    this.backOrderMessage = backOrderMessage;
    return this;
  }

  /**
   * Get backOrderMessage
   * @return backOrderMessage
  **/
  @ApiModelProperty(value = "")


  public String getBackOrderMessage() {
    return backOrderMessage;
  }

  public void setBackOrderMessage(String backOrderMessage) {
    this.backOrderMessage = backOrderMessage;
  }

  public ProductControl backOrderable(String backOrderable) {
    this.backOrderable = backOrderable;
    return this;
  }

  /**
   * Get backOrderable
   * @return backOrderable
  **/
  @ApiModelProperty(value = "")


  public String getBackOrderable() {
    return backOrderable;
  }

  public void setBackOrderable(String backOrderable) {
    this.backOrderable = backOrderable;
  }

  public ProductControl affiliateExport(Boolean affiliateExport) {
    this.affiliateExport = affiliateExport;
    return this;
  }

  /**
   * Get affiliateExport
   * @return affiliateExport
  **/
  @ApiModelProperty(value = "")


  public Boolean isAffiliateExport() {
    return affiliateExport;
  }

  public void setAffiliateExport(Boolean affiliateExport) {
    this.affiliateExport = affiliateExport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductControl productControl = (ProductControl) o;
    return Objects.equals(this.isDisplayableinLife, productControl.isDisplayableinLife) &&
        Objects.equals(this.isSellableinLife, productControl.isSellableinLife) &&
        Objects.equals(this.isDisplayableAcq, productControl.isDisplayableAcq) &&
        Objects.equals(this.isSellableRet, productControl.isSellableRet) &&
        Objects.equals(this.isDisplayableRet, productControl.isDisplayableRet) &&
        Objects.equals(this.isSellableAcq, productControl.isSellableAcq) &&
        Objects.equals(this.isDisplayableSavedBasket, productControl.isDisplayableSavedBasket) &&
        Objects.equals(this.order, productControl.order) &&
        Objects.equals(this.preOrderable, productControl.preOrderable) &&
        Objects.equals(this.availableFrom, productControl.availableFrom) &&
        Objects.equals(this.compareWith, productControl.compareWith) &&
        Objects.equals(this.backOrderMessage, productControl.backOrderMessage) &&
        Objects.equals(this.backOrderable, productControl.backOrderable) &&
        Objects.equals(this.affiliateExport, productControl.affiliateExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDisplayableinLife, isSellableinLife, isDisplayableAcq, isSellableRet, isDisplayableRet, isSellableAcq, isDisplayableSavedBasket, order, preOrderable, availableFrom, compareWith, backOrderMessage, backOrderable, affiliateExport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductControl {\n");
    
    sb.append("    isDisplayableinLife: ").append(toIndentedString(isDisplayableinLife)).append("\n");
    sb.append("    isSellableinLife: ").append(toIndentedString(isSellableinLife)).append("\n");
    sb.append("    isDisplayableAcq: ").append(toIndentedString(isDisplayableAcq)).append("\n");
    sb.append("    isSellableRet: ").append(toIndentedString(isSellableRet)).append("\n");
    sb.append("    isDisplayableRet: ").append(toIndentedString(isDisplayableRet)).append("\n");
    sb.append("    isSellableAcq: ").append(toIndentedString(isSellableAcq)).append("\n");
    sb.append("    isDisplayableSavedBasket: ").append(toIndentedString(isDisplayableSavedBasket)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    preOrderable: ").append(toIndentedString(preOrderable)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    compareWith: ").append(toIndentedString(compareWith)).append("\n");
    sb.append("    backOrderMessage: ").append(toIndentedString(backOrderMessage)).append("\n");
    sb.append("    backOrderable: ").append(toIndentedString(backOrderable)).append("\n");
    sb.append("    affiliateExport: ").append(toIndentedString(affiliateExport)).append("\n");
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

