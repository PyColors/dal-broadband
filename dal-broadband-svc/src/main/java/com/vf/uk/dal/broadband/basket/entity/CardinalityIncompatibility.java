package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CardinalityIncompatibility
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CardinalityIncompatibility   {
  @JsonProperty("groupCardinality")
  private String groupCardinality = null;

  @JsonProperty("productIds")
  @Valid
  private List<String> productIds = null;

  @JsonProperty("relationCardinality")
  private String relationCardinality = null;

  public CardinalityIncompatibility groupCardinality(String groupCardinality) {
    this.groupCardinality = groupCardinality;
    return this;
  }

  /**
   * Get groupCardinality
   * @return groupCardinality
  **/
  @ApiModelProperty(value = "")


  public String getGroupCardinality() {
    return groupCardinality;
  }

  public void setGroupCardinality(String groupCardinality) {
    this.groupCardinality = groupCardinality;
  }

  public CardinalityIncompatibility productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public CardinalityIncompatibility addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<String>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

  /**
   * Get productIds
   * @return productIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  public CardinalityIncompatibility relationCardinality(String relationCardinality) {
    this.relationCardinality = relationCardinality;
    return this;
  }

  /**
   * Get relationCardinality
   * @return relationCardinality
  **/
  @ApiModelProperty(value = "")


  public String getRelationCardinality() {
    return relationCardinality;
  }

  public void setRelationCardinality(String relationCardinality) {
    this.relationCardinality = relationCardinality;
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
    return Objects.equals(this.groupCardinality, cardinalityIncompatibility.groupCardinality) &&
        Objects.equals(this.productIds, cardinalityIncompatibility.productIds) &&
        Objects.equals(this.relationCardinality, cardinalityIncompatibility.relationCardinality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupCardinality, productIds, relationCardinality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardinalityIncompatibility {\n");
    
    sb.append("    groupCardinality: ").append(toIndentedString(groupCardinality)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    relationCardinality: ").append(toIndentedString(relationCardinality)).append("\n");
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

