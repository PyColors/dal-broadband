package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineIdentification.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class LineIdentification   {
  
  /** The fllandline number. */
  @JsonProperty("fllandlineNumber")
  private String fllandlineNumber = null;

  /** The type code. */
  @JsonProperty("typeCode")
  private String typeCode = null;

  /** The service classification code. */
  @JsonProperty("serviceClassificationCode")
  private String serviceClassificationCode = null;

  /** The move from post code. */
  @JsonProperty("moveFromPostCode")
  private String moveFromPostCode = null;

  /** The installation address. */
  @JsonProperty("installationAddress")
  private InstallationAddress installationAddress = null;

  
}

