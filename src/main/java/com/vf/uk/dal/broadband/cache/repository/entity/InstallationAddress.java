package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class InstallationAddress.
 */
@Data
public class InstallationAddress implements Serializable {

	private static final long serialVersionUID = 720766920252325742L;

	/** The Constant POSTCODE. */
	private static final String POST_CODE = "postCode";

	/** The Constant HOUSENAME. */
	private static final String HOUSE_NAME = "houseName";

	/** The Constant HOUSENUMBER. */
	private static final String HOUSE_NUMBER = "houseNumber";

	/** The Constant FLATNUMBER. */
	private static final String FLAT_NUMBER = "flatNumber";

	/** The Constant STREETNAME. */
	private static final String STREET_NAME = "streetName";

	/** The Constant TOWN. */
	private static final String ADDRESS_TOWN = "town";

	/** The Constant COUNTY. */
	private static final String ADDRESS_COUNTY = "county";

	/** The Constant COUNTRY. */
	private static final String ADDRESS_COUNTRY = "country";

	/** The Constant LOCALITY. */
	private static final String ADDRESS_LOCALITY = "locality";

	/** The Constant CITYSUBDIVISIONNAME. */
	private static final String CITYSUBDIVISION_NAME = "citySubDivisionName";

	/** The Constant IDENTIFICATION. */
	private static final String ADDRESS_IDENTIFICATION = "identification";

	private static final String MOVETYPE_CODE = "moveTypeCode";

	/** The identification. */
	@JsonProperty(ADDRESS_IDENTIFICATION)
	private Identification identification;

	/** The post code. */
	@JsonProperty(POST_CODE)
	private String postCode;

	/** The house name. */
	@JsonProperty(HOUSE_NAME)
	private String houseName;

	/** The house number. */
	@JsonProperty(HOUSE_NUMBER)
	private String houseNumber;

	/** The flat number. */
	@JsonProperty(FLAT_NUMBER)
	private String flatNumber;

	/** The street name. */
	@JsonProperty(STREET_NAME)
	private String streetName;

	/** The town. */
	@JsonProperty(ADDRESS_TOWN)
	private String town;

	/** The county. */
	@JsonProperty(ADDRESS_COUNTY)
	private String county;

	/** The country. */
	@JsonProperty(ADDRESS_COUNTRY)
	private String country;

	/** The locality. */
	@JsonProperty(ADDRESS_LOCALITY)
	private String locality;

	/** The city sub division name. */
	@JsonProperty(CITYSUBDIVISION_NAME)
	private String citySubDivisionName;

	/** The city sub division name. */
	@JsonProperty(MOVETYPE_CODE)
	private String moveTypeCode = null;

}
