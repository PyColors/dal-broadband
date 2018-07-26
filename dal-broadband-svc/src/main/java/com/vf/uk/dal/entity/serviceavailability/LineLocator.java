package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineLocator.
 */

public class LineLocator {
	
	/** The exchange code. */
	@JsonProperty("exchangeCode")
	private String exchangeCode = null;

	/** The exchange name. */
	@JsonProperty("exchangeName")
	private String exchangeName = null;

	/** The district code. */
	@JsonProperty("districtCode")
	private String districtCode = null;

	/** The l 2 SID. */
	@JsonProperty("L2SID")
	private String l2SID = null;

	/** The cable link ID. */
	@JsonProperty("cableLinkID")
	private String cableLinkID = null;

	/** The distribution point. */
	@JsonProperty("distributionPoint")
	private String distributionPoint = null;

	/** The cable provider. */
	@JsonProperty("cableProvider")
	private String cableProvider = null;

	/**
	 * Exchange code.
	 *
	 * @param exchangeCode the exchange code
	 * @return the line locator
	 */
	public LineLocator exchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
		return this;
	}

	/**
	 * A unique exchange identifier related to the line.
	 *
	 * @return exchangeCode
	 */
	public String getExchangeCode() {
		return exchangeCode;
	}

	/**
	 * Sets the exchange code.
	 *
	 * @param exchangeCode the new exchange code
	 */
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	/**
	 * Exchange name.
	 *
	 * @param exchangeName the exchange name
	 * @return the line locator
	 */
	public LineLocator exchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
		return this;
	}

	/**
	 * The name of the exchange corresponding to the exchange code.
	 *
	 * @return exchangeName
	 */
	public String getExchangeName() {
		return exchangeName;
	}

	/**
	 * Sets the exchange name.
	 *
	 * @param exchangeName the new exchange name
	 */
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	/**
	 * District code.
	 *
	 * @param districtCode the district code
	 * @return the line locator
	 */
	public LineLocator districtCode(String districtCode) {
		this.districtCode = districtCode;
		return this;
	}

	/**
	 * A unique code that identifies the District where the line belongs.
	 *
	 * @return districtCode
	 */
	public String getDistrictCode() {
		return districtCode;
	}

	/**
	 * Sets the district code.
	 *
	 * @param districtCode the new district code
	 */
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	/**
	 * L 2 SID.
	 *
	 * @param l2SID the l 2 SID
	 * @return the line locator
	 */
	public LineLocator l2SID(String l2SID) {
		this.l2SID = l2SID;
		return this;
	}

	/**
	 * The Identify of the L2S switch in the exchange.
	 *
	 * @return l2SID
	 */
	public String getL2SID() {
		return l2SID;
	}

	/**
	 * Sets the l2sid.
	 *
	 * @param l2SID the new l2sid
	 */
	public void setL2SID(String l2SID) {
		this.l2SID = l2SID;
	}

	/**
	 * Cable link ID.
	 *
	 * @param cableLinkID the cable link ID
	 * @return the line locator
	 */
	public LineLocator cableLinkID(String cableLinkID) {
		this.cableLinkID = cableLinkID;
		return this;
	}

	/**
	 * The Identify of the Cable Link for the line.
	 *
	 * @return cableLinkID
	 */
	public String getCableLinkID() {
		return cableLinkID;
	}

	/**
	 * Sets the cable link ID.
	 *
	 * @param cableLinkID the new cable link ID
	 */
	public void setCableLinkID(String cableLinkID) {
		this.cableLinkID = cableLinkID;
	}

	/**
	 * Distribution point.
	 *
	 * @param distributionPoint the distribution point
	 * @return the line locator
	 */
	public LineLocator distributionPoint(String distributionPoint) {
		this.distributionPoint = distributionPoint;
		return this;
	}

	/**
	 * The Distribution Point for this line.
	 *
	 * @return distributionPoint
	 */
	public String getDistributionPoint() {
		return distributionPoint;
	}

	/**
	 * Sets the distribution point.
	 *
	 * @param distributionPoint the new distribution point
	 */
	public void setDistributionPoint(String distributionPoint) {
		this.distributionPoint = distributionPoint;
	}

	/**
	 * Cable provider.
	 *
	 * @param cableProvider the cable provider
	 * @return the line locator
	 */
	public LineLocator cableProvider(String cableProvider) {
		this.cableProvider = cableProvider;
		return this;
	}

	/**
	 * The range holder of the FLN or The cable provider of the FLN number.
	 *
	 * @return cableProvider
	 */
	public String getCableProvider() {
		return cableProvider;
	}

	/**
	 * Sets the cable provider.
	 *
	 * @param cableProvider the new cable provider
	 */
	public void setCableProvider(String cableProvider) {
		this.cableProvider = cableProvider;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineLocator lineLocator = (LineLocator) o;
		return Objects.equals(this.exchangeCode, lineLocator.exchangeCode)
				&& Objects.equals(this.exchangeName, lineLocator.exchangeName)
				&& Objects.equals(this.districtCode, lineLocator.districtCode)
				&& Objects.equals(this.l2SID, lineLocator.l2SID)
				&& Objects.equals(this.cableLinkID, lineLocator.cableLinkID)
				&& Objects.equals(this.distributionPoint, lineLocator.distributionPoint)
				&& Objects.equals(this.cableProvider, lineLocator.cableProvider);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(exchangeCode, exchangeName, districtCode, l2SID, cableLinkID, distributionPoint,
				cableProvider);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineLocator {\n");

		sb.append("    exchangeCode: ").append(toIndentedString(exchangeCode)).append("\n");
		sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
		sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
		sb.append("    l2SID: ").append(toIndentedString(l2SID)).append("\n");
		sb.append("    cableLinkID: ").append(toIndentedString(cableLinkID)).append("\n");
		sb.append("    distributionPoint: ").append(toIndentedString(distributionPoint)).append("\n");
		sb.append("    cableProvider: ").append(toIndentedString(cableProvider)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 *
	 * @param o the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
