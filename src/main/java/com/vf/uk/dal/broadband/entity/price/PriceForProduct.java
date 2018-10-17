package com.vf.uk.dal.broadband.entity.price;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PriceForProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class PriceForProduct {
	@JsonProperty("priceForAccessoryes")
	@Valid
	private List<PriceForAccessory> priceForAccessoryes = null;

	@JsonProperty("priceForExtras")
	@Valid
	private List<PriceForExtra> priceForExtras = null;

}
