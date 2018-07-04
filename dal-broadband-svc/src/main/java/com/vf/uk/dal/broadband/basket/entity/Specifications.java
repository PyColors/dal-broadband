package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Specifications
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Specifications   {
  @JsonProperty("comparable")
  private String comparable = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("footnote")
  private String footnote = null;

  @JsonProperty("iskey")
  private String iskey = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("specPriority")
  private String specPriority = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("valueUOM")
  private String valueUOM = null;

  public Specifications comparable(String comparable) {
    this.comparable = comparable;
    return this;
  }

  /**
   * Get comparable
   * @return comparable
  **/
  @ApiModelProperty(value = "")


  public String getComparable() {
    return comparable;
  }

  public void setComparable(String comparable) {
    this.comparable = comparable;
  }

  public Specifications description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Specifications footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Get footnote
   * @return footnote
  **/
  @ApiModelProperty(value = "")


  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  public Specifications iskey(String iskey) {
    this.iskey = iskey;
    return this;
  }

  /**
   * Get iskey
   * @return iskey
  **/
  @ApiModelProperty(value = "")


  public String getIskey() {
    return iskey;
  }

  public void setIskey(String iskey) {
    this.iskey = iskey;
  }

  public Specifications name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Specifications specPriority(String specPriority) {
    this.specPriority = specPriority;
    return this;
  }

  /**
   * Get specPriority
   * @return specPriority
  **/
  @ApiModelProperty(value = "")


  public String getSpecPriority() {
    return specPriority;
  }

  public void setSpecPriority(String specPriority) {
    this.specPriority = specPriority;
  }

  public Specifications value(String value) {
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

  public Specifications valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Get valueType
   * @return valueType
  **/
  @ApiModelProperty(value = "")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public Specifications valueUOM(String valueUOM) {
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
    Specifications specifications = (Specifications) o;
    return Objects.equals(this.comparable, specifications.comparable) &&
        Objects.equals(this.description, specifications.description) &&
        Objects.equals(this.footnote, specifications.footnote) &&
        Objects.equals(this.iskey, specifications.iskey) &&
        Objects.equals(this.name, specifications.name) &&
        Objects.equals(this.specPriority, specifications.specPriority) &&
        Objects.equals(this.value, specifications.value) &&
        Objects.equals(this.valueType, specifications.valueType) &&
        Objects.equals(this.valueUOM, specifications.valueUOM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparable, description, footnote, iskey, name, specPriority, value, valueType, valueUOM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Specifications {\n");
    
    sb.append("    comparable: ").append(toIndentedString(comparable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
    sb.append("    iskey: ").append(toIndentedString(iskey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    specPriority: ").append(toIndentedString(specPriority)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

