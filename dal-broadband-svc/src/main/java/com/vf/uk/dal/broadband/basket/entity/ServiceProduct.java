package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

/**
 * ServiceProduct
 */

public class ServiceProduct   {
  private String serviceProductId = null;

  private List<ChildProduct> childProducts = null;
/**
 * 
 * @param serviceProductId
 * @return
 */
  public ServiceProduct serviceProductId(String serviceProductId) {
    this.serviceProductId = serviceProductId;
    return this;
  }

   /**
   * Id for the Service product (Mobile Service Id in case of a mobile phone service ). This is needed to validate Rex rules against root product for child service products.
   * @return serviceProductId
  **/


  public String getServiceProductId() {
    return serviceProductId;
  }

  public void setServiceProductId(String serviceProductId) {
    this.serviceProductId = serviceProductId;
  }
/**
 * 
 * @param childProducts
 * @return
 */
  public ServiceProduct childProducts(List<ChildProduct> childProducts) {
    this.childProducts = childProducts;
    return this;
  }
/**
 * 
 * @param childProductsItem
 * @return
 */
  public ServiceProduct addChildProductsItem(ChildProduct childProductsItem) {
    if (this.childProducts == null) {
      this.childProducts = new ArrayList<>();
    }
    this.childProducts.add(childProductsItem);
    return this;
  }

   /**
   * (Optional) these products will not be validated against each other as these are already validated. But, products in newProducts will still be validated against this product. This flexibility is to ensure we dont run rules against all products every time a product is added.
   * @return childProducts
  **/

  @Valid

  public List<ChildProduct> getChildProducts() {
    return childProducts;
  }

  public void setChildProducts(List<ChildProduct> childProducts) {
    this.childProducts = childProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProduct serviceProduct = (ServiceProduct) o;
    return Objects.equals(this.serviceProductId, serviceProduct.serviceProductId) &&
        Objects.equals(this.childProducts, serviceProduct.childProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceProductId, childProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProduct {\n");
    
    sb.append("    serviceProductId: ").append(toIndentedString(serviceProductId)).append("\n");
    sb.append("    childProducts: ").append(toIndentedString(childProducts)).append("\n");
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

