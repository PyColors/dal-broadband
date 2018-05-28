package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BundleDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")

public class BundleDetails   {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("planList")
  @Valid
  private List<BundleHeader> planList = null;

  public BundleDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * this message gets displayed when chordiant sorting fails due to failure of GRPL or getSubscriptionByMSISDN 
   * @return message
  **/
  @ApiModelProperty(value = "this message gets displayed when chordiant sorting fails due to failure of GRPL or getSubscriptionByMSISDN ")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BundleDetails planList(List<BundleHeader> planList) {
    this.planList = planList;
    return this;
  }

  public BundleDetails addPlanListItem(BundleHeader planListItem) {
    if (this.planList == null) {
      this.planList = new ArrayList<BundleHeader>();
    }
    this.planList.add(planListItem);
    return this;
  }

  /**
   * Get planList
   * @return planList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BundleHeader> getPlanList() {
    return planList;
  }

  public void setPlanList(List<BundleHeader> planList) {
    this.planList = planList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleDetails bundleDetails = (BundleDetails) o;
    return Objects.equals(this.message, bundleDetails.message) &&
        Objects.equals(this.planList, bundleDetails.planList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, planList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleDetails {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    planList: ").append(toIndentedString(planList)).append("\n");
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

