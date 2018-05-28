package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductPriceOverride
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class ProductPriceOverride   {
  @JsonProperty("priceNet")
  private String priceNet = null;

  @JsonProperty("priceGross")
  private String priceGross = null;

  @JsonProperty("priceVAT")
  private String priceVAT = null;

  public ProductPriceOverride priceNet(String priceNet) {
    this.priceNet = priceNet;
    return this;
  }

  /**
   * Get priceNet
   * @return priceNet
  **/
  @ApiModelProperty(value = "")


  public String getPriceNet() {
    return priceNet;
  }

  public void setPriceNet(String priceNet) {
    this.priceNet = priceNet;
  }

  public ProductPriceOverride priceGross(String priceGross) {
    this.priceGross = priceGross;
    return this;
  }

  /**
   * Get priceGross
   * @return priceGross
  **/
  @ApiModelProperty(value = "")


  public String getPriceGross() {
    return priceGross;
  }

  public void setPriceGross(String priceGross) {
    this.priceGross = priceGross;
  }

  public ProductPriceOverride priceVAT(String priceVAT) {
    this.priceVAT = priceVAT;
    return this;
  }

  /**
   * Get priceVAT
   * @return priceVAT
  **/
  @ApiModelProperty(value = "")


  public String getPriceVAT() {
    return priceVAT;
  }

  public void setPriceVAT(String priceVAT) {
    this.priceVAT = priceVAT;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPriceOverride productPriceOverride = (ProductPriceOverride) o;
    return Objects.equals(this.priceNet, productPriceOverride.priceNet) &&
        Objects.equals(this.priceGross, productPriceOverride.priceGross) &&
        Objects.equals(this.priceVAT, productPriceOverride.priceVAT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceNet, priceGross, priceVAT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPriceOverride {\n");
    
    sb.append("    priceNet: ").append(toIndentedString(priceNet)).append("\n");
    sb.append("    priceGross: ").append(toIndentedString(priceGross)).append("\n");
    sb.append("    priceVAT: ").append(toIndentedString(priceVAT)).append("\n");
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

