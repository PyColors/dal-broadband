package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ItemAttribute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ItemAttribute   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueUOM")
  private String valueUOM = null;

  public ItemAttribute key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ItemAttribute type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ItemAttribute value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ItemAttribute valueUOM(String valueUOM) {
    this.valueUOM = valueUOM;
    return this;
  }

  /**
   * Get valueUOM
   * @return valueUOM
  **/
  @ApiModelProperty(value = "")


  public String getValueUOM() {
    return valueUOM;
  }

  public void setValueUOM(String valueUOM) {
    this.valueUOM = valueUOM;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemAttribute itemAttribute = (ItemAttribute) o;
    return Objects.equals(this.key, itemAttribute.key) &&
        Objects.equals(this.type, itemAttribute.type) &&
        Objects.equals(this.value, itemAttribute.value) &&
        Objects.equals(this.valueUOM, itemAttribute.valueUOM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, value, valueUOM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttribute {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueUOM: ").append(toIndentedString(valueUOM)).append("\n");
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

