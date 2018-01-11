package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetServiceAvailibilityRequest
 */
public class GetServiceAvailibilityRequest{
	@JsonProperty("customerType")
	private CustomerTypeEnum customerType = null;

	@JsonProperty("landlineNumber")
	private String landlineNumber = null;

	@JsonProperty("moveFromPostCode")
	private String moveFromPostCode = null;

	@Valid
	@JsonProperty("installationAddress")
	private InstallationAddress installationAddress = null;

	/**
	 * Type of customer INDIVIDUAL or BUSINESS
	 * 
	 * @return customerType
	 **/
	public CustomerTypeEnum getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerTypeEnum customerType) {
		this.customerType = customerType;
	}

	public GetServiceAvailibilityRequest landlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
		return this;
	}

	/**
	 * Landline number
	 * 
	 * @return landlineNumber
	 **/
	public String getLandlineNumber() {
		return landlineNumber;
	}

	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

	public GetServiceAvailibilityRequest currentPostCode(String moveFromPostCode) {
		this.moveFromPostCode = moveFromPostCode;
		return this;
	}

	/**
	 * Specifies the post code from which the prospective customer is willing to
	 * move, Mandatory when InstallationAddress/MoveTypeCode=”ADDRESS_MOVE”
	 * 
	 * @return moveFromPostCode
	 **/
	public String getMoveFromPostCode() {
		return moveFromPostCode;
	}

	public void setMoveFromPostCode(String moveFromPostCode) {
		this.moveFromPostCode = moveFromPostCode;
	}

	public GetServiceAvailibilityRequest installationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
		return this;
	}

	/**
	 * Get installationAddress
	 * 
	 * @return installationAddress
	 **/
	public InstallationAddress getInstallationAddress() {
		return installationAddress;
	}

	public void setInstallationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetServiceAvailibilityRequest getServiceAvailibilityRequest = (GetServiceAvailibilityRequest) o;
		return Objects.equals(this.customerType, getServiceAvailibilityRequest.customerType)
				&& Objects.equals(this.landlineNumber, getServiceAvailibilityRequest.landlineNumber)
				&& Objects.equals(this.moveFromPostCode, getServiceAvailibilityRequest.moveFromPostCode)
				&& Objects.equals(this.installationAddress, getServiceAvailibilityRequest.installationAddress);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerType, landlineNumber, moveFromPostCode, installationAddress);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetServiceAvailibilityRequest {\n");

		sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
		sb.append("    landlineNumber: ").append(toIndentedString(landlineNumber)).append("\n");
		sb.append("    currentPostCode: ").append(toIndentedString(moveFromPostCode)).append("\n");
		sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
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
