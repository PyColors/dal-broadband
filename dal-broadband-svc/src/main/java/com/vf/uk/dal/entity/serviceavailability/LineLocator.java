package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineLocator
 */

public class LineLocator {
	@JsonProperty("exchangeCode")
	private String exchangeCode = null;

	@JsonProperty("exchangeName")
	private String exchangeName = null;

	@JsonProperty("districtCode")
	private String districtCode = null;

	@JsonProperty("L2SID")
	private String l2SID = null;

	@JsonProperty("cableLinkID")
	private String cableLinkID = null;

	@JsonProperty("distributionPoint")
	private String distributionPoint = null;

	@JsonProperty("cableProvider")
	private String cableProvider = null;

	public LineLocator exchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
		return this;
	}

	/**
	 * A unique exchange identifier related to the line
	 * 
	 * @return exchangeCode
	 **/
	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public LineLocator exchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
		return this;
	}

	/**
	 * The name of the exchange corresponding to the exchange code
	 * 
	 * @return exchangeName
	 **/
	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public LineLocator districtCode(String districtCode) {
		this.districtCode = districtCode;
		return this;
	}

	/**
	 * A unique code that identifies the District where the line belongs
	 * 
	 * @return districtCode
	 **/
	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public LineLocator l2SID(String l2SID) {
		this.l2SID = l2SID;
		return this;
	}

	/**
	 * The Identify of the L2S switch in the exchange
	 * 
	 * @return l2SID
	 **/
	public String getL2SID() {
		return l2SID;
	}

	public void setL2SID(String l2SID) {
		this.l2SID = l2SID;
	}

	public LineLocator cableLinkID(String cableLinkID) {
		this.cableLinkID = cableLinkID;
		return this;
	}

	/**
	 * The Identify of the Cable Link for the line
	 * 
	 * @return cableLinkID
	 **/
	public String getCableLinkID() {
		return cableLinkID;
	}

	public void setCableLinkID(String cableLinkID) {
		this.cableLinkID = cableLinkID;
	}

	public LineLocator distributionPoint(String distributionPoint) {
		this.distributionPoint = distributionPoint;
		return this;
	}

	/**
	 * The Distribution Point for this line
	 * 
	 * @return distributionPoint
	 **/
	public String getDistributionPoint() {
		return distributionPoint;
	}

	public void setDistributionPoint(String distributionPoint) {
		this.distributionPoint = distributionPoint;
	}

	public LineLocator cableProvider(String cableProvider) {
		this.cableProvider = cableProvider;
		return this;
	}

	/**
	 * The range holder of the FLN or The cable provider of the FLN number
	 * 
	 * @return cableProvider
	 **/
	public String getCableProvider() {
		return cableProvider;
	}

	public void setCableProvider(String cableProvider) {
		this.cableProvider = cableProvider;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(exchangeCode, exchangeName, districtCode, l2SID, cableLinkID, distributionPoint,
				cableProvider);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
