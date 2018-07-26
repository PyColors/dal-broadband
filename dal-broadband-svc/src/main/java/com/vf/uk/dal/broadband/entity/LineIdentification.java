package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineIdentification.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class LineIdentification   {
  
  /** The fllandline number. */
  @JsonProperty("fllandlineNumber")
  private String fllandlineNumber = null;

  /** The type code. */
  @JsonProperty("typeCode")
  private String typeCode = null;

  /** The service classification code. */
  @JsonProperty("serviceClassificationCode")
  private String serviceClassificationCode = null;

  /** The move from post code. */
  @JsonProperty("moveFromPostCode")
  private String moveFromPostCode = null;

  /** The installation address. */
  @JsonProperty("installationAddress")
  private InstallationAddress installationAddress = null;

  /**
   * Fllandline number.
   *
   * @param fllandlineNumber the fllandline number
   * @return the line identification
   */
  public LineIdentification fllandlineNumber(String fllandlineNumber) {
    this.fllandlineNumber = fllandlineNumber;
    return this;
  }

   /**
    * The directory number currently associated with the copper pair.
    *
    * @return fllandlineNumber
    */
  @ApiModelProperty(value = "The directory number currently associated with the copper pair")


  public String getFllandlineNumber() {
    return fllandlineNumber;
  }

  /**
   * Sets the fllandline number.
   *
   * @param fllandlineNumber the new fllandline number
   */
  public void setFllandlineNumber(String fllandlineNumber) {
    this.fllandlineNumber = fllandlineNumber;
  }

  /**
   * Type code.
   *
   * @param typeCode the type code
   * @return the line identification
   */
  public LineIdentification typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

   /**
    * Flag that identifies the type of Business Customer.
    *
    * @return typeCode
    */
  @ApiModelProperty(value = "Flag that identifies the type of Business Customer")


  public String getTypeCode() {
    return typeCode;
  }

  /**
   * Sets the type code.
   *
   * @param typeCode the new type code
   */
  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  /**
   * Service classification code.
   *
   * @param serviceClassificationCode the service classification code
   * @return the line identification
   */
  public LineIdentification serviceClassificationCode(String serviceClassificationCode) {
    this.serviceClassificationCode = serviceClassificationCode;
    return this;
  }

   /**
   * Represents the type of Business service to query for service availability. This is optional field
   * @return serviceClassificationCode
  **/
  @ApiModelProperty(value = "Represents the type of Business service to query for service availability. This is optional field")


  public String getServiceClassificationCode() {
    return serviceClassificationCode;
  }

  /**
   * Sets the service classification code.
   *
   * @param serviceClassificationCode the new service classification code
   */
  public void setServiceClassificationCode(String serviceClassificationCode) {
    this.serviceClassificationCode = serviceClassificationCode;
  }

  /**
   * Move from post code.
   *
   * @param moveFromPostCode the move from post code
   * @return the line identification
   */
  public LineIdentification moveFromPostCode(String moveFromPostCode) {
    this.moveFromPostCode = moveFromPostCode;
    return this;
  }

   /**
    * Specifies the post code from which the prospective customer is willing to move.
    *
    * @return moveFromPostCode
    */
  @ApiModelProperty(value = "Specifies the post code from which the prospective customer is willing to move")


  public String getMoveFromPostCode() {
    return moveFromPostCode;
  }

  /**
   * Sets the move from post code.
   *
   * @param moveFromPostCode the new move from post code
   */
  public void setMoveFromPostCode(String moveFromPostCode) {
    this.moveFromPostCode = moveFromPostCode;
  }

  /**
   * Installation address.
   *
   * @param installationAddress the installation address
   * @return the line identification
   */
  public LineIdentification installationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
    return this;
  }

   /**
    * Get installationAddress.
    *
    * @return installationAddress
    */
  @ApiModelProperty(value = "")

  @Valid

  public InstallationAddress getInstallationAddress() {
    return installationAddress;
  }

  /**
   * Sets the installation address.
   *
   * @param installationAddress the new installation address
   */
  public void setInstallationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
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
    LineIdentification lineIdentification = (LineIdentification) o;
    return Objects.equals(this.fllandlineNumber, lineIdentification.fllandlineNumber) &&
        Objects.equals(this.typeCode, lineIdentification.typeCode) &&
        Objects.equals(this.serviceClassificationCode, lineIdentification.serviceClassificationCode) &&
        Objects.equals(this.moveFromPostCode, lineIdentification.moveFromPostCode) &&
        Objects.equals(this.installationAddress, lineIdentification.installationAddress);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(fllandlineNumber, typeCode, serviceClassificationCode, moveFromPostCode, installationAddress);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineIdentification {\n");
    
    sb.append("    fllandlineNumber: ").append(toIndentedString(fllandlineNumber)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    serviceClassificationCode: ").append(toIndentedString(serviceClassificationCode)).append("\n");
    sb.append("    moveFromPostCode: ").append(toIndentedString(moveFromPostCode)).append("\n");
    sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
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

