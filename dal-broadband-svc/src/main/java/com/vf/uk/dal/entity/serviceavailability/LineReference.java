package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineReference.
 */
public class LineReference {
	
	/** The landline number. */
	@JsonProperty("landlineNumber")
	private String landlineNumber = null;

	/** The address reference number. */
	@JsonProperty("addressReferenceNumber")
	private String addressReferenceNumber = null;

	/** The post code. */
	@JsonProperty("postCode")
	private String postCode = null;

	/** The line plant. */
	@JsonProperty("linePlant")
	private LinePlant linePlant = null;

	/** The line directory. */
	@JsonProperty("lineDirectory")
	private List<LineDirectory> lineDirectory = new ArrayList<>();

	/** The line locator. */
	@JsonProperty("lineLocator")
	private LineLocator lineLocator = null;

	/** The line settings. */
	@JsonProperty("lineSettings")
	private LineSettings lineSettings = null;

	/** The line status. */
	@JsonProperty("lineStatus")
	private LineStatus lineStatus = null;

	/** The available services. */
	@JsonProperty("availableServices")
	private AvailableServices availableServices = null;

	/** The unsupported services. */
	@JsonProperty("unsupportedServices")
	private UnsupportedServices unsupportedServices = null;

	/** The incompatible services. */
	@JsonProperty("incompatibleServices")
	private IncompatibleServices incompatibleServices = null;

