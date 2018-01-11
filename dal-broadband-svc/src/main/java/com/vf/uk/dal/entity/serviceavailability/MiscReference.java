package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MiscReference
 */

public class MiscReference {
	@JsonProperty("serviceProviderName")
	private String serviceProviderName = null;

	@JsonProperty("lineLength")
	private String lineLength = null;

	@JsonProperty("customerAgreedDate")
	private String customerAgreedDate = null;

	@JsonProperty("readyForServiceDate")
	private String readyForServiceDate = null;

	@JsonProperty("ANFP")
	private String anfp = null;

	public MiscReference serviceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
		return this;
	}

	/**
	 * Included when ADSL is already on the line, or when ADSL is being
	 * provided.
	 * 
	 * @return serviceProviderName
	 **/
	public String getServiceProviderName() {
		return serviceProviderName;
	}

	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	public MiscReference lineLength(String lineLength) {
		this.lineLength = lineLength;
		return this;
	}

	/**
	 * Estimate of the line length (in meters)
	 * 
	 * @return lineLength
	 **/
	public String getLineLength() {
		return lineLength;
	}

	public void setLineLength(String lineLength) {
		this.lineLength = lineLength;
	}

	public MiscReference customerAgreedDate(String customerAgreedDate) {
		this.customerAgreedDate = customerAgreedDate;
		return this;
	}

	/**
	 * Detailed when an ADSL provide or cease is in progress
	 * 
	 * @return customerAgreedDate
	 **/
	public String getCustomerAgreedDate() {
		return customerAgreedDate;
	}

	public void setCustomerAgreedDate(String customerAgreedDate) {
		this.customerAgreedDate = customerAgreedDate;
	}

	public MiscReference readyForServiceDate(String readyForServiceDate) {
		this.readyForServiceDate = readyForServiceDate;
		return this;
	}

	/**
	 * If GEA-FTTC is planned, but not yet enabled this field holds the Ready
	 * For Service date.
	 * 
	 * @return readyForServiceDate
	 **/
	public String getReadyForServiceDate() {
		return readyForServiceDate;
	}

	public void setReadyForServiceDate(String readyForServiceDate) {
		this.readyForServiceDate = readyForServiceDate;
	}

	

	/**
	 * The Access Network Frequency Plan. The DP category which describes the
	 * length of the line from the cabinet, and thereby providing a view on the
	 * services that are allowed to run.
	 * 
	 * @return ANFP
	 **/
	/**
	 * @return the anfp
	 */
	public String getAnfp() {
		return anfp;
	}

	/**
	 * @param anfp the anfp to set
	 */
	public void setAnfp(String anfp) {
		this.anfp = anfp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MiscReference miscReference = (MiscReference) o;
		return Objects.equals(this.serviceProviderName, miscReference.serviceProviderName)
				&& Objects.equals(this.lineLength, miscReference.lineLength)
				&& Objects.equals(this.customerAgreedDate, miscReference.customerAgreedDate)
				&& Objects.equals(this.readyForServiceDate, miscReference.readyForServiceDate)
				&& Objects.equals(this.anfp, miscReference.anfp);
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(serviceProviderName, lineLength, customerAgreedDate, readyForServiceDate, anfp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MiscReference {\n");

		sb.append("    serviceProviderName: ").append(toIndentedString(serviceProviderName)).append("\n");
		sb.append("    lineLength: ").append(toIndentedString(lineLength)).append("\n");
		sb.append("    customerAgreedDate: ").append(toIndentedString(customerAgreedDate)).append("\n");
		sb.append("    readyForServiceDate: ").append(toIndentedString(readyForServiceDate)).append("\n");
		sb.append("    ANFP: ").append(toIndentedString(anfp)).append("\n");
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
