package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Allowance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Allowance   {
  @JsonProperty("displayUom")
  private String displayUom = null;

  @JsonProperty("tilUom")
  private String tilUom = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uom")
  private String uom = null;

  @JsonProperty("value")
  private String value = null;

  /**
   * 
   * @param displayUom
   * @return
   */
  public Allowance displayUom(String displayUom) {
    this.displayUom = displayUom;
    return this;
  }

  /**
   * Get displayUom
   * @return displayUom
  **/
  @ApiModelProperty(value = "")


  public String getDisplayUom() {
    return displayUom;
  }

  public void setDisplayUom(String displayUom) {
    this.displayUom = displayUom;
  }

  /**
   * 
   * @param tilUom
   * @return
   */
  public Allowance tilUom(String tilUom) {
    this.tilUom = tilUom;
    return this;
  }

  /**
   * Get tilUom
   * @return tilUom
  **/
  @ApiModelProperty(value = "")


  public String getTilUom() {
    return tilUom;
  }

  public void setTilUom(String tilUom) {
    this.tilUom = tilUom;
  }

  /**
   * 
   * @param type
   * @return
   */
  public Allowance type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * 
   * @param uom
   * @return
   */
  public Allowance uom(String uom) {
    this.uom = uom;
    return this;
  }

  /**
   * Get uom
   * @return uom
  **/
  @ApiModelProperty(value = "")


  public String getUom() {
    return uom;
  }

  public void setUom(String uom) {
    this.uom = uom;
  }

  /**
   * 
   * @param value
   * @return
   */
  public Allowance value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allowance {\n");
    
    sb.append("    displayUom: ").append(toIndentedString(displayUom)).append("\n");
    sb.append("    tilUom: ").append(toIndentedString(tilUom)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

