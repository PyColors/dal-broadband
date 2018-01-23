package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MediaLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class MediaLink   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("packageType")
  private List<String> packageType = null;

  public MediaLink id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique id given for this link which provide a reference for UI to place this on the screen
   * @return id
  **/
  @ApiModelProperty(value = "Unique id given for this link which provide a reference for UI to place this on the screen")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MediaLink value(String value) {
    this.value = value;
    return this;
  }

   /**
   * URL Link from the content site for the media
   * @return value
  **/
  @ApiModelProperty(value = "URL Link from the content site for the media")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MediaLink type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Will provide UI information on the type of the link (like URL)
   * @return type
  **/
  @ApiModelProperty(value = "Will provide UI information on the type of the link (like URL)")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MediaLink priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * priority of the media link
   * @return priority
  **/
  @ApiModelProperty(value = "priority of the media link")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public MediaLink packageType(List<String> packageType) {
    this.packageType = packageType;
    return this;
  }

  public MediaLink addPackageTypeItem(String packageTypeItem) {
    if (this.packageType == null) {
      this.packageType = new ArrayList<String>();
    }
    this.packageType.add(packageTypeItem);
    return this;
  }

   /**
   * List of packageTypes available for the MediaLink
   * @return packageType
  **/
  @ApiModelProperty(value = "List of packageTypes available for the MediaLink")


  public List<String> getPackageType() {
    return packageType;
  }

  public void setPackageType(List<String> packageType) {
    this.packageType = packageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaLink mediaLink = (MediaLink) o;
    return Objects.equals(this.id, mediaLink.id) &&
        Objects.equals(this.value, mediaLink.value) &&
        Objects.equals(this.type, mediaLink.type) &&
        Objects.equals(this.priority, mediaLink.priority) &&
        Objects.equals(this.packageType, mediaLink.packageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, type, priority, packageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaLink {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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

