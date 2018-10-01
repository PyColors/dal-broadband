package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceLineTreatment.
 */

public class ServiceLineTreatment {

	/** The line treatment type. */
	@JsonProperty("lineTreatmentType")
	private LineTreatmentTypeEnum lineTreatmentType = null;

	/** The access line ID. */
	@JsonProperty("accessLineID")
	private String accessLineID = null;

	/** The access line type. */
	@JsonProperty("accessLineType")
	private String accessLineType = null;

	/** The service type. */
	@JsonProperty("serviceType")
	private String serviceType = null;

	/** The service action. */
	@JsonProperty("serviceAction")
	private String serviceAction = null;

	/** The SIM 2 value. */
	@JsonProperty("SIM2Value")
	private String SIM2Value = null;

	/** The line info. */
	@JsonProperty("lineInfo")
	private String lineInfo = null;

	/** The can number be retained. */
	@JsonProperty("canNumberBeRetained")
	private Boolean canNumberBeRetained = null;

	/** The port in flag. */
	@JsonProperty("portInFlag")
	private String portInFlag = null;

	/** The vi C code. */
	@JsonProperty("VICCode")
	private String viCCode = null;

	/** The pending order. */
	@JsonProperty("pendingOrder")
	private List<PendingOrder> pendingOrder = new ArrayList<>();

	/** The note. */
	@JsonProperty("note")
	private String note = null;

