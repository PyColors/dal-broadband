package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductAllowance.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductAllowance   {
  
  /** The type. */
  @JsonProperty("type")
  private String type = null;

  /** The uom. */
  @JsonProperty("uom")
  private String uom = null;

  /** The value. */
  @JsonProperty("value")
  private String value = null;

  /**
   * Type.
   *
   * @param type the type
   * @return the product allowance
   */
  public ProductAllowance type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   *
   * @return type
   */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Uom.
   *
   * @param uom the uom
   * @return the product allowance
   */
  public ProductAllowance uom(String uom) {
    this.uom = uom;
    return this;
  }

  /**
   * Get uom.
   *
   * @return uom
   */
  @ApiModelProperty(value = "")


  public String getUom() {
    return uom;
  }

  /**
   * Sets the uom.
   *
   * @param uom the new uom
   */
  public void setUom(String uom) {
    this.uom = uom;
  }

  /**
   * Value.
   *
   * @param value the value
   * @return the product allowance
   */
  public ProductAllowance value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value.
   *
   * @return value
   */
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  /**
   * Sets the value.
   *
   * @param value the new value
   */
  public void setValue(String value) {
    this.value = value;
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
    ProductAllowance productAllowance = (ProductAllowance) o;
    return Objects.equals(this.type, productAllowance.type) &&
        Objects.equals(this.uom, productAllowance.uom) &&
        Objects.equals(this.value, productAllowance.value);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(type, uom, value);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAllowance {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

