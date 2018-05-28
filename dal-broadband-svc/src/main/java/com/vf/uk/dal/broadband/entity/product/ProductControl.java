package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductControl
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

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
        Objects.equals(this.isDisplayableSavedBasket, productControl.isDisplayableSavedBasket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDisplayableinLife, isSellableinLife, isDisplayableAcq, isSellableRet, isDisplayableRet, isSellableAcq, isDisplayableSavedBasket);
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

