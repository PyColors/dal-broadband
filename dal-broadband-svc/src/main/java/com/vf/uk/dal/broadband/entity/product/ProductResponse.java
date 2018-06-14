package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductResponse   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("partialSuccess")
  private Boolean partialSuccess = null;

  @JsonProperty("productList")
  @Valid
  private List<Product> productList = null;

  @JsonProperty("responseObject")
  private JSONObject responseObject = null;

  @JsonProperty("success")
  private Boolean success = null;

  public ProductResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ProductResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ProductResponse partialSuccess(Boolean partialSuccess) {
    this.partialSuccess = partialSuccess;
    return this;
  }

  /**
   * Get partialSuccess
   * @return partialSuccess
  **/
  @ApiModelProperty(value = "")


  public Boolean isPartialSuccess() {
    return partialSuccess;
  }

  public void setPartialSuccess(Boolean partialSuccess) {
    this.partialSuccess = partialSuccess;
  }

  public ProductResponse productList(List<Product> productList) {
    this.productList = productList;
    return this;
  }

  public ProductResponse addProductListItem(Product productListItem) {
    if (this.productList == null) {
      this.productList = new ArrayList<Product>();
    }
    this.productList.add(productListItem);
    return this;
  }

  /**
   * Get productList
   * @return productList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }

  public ProductResponse responseObject(JSONObject responseObject) {
    this.responseObject = responseObject;
    return this;
  }

  /**
   * Get responseObject
   * @return responseObject
  **/
  @ApiModelProperty(value = "")

  @Valid

  public JSONObject getResponseObject() {
    return responseObject;
  }

  public void setResponseObject(JSONObject responseObject) {
    this.responseObject = responseObject;
  }

  public ProductResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")


  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductResponse productResponse = (ProductResponse) o;
    return Objects.equals(this.errorCode, productResponse.errorCode) &&
        Objects.equals(this.errorMessage, productResponse.errorMessage) &&
        Objects.equals(this.partialSuccess, productResponse.partialSuccess) &&
        Objects.equals(this.productList, productResponse.productList) &&
        Objects.equals(this.responseObject, productResponse.responseObject) &&
        Objects.equals(this.success, productResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, partialSuccess, productList, responseObject, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResponse {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    partialSuccess: ").append(toIndentedString(partialSuccess)).append("\n");
    sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
    sb.append("    responseObject: ").append(toIndentedString(responseObject)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