	/**
	 * Line treatment type.
	 *
	 * @param lineTreatmentType the line treatment type
	 * @return the service line treatment
	 */
	public ServiceLineTreatment lineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
		return this;
	}

	/**
	 * Type of line treatment.
	 *
	 * @return lineTreatmentType
	 */
	public LineTreatmentTypeEnum getLineTreatmentType() {
		return lineTreatmentType;
	}

	/**
	 * Sets the line treatment type.
	 *
	 * @param lineTreatmentType the new line treatment type
	 */
	public void setLineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	/**
	 * Access line ID.
	 *
	 * @param accessLineID the access line ID
	 * @return the service line treatment
	 */
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

	/**
	 * Sets the access line ID.
	 *
	 * @param accessLineID the new access line ID
	 */
	public void setAccessLineID(String accessLineID) {
		this.accessLineID = accessLineID;
	}

	/**
	 * Access line type.
	 *
	 * @param accessLineType the access line type
	 * @return the service line treatment
	 */
	public ServiceLineTreatment accessLineType(String accessLineType) {
		this.accessLineType = accessLineType;
		return this;
	}

	/**
	 * Indicates that the above field contains Access Line ID PSTN_ACCESSLINE –
	 * Indicates a Working PSTN MPF_ACCESSLINE – Indicates a Working MPF
	 * STOPPED_PSTN_ACCESSLINE – Indicates a Stopped PSTN STOPPED_MPF_ACCESSLINE
	 * – Indicates a Stopped MPF.
	 *
	 * @return accessLineType
	 */
	public String getAccessLineType() {
		return accessLineType;
	}

	/**
	 * Sets the access line type.
	 *
	 * @param accessLineType the new access line type
	 */
	public void setAccessLineType(String accessLineType) {
		this.accessLineType = accessLineType;
	}

	/**
	 * Service type.
	 *
	 * @param serviceType the service type
	 * @return the service line treatment
	 */
	public ServiceLineTreatment serviceType(String serviceType) {
		this.serviceType = serviceType;
		return this;
	}

	/**
	 * Type of the service or product that is offered.
	 *
	 * @return serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * Sets the service type.
	 *
	 * @param serviceType the new service type
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * Service action.
	 *
	 * @param serviceAction the service action
	 * @return the service line treatment
	 */
	public ServiceLineTreatment serviceAction(String serviceAction) {
		this.serviceAction = serviceAction;
		return this;
	}

	/**
	 * Identifies the action that needs to be applied to the line Provide –
	 * Provide new service Transfer – Transfer service at the same address
	 * TransferAndAddressMove – Transfer service in addition to change of
	 * address.
	 *
	 * @return serviceAction
	 */
	public String getServiceAction() {
		return serviceAction;
	}

	/**
	 * Sets the service action.
	 *
	 * @param serviceAction the new service action
	 */
	public void setServiceAction(String serviceAction) {
		this.serviceAction = serviceAction;
	}

	

	/**
	 * Line info.
	 *
	 * @param lineInfo the line info
	 * @return the service line treatment
	 */
	public ServiceLineTreatment lineInfo(String lineInfo) {
		this.lineInfo = lineInfo;
		return this;
	}

	/**
	 * Information given to the agent regarding the treatment of the line.
	 *
	 * @return lineInfo
	 */
	public String getLineInfo() {
		return lineInfo;
	}

	/**
	 * Sets the line info.
	 *
	 * @param lineInfo the new line info
	 */
	public void setLineInfo(String lineInfo) {
		this.lineInfo = lineInfo;
	}

	/**
	 * Can number be retained.
	 *
	 * @param canNumberBeRetained the can number be retained
	 * @return the service line treatment
	 */
	public ServiceLineTreatment canNumberBeRetained(Boolean canNumberBeRetained) {
		this.canNumberBeRetained = canNumberBeRetained;
		return this;
	}

	/**
	 * Flag specifying if the existing FTN can be retained or not.
	 *
	 * @return canNumberBeRetained
	 */
	public Boolean getCanNumberBeRetained() {
		return canNumberBeRetained;
	}

	/**
	 * Sets the can number be retained.
	 *
	 * @param canNumberBeRetained the new can number be retained
	 */
	public void setCanNumberBeRetained(Boolean canNumberBeRetained) {
		this.canNumberBeRetained = canNumberBeRetained;
	}

	/**
	 * Port in flag.
	 *
	 * @param portInFlag the port in flag
	 * @return the service line treatment
	 */
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

	/**
	 * Sets the port in flag.
	 *
	 * @param portInFlag the new port in flag
	 */
	public void setPortInFlag(String portInFlag) {
		this.portInFlag = portInFlag;
	}

	/**
	 * Vi C code.
	 *
	 * @param viCCode the vi C code
	 * @return the service line treatment
	 */
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

	/**
	 * Sets the vi C code.
	 *
	 * @param viCCode the new vi C code
	 */
	public void setViCCode(String viCCode) {
		this.viCCode = viCCode;
	}

	/**
	 * Pending order.
	 *
	 * @param pendingOrder the pending order
	 * @return the service line treatment
	 */
	public ServiceLineTreatment pendingOrder(List<PendingOrder> pendingOrder) {
		this.pendingOrder = pendingOrder;
		return this;
	}

	/**
	 * Adds the pending order item.
	 *
	 * @param pendingOrderItem the pending order item
	 * @return the service line treatment
	 */
	public ServiceLineTreatment addPendingOrderItem(PendingOrder pendingOrderItem) {
		this.pendingOrder.add(pendingOrderItem);
		return this;
	}

	/**
	 * Get pendingOrder.
	 *
	 * @return pendingOrder
	 */
	public List<PendingOrder> getPendingOrder() {
		return pendingOrder;
	}

	/**
	 * Sets the pending order.
	 *
	 * @param pendingOrder the new pending order
	 */
	public void setPendingOrder(List<PendingOrder> pendingOrder) {
		this.pendingOrder = pendingOrder;
	}

	/**
	 * Note.
	 *
	 * @param note the note
	 * @return the service line treatment
	 */
	public ServiceLineTreatment note(String note) {
		this.note = note;
		return this;
	}

	/**
	 * Notes, if any, for the current treatment block.
	 *
	 * @return note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * Sets the note.
	 *
	 * @param note the new note
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * Gets the SIM 2 value.
	 *
	 * @return the SIM 2 value
	 */
	public String getSIM2Value() {
		return SIM2Value;
	}

	/**
	 * Sets the SIM 2 value.
	 *
	 * @param sIM2Value the new SIM 2 value
	 */
	public void setSIM2Value(String sIM2Value) {
		SIM2Value = sIM2Value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(lineTreatmentType, accessLineID, accessLineType, serviceType, serviceAction, SIM2Value,
				lineInfo, canNumberBeRetained, portInFlag, viCCode, pendingOrder, note);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
	 *
	 * @param o the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
