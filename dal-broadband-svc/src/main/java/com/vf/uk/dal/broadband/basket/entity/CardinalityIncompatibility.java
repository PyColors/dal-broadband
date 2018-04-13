package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Populated only when cardinality rules are not met.
 */

public class CardinalityIncompatibility   {
  private String relationCardinality = null;

  private List<String> productIds = null;

  private String groupCardinality = null;
/**
 * 
 * @param relationCardinality
 * @return
 */
  public CardinalityIncompatibility relationCardinality(String relationCardinality) {
    this.relationCardinality = relationCardinality;
    return this;
  }

   /**
   * populated if relationShip cardinality has failed.
   * @return relationCardinality
  **/


  public String getRelationCardinality() {
    return relationCardinality;
  }

  public void setRelationCardinality(String relationCardinality) {
    this.relationCardinality = relationCardinality;
  }
/**
 * 
 * @param productIds
 * @return
 */
  public CardinalityIncompatibility productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }
/**
 * 
 * @param productIdsItem
 * @return
 */
  public CardinalityIncompatibility addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * List of productIds when group cardinality is broken for a service product. Populated along with Group Cardinality.
   * @return productIds
  **/


  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }
/**
 * 
 * @param groupCardinality
 * @return
 */
  public CardinalityIncompatibility groupCardinality(String groupCardinality) {
    this.groupCardinality = groupCardinality;
    return this;
  }

   /**
   * group cardinality when a parent relation cardinality is broken.populated aling with product Ids.
   * @return groupCardinality
  **/


  public String getGroupCardinality() {
    return groupCardinality;
  }

  public void setGroupCardinality(String groupCardinality) {
    this.groupCardinality = groupCardinality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardinalityIncompatibility cardinalityIncompatibility = (CardinalityIncompatibility) o;
    return Objects.equals(this.relationCardinality, cardinalityIncompatibility.relationCardinality) &&
        Objects.equals(this.productIds, cardinalityIncompatibility.productIds) &&
        Objects.equals(this.groupCardinality, cardinalityIncompatibility.groupCardinality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationCardinality, productIds, groupCardinality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardinalityIncompatibility {\n");
    
    sb.append("    relationCardinality: ").append(toIndentedString(relationCardinality)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    groupCardinality: ").append(toIndentedString(groupCardinality)).append("\n");
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

