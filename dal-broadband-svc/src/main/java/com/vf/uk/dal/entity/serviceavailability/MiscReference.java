package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MiscReference.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T12:15:55.201Z")

public class MiscReference   {
  
  /** The anfp. */
  @JsonProperty("ANFP")
  private String ANFP = null;

  /** The customer agreed date. */
  @JsonProperty("customerAgreedDate")
  private String customerAgreedDate = null;

  /** The installation type. */
  @JsonProperty("installationType")
  private String installationType = null;

  /** The line length. */
  @JsonProperty("lineLength")
  private String lineLength = null;

  /** The ready for service date. */
  @JsonProperty("readyForServiceDate")
  private String readyForServiceDate = null;

  /** The service provider name. */
  @JsonProperty("serviceProviderName")
  private String serviceProviderName = null;

  /**
   * Anfp.
   *
   * @param ANFP the anfp
   * @return the misc reference
   */
  public MiscReference ANFP(String ANFP) {
    this.ANFP = ANFP;
    return this;
  }

  /**
   * Get ANFP.
   *
   * @return ANFP
   */
  @ApiModelProperty(value = "")


  public String getANFP() {
    return ANFP;
  }

  /**
   * Sets the anfp.
   *
   * @param ANFP the new anfp
   */
  public void setANFP(String ANFP) {
    this.ANFP = ANFP;
  }

  /**
   * Customer agreed date.
   *
   * @param customerAgreedDate the customer agreed date
   * @return the misc reference
   */
  public MiscReference customerAgreedDate(String customerAgreedDate) {
    this.customerAgreedDate = customerAgreedDate;
    return this;
  }

  /**
   * Get customerAgreedDate.
   *
   * @return customerAgreedDate
   */
  @ApiModelProperty(value = "")


  public String getCustomerAgreedDate() {
    return customerAgreedDate;
  }

  /**
   * Sets the customer agreed date.
   *
   * @param customerAgreedDate the new customer agreed date
   */
  public void setCustomerAgreedDate(String customerAgreedDate) {
    this.customerAgreedDate = customerAgreedDate;
  }

  /**
   * Installation type.
   *
   * @param installationType the installation type
   * @return the misc reference
   */
  public MiscReference installationType(String installationType) {
    this.installationType = installationType;
    return this;
  }

  /**
   * Get installationType.
   *
   * @return installationType
   */
  @ApiModelProperty(value = "")


  public String getInstallationType() {
    return installationType;
  }

  /**
   * Sets the installation type.
   *
   * @param installationType the new installation type
   */
  public void setInstallationType(String installationType) {
    this.installationType = installationType;
  }

  /**
   * Line length.
   *
   * @param lineLength the line length
   * @return the misc reference
   */
  public MiscReference lineLength(String lineLength) {
    this.lineLength = lineLength;
    return this;
  }

  /**
   * Get lineLength.
   *
   * @return lineLength
   */
  @ApiModelProperty(value = "")


  public String getLineLength() {
    return lineLength;
  }

  /**
   * Sets the line length.
   *
   * @param lineLength the new line length
   */
  public void setLineLength(String lineLength) {
    this.lineLength = lineLength;
  }

  /**
   * Ready for service date.
   *
   * @param readyForServiceDate the ready for service date
   * @return the misc reference
   */
  public MiscReference readyForServiceDate(String readyForServiceDate) {
    this.readyForServiceDate = readyForServiceDate;
    return this;
  }

  /**
   * Get readyForServiceDate.
   *
   * @return readyForServiceDate
   */
  @ApiModelProperty(value = "")


  public String getReadyForServiceDate() {
    return readyForServiceDate;
  }

  /**
   * Sets the ready for service date.
   *
   * @param readyForServiceDate the new ready for service date
   */
  public void setReadyForServiceDate(String readyForServiceDate) {
    this.readyForServiceDate = readyForServiceDate;
  }

  /**
   * Service provider name.
   *
   * @param serviceProviderName the service provider name
   * @return the misc reference
   */
  public MiscReference serviceProviderName(String serviceProviderName) {
    this.serviceProviderName = serviceProviderName;
    return this;
  }

  /**
   * Get serviceProviderName.
   *
   * @return serviceProviderName
   */
  @ApiModelProperty(value = "")


  public String getServiceProviderName() {
    return serviceProviderName;
  }

  /**
   * Sets the service provider name.
   *
   * @param serviceProviderName the new service provider name
   */
  public void setServiceProviderName(String serviceProviderName) {
    this.serviceProviderName = serviceProviderName;
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
    MiscReference miscReference = (MiscReference) o;
    return Objects.equals(this.ANFP, miscReference.ANFP) &&
        Objects.equals(this.customerAgreedDate, miscReference.customerAgreedDate) &&
        Objects.equals(this.installationType, miscReference.installationType) &&
        Objects.equals(this.lineLength, miscReference.lineLength) &&
        Objects.equals(this.readyForServiceDate, miscReference.readyForServiceDate) &&
        Objects.equals(this.serviceProviderName, miscReference.serviceProviderName);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(ANFP, customerAgreedDate, installationType, lineLength, readyForServiceDate, serviceProviderName);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscReference {\n");
    
    sb.append("    ANFP: ").append(toIndentedString(ANFP)).append("\n");
    sb.append("    customerAgreedDate: ").append(toIndentedString(customerAgreedDate)).append("\n");
    sb.append("    installationType: ").append(toIndentedString(installationType)).append("\n");
    sb.append("    lineLength: ").append(toIndentedString(lineLength)).append("\n");
    sb.append("    readyForServiceDate: ").append(toIndentedString(readyForServiceDate)).append("\n");
    sb.append("    serviceProviderName: ").append(toIndentedString(serviceProviderName)).append("\n");
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

