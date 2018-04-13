/*
 * Basket APIs
 * Basket API service specification
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.vf.uk.dal.broadband.basket.entity;

/**
 * AddBundle
 */

public class AddBundle {

	private String action = null;


	private String skuId = null;



	/**
	 * Action to indicate the operation requested by the use on this particular bundle. Expected values are ADD/REMOVE/MODIFY
	 * @return action
	 **/

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}



	/**
	 * Bundle id from the product catalogue
	 * @return skuId
	 **/

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}



}

