package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * PriceRequestForBasket
 */

public class PriceRequestForBasket   {
  private List<PackageInRequest> packages = new ArrayList<>();
/**
 * 
 * @param packages
 * @return
 */
  public PriceRequestForBasket packages(List<PackageInRequest> packages) {
    this.packages = packages;
    return this;
  }
/**
 * 
 * @param packagesItem
 * @return
 */
  public PriceRequestForBasket addPackagesItem(PackageInRequest packagesItem) {
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Unique hardware id as available from the product catalogue
   * @return packages
  **/
  public List<PackageInRequest> getPackages() {
    return packages;
  }

  public void setPackages(List<PackageInRequest> packages) {
    this.packages = packages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceRequestForBasket priceRequestForBasket = (PriceRequestForBasket) o;
    return Objects.equals(this.packages, priceRequestForBasket.packages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceRequestForBasket {\n");
    
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
