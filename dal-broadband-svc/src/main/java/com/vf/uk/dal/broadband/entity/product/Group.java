package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Group
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class Group   {
  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("specifications")
  @Valid
  private List<Specification> specifications = null;

  public Group groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(value = "")


  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Group priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")


  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public Group specifications(List<Specification> specifications) {
    this.specifications = specifications;
    return this;
  }

  public Group addSpecificationsItem(Specification specificationsItem) {
    if (this.specifications == null) {
      this.specifications = new ArrayList<Specification>();
    }
    this.specifications.add(specificationsItem);
    return this;
  }

  /**
   * Get specifications
   * @return specifications
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Specification> getSpecifications() {
    return specifications;
  }

  public void setSpecifications(List<Specification> specifications) {
    this.specifications = specifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.groupName, group.groupName) &&
        Objects.equals(this.priority, group.priority) &&
        Objects.equals(this.specifications, group.specifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, priority, specifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
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

