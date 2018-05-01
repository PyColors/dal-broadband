package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Specifications
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class Specifications   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("valueUOM")
  private String valueUOM = null;

  @JsonProperty("footNote")
  private String footNote = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("hideInList")
  private Boolean hideInList = null;

  @JsonProperty("key")
  private Boolean key = null;

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

  public Specifications priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
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

  public Specifications footNote(String footNote) {
    this.footNote = footNote;
    return this;
  }

  /**
   * Get footNote
   * @return footNote
  **/
  @ApiModelProperty(value = "")


  public String getFootNote() {
    return footNote;
  }

  public void setFootNote(String footNote) {
    this.footNote = footNote;
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

  public Specifications hideInList(Boolean hideInList) {
    this.hideInList = hideInList;
    return this;
  }

  /**
   * Get hideInList
   * @return hideInList
  **/
  @ApiModelProperty(value = "")


  public Boolean isHideInList() {
    return hideInList;
  }

  public void setHideInList(Boolean hideInList) {
    this.hideInList = hideInList;
  }

  public Specifications key(Boolean key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")


  public Boolean isKey() {
    return key;
  }

  public void setKey(Boolean key) {
    this.key = key;
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
    return Objects.equals(this.name, specifications.name) &&
        Objects.equals(this.value, specifications.value) &&
        Objects.equals(this.priority, specifications.priority) &&
        Objects.equals(this.valueType, specifications.valueType) &&
        Objects.equals(this.valueUOM, specifications.valueUOM) &&
        Objects.equals(this.footNote, specifications.footNote) &&
        Objects.equals(this.description, specifications.description) &&
        Objects.equals(this.hideInList, specifications.hideInList) &&
        Objects.equals(this.key, specifications.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, priority, valueType, valueUOM, footNote, description, hideInList, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Specifications {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    valueUOM: ").append(toIndentedString(valueUOM)).append("\n");
    sb.append("    footNote: ").append(toIndentedString(footNote)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hideInList: ").append(toIndentedString(hideInList)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

