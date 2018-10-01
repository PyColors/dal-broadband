package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class AvailableServices.
 */
@Data
public class AvailableServices implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8786941003761030305L;

	/** The Constant SERVICE. */
	private static final String AVAILABLE_SERVICE = "service";

	/** The service. */
	@JsonProperty(AVAILABLE_SERVICE)
	private List<String> service = new ArrayList<>();

}
