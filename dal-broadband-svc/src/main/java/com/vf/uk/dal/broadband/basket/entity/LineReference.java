package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

/**
 * LineReference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-25T06:31:48.127Z")

public class LineReference {
	private LineLocator lineLocator = null;

	private LineSettings lineSettings = null;

	private LineStatus lineStatus = null;

	private AvailableServices availableServices = null;

	private List<LineDirectory> lineDirectory = null;

	public LineReference lineLocator(LineLocator lineLocator) {
		this.lineLocator = lineLocator;
		return this;
	}

	/**
	 * Get lineLocator
	 * 
	 * @return lineLocator
	 **/

	@Valid

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

	@Valid

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

	@Valid

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

	@Valid

	public AvailableServices getAvailableServices() {
		return availableServices;
	}

	public void setAvailableServices(AvailableServices availableServices) {
		this.availableServices = availableServices;
	}

	public LineReference lineDirectory(List<LineDirectory> lineDirectory) {
		this.lineDirectory = lineDirectory;
		return this;
	}

	public LineReference addLineDirectoryItem(LineDirectory lineDirectoryItem) {
		if (this.lineDirectory == null) {
			this.lineDirectory = new ArrayList<LineDirectory>();
		}
		this.lineDirectory.add(lineDirectoryItem);
		return this;
	}

	/**
	 * Get lineDirectory
	 * 
	 * @return lineDirectory
	 **/

	@Valid

	public List<LineDirectory> getLineDirectory() {
		return lineDirectory;
	}

	public void setLineDirectory(List<LineDirectory> lineDirectory) {
		this.lineDirectory = lineDirectory;
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
		return Objects.equals(this.lineLocator, lineReference.lineLocator)
				&& Objects.equals(this.lineSettings, lineReference.lineSettings)
				&& Objects.equals(this.lineStatus, lineReference.lineStatus)
				&& Objects.equals(this.availableServices, lineReference.availableServices)
				&& Objects.equals(this.lineDirectory, lineReference.lineDirectory);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineLocator, lineSettings, lineStatus, availableServices, lineDirectory);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineReference {\n");

		sb.append("    lineLocator: ").append(toIndentedString(lineLocator)).append("\n");
		sb.append("    lineSettings: ").append(toIndentedString(lineSettings)).append("\n");
		sb.append("    lineStatus: ").append(toIndentedString(lineStatus)).append("\n");
		sb.append("    availableServices: ").append(toIndentedString(availableServices)).append("\n");
		sb.append("    lineDirectory: ").append(toIndentedString(lineDirectory)).append("\n");
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
