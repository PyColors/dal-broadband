package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

/**
 * CompatibilityRequestList
 */

public class CompatibilityRequestList   {
  private List<CompatibilityRequest> packages = null;
/**
 * 
 * @param packages
 * @return
 */
  public CompatibilityRequestList packages(List<CompatibilityRequest> packages) {
    this.packages = packages;
    return this;
  }
/**
 * 
 * @param packagesItem
 * @return
 */
  public CompatibilityRequestList addPackagesItem(CompatibilityRequest packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @Valid

  public List<CompatibilityRequest> getPackages() {
    return packages;
  }

  public void setPackages(List<CompatibilityRequest> packages) {
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
    CompatibilityRequestList compatibilityRequestList = (CompatibilityRequestList) o;
    return Objects.equals(this.packages, compatibilityRequestList.packages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilityRequestList {\n");
    
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

