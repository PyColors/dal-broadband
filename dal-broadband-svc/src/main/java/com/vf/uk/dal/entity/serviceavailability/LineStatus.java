package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineStatus.
 */
@Data
public class LineStatus {

	/** The status code. */
	@JsonProperty("statusCode")
	private String statusCode = null;

	/** The access line status. */
	@JsonProperty("accessLineStatus")
	private String accessLineStatus = null;

	/** The gn P status. */
	@JsonProperty("GNPStatus")
	private String gnPStatus = null;

	/** The line option. */
	@JsonProperty("lineOption")
	private String lineOption = null;

	/** The technology. */
	@JsonProperty("technology")
	private String technology = null;

	/** The line type. */
	@JsonProperty("lineType")
	private String lineType = null;

	/** The temp structure. */
	@JsonProperty("tempStructure")
	private Boolean tempStructure = null;

	/** The standby power required. */
	@JsonProperty("standbyPowerRequired")
	private Boolean standbyPowerRequired = null;

	/** The narrow band services available. */
	@JsonProperty("narrowBandServicesAvailable")
	private String narrowBandServicesAvailable = null;

}
