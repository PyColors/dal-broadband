package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * GetServiceAvailibilityRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T12:15:55.201Z")

public class GetServiceAvailibilityRequest   {
  
  /** The category. */
  @JsonProperty("category")
  private String category = null;

  /**
   * Gets or Sets customerType.
   */
  public enum CustomerTypeEnum {
    
    /** The individual. */
    INDIVIDUAL("INDIVIDUAL"),
    
    /** The business. */
    BUSINESS("BUSINESS");

    /** The value. */
    private String value;

    /**
     * Instantiates a new customer type enum.
     *
     * @param value the value
     */
    CustomerTypeEnum(String value) {
      this.value = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * From value.
     *
     * @param text the text
     * @return the customer type enum
     */
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

  /** The customer type. */
  @JsonProperty("customerType")
  private CustomerTypeEnum customerType = null;

  /** The installation address. */
  @JsonProperty("installationAddress")
  private InstallationAddress installationAddress = null;

  /** The landline number. */
  @JsonProperty("landlineNumber")
  private String landlineNumber = null;

  /** The move from post code. */
  @JsonProperty("moveFromPostCode")
  private String moveFromPostCode = null;

  /**
   * Category.
   *
   * @param category the category
   * @return the gets the service availibility request
   */
  public GetServiceAvailibilityRequest category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category.
   *
   * @return category
   */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  /**
   * Sets the category.
   *
   * @param category the new category
   */
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Customer type.
   *
   * @param customerType the customer type
   * @return the gets the service availibility request
   */
  public GetServiceAvailibilityRequest customerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Get customerType.
   *
   * @return customerType
   */
  @ApiModelProperty(value = "")


  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }

  /**
   * Sets the customer type.
   *
   * @param customerType the new customer type
   */
  public void setCustomerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
  }

  /**
   * Installation address.
   *
   * @param installationAddress the installation address
   * @return the gets the service availibility request
   */
  public GetServiceAvailibilityRequest installationAddress(InstallationAddress installationAddress) {
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

  /**
   * Landline number.
   *
   * @param landlineNumber the landline number
   * @return the gets the service availibility request
   */
  public GetServiceAvailibilityRequest landlineNumber(String landlineNumber) {
    this.landlineNumber = landlineNumber;
    return this;
  }

  /**
   * Get landlineNumber.
   *
   * @return landlineNumber
   */
  @ApiModelProperty(value = "")


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
   * Move from post code.
   *
   * @param moveFromPostCode the move from post code
   * @return the gets the service availibility request
   */
  public GetServiceAvailibilityRequest moveFromPostCode(String moveFromPostCode) {
    this.moveFromPostCode = moveFromPostCode;
    return this;
  }

  /**
   * Get moveFromPostCode.
   *
   * @return moveFromPostCode
   */
  @ApiModelProperty(value = "")


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
    GetServiceAvailibilityRequest getServiceAvailibilityRequest = (GetServiceAvailibilityRequest) o;
    return Objects.equals(this.category, getServiceAvailibilityRequest.category) &&
        Objects.equals(this.customerType, getServiceAvailibilityRequest.customerType) &&
        Objects.equals(this.installationAddress, getServiceAvailibilityRequest.installationAddress) &&
        Objects.equals(this.landlineNumber, getServiceAvailibilityRequest.landlineNumber) &&
        Objects.equals(this.moveFromPostCode, getServiceAvailibilityRequest.moveFromPostCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(category, customerType, installationAddress, landlineNumber, moveFromPostCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

