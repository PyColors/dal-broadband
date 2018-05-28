package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Misc
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class Misc   {
  @JsonProperty("itemAttribute")
  @Valid
  private List<ItemAttribute> itemAttribute = null;

  public Misc itemAttribute(List<ItemAttribute> itemAttribute) {
    this.itemAttribute = itemAttribute;
    return this;
  }

  public Misc addItemAttributeItem(ItemAttribute itemAttributeItem) {
    if (this.itemAttribute == null) {
      this.itemAttribute = new ArrayList<ItemAttribute>();
    }
    this.itemAttribute.add(itemAttributeItem);
    return this;
  }

  /**
   * Get itemAttribute
   * @return itemAttribute
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ItemAttribute> getItemAttribute() {
    return itemAttribute;
  }

  public void setItemAttribute(List<ItemAttribute> itemAttribute) {
    this.itemAttribute = itemAttribute;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(itemAttribute);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

