package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * The Class SecureNet.
 */
@Data
public class SecureNet {

	/** The bundle id. */
	private String bundleId;

	/** The flag. */
	private boolean flag;

	/** The label. */
	private String label;

	/** The type. */
	private String type;

	/** The priority. */
	private Integer priority = null;

	/** The package type. */
	public List<String> packageType = new ArrayList<>();

}
