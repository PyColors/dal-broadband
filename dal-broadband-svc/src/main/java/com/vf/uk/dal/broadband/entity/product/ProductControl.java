package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductControl.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductControl   {
  
  /** The affiliate export. */
  @JsonProperty("affiliateExport")
  private Boolean affiliateExport = null;

  /** The available from. */
  @JsonProperty("availableFrom")
  private String availableFrom = null;

  /** The back order message. */
  @JsonProperty("backOrderMessage")
  private String backOrderMessage = null;

  /** The back orderable. */
  @JsonProperty("backOrderable")
  private String backOrderable = null;

  /** The compare with. */
  @JsonProperty("compareWith")
  private String compareWith = null;

  /** The is displayable acq. */
  @JsonProperty("isDisplayableAcq")
  private Boolean isDisplayableAcq = null;

  /** The is displayable ret. */
  @JsonProperty("isDisplayableRet")
  private Boolean isDisplayableRet = null;

  /** The is displayable saved basket. */
  @JsonProperty("isDisplayableSavedBasket")
  private Boolean isDisplayableSavedBasket = null;

  /** The is displayablein life. */
  @JsonProperty("isDisplayableinLife")
  private Boolean isDisplayableinLife = null;

  /** The is sellable acq. */
  @JsonProperty("isSellableAcq")
  private Boolean isSellableAcq = null;

  /** The is sellable ret. */
  @JsonProperty("isSellableRet")
  private Boolean isSellableRet = null;

  /** The is sellablein life. */
  @JsonProperty("isSellableinLife")
  private Boolean isSellableinLife = null;

  /** The order. */
  @JsonProperty("order")
  private String order = null;

  /** The pre orderable. */
  @JsonProperty("preOrderable")
  private Boolean preOrderable = null;

  /**
   * Affiliate export.
   *
   * @param affiliateExport the affiliate export
   * @return the product control
   */
  public ProductControl affiliateExport(Boolean affiliateExport) {
    this.affiliateExport = affiliateExport;
    return this;
  }

  /**
   * Get affiliateExport.
   *
   * @return affiliateExport
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isAffiliateExport() {
    return affiliateExport;
  }

  /**
   * Sets the affiliate export.
   *
   * @param affiliateExport the new affiliate export
   */
  public void setAffiliateExport(Boolean affiliateExport) {
    this.affiliateExport = affiliateExport;
  }

  /**
   * Available from.
   *
   * @param availableFrom the available from
   * @return the product control
   */
  public ProductControl availableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
    return this;
  }

  /**
   * Get availableFrom.
   *
   * @return availableFrom
   */
  @ApiModelProperty(value = "")


  public String getAvailableFrom() {
    return availableFrom;
  }

  /**
   * Sets the available from.
   *
   * @param availableFrom the new available from
   */
  public void setAvailableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
  }

  /**
   * Back order message.
   *
   * @param backOrderMessage the back order message
   * @return the product control
   */
  public ProductControl backOrderMessage(String backOrderMessage) {
    this.backOrderMessage = backOrderMessage;
    return this;
  }

  /**
   * Get backOrderMessage.
   *
   * @return backOrderMessage
   */
  @ApiModelProperty(value = "")


  public String getBackOrderMessage() {
    return backOrderMessage;
  }

  /**
   * Sets the back order message.
   *
   * @param backOrderMessage the new back order message
   */
  public void setBackOrderMessage(String backOrderMessage) {
    this.backOrderMessage = backOrderMessage;
  }

  /**
   * Back orderable.
   *
   * @param backOrderable the back orderable
   * @return the product control
   */
  public ProductControl backOrderable(String backOrderable) {
    this.backOrderable = backOrderable;
    return this;
  }

  /**
   * Get backOrderable.
   *
   * @return backOrderable
   */
  @ApiModelProperty(value = "")


  public String getBackOrderable() {
    return backOrderable;
  }

  /**
   * Sets the back orderable.
   *
   * @param backOrderable the new back orderable
   */
  public void setBackOrderable(String backOrderable) {
    this.backOrderable = backOrderable;
  }

  /**
   * Compare with.
   *
   * @param compareWith the compare with
   * @return the product control
   */
  public ProductControl compareWith(String compareWith) {
    this.compareWith = compareWith;
    return this;
  }

  /**
   * Get compareWith.
   *
   * @return compareWith
   */
  @ApiModelProperty(value = "")


  public String getCompareWith() {
    return compareWith;
  }

  /**
   * Sets the compare with.
   *
   * @param compareWith the new compare with
   */
  public void setCompareWith(String compareWith) {
    this.compareWith = compareWith;
  }

  /**
   * Checks if is displayable acq.
   *
   * @param isDisplayableAcq the is displayable acq
   * @return the product control
   */
  public ProductControl isDisplayableAcq(Boolean isDisplayableAcq) {
    this.isDisplayableAcq = isDisplayableAcq;
    return this;
  }

  /**
   * Get isDisplayableAcq.
   *
   * @return isDisplayableAcq
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsDisplayableAcq() {
    return isDisplayableAcq;
  }

  /**
   * Sets the checks if is displayable acq.
   *
   * @param isDisplayableAcq the new checks if is displayable acq
   */
  public void setIsDisplayableAcq(Boolean isDisplayableAcq) {
    this.isDisplayableAcq = isDisplayableAcq;
  }

  /**
   * Checks if is displayable ret.
   *
   * @param isDisplayableRet the is displayable ret
   * @return the product control
   */
  public ProductControl isDisplayableRet(Boolean isDisplayableRet) {
    this.isDisplayableRet = isDisplayableRet;
    return this;
  }

  /**
   * Get isDisplayableRet.
   *
   * @return isDisplayableRet
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsDisplayableRet() {
    return isDisplayableRet;
  }

  /**
   * Sets the checks if is displayable ret.
   *
   * @param isDisplayableRet the new checks if is displayable ret
   */
  public void setIsDisplayableRet(Boolean isDisplayableRet) {
    this.isDisplayableRet = isDisplayableRet;
  }

  /**
   * Checks if is displayable saved basket.
   *
   * @param isDisplayableSavedBasket the is displayable saved basket
   * @return the product control
   */
  public ProductControl isDisplayableSavedBasket(Boolean isDisplayableSavedBasket) {
    this.isDisplayableSavedBasket = isDisplayableSavedBasket;
    return this;
  }

  /**
   * Get isDisplayableSavedBasket.
   *
   * @return isDisplayableSavedBasket
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsDisplayableSavedBasket() {
    return isDisplayableSavedBasket;
  }

  /**
   * Sets the checks if is displayable saved basket.
   *
   * @param isDisplayableSavedBasket the new checks if is displayable saved basket
   */
  public void setIsDisplayableSavedBasket(Boolean isDisplayableSavedBasket) {
    this.isDisplayableSavedBasket = isDisplayableSavedBasket;
  }

  /**
   * Checks if is displayablein life.
   *
   * @param isDisplayableinLife the is displayablein life
   * @return the product control
   */
  public ProductControl isDisplayableinLife(Boolean isDisplayableinLife) {
    this.isDisplayableinLife = isDisplayableinLife;
    return this;
  }

  /**
   * Get isDisplayableinLife.
   *
   * @return isDisplayableinLife
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsDisplayableinLife() {
    return isDisplayableinLife;
  }

  /**
   * Sets the checks if is displayablein life.
   *
   * @param isDisplayableinLife the new checks if is displayablein life
   */
  public void setIsDisplayableinLife(Boolean isDisplayableinLife) {
    this.isDisplayableinLife = isDisplayableinLife;
  }

  /**
   * Checks if is sellable acq.
   *
   * @param isSellableAcq the is sellable acq
   * @return the product control
   */
  public ProductControl isSellableAcq(Boolean isSellableAcq) {
    this.isSellableAcq = isSellableAcq;
    return this;
  }

  /**
   * Get isSellableAcq.
   *
   * @return isSellableAcq
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsSellableAcq() {
    return isSellableAcq;
  }

  /**
   * Sets the checks if is sellable acq.
   *
   * @param isSellableAcq the new checks if is sellable acq
   */
  public void setIsSellableAcq(Boolean isSellableAcq) {
    this.isSellableAcq = isSellableAcq;
  }

  /**
   * Checks if is sellable ret.
   *
   * @param isSellableRet the is sellable ret
   * @return the product control
   */
  public ProductControl isSellableRet(Boolean isSellableRet) {
    this.isSellableRet = isSellableRet;
    return this;
  }

  /**
   * Get isSellableRet.
   *
   * @return isSellableRet
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsSellableRet() {
    return isSellableRet;
  }

  /**
   * Sets the checks if is sellable ret.
   *
   * @param isSellableRet the new checks if is sellable ret
   */
  public void setIsSellableRet(Boolean isSellableRet) {
    this.isSellableRet = isSellableRet;
  }

  /**
   * Checks if is sellablein life.
   *
   * @param isSellableinLife the is sellablein life
   * @return the product control
   */
  public ProductControl isSellableinLife(Boolean isSellableinLife) {
    this.isSellableinLife = isSellableinLife;
    return this;
  }

  /**
   * Get isSellableinLife.
   *
   * @return isSellableinLife
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsSellableinLife() {
    return isSellableinLife;
  }

  /**
   * Sets the checks if is sellablein life.
   *
   * @param isSellableinLife the new checks if is sellablein life
   */
  public void setIsSellableinLife(Boolean isSellableinLife) {
    this.isSellableinLife = isSellableinLife;
  }

  /**
   * Order.
   *
   * @param order the order
   * @return the product control
   */
  public ProductControl order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order.
   *
   * @return order
   */
  @ApiModelProperty(value = "")


  public String getOrder() {
    return order;
  }

  /**
   * Sets the order.
   *
   * @param order the new order
   */
  public void setOrder(String order) {
    this.order = order;
  }

  /**
   * Pre orderable.
   *
   * @param preOrderable the pre orderable
   * @return the product control
   */
  public ProductControl preOrderable(Boolean preOrderable) {
    this.preOrderable = preOrderable;
    return this;
  }

  /**
   * Get preOrderable.
   *
   * @return preOrderable
   */

  public Boolean isPreOrderable() {
    return preOrderable;
  }

  /**
   * Sets the pre orderable.
   *
   * @param preOrderable the new pre orderable
   */
  public void setPreOrderable(Boolean preOrderable) {
    this.preOrderable = preOrderable;
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
    ProductControl productControl = (ProductControl) o;
    return Objects.equals(this.affiliateExport, productControl.affiliateExport) &&
        Objects.equals(this.availableFrom, productControl.availableFrom) &&
        Objects.equals(this.backOrderMessage, productControl.backOrderMessage) &&
        Objects.equals(this.backOrderable, productControl.backOrderable) &&
        Objects.equals(this.compareWith, productControl.compareWith) &&
        Objects.equals(this.isDisplayableAcq, productControl.isDisplayableAcq) &&
        Objects.equals(this.isDisplayableRet, productControl.isDisplayableRet) &&
        Objects.equals(this.isDisplayableSavedBasket, productControl.isDisplayableSavedBasket) &&
        Objects.equals(this.isDisplayableinLife, productControl.isDisplayableinLife) &&
        Objects.equals(this.isSellableAcq, productControl.isSellableAcq) &&
        Objects.equals(this.isSellableRet, productControl.isSellableRet) &&
        Objects.equals(this.isSellableinLife, productControl.isSellableinLife) &&
        Objects.equals(this.order, productControl.order) &&
        Objects.equals(this.preOrderable, productControl.preOrderable);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(affiliateExport, availableFrom, backOrderMessage, backOrderable, compareWith, isDisplayableAcq, isDisplayableRet, isDisplayableSavedBasket, isDisplayableinLife, isSellableAcq, isSellableRet, isSellableinLife, order, preOrderable);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductControl {\n");
    
    sb.append("    affiliateExport: ").append(toIndentedString(affiliateExport)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    backOrderMessage: ").append(toIndentedString(backOrderMessage)).append("\n");
    sb.append("    backOrderable: ").append(toIndentedString(backOrderable)).append("\n");
    sb.append("    compareWith: ").append(toIndentedString(compareWith)).append("\n");
    sb.append("    isDisplayableAcq: ").append(toIndentedString(isDisplayableAcq)).append("\n");
    sb.append("    isDisplayableRet: ").append(toIndentedString(isDisplayableRet)).append("\n");
    sb.append("    isDisplayableSavedBasket: ").append(toIndentedString(isDisplayableSavedBasket)).append("\n");
    sb.append("    isDisplayableinLife: ").append(toIndentedString(isDisplayableinLife)).append("\n");
    sb.append("    isSellableAcq: ").append(toIndentedString(isSellableAcq)).append("\n");
    sb.append("    isSellableRet: ").append(toIndentedString(isSellableRet)).append("\n");
    sb.append("    isSellableinLife: ").append(toIndentedString(isSellableinLife)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    preOrderable: ").append(toIndentedString(preOrderable)).append("\n");
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

