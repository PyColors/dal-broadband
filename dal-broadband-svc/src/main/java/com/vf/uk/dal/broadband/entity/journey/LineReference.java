/*
 * Journey APIs
 * Journey APIs for Authenticated Journeys
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.vf.uk.dal.broadband.entity.journey;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LineReference
 */
public class LineReference {
  private InstallationAddress installationAddress = null;

  private LineLocator lineLocator = null;

  private LineSettings lineSettings = null;

  private LineStatus lineStatus = null;

  private AvailableServices availableServices = null;

  private List<LineDirectory> lineDirectory = null;

  /**
 * @param installationAddress
 * @return
 */
public LineReference installationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
    return this;
  }

   /**
   * Get installationAddress
   * @return installationAddress
  **/
  public InstallationAddress getInstallationAddress() {
    return installationAddress;
  }

  public void setInstallationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
  }

  /**
 * @param lineLocator
 * @return
 */
public LineReference lineLocator(LineLocator lineLocator) {
    this.lineLocator = lineLocator;
    return this;
  }

   /**
   * Get lineLocator
   * @return lineLocator
  **/
  public LineLocator getLineLocator() {
    return lineLocator;
  }

  public void setLineLocator(LineLocator lineLocator) {
    this.lineLocator = lineLocator;
  }

  /**
 * @param lineSettings
 * @return
 */
public LineReference lineSettings(LineSettings lineSettings) {
    this.lineSettings = lineSettings;
    return this;
  }

   /**
   * Get lineSettings
   * @return lineSettings
  **/
   
  public LineSettings getLineSettings() {
    return lineSettings;
  }

  public void setLineSettings(LineSettings lineSettings) {
    this.lineSettings = lineSettings;
  }

  /**
 * @param lineStatus
 * @return
 */
public LineReference lineStatus(LineStatus lineStatus) {
    this.lineStatus = lineStatus;
    return this;
  }

   /**
   * Get lineStatus
   * @return lineStatus
  **/
   
  public LineStatus getLineStatus() {
    return lineStatus;
  }

  public void setLineStatus(LineStatus lineStatus) {
    this.lineStatus = lineStatus;
  }

  /**
 * @param availableServices
 * @return
 */
public LineReference availableServices(AvailableServices availableServices) {
    this.availableServices = availableServices;
    return this;
  }

   /**
   * Get availableServices
   * @return availableServices
  **/
   
  public AvailableServices getAvailableServices() {
    return availableServices;
  }

  public void setAvailableServices(AvailableServices availableServices) {
    this.availableServices = availableServices;
  }

  /**
 * @param lineDirectory
 * @return
 */
public LineReference lineDirectory(List<LineDirectory> lineDirectory) {
    this.lineDirectory = lineDirectory;
    return this;
  }

  /**
 * @param lineDirectoryItem
 * @return
 */
public LineReference addLineDirectoryItem(LineDirectory lineDirectoryItem) {
    if (this.lineDirectory == null) {
      this.lineDirectory = new ArrayList<LineDirectory>();
    }
    this.lineDirectory.add(lineDirectoryItem);
    return this;
  }

   /**
   * Get lineDirectory
   * @return lineDirectory
  **/
   
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
    return Objects.equals(this.installationAddress, lineReference.installationAddress) &&
        Objects.equals(this.lineLocator, lineReference.lineLocator) &&
        Objects.equals(this.lineSettings, lineReference.lineSettings) &&
        Objects.equals(this.lineStatus, lineReference.lineStatus) &&
        Objects.equals(this.availableServices, lineReference.availableServices) &&
        Objects.equals(this.lineDirectory, lineReference.lineDirectory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installationAddress, lineLocator, lineSettings, lineStatus, availableServices, lineDirectory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineReference {\n");
    
    sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
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

