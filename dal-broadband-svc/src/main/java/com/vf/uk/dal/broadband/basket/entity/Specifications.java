package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Specifications.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Specifications   {
  
  /** The comparable. */
  @JsonProperty("comparable")
  private String comparable = null;

  /** The description. */
  @JsonProperty("description")
  private String description = null;

  /** The footnote. */
  @JsonProperty("footnote")
  private String footnote = null;

  /** The iskey. */
  @JsonProperty("iskey")
  private String iskey = null;

  /** The name. */
  @JsonProperty("name")
  private String name = null;

  /** The spec priority. */
  @JsonProperty("specPriority")
  private String specPriority = null;

  /** The value. */
  @JsonProperty("value")
  private String value = null;

  /** The value type. */
  @JsonProperty("valueType")
  private String valueType = null;

  /** The value UOM. */
  @JsonProperty("valueUOM")
  private String valueUOM = null;

  /**
   * Comparable.
   *
   * @param comparable the comparable
   * @return the specifications
   */
  public Specifications comparable(String comparable) {
    this.comparable = comparable;
    return this;
  }

  /**
   * Get comparable.
   *
   * @return comparable
   */
  @ApiModelProperty(value = "")


  public String getComparable() {
    return comparable;
  }

  /**
   * Sets the comparable.
   *
   * @param comparable the new comparable
   */
  public void setComparable(String comparable) {
    this.comparable = comparable;
  }

  /**
   * Description.
   *
   * @param description the description
   * @return the specifications
   */
  public Specifications description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description.
   *
   * @return description
   */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Footnote.
   *
   * @param footnote the footnote
   * @return the specifications
   */
  public Specifications footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Get footnote.
   *
   * @return footnote
   */
  @ApiModelProperty(value = "")


  public String getFootnote() {
    return footnote;
  }

  /**
   * Sets the footnote.
   *
   * @param footnote the new footnote
   */
  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  /**
   * Iskey.
   *
   * @param iskey the iskey
   * @return the specifications
   */
  public Specifications iskey(String iskey) {
    this.iskey = iskey;
    return this;
  }

  /**
   * Get iskey.
   *
   * @return iskey
   */
  @ApiModelProperty(value = "")


  public String getIskey() {
    return iskey;
  }

  /**
   * Sets the iskey.
   *
   * @param iskey the new iskey
   */
  public void setIskey(String iskey) {
    this.iskey = iskey;
  }

  /**
   * Name.
   *
   * @param name the name
   * @return the specifications
   */
  public Specifications name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   *
   * @return name
   */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Spec priority.
   *
   * @param specPriority the spec priority
   * @return the specifications
   */
  public Specifications specPriority(String specPriority) {
    this.specPriority = specPriority;
    return this;
  }

  /**
   * Get specPriority.
   *
   * @return specPriority
   */
  @ApiModelProperty(value = "")


  public String getSpecPriority() {
    return specPriority;
  }

  /**
   * Sets the spec priority.
   *
   * @param specPriority the new spec priority
   */
  public void setSpecPriority(String specPriority) {
    this.specPriority = specPriority;
  }

  /**
   * Value.
   *
   * @param value the value
   * @return the specifications
   */
  public Specifications value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value.
   *
   * @return value
   */
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  /**
   * Sets the value.
   *
   * @param value the new value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Value type.
   *
   * @param valueType the value type
   * @return the specifications
   */
  public Specifications valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Get valueType.
   *
   * @return valueType
   */
  @ApiModelProperty(value = "")


  public String getValueType() {
    return valueType;
  }

  /**
   * Sets the value type.
   *
   * @param valueType the new value type
   */
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * Value UOM.
   *
   * @param valueUOM the value UOM
   * @return the specifications
   */
  public Specifications valueUOM(String valueUOM) {
    this.valueUOM = valueUOM;
    return this;
  }

  /**
   * Get valueUOM.
   *
   * @return valueUOM
   */
  @ApiModelProperty(value = "")


  public String getValueUOM() {
    return valueUOM;
  }

  /**
   * Sets the value UOM.
   *
   * @param valueUOM the new value UOM
   */
  public void setValueUOM(String valueUOM) {
    this.valueUOM = valueUOM;
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(comparable, description, footnote, iskey, name, specPriority, value, valueType, valueUOM);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

