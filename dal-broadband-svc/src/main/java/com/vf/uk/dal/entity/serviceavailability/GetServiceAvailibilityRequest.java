package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * GetServiceAvailibilityRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T12:15:55.201Z")

public class GetServiceAvailibilityRequest   {
  @JsonProperty("category")
  private String category = null;

  /**
   * Gets or Sets customerType
   */
  public enum CustomerTypeEnum {
    INDIVIDUAL("INDIVIDUAL"),
    
    BUSINESS("BUSINESS");

    private String value;

    CustomerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerTypeEnum fromValue(String text) {
      for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("customerType")
  private CustomerTypeEnum customerType = null;

  @JsonProperty("installationAddress")
  private InstallationAddress installationAddress = null;

  @JsonProperty("landlineNumber")
  private String landlineNumber = null;

  @JsonProperty("moveFromPostCode")
  private String moveFromPostCode = null;

  public GetServiceAvailibilityRequest category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public GetServiceAvailibilityRequest customerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Get customerType
   * @return customerType
  **/
  @ApiModelProperty(value = "")


  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
  }

  public GetServiceAvailibilityRequest installationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
    return this;
  }

  /**
   * Get installationAddress
   * @return installationAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstallationAddress getInstallationAddress() {
    return installationAddress;
  }

  public void setInstallationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
  }

  public GetServiceAvailibilityRequest landlineNumber(String landlineNumber) {
    this.landlineNumber = landlineNumber;
    return this;
  }

  /**
   * Get landlineNumber
   * @return landlineNumber
  **/
  @ApiModelProperty(value = "")


  public String getLandlineNumber() {
    return landlineNumber;
  }

  public void setLandlineNumber(String landlineNumber) {
    this.landlineNumber = landlineNumber;
  }

  public GetServiceAvailibilityRequest moveFromPostCode(String moveFromPostCode) {
    this.moveFromPostCode = moveFromPostCode;
    return this;
  }

  /**
   * Get moveFromPostCode
   * @return moveFromPostCode
  **/
  @ApiModelProperty(value = "")


  public String getMoveFromPostCode() {
    return moveFromPostCode;
  }

  public void setMoveFromPostCode(String moveFromPostCode) {
    this.moveFromPostCode = moveFromPostCode;
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
    return Objects.equals(this.category, getServiceAvailibilityRequest.category) &&
        Objects.equals(this.customerType, getServiceAvailibilityRequest.customerType) &&
        Objects.equals(this.installationAddress, getServiceAvailibilityRequest.installationAddress) &&
        Objects.equals(this.landlineNumber, getServiceAvailibilityRequest.landlineNumber) &&
        Objects.equals(this.moveFromPostCode, getServiceAvailibilityRequest.moveFromPostCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, customerType, installationAddress, landlineNumber, moveFromPostCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServiceAvailibilityRequest {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
    sb.append("    landlineNumber: ").append(toIndentedString(landlineNumber)).append("\n");
    sb.append("    moveFromPostCode: ").append(toIndentedString(moveFromPostCode)).append("\n");
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

