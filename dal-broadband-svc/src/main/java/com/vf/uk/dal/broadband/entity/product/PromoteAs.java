package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PromoteAs.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class PromoteAs   {
  
  /** The promotion name. */
  @JsonProperty("promotionName")
  @Valid
  private List<String> promotionName = null;

  /**
   * Promotion name.
   *
   * @param promotionName the promotion name
   * @return the promote as
   */
  public PromoteAs promotionName(List<String> promotionName) {
    this.promotionName = promotionName;
    return this;
  }

  /**
   * Adds the promotion name item.
   *
   * @param promotionNameItem the promotion name item
   * @return the promote as
   */
  public PromoteAs addPromotionNameItem(String promotionNameItem) {
    if (this.promotionName == null) {
      this.promotionName = new ArrayList<>();
    }
    this.promotionName.add(promotionNameItem);
    return this;
  }

  /**
   * Get promotionName.
   *
   * @return promotionName
   */
  @ApiModelProperty(value = "")


  public List<String> getPromotionName() {
    return promotionName;
  }

  /**
   * Sets the promotion name.
   *
   * @param promotionName the new promotion name
   */
  public void setPromotionName(List<String> promotionName) {
    this.promotionName = promotionName;
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
    PromoteAs promoteAs = (PromoteAs) o;
    return Objects.equals(this.promotionName, promoteAs.promotionName);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(promotionName);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

