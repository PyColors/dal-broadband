package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineReference
 */
public class LineReference {
	@JsonProperty("landlineNumber")
	private String landlineNumber = null;

	@JsonProperty("addressReferenceNumber")
	private String addressReferenceNumber = null;

	@JsonProperty("postCode")
	private String postCode = null;

	@JsonProperty("linePlant")
	private LinePlant linePlant = null;

	@JsonProperty("lineDirectory")
	private List<LineDirectory> lineDirectory = new ArrayList<>();

	@JsonProperty("lineLocator")
	private LineLocator lineLocator = null;

	@JsonProperty("lineSettings")
	private LineSettings lineSettings = null;

	@JsonProperty("lineStatus")
	private LineStatus lineStatus = null;

	@JsonProperty("availableServices")
	private AvailableServices availableServices = null;

	@JsonProperty("unsupportedServices")
	private UnsupportedServices unsupportedServices = null;

	@JsonProperty("incompatibleServices")
	private IncompatibleServices incompatibleServices = null;

	public LineReference landlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
		return this;
	}

	/**
	 * The directory number currently associated with the copper pair Note: The
	 * Fixed Line Service Availability system returns the FLN only when FLN is
	 * passed in the input
	 * 
	 * @return landlineNumber
	 **/
	public String getLandlineNumber() {
		return landlineNumber;
	}

	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

	public LineReference addressReferenceNumber(String addressReferenceNumber) {
		this.addressReferenceNumber = addressReferenceNumber;
		return this;
	}

	/**
	 * This is the Wholesale address reference identifier that uniquely
	 * identifies the address in the Fixed Line or PostOffice system
	 * 
	 * @return addressReferenceNumber
	 **/
	public String getAddressReferenceNumber() {
		return addressReferenceNumber;
	}

	public void setAddressReferenceNumber(String addressReferenceNumber) {
		this.addressReferenceNumber = addressReferenceNumber;
	}

	public LineReference postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	 * The postcode of the prospective customer as per the Fixed Line system
	 * 
	 * @return postCode
	 **/
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public LineReference linePlant(LinePlant linePlant) {
		this.linePlant = linePlant;
		return this;
	}

	/**
	 * Get linePlant
	 * 
	 * @return linePlant
	 **/
	public LinePlant getLinePlant() {
		return linePlant;
	}

	public void setLinePlant(LinePlant linePlant) {
		this.linePlant = linePlant;
	}

	public LineReference lineDirectory(List<LineDirectory> lineDirectory) {
		this.lineDirectory = lineDirectory;
		return this;
	}

	public LineReference addLineDirectoryItem(LineDirectory lineDirectoryItem) {
		this.lineDirectory.add(lineDirectoryItem);
		return this;
	}

	/**
	 * Get lineDirectory
	 * 
	 * @return lineDirectory
	 **/
	public List<LineDirectory> getLineDirectory() {
		return lineDirectory;
	}

	public void setLineDirectory(List<LineDirectory> lineDirectory) {
		this.lineDirectory = lineDirectory;
	}

	public LineReference lineLocator(LineLocator lineLocator) {
		this.lineLocator = lineLocator;
		return this;
	}

	/**
	 * Get lineLocator
	 * 
	 * @return lineLocator
	 **/
	public LineLocator getLineLocator() {
		return lineLocator;
	}

	public void setLineLocator(LineLocator lineLocator) {
		this.lineLocator = lineLocator;
	}

	public LineReference lineSettings(LineSettings lineSettings) {
		this.lineSettings = lineSettings;
		return this;
	}

	/**
	 * Get lineSettings
	 * 
	 * @return lineSettings
	 **/
	public LineSettings getLineSettings() {
		return lineSettings;
	}

	public void setLineSettings(LineSettings lineSettings) {
		this.lineSettings = lineSettings;
	}

	public LineReference lineStatus(LineStatus lineStatus) {
		this.lineStatus = lineStatus;
		return this;
	}

	/**
	 * Get lineStatus
	 * 
	 * @return lineStatus
	 **/
	public LineStatus getLineStatus() {
		return lineStatus;
	}

	public void setLineStatus(LineStatus lineStatus) {
		this.lineStatus = lineStatus;
	}

	public LineReference availableServices(AvailableServices availableServices) {
		this.availableServices = availableServices;
		return this;
	}

	/**
	 * Get availableServices
	 * 
	 * @return availableServices
	 **/
	public AvailableServices getAvailableServices() {
		return availableServices;
	}

	public void setAvailableServices(AvailableServices availableServices) {
		this.availableServices = availableServices;
	}

	public LineReference unsupportedServices(UnsupportedServices unsupportedServices) {
		this.unsupportedServices = unsupportedServices;
		return this;
	}

	/**
	 * Get unsupportedServices
	 * 
	 * @return unsupportedServices
	 **/
	public UnsupportedServices getUnsupportedServices() {
		return unsupportedServices;
	}

	public void setUnsupportedServices(UnsupportedServices unsupportedServices) {
		this.unsupportedServices = unsupportedServices;
	}

	public LineReference incompatibleServices(IncompatibleServices incompatibleServices) {
		this.incompatibleServices = incompatibleServices;
		return this;
	}

	/**
	 * Get incompatibleServices
	 * 
	 * @return incompatibleServices
	 **/
	public IncompatibleServices getIncompatibleServices() {
		return incompatibleServices;
	}

	public void setIncompatibleServices(IncompatibleServices incompatibleServices) {
		this.incompatibleServices = incompatibleServices;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineReference lineReference = (LineReference) o;
		return Objects.equals(this.landlineNumber, lineReference.landlineNumber)
				&& Objects.equals(this.addressReferenceNumber, lineReference.addressReferenceNumber)
				&& Objects.equals(this.postCode, lineReference.postCode)
				&& Objects.equals(this.linePlant, lineReference.linePlant)
				&& Objects.equals(this.lineDirectory, lineReference.lineDirectory)
				&& Objects.equals(this.lineLocator, lineReference.lineLocator)
				&& Objects.equals(this.lineSettings, lineReference.lineSettings)
				&& Objects.equals(this.lineStatus, lineReference.lineStatus)
				&& Objects.equals(this.availableServices, lineReference.availableServices)
				&& Objects.equals(this.unsupportedServices, lineReference.unsupportedServices)
				&& Objects.equals(this.incompatibleServices, lineReference.incompatibleServices);
	}

	@Override
	public int hashCode() {
		return Objects.hash(landlineNumber, addressReferenceNumber, postCode, linePlant, lineDirectory, lineLocator,
				lineSettings, lineStatus, availableServices, unsupportedServices, incompatibleServices);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineReference {\n");

		sb.append("    landlineNumber: ").append(toIndentedString(landlineNumber)).append("\n");
		sb.append("    addressReferenceNumber: ").append(toIndentedString(addressReferenceNumber)).append("\n");
		sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
		sb.append("    linePlant: ").append(toIndentedString(linePlant)).append("\n");
		sb.append("    lineDirectory: ").append(toIndentedString(lineDirectory)).append("\n");
		sb.append("    lineLocator: ").append(toIndentedString(lineLocator)).append("\n");
		sb.append("    lineSettings: ").append(toIndentedString(lineSettings)).append("\n");
		sb.append("    lineStatus: ").append(toIndentedString(lineStatus)).append("\n");
		sb.append("    availableServices: ").append(toIndentedString(availableServices)).append("\n");
		sb.append("    unsupportedServices: ").append(toIndentedString(unsupportedServices)).append("\n");
		sb.append("    incompatibleServices: ").append(toIndentedString(incompatibleServices)).append("\n");
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
