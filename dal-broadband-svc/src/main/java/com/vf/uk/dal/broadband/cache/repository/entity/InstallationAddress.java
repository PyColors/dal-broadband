package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class InstallationAddress.
 */
public class InstallationAddress implements Serializable {

	private static final long serialVersionUID = 720766920252325742L;

	/** The Constant POSTCODE. */
	private static final String POSTCODE = "postCode";

	/** The Constant HOUSENAME. */
	private static final String HOUSENAME = "houseName";

	/** The Constant HOUSENUMBER. */
	private static final String HOUSENUMBER = "houseNumber";

	/** The Constant FLATNUMBER. */
	private static final String FLATNUMBER = "flatNumber";

	/** The Constant STREETNAME. */
	private static final String STREETNAME = "streetName";

	/** The Constant TOWN. */
	private static final String TOWN = "town";

	/** The Constant COUNTY. */
	private static final String COUNTY = "county";

	/** The Constant COUNTRY. */
	private static final String COUNTRY = "country";

	/** The Constant LOCALITY. */
	private static final String LOCALITY = "locality";

	/** The Constant CITYSUBDIVISIONNAME. */
	private static final String CITYSUBDIVISIONNAME = "citySubDivisionName";

	/** The Constant IDENTIFICATION. */
	private static final String IDENTIFICATION = "identification";

	private static final String MOVETYPECODE = "moveTypeCode";

	/** The identification. */
	@JsonProperty(IDENTIFICATION)
	private Identification identification;

	/** The post code. */
	@JsonProperty(POSTCODE)
	private String postCode;

	/** The house name. */
	@JsonProperty(HOUSENAME)
	private String houseName;

	/** The house number. */
	@JsonProperty(HOUSENUMBER)
	private String houseNumber;

	/** The flat number. */
	@JsonProperty(FLATNUMBER)
	private String flatNumber;

	/** The street name. */
	@JsonProperty(STREETNAME)
	private String streetName;

	/** The town. */
	@JsonProperty(TOWN)
	private String town;

	/** The county. */
	@JsonProperty(COUNTY)
	private String county;

	/** The country. */
	@JsonProperty(COUNTRY)
	private String country;

	/** The locality. */
	@JsonProperty(LOCALITY)
	private String locality;

	/** The city sub division name. */
	@JsonProperty(CITYSUBDIVISIONNAME)
	private String citySubDivisionName;

	
	/** The city sub division name. */
	@JsonProperty(MOVETYPECODE)
	private String moveTypeCode = null;
	
	/**
	 * Gets the identification.
	 *
	 * @return the identification
	 */
	public Identification getIdentification() {
		return identification;
	}

	/**
	 * Sets the identification.
	 *
	 * @param identification
	 *            the new identification
	 */
	public void setIdentification(Identification identification) {
		this.identification = identification;
	}

	/**
	 * Gets the post code.
	 *
	 * @return the post code
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * Sets the post code.
	 *
	 * @param postCode
	 *            the new post code
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * Gets the house name.
	 *
	 * @return the house name
	 */
	public String getHouseName() {
		return houseName;
	}

	/**
	 * Sets the house name.
	 *
	 * @param houseName
	 *            the new house name
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	/**
	 * Gets the house number.
	 *
	 * @return the house number
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * Sets the house number.
	 *
	 * @param houseNumber
	 *            the new house number
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * Gets the flat number.
	 *
	 * @return the flat number
	 */
	public String getFlatNumber() {
		return flatNumber;
	}

	/**
	 * Sets the flat number.
	 *
	 * @param flatNumber
	 *            the new flat number
	 */
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	/**
	 * Gets the street name.
	 *
	 * @return the street name
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Sets the street name.
	 *
	 * @param streetName
	 *            the new street name
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Gets the town.
	 *
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * Sets the town.
	 *
	 * @param town
	 *            the new town
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * Gets the county.
	 *
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * Sets the county.
	 *
	 * @param county
	 *            the new county
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country
	 *            the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the locality.
	 *
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * Sets the locality.
	 *
	 * @param locality
	 *            the new locality
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * Gets the city sub division name.
	 *
	 * @return the city sub division name
	 */
	public String getCitySubDivisionName() {
		return citySubDivisionName;
	}

	/**
	 * Sets the city sub division name.
	 *
	 * @param citySubDivisionName
	 *            the new city sub division name
	 */
	public void setCitySubDivisionName(String citySubDivisionName) {
		this.citySubDivisionName = citySubDivisionName;
	}

	public String getMoveTypeCode() {
		return moveTypeCode;
	}

	public void setMoveTypeCode(String moveTypeCode) {
		this.moveTypeCode = moveTypeCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((citySubDivisionName == null) ? 0 : citySubDivisionName.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((county == null) ? 0 : county.hashCode());
		result = prime * result + ((flatNumber == null) ? 0 : flatNumber.hashCode());
		result = prime * result + ((houseName == null) ? 0 : houseName.hashCode());
		result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
		result = prime * result + ((identification == null) ? 0 : identification.hashCode());
		result = prime * result + ((locality == null) ? 0 : locality.hashCode());
		result = prime * result + ((postCode == null) ? 0 : postCode.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((town == null) ? 0 : town.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InstallationAddress other = (InstallationAddress) obj;
		if (citySubDivisionName == null) {
			if (other.citySubDivisionName != null)
				return false;
		} else if (!citySubDivisionName.equals(other.citySubDivisionName))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (county == null) {
			if (other.county != null)
				return false;
		} else if (!county.equals(other.county))
			return false;
		if (flatNumber == null) {
			if (other.flatNumber != null)
				return false;
		} else if (!flatNumber.equals(other.flatNumber))
			return false;
		if (houseName == null) {
			if (other.houseName != null)
				return false;
		} else if (!houseName.equals(other.houseName))
			return false;
		if (houseNumber == null) {
			if (other.houseNumber != null)
				return false;
		} else if (!houseNumber.equals(other.houseNumber))
			return false;
		if (identification == null) {
			if (other.identification != null)
				return false;
		} else if (!identification.equals(other.identification))
			return false;
		if (locality == null) {
			if (other.locality != null)
				return false;
		} else if (!locality.equals(other.locality))
			return false;
		if (postCode == null) {
			if (other.postCode != null)
				return false;
		} else if (!postCode.equals(other.postCode))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InstallationAddress [identification=" + identification + ", postCode=" + postCode + ", houseName="
				+ houseName + ", houseNumber=" + houseNumber + ", flatNumber=" + flatNumber + ", streetName="
				+ streetName + ", town=" + town + ", county=" + county + ", country=" + country + ", locality="
				+ locality + ", citySubDivisionName=" + citySubDivisionName + "]";
	}

}
