package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Misc.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class Misc   {
  
  /** The item attribute. */
  @JsonProperty("itemAttribute")
  @Valid
  private List<ItemAttribute> itemAttribute = null;

  /**
   * Item attribute.
   *
   * @param itemAttribute the item attribute
   * @return the misc
   */
  public Misc itemAttribute(List<ItemAttribute> itemAttribute) {
    this.itemAttribute = itemAttribute;
    return this;
  }

  /**
   * Adds the item attribute item.
   *
   * @param itemAttributeItem the item attribute item
   * @return the misc
   */
  public Misc addItemAttributeItem(ItemAttribute itemAttributeItem) {
    if (this.itemAttribute == null) {
      this.itemAttribute = new ArrayList<>();
    }
    this.itemAttribute.add(itemAttributeItem);
    return this;
  }

  /**
   * Get itemAttribute.
   *
   * @return itemAttribute
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<ItemAttribute> getItemAttribute() {
    return itemAttribute;
  }

  /**
   * Sets the item attribute.
   *
   * @param itemAttribute the new item attribute
   */
  public void setItemAttribute(List<ItemAttribute> itemAttribute) {
    this.itemAttribute = itemAttribute;
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
    Misc misc = (Misc) o;
    return Objects.equals(this.itemAttribute, misc.itemAttribute);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(itemAttribute);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Misc {\n");
    
    sb.append("    itemAttribute: ").append(toIndentedString(itemAttribute)).append("\n");
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

