package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * StoreInfo.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class StoreInfo   {

  /** The stock status. */
  @JsonProperty("stockStatus")
  private String stockStatus = null;

  /** The store alias. */
  @JsonProperty("storeAlias")
  private String storeAlias = null;

  /** The store id. */
  @JsonProperty("storeId")
  private String storeId = null;

  /** The store name. */
  @JsonProperty("storeName")
  private String storeName = null;

  
}

