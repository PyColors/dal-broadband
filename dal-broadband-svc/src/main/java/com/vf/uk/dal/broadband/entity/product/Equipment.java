package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Equipment.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class Equipment   {
  
  /** The make. */
  @JsonProperty("make")
  private String make = null;

  /** The model. */
  @JsonProperty("model")
  private String model = null;

  /**
   * Make.
   *
   * @param make the make
   * @return the equipment
   */
  public Equipment make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Get make.
   *
   * @return make
   */
  @ApiModelProperty(value = "")


  public String getMake() {
    return make;
  }

  /**
   * Sets the make.
   *
   * @param make the new make
   */
  public void setMake(String make) {
    this.make = make;
  }

  /**
   * Model.
   *
   * @param model the model
   * @return the equipment
   */
  public Equipment model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model.
   *
   * @return model
   */
  @ApiModelProperty(value = "")


  public String getModel() {
    return model;
  }

  /**
   * Sets the model.
   *
   * @param model the new model
   */
  public void setModel(String model) {
    this.model = model;
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
    Equipment equipment = (Equipment) o;
    return Objects.equals(this.make, equipment.make) &&
        Objects.equals(this.model, equipment.model);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(make, model);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Equipment {\n");
    
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

