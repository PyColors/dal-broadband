package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateBasketRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CreateBasketRequest   {
  @JsonProperty("affiliateFlag")
  private Boolean affiliateFlag = null;

  @JsonProperty("affiliateId")
  private String affiliateId = null;

  @JsonProperty("customerRequestedDate")
  private String customerRequestedDate = null;

  @JsonProperty("journey")
  private Journey journey = null;

  @JsonProperty("packages")
  @Valid
  private List<AddPackage> packages = null;

  @JsonProperty("returnURL")
  private String returnURL = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("ttl")
  private String ttl = null;

  public CreateBasketRequest affiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
    return this;
  }

  /**
   * Get affiliateFlag
   * @return affiliateFlag
  **/
  @ApiModelProperty(value = "")


  public Boolean isAffiliateFlag() {
    return affiliateFlag;
  }

  public void setAffiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
  }

  public CreateBasketRequest affiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
    return this;
  }

  /**
   * Get affiliateId
   * @return affiliateId
  **/
  @ApiModelProperty(value = "")


  public String getAffiliateId() {
    return affiliateId;
  }

  public void setAffiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
  }

  public CreateBasketRequest customerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
    return this;
  }

  /**
   * Get customerRequestedDate
   * @return customerRequestedDate
  **/
  @ApiModelProperty(value = "")


  public String getCustomerRequestedDate() {
    return customerRequestedDate;
  }

  public void setCustomerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
  }

  public CreateBasketRequest journey(Journey journey) {
    this.journey = journey;
    return this;
  }

  /**
   * Get journey
   * @return journey
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Journey getJourney() {
    return journey;
  }

  public void setJourney(Journey journey) {
    this.journey = journey;
  }

  public CreateBasketRequest packages(List<AddPackage> packages) {
    this.packages = packages;
    return this;
  }

  public CreateBasketRequest addPackagesItem(AddPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AddPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<AddPackage> packages) {
    this.packages = packages;
  }

  public CreateBasketRequest returnURL(String returnURL) {
    this.returnURL = returnURL;
    return this;
  }

  /**
   * Get returnURL
   * @return returnURL
  **/
  @ApiModelProperty(value = "")


  public String getReturnURL() {
    return returnURL;
  }

  public void setReturnURL(String returnURL) {
    this.returnURL = returnURL;
  }

  public CreateBasketRequest source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CreateBasketRequest ttl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Get ttl
   * @return ttl
  **/
  @ApiModelProperty(value = "")


  public String getTtl() {
    return ttl;
  }

  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBasketRequest createBasketRequest = (CreateBasketRequest) o;
    return Objects.equals(this.affiliateFlag, createBasketRequest.affiliateFlag) &&
        Objects.equals(this.affiliateId, createBasketRequest.affiliateId) &&
        Objects.equals(this.customerRequestedDate, createBasketRequest.customerRequestedDate) &&
        Objects.equals(this.journey, createBasketRequest.journey) &&
        Objects.equals(this.packages, createBasketRequest.packages) &&
        Objects.equals(this.returnURL, createBasketRequest.returnURL) &&
        Objects.equals(this.source, createBasketRequest.source) &&
        Objects.equals(this.ttl, createBasketRequest.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateFlag, affiliateId, customerRequestedDate, journey, packages, returnURL, source, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBasketRequest {\n");
    
    sb.append("    affiliateFlag: ").append(toIndentedString(affiliateFlag)).append("\n");
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
    sb.append("    customerRequestedDate: ").append(toIndentedString(customerRequestedDate)).append("\n");
    sb.append("    journey: ").append(toIndentedString(journey)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    returnURL: ").append(toIndentedString(returnURL)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

