package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineLocator
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketLineLocator   {
  @JsonProperty("cableLinkID")
  private String cableLinkID = null;

  @JsonProperty("distributionPoint")
  private String distributionPoint = null;

  @JsonProperty("districtCode")
  private String districtCode = null;

  @JsonProperty("exchangeCode")
  private String exchangeCode = null;

  @JsonProperty("exchangeName")
  private String exchangeName = null;

  @JsonProperty("l2SID")
  private String l2SID = null;

  public BasketLineLocator cableLinkID(String cableLinkID) {
    this.cableLinkID = cableLinkID;
    return this;
  }

  /**
   * Get cableLinkID
   * @return cableLinkID
  **/
  @ApiModelProperty(value = "")


  public String getCableLinkID() {
    return cableLinkID;
  }

  public void setCableLinkID(String cableLinkID) {
    this.cableLinkID = cableLinkID;
  }

  public BasketLineLocator distributionPoint(String distributionPoint) {
    this.distributionPoint = distributionPoint;
    return this;
  }

  /**
   * Get distributionPoint
   * @return distributionPoint
  **/
  @ApiModelProperty(value = "")


  public String getDistributionPoint() {
    return distributionPoint;
  }

  public void setDistributionPoint(String distributionPoint) {
    this.distributionPoint = distributionPoint;
  }

  public BasketLineLocator districtCode(String districtCode) {
    this.districtCode = districtCode;
    return this;
  }

  /**
   * Get districtCode
   * @return districtCode
  **/
  @ApiModelProperty(value = "")


  public String getDistrictCode() {
    return districtCode;
  }

  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }

  public BasketLineLocator exchangeCode(String exchangeCode) {
    this.exchangeCode = exchangeCode;
    return this;
  }

  /**
   * Get exchangeCode
   * @return exchangeCode
  **/
  @ApiModelProperty(value = "")


  public String getExchangeCode() {
    return exchangeCode;
  }

  public void setExchangeCode(String exchangeCode) {
    this.exchangeCode = exchangeCode;
  }

  public BasketLineLocator exchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

  /**
   * Get exchangeName
   * @return exchangeName
  **/
  @ApiModelProperty(value = "")


  public String getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }

  public BasketLineLocator l2SID(String l2SID) {
    this.l2SID = l2SID;
    return this;
  }

  /**
   * Get l2SID
   * @return l2SID
  **/
  @ApiModelProperty(value = "")


  public String getL2SID() {
    return l2SID;
  }

  public void setL2SID(String l2SID) {
    this.l2SID = l2SID;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineLocator {\n");
    
    sb.append("    cableLinkID: ").append(toIndentedString(cableLinkID)).append("\n");
    sb.append("    distributionPoint: ").append(toIndentedString(distributionPoint)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    exchangeCode: ").append(toIndentedString(exchangeCode)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    l2SID: ").append(toIndentedString(l2SID)).append("\n");
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

