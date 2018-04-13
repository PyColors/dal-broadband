package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class LineLocator.
 */
public class LineLocator implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8007923495697414332L;

	/** The Constant EXCHANGECODE. */
	private static final String EXCHANGECODE = "exchangeCode";

	/** The Constant EXCHANGENAME. */
	private static final String EXCHANGENAME = "exchangeName";

	/** The Constant DISTRICTCODE. */
	private static final String DISTRICTCODE = "districtCode";

	/** The Constant L2SID. */
	private static final String L2SID = "l2SID";

	/** The Constant CABLELINKID. */
	private static final String CABLELINKID = "cableLinkID";

	/** The Constant DISTRIBUTIONPOINT. */
	private static final String DISTRIBUTIONPOINT = "distributionPoint";

	/** The exchange code. */
	@JsonProperty(EXCHANGECODE)
	private String exchangeCode;

	/** The exchange name. */
	@JsonProperty(EXCHANGENAME)
	private String exchangeName;

	/** The district code. */
	@JsonProperty(DISTRICTCODE)
	private String districtCode;

	/** The l 2 SID. */
	@JsonProperty(L2SID)
	private String l2SID;

	/** The cable link ID. */
	@JsonProperty(CABLELINKID)
	private String cableLinkID;

	/** The distribution point. */
	@JsonProperty(DISTRIBUTIONPOINT)
	private String distributionPoint;

	/**
	 * Gets the exchange code.
	 *
	 * @return the exchange code
	 */
	public String getExchangeCode() {
		return exchangeCode;
	}

	/**
	 * Sets the exchange code.
	 *
	 * @param exchangeCode
	 *            the new exchange code
	 */
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	/**
	 * Gets the exchange name.
	 *
	 * @return the exchange name
	 */
	public String getExchangeName() {
		return exchangeName;
	}

	/**
	 * Sets the exchange name.
	 *
	 * @param exchangeName
	 *            the new exchange name
	 */
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	/**
	 * Gets the district code.
	 *
	 * @return the district code
	 */
	public String getDistrictCode() {
		return districtCode;
	}

	/**
	 * Sets the district code.
	 *
	 * @param districtCode
	 *            the new district code
	 */
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	/**
	 * Gets the l2sid.
	 *
	 * @return the l2sid
	 */
	public String getL2SID() {
		return l2SID;
	}

	/**
	 * Sets the l2sid.
	 *
	 * @param l2sid
	 *            the new l2sid
	 */
	public void setL2SID(String l2sid) {
		l2SID = l2sid;
	}

	/**
	 * Gets the cable link ID.
	 *
	 * @return the cable link ID
	 */
	public String getCableLinkID() {
		return cableLinkID;
	}

	/**
	 * Sets the cable link ID.
	 *
	 * @param cableLinkID
	 *            the new cable link ID
	 */
	public void setCableLinkID(String cableLinkID) {
		this.cableLinkID = cableLinkID;
	}

	/**
	 * Gets the distribution point.
	 *
	 * @return the distribution point
	 */
	public String getDistributionPoint() {
		return distributionPoint;
	}

	/**
	 * Sets the distribution point.
	 *
	 * @param distributionPoint
	 *            the new distribution point
	 */
	public void setDistributionPoint(String distributionPoint) {
		this.distributionPoint = distributionPoint;
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
		result = prime * result + ((cableLinkID == null) ? 0 : cableLinkID.hashCode());
		result = prime * result + ((distributionPoint == null) ? 0 : distributionPoint.hashCode());
		result = prime * result + ((districtCode == null) ? 0 : districtCode.hashCode());
		result = prime * result + ((exchangeCode == null) ? 0 : exchangeCode.hashCode());
		result = prime * result + ((exchangeName == null) ? 0 : exchangeName.hashCode());
		result = prime * result + ((l2SID == null) ? 0 : l2SID.hashCode());
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
		LineLocator other = (LineLocator) obj;
		if (cableLinkID == null) {
			if (other.cableLinkID != null)
				return false;
		} else if (!cableLinkID.equals(other.cableLinkID))
			return false;
		if (distributionPoint == null) {
			if (other.distributionPoint != null)
				return false;
		} else if (!distributionPoint.equals(other.distributionPoint))
			return false;
		if (districtCode == null) {
			if (other.districtCode != null)
				return false;
		} else if (!districtCode.equals(other.districtCode))
			return false;
		if (exchangeCode == null) {
			if (other.exchangeCode != null)
				return false;
		} else if (!exchangeCode.equals(other.exchangeCode))
			return false;
		if (exchangeName == null) {
			if (other.exchangeName != null)
				return false;
		} else if (!exchangeName.equals(other.exchangeName))
			return false;
		if (l2SID == null) {
			if (other.l2SID != null)
				return false;
		} else if (!l2SID.equals(other.l2SID))
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
		return "LineLocator [exchangeCode=" + exchangeCode + ", exchangeName=" + exchangeName + ", districtCode="
				+ districtCode + ", l2SID=" + l2SID + ", cableLinkID=" + cableLinkID + ", distributionPoint="
				+ distributionPoint + "]";
	}

}
