package com.vf.uk.dal.broadband.inventory.entity;

/*
 * Delivery Method API
 * gives the delivery methods related to the basket or sku id's
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import java.util.List;

import lombok.Data;

/**
 * Each delivery object represents a delivery method.
 */
@Data
public class DeliveryMethods {

	/** The product id. */
	private String productId = null;

	/** The display name. */
	private String displayName = null;

	/** The delivery type. */
	private String deliveryType = null;

	/** The stock status. */
	private String stockStatus = null;

	/** The price. */
	private DeliveryPrice price = null;

	/** The delivery method. */
	private String deliveryMethod = null;

	/** The description. */
	private String description = null;

	/** The partner. */
	private String partner = null;

	/** The available time. */
	private String availableTime = null;

	/** The cut off time. */
	private String cutOffTime = null;

	/** The packaging date. */
	private String packagingDate = null;

	/** The back order product names. */
	private List<String> backOrderProductNames = null;

	/** The out of stock product names. */
	private List<String> outOfStockProductNames = null;

}
