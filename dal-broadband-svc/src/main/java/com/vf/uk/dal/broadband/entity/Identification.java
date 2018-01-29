package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Identification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class Identification   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("contextId")
  private String contextId = null;

  /**
   * 
   * @param id
   * @return
   */
  public Identification id(String id) {
    this.id = id;
    return this;
  }

   /**
   * This is the Wholesale address reference identifier that uniquely identifies the address in the Fixed Line or PostOffice system
   * @return id
  **/
  @ApiModelProperty(value = "This is the Wholesale address reference identifier that uniquely identifies the address in the Fixed Line or PostOffice system")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @param contextId
   * @return
   */
  public Identification contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @ApiModelProperty(value = "")


  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identification identification = (Identification) o;
    return Objects.equals(this.id, identification.id) &&
        Objects.equals(this.contextId, identification.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contextId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
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

