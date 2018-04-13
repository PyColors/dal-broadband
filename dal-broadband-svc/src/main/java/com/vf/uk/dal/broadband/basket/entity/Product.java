package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;
/**
 * Product
 */

public class Product   {
  private String skuId = null;

  private String productType = null;
  
  private String action=null;
  
  

  public String getAction() {
	return action;
}

public void setAction(String action) {
	this.action = action;
}
/**
 * 
 * @param skuId
 * @return
 */
public Product skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

   /**
   * Product id from the product catalogue
   * @return skuId
  **/
  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }
/**
 * 
 * @param productType
 * @return
 */
  public Product productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Product type of should be SERVICE/HARDWARE 
   * @return productType
  **/
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
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
    return Objects.equals(this.skuId, product.skuId) &&
        Objects.equals(this.productType, product.productType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, productType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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

