package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class LineReference.
 */
@Data
public class LineReference implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6204503232964226221L;

	/** The Constant INSTALLATIONADDRESS. */
	private static final String INSTALLATION_ADDRESS = "installationAddress";

	/** The Constant LINELOCATOR. */
	private static final String LINE_LOCATOR = "lineLocator";

	/** The Constant LINEDIRECTYLIST. */
	private static final String LINEDIRECTYLIST = "lineDirectoryList";

	/** The Constant LINESETTINGS. */
	private static final String LINE_SETTINGS = "lineSettings";

	/** The Constant LINESTATUS. */
	private static final String LINE_STATUS = "lineStatus";

	/** The Constant AVAILABLESERVICES. */
	private static final String AVAILABLE_SERVICES = "availableServices";

	/** The installation address. */
	@JsonProperty(INSTALLATION_ADDRESS)
	private InstallationAddress installationAddress;

	/** The line locator. */
	@JsonProperty(LINE_LOCATOR)
	private LineLocator lineLocator;

	/** The line directory list. */
	@JsonProperty(LINEDIRECTYLIST)
	private List<LineDirectory> lineDirectoryList = new ArrayList<>();

	/** The line settings. */
	@JsonProperty(LINE_SETTINGS)
	private LineSettings lineSettings;

	/** The line status. */
	@JsonProperty(LINE_STATUS)
	private LineStatus lineStatus;

	/** The available services. */
	@JsonProperty(AVAILABLE_SERVICES)
	private AvailableServices availableServices;

}
