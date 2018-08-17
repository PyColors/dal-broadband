package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * UpdateBasketRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class UpdateBasketRequest {

	/** The affiliate flag. */
	@JsonProperty("affiliateFlag")
	private Boolean affiliateFlag = null;

	/** The customer. */
	@JsonProperty("customer")
	private Customer customer = null;

	/** The customer requested date. */
	@JsonProperty("customerRequestedDate")
	private String customerRequestedDate = null;

	/** The delivery info. */
	@JsonProperty("deliveryInfo")
	private DeliveryInfo deliveryInfo = null;

	/** The metadata. */
	@JsonProperty("metadata")
	private Metadata metadata = null;

	/** The remove voucher code. */
	@JsonProperty("removeVoucherCode")
	private Boolean removeVoucherCode = null;

	/** The vet outcome. */
	@JsonProperty("vetOutcome")
	private VetOutcome vetOutcome = null;

	/** The voucher code. */
	@JsonProperty("voucherCode")
	private String voucherCode = null;

}
