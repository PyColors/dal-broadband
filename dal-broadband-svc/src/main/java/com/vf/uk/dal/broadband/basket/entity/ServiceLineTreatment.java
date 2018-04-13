package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



/**
 * ServiceLineTreatment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-25T06:31:48.127Z")

public class ServiceLineTreatment   {
  private String parentIdentification = null;

  private String serviceType = null;

  private String serviceAction = null;

  private String simValue = null;

  private String lineInfo = null;

  private boolean canNumberBeRetained;

  public boolean isCanNumberBeRetained() {
	return canNumberBeRetained;
}

public void setCanNumberBeRetained(boolean canNumberBeRetained) {
	this.canNumberBeRetained = canNumberBeRetained;
}

private String portInFlag = null;

  private String vicCode = null;

  private List<PendingOrder> pendingOrders = null;

  private AccessLine accessLine = null;

  public ServiceLineTreatment parentIdentification(String parentIdentification) {
    this.parentIdentification = parentIdentification;
    return this;
  }

   /**
   * Get parentIdentification
   * @return parentIdentification
  **/


  public String getParentIdentification() {
    return parentIdentification;
  }

  public void setParentIdentification(String parentIdentification) {
    this.parentIdentification = parentIdentification;
  }

  public ServiceLineTreatment serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * 
   * @return serviceType
  **/


  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public ServiceLineTreatment serviceAction(String serviceAction) {
    this.serviceAction = serviceAction;
    return this;
  }

   /**
   * Identifies the action that needs to be applied to the line
   * @return serviceAction
  **/


  public String getServiceAction() {
    return serviceAction;
  }

  public void setServiceAction(String serviceAction) {
    this.serviceAction = serviceAction;
  }

  public ServiceLineTreatment simValue(String simValue) {
    this.simValue = simValue;
    return this;
  }

   /**
   * Flag specifying if a SIM2 is needed or not (SIM2 – Simultaneous Provide)
   * @return simValue
  **/


  public String getSimValue() {
    return simValue;
  }

  public void setSimValue(String simValue) {
    this.simValue = simValue;
  }

  public ServiceLineTreatment lineInfo(String lineInfo) {
    this.lineInfo = lineInfo;
    return this;
  }

   /**
   * Information given to the agent regarding the treatment of the line
   * @return lineInfo
  **/


  public String getLineInfo() {
    return lineInfo;
  }

  public void setLineInfo(String lineInfo) {
    this.lineInfo = lineInfo;
  }

  
  public ServiceLineTreatment portInFlag(String portInFlag) {
    this.portInFlag = portInFlag;
    return this;
  }

   /**
   * A flag which specifies how the number needs to be ported in.
   * @return portInFlag
  **/


  public String getPortInFlag() {
    return portInFlag;
  }

  public void setPortInFlag(String portInFlag) {
    this.portInFlag = portInFlag;
  }

  public ServiceLineTreatment vicCode(String vicCode) {
    this.vicCode = vicCode;
    return this;
  }

   /**
   * An identifier issued to allow an import to occur.
   * @return vicCode
  **/


  public String getVicCode() {
    return vicCode;
  }

  public void setVicCode(String vicCode) {
    this.vicCode = vicCode;
  }

  public ServiceLineTreatment pendingOrders(List<PendingOrder> pendingOrders) {
    this.pendingOrders = pendingOrders;
    return this;
  }

  public ServiceLineTreatment addPendingOrdersItem(PendingOrder pendingOrdersItem) {
    if (this.pendingOrders == null) {
      this.pendingOrders = new ArrayList<PendingOrder>();
    }
    this.pendingOrders.add(pendingOrdersItem);
    return this;
  }

   /**
   * Get pendingOrders
   * @return pendingOrders
  **/


  public List<PendingOrder> getPendingOrders() {
    return pendingOrders;
  }

  public void setPendingOrders(List<PendingOrder> pendingOrders) {
    this.pendingOrders = pendingOrders;
  }

  public ServiceLineTreatment accessLine(AccessLine accessLine) {
    this.accessLine = accessLine;
    return this;
  }

   /**
   * Get accessLine
   * @return accessLine
  **/


  public AccessLine getAccessLine() {
    return accessLine;
  }

  public void setAccessLine(AccessLine accessLine) {
    this.accessLine = accessLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLineTreatment serviceLineTreatment = (ServiceLineTreatment) o;
    return Objects.equals(this.parentIdentification, serviceLineTreatment.parentIdentification) &&
        Objects.equals(this.serviceType, serviceLineTreatment.serviceType) &&
        Objects.equals(this.serviceAction, serviceLineTreatment.serviceAction) &&
        Objects.equals(this.simValue, serviceLineTreatment.simValue) &&
        Objects.equals(this.lineInfo, serviceLineTreatment.lineInfo) &&
        Objects.equals(this.canNumberBeRetained, serviceLineTreatment.canNumberBeRetained) &&
        Objects.equals(this.portInFlag, serviceLineTreatment.portInFlag) &&
        Objects.equals(this.vicCode, serviceLineTreatment.vicCode) &&
        Objects.equals(this.pendingOrders, serviceLineTreatment.pendingOrders) &&
        Objects.equals(this.accessLine, serviceLineTreatment.accessLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentIdentification, serviceType, serviceAction, simValue, lineInfo, canNumberBeRetained, portInFlag, vicCode, pendingOrders, accessLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLineTreatment {\n");
    
    sb.append("    parentIdentification: ").append(toIndentedString(parentIdentification)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceAction: ").append(toIndentedString(serviceAction)).append("\n");
    sb.append("    simValue: ").append(toIndentedString(simValue)).append("\n");
    sb.append("    lineInfo: ").append(toIndentedString(lineInfo)).append("\n");
    sb.append("    canNumberBeRetained: ").append(toIndentedString(canNumberBeRetained)).append("\n");
    sb.append("    portInFlag: ").append(toIndentedString(portInFlag)).append("\n");
    sb.append("    vicCode: ").append(toIndentedString(vicCode)).append("\n");
    sb.append("    pendingOrders: ").append(toIndentedString(pendingOrders)).append("\n");
    sb.append("    accessLine: ").append(toIndentedString(accessLine)).append("\n");
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

