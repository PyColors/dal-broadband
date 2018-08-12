package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PendingOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketPendingOrder   {
  @JsonProperty("completionDate")
  private String completionDate = null;

  @JsonProperty("thirdPartyFlag")
  private String thirdPartyFlag = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  /**
   * 
   * @param completionDate
   * @return
   */
  public BasketPendingOrder completionDate(String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Get completionDate
   * @return completionDate
  **/
  @ApiModelProperty(value = "")


  public String getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(String completionDate) {
    this.completionDate = completionDate;
  }

  /**
   * 
   * @param thirdPartyFlag
   * @return
   */
  public BasketPendingOrder thirdPartyFlag(String thirdPartyFlag) {
    this.thirdPartyFlag = thirdPartyFlag;
    return this;
  }

  /**
   * Get thirdPartyFlag
   * @return thirdPartyFlag
  **/
  @ApiModelProperty(value = "")


  public String getThirdPartyFlag() {
    return thirdPartyFlag;
  }

  public void setThirdPartyFlag(String thirdPartyFlag) {
    this.thirdPartyFlag = thirdPartyFlag;
  }

  /**
   * 
   * @param typeCode
   * @return
   */
  public BasketPendingOrder typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Get typeCode
   * @return typeCode
  **/
  @ApiModelProperty(value = "")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketPendingOrder pendingOrder = (BasketPendingOrder) o;
    return Objects.equals(this.completionDate, pendingOrder.completionDate) &&
        Objects.equals(this.thirdPartyFlag, pendingOrder.thirdPartyFlag) &&
        Objects.equals(this.typeCode, pendingOrder.typeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionDate, thirdPartyFlag, typeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingOrder {\n");
    
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    thirdPartyFlag: ").append(toIndentedString(thirdPartyFlag)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

