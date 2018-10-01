package com.vf.uk.dal.entity.serviceavailability;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LinePlant.
 */
@Data
public class LinePlant {

	/** The spare pairs. */
	@JsonProperty("sparePairs")
	private BigDecimal sparePairs = null;

	/** The working lines. */
	@JsonProperty("workingLines")
	private BigDecimal workingLines = null;

	/** The stopped lines. */
	@JsonProperty("stoppedLines")
	private BigDecimal stoppedLines = null;

}
