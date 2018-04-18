package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceBriefDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class DeviceBriefDescription   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueUOM")
  private String valueUOM = null;

  public DeviceBriefDescription key(String key) {
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

  public DeviceBriefDescription type(String type) {
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

  public DeviceBriefDescription value(String value) {
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

  public DeviceBriefDescription valueUOM(String valueUOM) {
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
    DeviceBriefDescription deviceBriefDescription = (DeviceBriefDescription) o;
    return Objects.equals(this.key, deviceBriefDescription.key) &&
        Objects.equals(this.type, deviceBriefDescription.type) &&
        Objects.equals(this.value, deviceBriefDescription.value) &&
        Objects.equals(this.valueUOM, deviceBriefDescription.valueUOM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, value, valueUOM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceBriefDescription {\n");
    
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

