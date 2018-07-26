package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceLineTreatment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketServiceLineTreatment   {
  @JsonProperty("accessLine")
  private BasketAccessLine accessLine = null;

  @JsonProperty("canNumberBeRetained")
  private Boolean canNumberBeRetained = null;

  @JsonProperty("lineInfo")
  private String lineInfo = null;

  @JsonProperty("parentIdentification")
  private String parentIdentification = null;

  @JsonProperty("pendingOrders")
  @Valid
  private List<BasketPendingOrder> pendingOrders = null;

  @JsonProperty("portInFlag")
  private String portInFlag = null;

  @JsonProperty("serviceAction")
  private String serviceAction = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("simValue")
  private String simValue = null;

  @JsonProperty("vicCode")
  private String vicCode = null;

  public BasketServiceLineTreatment accessLine(BasketAccessLine accessLine) {
    this.accessLine = accessLine;
    return this;
  }

  /**
   * Get accessLine
   * @return accessLine
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasketAccessLine getAccessLine() {
    return accessLine;
  }

  public void setAccessLine(BasketAccessLine accessLine) {
    this.accessLine = accessLine;
  }

  public BasketServiceLineTreatment canNumberBeRetained(Boolean canNumberBeRetained) {
    this.canNumberBeRetained = canNumberBeRetained;
    return this;
  }

  /**
   * Get canNumberBeRetained
   * @return canNumberBeRetained
  **/

  public Boolean isCanNumberBeRetained() {
    return canNumberBeRetained;
  }

  public void setCanNumberBeRetained(Boolean canNumberBeRetained) {
    this.canNumberBeRetained = canNumberBeRetained;
  }

  public BasketServiceLineTreatment lineInfo(String lineInfo) {
    this.lineInfo = lineInfo;
    return this;
  }

  /**
   * Get lineInfo
   * @return lineInfo
  **/
  @ApiModelProperty(value = "")


  public String getLineInfo() {
    return lineInfo;
  }

  public void setLineInfo(String lineInfo) {
    this.lineInfo = lineInfo;
  }

  public BasketServiceLineTreatment parentIdentification(String parentIdentification) {
    this.parentIdentification = parentIdentification;
    return this;
  }

  /**
   * Get parentIdentification
   * @return parentIdentification
  **/
  @ApiModelProperty(value = "")


  public String getParentIdentification() {
    return parentIdentification;
  }

  public void setParentIdentification(String parentIdentification) {
    this.parentIdentification = parentIdentification;
  }

  public BasketServiceLineTreatment pendingOrders(List<BasketPendingOrder> pendingOrders) {
    this.pendingOrders = pendingOrders;
    return this;
  }

  public BasketServiceLineTreatment addPendingOrdersItem(BasketPendingOrder pendingOrdersItem) {
    if (this.pendingOrders == null) {
      this.pendingOrders = new ArrayList<>();
    }
    this.pendingOrders.add(pendingOrdersItem);
    return this;
  }

  /**
   * Get pendingOrders
   * @return pendingOrders
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BasketPendingOrder> getPendingOrders() {
    return pendingOrders;
  }

  public void setPendingOrders(List<BasketPendingOrder> pendingOrders) {
    this.pendingOrders = pendingOrders;
  }

  public BasketServiceLineTreatment portInFlag(String portInFlag) {
    this.portInFlag = portInFlag;
    return this;
  }

  /**
   * Get portInFlag
   * @return portInFlag
  **/
  @ApiModelProperty(value = "")


  public String getPortInFlag() {
    return portInFlag;
  }

  public void setPortInFlag(String portInFlag) {
    this.portInFlag = portInFlag;
  }

  public BasketServiceLineTreatment serviceAction(String serviceAction) {
    this.serviceAction = serviceAction;
    return this;
  }

  /**
   * Get serviceAction
   * @return serviceAction
  **/
  @ApiModelProperty(value = "")


  public String getServiceAction() {
    return serviceAction;
  }

  public void setServiceAction(String serviceAction) {
    this.serviceAction = serviceAction;
  }

  public BasketServiceLineTreatment serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "")


  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public BasketServiceLineTreatment simValue(String simValue) {
    this.simValue = simValue;
    return this;
  }

  /**
   * Get simValue
   * @return simValue
  **/
  @ApiModelProperty(value = "")


  public String getSimValue() {
    return simValue;
  }

  public void setSimValue(String simValue) {
    this.simValue = simValue;
  }

  public BasketServiceLineTreatment vicCode(String vicCode) {
    this.vicCode = vicCode;
    return this;
  }

  /**
   * Get vicCode
   * @return vicCode
  **/
  @ApiModelProperty(value = "")


  public String getVicCode() {
    return vicCode;
  }

  public void setVicCode(String vicCode) {
    this.vicCode = vicCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketServiceLineTreatment serviceLineTreatment = (BasketServiceLineTreatment) o;
    return Objects.equals(this.accessLine, serviceLineTreatment.accessLine) &&
        Objects.equals(this.canNumberBeRetained, serviceLineTreatment.canNumberBeRetained) &&
        Objects.equals(this.lineInfo, serviceLineTreatment.lineInfo) &&
        Objects.equals(this.parentIdentification, serviceLineTreatment.parentIdentification) &&
        Objects.equals(this.pendingOrders, serviceLineTreatment.pendingOrders) &&
        Objects.equals(this.portInFlag, serviceLineTreatment.portInFlag) &&
        Objects.equals(this.serviceAction, serviceLineTreatment.serviceAction) &&
        Objects.equals(this.serviceType, serviceLineTreatment.serviceType) &&
        Objects.equals(this.simValue, serviceLineTreatment.simValue) &&
        Objects.equals(this.vicCode, serviceLineTreatment.vicCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLine, canNumberBeRetained, lineInfo, parentIdentification, pendingOrders, portInFlag, serviceAction, serviceType, simValue, vicCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLineTreatment {\n");
    
    sb.append("    accessLine: ").append(toIndentedString(accessLine)).append("\n");
    sb.append("    canNumberBeRetained: ").append(toIndentedString(canNumberBeRetained)).append("\n");
    sb.append("    lineInfo: ").append(toIndentedString(lineInfo)).append("\n");
    sb.append("    parentIdentification: ").append(toIndentedString(parentIdentification)).append("\n");
    sb.append("    pendingOrders: ").append(toIndentedString(pendingOrders)).append("\n");
    sb.append("    portInFlag: ").append(toIndentedString(portInFlag)).append("\n");
    sb.append("    serviceAction: ").append(toIndentedString(serviceAction)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    simValue: ").append(toIndentedString(simValue)).append("\n");
    sb.append("    vicCode: ").append(toIndentedString(vicCode)).append("\n");
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

