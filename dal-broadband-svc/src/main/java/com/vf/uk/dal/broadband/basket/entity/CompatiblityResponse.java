package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CompatiblityResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CompatiblityResponse   {
  @JsonProperty("packages")
  @Valid
  private List<CompatibilityPackage> packages = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  /**
   * 
   * @param packages
   * @return
   */
  public CompatiblityResponse packages(List<CompatibilityPackage> packages) {
    this.packages = packages;
    return this;
  }

  /**
   * 
   * @param packagesItem
   * @return
   */
  public CompatiblityResponse addPackagesItem(CompatibilityPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CompatibilityPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<CompatibilityPackage> packages) {
    this.packages = packages;
  }

  /**
   * 
   * @param valid
   * @return
   */
  public CompatiblityResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(value = "")


  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatiblityResponse compatiblityResponse = (CompatiblityResponse) o;
    return Objects.equals(this.packages, compatiblityResponse.packages) &&
        Objects.equals(this.valid, compatiblityResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packages, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatiblityResponse {\n");
    
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