	/**
	 * Landline number.
	 *
	 * @param landlineNumber the landline number
	 * @return the line reference
	 */
	public LineReference landlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
		return this;
	}

	/**
	 * The directory number currently associated with the copper pair Note: The
	 * Fixed Line Service Availability system returns the FLN only when FLN is
	 * passed in the input.
	 *
	 * @return landlineNumber
	 */
	public String getLandlineNumber() {
		return landlineNumber;
	}

	/**
	 * Sets the landline number.
	 *
	 * @param landlineNumber the new landline number
	 */
	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

	/**
	 * Address reference number.
	 *
	 * @param addressReferenceNumber the address reference number
	 * @return the line reference
	 */
	public LineReference addressReferenceNumber(String addressReferenceNumber) {
		this.addressReferenceNumber = addressReferenceNumber;
		return this;
	}

	/**
	 * This is the Wholesale address reference identifier that uniquely
	 * identifies the address in the Fixed Line or PostOffice system.
	 *
	 * @return addressReferenceNumber
	 */
	public String getAddressReferenceNumber() {
		return addressReferenceNumber;
	}

	/**
	 * Sets the address reference number.
	 *
	 * @param addressReferenceNumber the new address reference number
	 */
	public void setAddressReferenceNumber(String addressReferenceNumber) {
		this.addressReferenceNumber = addressReferenceNumber;
	}

	/**
	 * Post code.
	 *
	 * @param postCode the post code
	 * @return the line reference
	 */
	public LineReference postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	 * The postcode of the prospective customer as per the Fixed Line system.
	 *
	 * @return postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * Sets the post code.
	 *
	 * @param postCode the new post code
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * Line plant.
	 *
	 * @param linePlant the line plant
	 * @return the line reference
	 */
	public LineReference linePlant(LinePlant linePlant) {
		this.linePlant = linePlant;
		return this;
	}

	/**
	 * Get linePlant.
	 *
	 * @return linePlant
	 */
	public LinePlant getLinePlant() {
		return linePlant;
	}

	/**
	 * Sets the line plant.
	 *
	 * @param linePlant the new line plant
	 */
	public void setLinePlant(LinePlant linePlant) {
		this.linePlant = linePlant;
	}

	/**
	 * Line directory.
	 *
	 * @param lineDirectory the line directory
	 * @return the line reference
	 */
	public LineReference lineDirectory(List<LineDirectory> lineDirectory) {
		this.lineDirectory = lineDirectory;
		return this;
	}

	/**
	 * Adds the line directory item.
	 *
	 * @param lineDirectoryItem the line directory item
	 * @return the line reference
	 */
	public LineReference addLineDirectoryItem(LineDirectory lineDirectoryItem) {
		this.lineDirectory.add(lineDirectoryItem);
		return this;
	}

	/**
	 * Get lineDirectory.
	 *
	 * @return lineDirectory
	 */
	public List<LineDirectory> getLineDirectory() {
		return lineDirectory;
	}

	/**
	 * Sets the line directory.
	 *
	 * @param lineDirectory the new line directory
	 */
	public void setLineDirectory(List<LineDirectory> lineDirectory) {
		this.lineDirectory = lineDirectory;
	}

	/**
	 * Line locator.
	 *
	 * @param lineLocator the line locator
	 * @return the line reference
	 */
	public LineReference lineLocator(LineLocator lineLocator) {
		this.lineLocator = lineLocator;
		return this;
	}

	/**
	 * Get lineLocator.
	 *
	 * @return lineLocator
	 */
	public LineLocator getLineLocator() {
		return lineLocator;
	}

	/**
	 * Sets the line locator.
	 *
	 * @param lineLocator the new line locator
	 */
	public void setLineLocator(LineLocator lineLocator) {
		this.lineLocator = lineLocator;
	}

	/**
	 * Line settings.
	 *
	 * @param lineSettings the line settings
	 * @return the line reference
	 */
	public LineReference lineSettings(LineSettings lineSettings) {
		this.lineSettings = lineSettings;
		return this;
	}

	/**
	 * Get lineSettings.
	 *
	 * @return lineSettings
	 */
	public LineSettings getLineSettings() {
		return lineSettings;
	}

	/**
	 * Sets the line settings.
	 *
	 * @param lineSettings the new line settings
	 */
	public void setLineSettings(LineSettings lineSettings) {
		this.lineSettings = lineSettings;
	}

	/**
	 * Line status.
	 *
	 * @param lineStatus the line status
	 * @return the line reference
	 */
	public LineReference lineStatus(LineStatus lineStatus) {
		this.lineStatus = lineStatus;
		return this;
	}

	/**
	 * Get lineStatus.
	 *
	 * @return lineStatus
	 */
	public LineStatus getLineStatus() {
		return lineStatus;
	}

	/**
	 * Sets the line status.
	 *
	 * @param lineStatus the new line status
	 */
	public void setLineStatus(LineStatus lineStatus) {
		this.lineStatus = lineStatus;
	}

	/**
	 * Available services.
	 *
	 * @param availableServices the available services
	 * @return the line reference
	 */
	public LineReference availableServices(AvailableServices availableServices) {
		this.availableServices = availableServices;
		return this;
	}

	/**
	 * Get availableServices.
	 *
	 * @return availableServices
	 */
	public AvailableServices getAvailableServices() {
		return availableServices;
	}

	/**
	 * Sets the available services.
	 *
	 * @param availableServices the new available services
	 */
	public void setAvailableServices(AvailableServices availableServices) {
		this.availableServices = availableServices;
	}

	/**
	 * Unsupported services.
	 *
	 * @param unsupportedServices the unsupported services
	 * @return the line reference
	 */
	public LineReference unsupportedServices(UnsupportedServices unsupportedServices) {
		this.unsupportedServices = unsupportedServices;
		return this;
	}

	/**
	 * Get unsupportedServices.
	 *
	 * @return unsupportedServices
	 */
	public UnsupportedServices getUnsupportedServices() {
		return unsupportedServices;
	}

	/**
	 * Sets the unsupported services.
	 *
	 * @param unsupportedServices the new unsupported services
	 */
	public void setUnsupportedServices(UnsupportedServices unsupportedServices) {
		this.unsupportedServices = unsupportedServices;
	}

	/**
	 * Incompatible services.
	 *
	 * @param incompatibleServices the incompatible services
	 * @return the line reference
	 */
	public LineReference incompatibleServices(IncompatibleServices incompatibleServices) {
		this.incompatibleServices = incompatibleServices;
		return this;
	}

	/**
	 * Get incompatibleServices.
	 *
	 * @return incompatibleServices
	 */
	public IncompatibleServices getIncompatibleServices() {
		return incompatibleServices;
	}

	/**
	 * Sets the incompatible services.
	 *
	 * @param incompatibleServices the new incompatible services
	 */
	public void setIncompatibleServices(IncompatibleServices incompatibleServices) {
		this.incompatibleServices = incompatibleServices;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(landlineNumber, addressReferenceNumber, postCode, linePlant, lineDirectory, lineLocator,
				lineSettings, lineStatus, availableServices, unsupportedServices, incompatibleServices);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
