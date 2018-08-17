package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ProductControl.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class ProductControl {

	/** The affiliate export. */
	@JsonProperty("affiliateExport")
	private Boolean affiliateExport = null;

	/** The available from. */
	@JsonProperty("availableFrom")
	private String availableFrom = null;

	/** The back order message. */
	@JsonProperty("backOrderMessage")
	private String backOrderMessage = null;

	/** The back orderable. */
	@JsonProperty("backOrderable")
	private String backOrderable = null;

	/** The compare with. */
	@JsonProperty("compareWith")
	private String compareWith = null;

	/** The is displayable acq. */
	@JsonProperty("isDisplayableAcq")
	private Boolean isDisplayableAcq = null;

	/** The is displayable ret. */
	@JsonProperty("isDisplayableRet")
	private Boolean isDisplayableRet = null;

	/** The is displayable saved basket. */
	@JsonProperty("isDisplayableSavedBasket")
	private Boolean isDisplayableSavedBasket = null;

	/** The is displayablein life. */
	@JsonProperty("isDisplayableinLife")
	private Boolean isDisplayableinLife = null;

	/** The is sellable acq. */
	@JsonProperty("isSellableAcq")
	private Boolean isSellableAcq = null;

	/** The is sellable ret. */
	@JsonProperty("isSellableRet")
	private Boolean isSellableRet = null;

	/** The is sellablein life. */
	@JsonProperty("isSellableinLife")
	private Boolean isSellableinLife = null;

	/** The order. */
	@JsonProperty("order")
	private String order = null;

	/** The pre orderable. */
	@JsonProperty("preOrderable")
	private Boolean preOrderable = null;

}
