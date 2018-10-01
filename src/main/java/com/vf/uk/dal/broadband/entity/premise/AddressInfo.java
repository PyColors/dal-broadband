package com.vf.uk.dal.broadband.entity.premise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class AddressInfo.
 */
@Data
public class AddressInfo extends ResourceSupport {

	/** The category. */
	@JsonProperty("category")
	private String category;

	/** The addresses. */
	@JsonProperty("addresses")
	private List<Address> addresses = new ArrayList<>();

}
