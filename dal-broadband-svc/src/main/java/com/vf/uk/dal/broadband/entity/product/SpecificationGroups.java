package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SpecificationGroups
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class SpecificationGroups   {
  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("specifications")
  @Valid
  private List<Specifications> specifications = null;

  public SpecificationGroups groupName(String groupName) {
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

  public SpecificationGroups priority(String priority) {
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

  public SpecificationGroups specifications(List<Specifications> specifications) {
    this.specifications = specifications;
    return this;
  }

  public SpecificationGroups addSpecificationsItem(Specifications specificationsItem) {
    if (this.specifications == null) {
      this.specifications = new ArrayList<Specifications>();
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

  public List<Specifications> getSpecifications() {
    return specifications;
  }

  public void setSpecifications(List<Specifications> specifications) {
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
    SpecificationGroups specificationGroups = (SpecificationGroups) o;
    return Objects.equals(this.groupName, specificationGroups.groupName) &&
        Objects.equals(this.priority, specificationGroups.priority) &&
        Objects.equals(this.specifications, specificationGroups.specifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, priority, specifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificationGroups {\n");
    
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

