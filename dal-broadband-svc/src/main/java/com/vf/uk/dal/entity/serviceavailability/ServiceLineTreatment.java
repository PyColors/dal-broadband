package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceLineTreatment
 */

public class ServiceLineTreatment {

	@JsonProperty("lineTreatmentType")
	private LineTreatmentTypeEnum lineTreatmentType = null;

	@JsonProperty("accessLineID")
	private String accessLineID = null;

	@JsonProperty("accessLineType")
	private String accessLineType = null;

	@JsonProperty("serviceType")
	private String serviceType = null;

	@JsonProperty("serviceAction")
	private String serviceAction = null;

	@JsonProperty("SIM2Value")
	private String SIM2Value = null;

	@JsonProperty("lineInfo")
	private String lineInfo = null;

	@JsonProperty("canNumberBeRetained")
	private Boolean canNumberBeRetained = null;

	@JsonProperty("portInFlag")
	private String portInFlag = null;

	@JsonProperty("VICCode")
	private String viCCode = null;

	@JsonProperty("pendingOrder")
	private List<PendingOrder> pendingOrder = new ArrayList<>();

	@JsonProperty("note")
	private String note = null;

	public ServiceLineTreatment lineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
		return this;
	}

	/**
	 * Type of line treatment
	 * 
	 * @return lineTreatmentType
	 **/
	public LineTreatmentTypeEnum getLineTreatmentType() {
		return lineTreatmentType;
	}

	public void setLineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	public ServiceLineTreatment accessLineID(String accessLineID) {
		this.accessLineID = accessLineID;
		return this;
	}

	/**
	 * A unique identifier for copper line. This field can be used as an
	 * alternative means of identifying a working line
	 * 
	 * @return accessLineID
	 **/
	public String getAccessLineID() {
		return accessLineID;
	}

	public void setAccessLineID(String accessLineID) {
		this.accessLineID = accessLineID;
	}

	public ServiceLineTreatment accessLineType(String accessLineType) {
		this.accessLineType = accessLineType;
		return this;
	}

	/**
	 * Indicates that the above field contains Access Line ID PSTN_ACCESSLINE –
	 * Indicates a Working PSTN MPF_ACCESSLINE – Indicates a Working MPF
	 * STOPPED_PSTN_ACCESSLINE – Indicates a Stopped PSTN STOPPED_MPF_ACCESSLINE
	 * – Indicates a Stopped MPF
	 * 
	 * @return accessLineType
	 **/
	public String getAccessLineType() {
		return accessLineType;
	}

	public void setAccessLineType(String accessLineType) {
		this.accessLineType = accessLineType;
	}

	public ServiceLineTreatment serviceType(String serviceType) {
		this.serviceType = serviceType;
		return this;
	}

	/**
	 * Type of the service or product that is offered
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
	 * Identifies the action that needs to be applied to the line Provide –
	 * Provide new service Transfer – Transfer service at the same address
	 * TransferAndAddressMove – Transfer service in addition to change of
	 * address
	 * 
	 * @return serviceAction
	 **/
	public String getServiceAction() {
		return serviceAction;
	}

	public void setServiceAction(String serviceAction) {
		this.serviceAction = serviceAction;
	}

	

	public ServiceLineTreatment lineInfo(String lineInfo) {
		this.lineInfo = lineInfo;
		return this;
	}

	/**
	 * Information given to the agent regarding the treatment of the line
	 * 
	 * @return lineInfo
	 **/
	public String getLineInfo() {
		return lineInfo;
	}

	public void setLineInfo(String lineInfo) {
		this.lineInfo = lineInfo;
	}

	public ServiceLineTreatment canNumberBeRetained(Boolean canNumberBeRetained) {
		this.canNumberBeRetained = canNumberBeRetained;
		return this;
	}

	/**
	 * Flag specifying if the existing FTN can be retained or not
	 * 
	 * @return canNumberBeRetained
	 **/
	public Boolean getCanNumberBeRetained() {
		return canNumberBeRetained;
	}

	public void setCanNumberBeRetained(Boolean canNumberBeRetained) {
		this.canNumberBeRetained = canNumberBeRetained;
	}

	public ServiceLineTreatment portInFlag(String portInFlag) {
		this.portInFlag = portInFlag;
		return this;
	}

	/**
	 * A flag which specifies how the number needs to be ported in.
	 * 
	 * @return portInFlag
	 **/
	public String getPortInFlag() {
		return portInFlag;
	}

	public void setPortInFlag(String portInFlag) {
		this.portInFlag = portInFlag;
	}

	public ServiceLineTreatment viCCode(String viCCode) {
		this.viCCode = viCCode;
		return this;
	}

	/**
	 * An identifier issued to allow an import to occur.
	 * 
	 * @return viCCode
	 **/
	public String getViCCode() {
		return viCCode;
	}

	public void setViCCode(String viCCode) {
		this.viCCode = viCCode;
	}

	public ServiceLineTreatment pendingOrder(List<PendingOrder> pendingOrder) {
		this.pendingOrder = pendingOrder;
		return this;
	}

	public ServiceLineTreatment addPendingOrderItem(PendingOrder pendingOrderItem) {
		this.pendingOrder.add(pendingOrderItem);
		return this;
	}

	/**
	 * Get pendingOrder
	 * 
	 * @return pendingOrder
	 **/
	public List<PendingOrder> getPendingOrder() {
		return pendingOrder;
	}

	public void setPendingOrder(List<PendingOrder> pendingOrder) {
		this.pendingOrder = pendingOrder;
	}

	public ServiceLineTreatment note(String note) {
		this.note = note;
		return this;
	}

	/**
	 * Notes, if any, for the current treatment block
	 * 
	 * @return note
	 **/
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSIM2Value() {
		return SIM2Value;
	}

	public void setSIM2Value(String sIM2Value) {
		SIM2Value = sIM2Value;
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
		return Objects.equals(this.lineTreatmentType, serviceLineTreatment.lineTreatmentType)
				&& Objects.equals(this.accessLineID, serviceLineTreatment.accessLineID)
				&& Objects.equals(this.accessLineType, serviceLineTreatment.accessLineType)
				&& Objects.equals(this.serviceType, serviceLineTreatment.serviceType)
				&& Objects.equals(this.serviceAction, serviceLineTreatment.serviceAction)
				&& Objects.equals(this.SIM2Value, serviceLineTreatment.SIM2Value)
				&& Objects.equals(this.lineInfo, serviceLineTreatment.lineInfo)
				&& Objects.equals(this.canNumberBeRetained, serviceLineTreatment.canNumberBeRetained)
				&& Objects.equals(this.portInFlag, serviceLineTreatment.portInFlag)
				&& Objects.equals(this.viCCode, serviceLineTreatment.viCCode)
				&& Objects.equals(this.pendingOrder, serviceLineTreatment.pendingOrder)
				&& Objects.equals(this.note, serviceLineTreatment.note);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineTreatmentType, accessLineID, accessLineType, serviceType, serviceAction, SIM2Value,
				lineInfo, canNumberBeRetained, portInFlag, viCCode, pendingOrder, note);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceLineTreatment {\n");

		sb.append("    lineTreatmentType: ").append(toIndentedString(lineTreatmentType)).append("\n");
		sb.append("    accessLineID: ").append(toIndentedString(accessLineID)).append("\n");
		sb.append("    accessLineType: ").append(toIndentedString(accessLineType)).append("\n");
		sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
		sb.append("    serviceAction: ").append(toIndentedString(serviceAction)).append("\n");
		sb.append("    siM2Value: ").append(toIndentedString(SIM2Value)).append("\n");
		sb.append("    lineInfo: ").append(toIndentedString(lineInfo)).append("\n");
		sb.append("    canNumberBeRetained: ").append(toIndentedString(canNumberBeRetained)).append("\n");
		sb.append("    portInFlag: ").append(toIndentedString(portInFlag)).append("\n");
		sb.append("    viCCode: ").append(toIndentedString(viCCode)).append("\n");
		sb.append("    pendingOrder: ").append(toIndentedString(pendingOrder)).append("\n");
		sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
