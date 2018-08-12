package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ServiceLineTreatment.
 */
public class ServiceLineTreatment implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2146581389765169469L;
	
	/** The Constant PARENTIDENTIFICATION. */
	private static final String PARENT_IDENTIFICATION = "parentIdentification";
	
	/** The Constant ACCESSLINE. */
	private static final String ACCESS_LINE = "accessLine";
	
	/** The Constant SERVICETYPE. */
	private static final String SERVICE_TYPE = "serviceType";
	
	/** The Constant SERVICEACTION. */
	private static final String SERVICE_ACTION = "serviceAction";
	
	/** The Constant SIM2VALUE. */
	private static final String SIM2_VALUE = "sIM2Value";
	
	/** The Constant LINEINFO. */
	private static final String LINE_INFO = "lineInfo";
	
	/** The Constant CANNUMBERBERETAINED. */
	private static final String CANNUMBERBE_RETAINED = "canNumberBeRetained";
	
	/** The Constant PORTINFLAG. */
	private static final String PORTIN_FLAG = "portInFlag";
	
	/** The Constant VICCODE. */
	private static final String VIC_CODE = "vicCode";
	
	/** The Constant PENDINGORDERS. */
	private static final String PENDING_ORDERS = "pendingOrders";
	
	/** The parent identification. */
	@JsonProperty(PARENT_IDENTIFICATION)
	private String parentIdentification;
	
	/** The access line. */
	@JsonProperty(ACCESS_LINE)
	private AccessLine accessLine;
	
	/** The service type. */
	@JsonProperty(SERVICE_TYPE)
	private String serviceType;
	
	/** The service action. */
	@JsonProperty(SERVICE_ACTION)
	private String serviceAction;
	
	/** The s IM 2 value. */
	@JsonProperty(SIM2_VALUE)
	private String sIM2Value;
	
	/** The line info. */
	@JsonProperty(LINE_INFO)
	private String lineInfo;
	
	/** The can number be retained. */
	@JsonProperty(CANNUMBERBE_RETAINED)
	private boolean canNumberBeRetained;
	
	/** The Port in flag. */
	@JsonProperty(PORTIN_FLAG)
	private String portInFlag;
	
	/** The v IC code. */
	@JsonProperty(VIC_CODE)
	private String vicCode;
	
	/** The pending orders. */
	@JsonProperty(PENDING_ORDERS)
	private List<PendingOrder> pendingOrders = new ArrayList<>();
	
	/**
	 * Gets the parent identification.
	 *
	 * @return the parent identification
	 */
	public String getParentIdentification() {
		return parentIdentification;
	}
	
	/**
	 * Sets the parent identification.
	 *
	 * @param parentIdentification the new parent identification
	 */
	public void setParentIdentification(String parentIdentification) {
		this.parentIdentification = parentIdentification;
	}
	
	/**
	 * Gets the access line.
	 *
	 * @return the access line
	 */
	public AccessLine getAccessLine() {
		return accessLine;
	}
	
	/**
	 * Sets the access line.
	 *
	 * @param accessLine the new access line
	 */
	public void setAccessLine(AccessLine accessLine) {
		this.accessLine = accessLine;
	}
	
	/**
	 * Gets the service type.
	 *
	 * @return the service type
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
	 * Gets the service action.
	 *
	 * @return the service action
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
	 * Gets the s IM 2 value.
	 *
	 * @return the s IM 2 value
	 */
	public String getsIM2Value() {
		return sIM2Value;
	}
	
	/**
	 * Sets the s IM 2 value.
	 *
	 * @param sIM2Value the new s IM 2 value
	 */
	public void setsIM2Value(String sIM2Value) {
		this.sIM2Value = sIM2Value;
	}
	
	/**
	 * Gets the line info.
	 *
	 * @return the line info
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
	 * Gets the can number be retained.
	 *
	 * @return the can number be retained
	 */
	
	
	/**
	 * Gets the port in flag.
	 *
	 * @return the port in flag
	 */
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
	 * Gets the v IC code.
	 *
	 * @return the v IC code
	 */
	public String getVicCode() {
		return vicCode;
	}
	
	/**
	 * Sets the v IC code.
	 *
	 * @param vICCode the new v IC code
	 */
	public void setVicCode(String vicCode) {
		this.vicCode = vicCode;
	}
	
	/**
	 * Gets the pending orders.
	 *
	 * @return the pending orders
	 */
	public List<PendingOrder> getPendingOrders() {
		return pendingOrders;
	}
	
	/**
	 * Sets the pending orders.
	 *
	 * @param pendingOrders the new pending orders
	 */
	public void setPendingOrders(List<PendingOrder> pendingOrders) {
		this.pendingOrders = pendingOrders;
	}
	
	

	public boolean isCanNumberBeRetained() {
		return canNumberBeRetained;
	}

	public void setCanNumberBeRetained(boolean canNumberBeRetained) {
		this.canNumberBeRetained = canNumberBeRetained;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessLine == null) ? 0 : accessLine.hashCode());
		result = prime * result + ((portInFlag == null) ? 0 : portInFlag.hashCode());
		result = prime * result + ((lineInfo == null) ? 0 : lineInfo.hashCode());
		result = prime * result + ((parentIdentification == null) ? 0 : parentIdentification.hashCode());
		result = prime * result + ((pendingOrders == null) ? 0 : pendingOrders.hashCode());
		result = prime * result + ((sIM2Value == null) ? 0 : sIM2Value.hashCode());
		result = prime * result + ((serviceAction == null) ? 0 : serviceAction.hashCode());
		result = prime * result + ((serviceType == null) ? 0 : serviceType.hashCode());
		result = prime * result + ((vicCode == null) ? 0 : vicCode.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceLineTreatment other = (ServiceLineTreatment) obj;
		if (accessLine == null) {
			if (other.accessLine != null)
				return false;
		} else if (!accessLine.equals(other.accessLine))
			return false;
		if (portInFlag == null) {
			if (other.portInFlag != null)
				return false;
		} else if (!portInFlag.equals(other.portInFlag))
			return false;
		
		if (lineInfo == null) {
			if (other.lineInfo != null)
				return false;
		} else if (!lineInfo.equals(other.lineInfo))
			return false;
		if (parentIdentification == null) {
			if (other.parentIdentification != null)
				return false;
		} else if (!parentIdentification.equals(other.parentIdentification))
			return false;
		if (pendingOrders == null) {
			if (other.pendingOrders != null)
				return false;
		} else if (!pendingOrders.equals(other.pendingOrders))
			return false;
		if (sIM2Value == null) {
			if (other.sIM2Value != null)
				return false;
		} else if (!sIM2Value.equals(other.sIM2Value))
			return false;
		if (serviceAction == null) {
			if (other.serviceAction != null)
				return false;
		} else if (!serviceAction.equals(other.serviceAction))
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
			return false;
		if (vicCode == null) {
			if (other.vicCode != null)
				return false;
		} else if (!vicCode.equals(other.vicCode))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServiceLineTreatment [parentIdentification=" + parentIdentification + ", AccessLine=" + accessLine
				+ ", serviceType=" + serviceType + ", serviceAction=" + serviceAction + ", sIM2Value=" + sIM2Value
				+ ", lineInfo=" + lineInfo + ", canNumberBeRetained=" + canNumberBeRetained + ", PortInFlag="
				+ portInFlag + ", vICCode=" + vicCode + ", pendingOrders=" + pendingOrders + "]";
	}
	
	
}
