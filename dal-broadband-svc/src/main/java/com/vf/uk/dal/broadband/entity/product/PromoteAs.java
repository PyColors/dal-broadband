package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PromoteAs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class PromoteAs   {
  @JsonProperty("promotionName")
  @Valid
  private List<String> promotionName = null;

  public PromoteAs promotionName(List<String> promotionName) {
    this.promotionName = promotionName;
    return this;
  }

  public PromoteAs addPromotionNameItem(String promotionNameItem) {
    if (this.promotionName == null) {
      this.promotionName = new ArrayList<String>();
    }
    this.promotionName.add(promotionNameItem);
    return this;
  }

  /**
   * Get promotionName
   * @return promotionName
  **/
  @ApiModelProperty(value = "")


  public List<String> getPromotionName() {
    return promotionName;
  }

  public void setPromotionName(List<String> promotionName) {
    this.promotionName = promotionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoteAs promoteAs = (PromoteAs) o;
    return Objects.equals(this.promotionName, promoteAs.promotionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoteAs {\n");
    
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
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

