package com.vf.uk.dal.broadband.entity;

import java.util.List;

import lombok.Data;

/**
 * The Class GetBundleListSearchCriteria.
 */
@Data
public class GetBundleListSearchCriteria {

	/** The bundle id. */
	private String bundleId;

	/** The bundle class. */
	private String bundleClass;

	/** The device id. */
	private String deviceId;

	/** The user type. */
	private String userType;

	/** The sort. */
	private String sortCriteria;

	/** The count. */
	private int count;

	/** The offset. */
	private int offset;

	/** The journey id. */
	private String journeyId;

	/** The bundle id list. */
	private List<String> bundleIdList;

	/** The journey type. */
	private String journeyType;

	/** The credit limit. */
	private String creditLimit;

	/** The offer code. */
	private String offerCode;

	/** The customer identification number. */
	private String customerIdentificationNumber;

	/** The skip chordiant. */
	private Boolean skipChordiant;

	/** The duration. */
	private String duration;

	/** The classification code. */
	private String classificationCode;

	/** The status. */
	private String status;

	/** The broadband id. */
	private String broadbandId;

}
