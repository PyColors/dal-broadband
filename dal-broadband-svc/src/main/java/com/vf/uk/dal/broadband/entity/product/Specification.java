package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Specification.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class Specification   {
  
  /** The description. */
  @JsonProperty("description")
  private String description = null;

  /** The foot note. */
  @JsonProperty("footNote")
  private String footNote = null;

  /** The hide in list. */
  @JsonProperty("hideInList")
  private Boolean hideInList = null;

  /** The is key. */
  @JsonProperty("isKey")
  private Boolean isKey = null;

  /** The key. */
  @JsonProperty("key")
  private Boolean key = null;

  /** The name. */
  @JsonProperty("name")
  private String name = null;

  /** The priority. */
  @JsonProperty("priority")
  private Long priority = null;

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
   * Description.
   *
   * @param description the description
   * @return the specification
   */
  public Specification description(String description) {
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
   * Foot note.
   *
   * @param footNote the foot note
   * @return the specification
   */
  public Specification footNote(String footNote) {
    this.footNote = footNote;
    return this;
  }

  /**
   * Get footNote.
   *
   * @return footNote
   */
  @ApiModelProperty(value = "")


  public String getFootNote() {
    return footNote;
  }

  /**
   * Sets the foot note.
   *
   * @param footNote the new foot note
   */
  public void setFootNote(String footNote) {
    this.footNote = footNote;
  }

  /**
   * Hide in list.
   *
   * @param hideInList the hide in list
   * @return the specification
   */
  public Specification hideInList(Boolean hideInList) {
    this.hideInList = hideInList;
    return this;
  }

  /**
   * Get hideInList.
   *
   * @return hideInList
   */
  @ApiModelProperty(value = "")


  public Boolean isHideInList() {
    return hideInList;
  }

  /**
   * Sets the hide in list.
   *
   * @param hideInList the new hide in list
   */
  public void setHideInList(Boolean hideInList) {
    this.hideInList = hideInList;
  }

  /**
   * Checks if is key.
   *
   * @param isKey the is key
   * @return the specification
   */
  public Specification isKey(Boolean isKey) {
    this.isKey = isKey;
    return this;
  }

  /**
   * Get isKey.
   *
   * @return isKey
   */
  @ApiModelProperty(value = "")


  public Boolean isIsKey() {
    return isKey;
  }

  /**
   * Sets the checks if is key.
   *
   * @param isKey the new checks if is key
   */
  public void setIsKey(Boolean isKey) {
    this.isKey = isKey;
  }

  /**
   * Key.
   *
   * @param key the key
   * @return the specification
   */
  public Specification key(Boolean key) {
    this.key = key;
    return this;
  }

  /**
   * Get key.
   *
   * @return key
   */
  @ApiModelProperty(value = "")


  public Boolean isKey() {
    return key;
  }

  /**
   * Sets the key.
   *
   * @param key the new key
   */
  public void setKey(Boolean key) {
    this.key = key;
  }

  /**
   * Name.
   *
   * @param name the name
   * @return the specification
   */
  public Specification name(String name) {
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
   * Priority.
   *
   * @param priority the priority
   * @return the specification
   */
  public Specification priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority.
   *
   * @return priority
   */
  @ApiModelProperty(value = "")


  public Long getPriority() {
    return priority;
  }

  /**
   * Sets the priority.
   *
   * @param priority the new priority
   */
  public void setPriority(Long priority) {
    this.priority = priority;
  }

  /**
   * Value.
   *
   * @param value the value
   * @return the specification
   */
  public Specification value(String value) {
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
   * @return the specification
   */
  public Specification valueType(String valueType) {
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
   * @return the specification
   */
  public Specification valueUOM(String valueUOM) {
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
    Specification specification = (Specification) o;
    return Objects.equals(this.description, specification.description) &&
        Objects.equals(this.footNote, specification.footNote) &&
        Objects.equals(this.hideInList, specification.hideInList) &&
        Objects.equals(this.isKey, specification.isKey) &&
        Objects.equals(this.key, specification.key) &&
        Objects.equals(this.name, specification.name) &&
        Objects.equals(this.priority, specification.priority) &&
        Objects.equals(this.value, specification.value) &&
        Objects.equals(this.valueType, specification.valueType) &&
        Objects.equals(this.valueUOM, specification.valueUOM);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(description, footNote, hideInList, isKey, key, name, priority, value, valueType, valueUOM);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Specification {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    footNote: ").append(toIndentedString(footNote)).append("\n");
    sb.append("    hideInList: ").append(toIndentedString(hideInList)).append("\n");
    sb.append("    isKey: ").append(toIndentedString(isKey)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

