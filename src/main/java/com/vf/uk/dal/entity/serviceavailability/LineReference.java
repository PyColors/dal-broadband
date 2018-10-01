package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineReference.
 */
@Data
public class LineReference {

	/** The landline number. */
	@JsonProperty("landlineNumber")
	private String landlineNumber = null;

	/** The address reference number. */
	@JsonProperty("addressReferenceNumber")
	private String addressReferenceNumber = null;

	/** The post code. */
	@JsonProperty("postCode")
	private String postCode = null;

	/** The line plant. */
	@JsonProperty("linePlant")
	private LinePlant linePlant = null;

	/** The line directory. */
	@JsonProperty("lineDirectory")
	private List<LineDirectory> lineDirectory = new ArrayList<>();

	/** The line locator. */
	@JsonProperty("lineLocator")
	private LineLocator lineLocator = null;

	/** The line settings. */
	@JsonProperty("lineSettings")
	private LineSettings lineSettings = null;

	/** The line status. */
	@JsonProperty("lineStatus")
	private LineStatus lineStatus = null;

	/** The available services. */
	@JsonProperty("availableServices")
	private AvailableServices availableServices = null;

	/** The unsupported services. */
	@JsonProperty("unsupportedServices")
	private UnsupportedServices unsupportedServices = null;

	/** The incompatible services. */
	@JsonProperty("incompatibleServices")
	private IncompatibleServices incompatibleServices = null;

}
