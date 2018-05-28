package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class PriceForHardware implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6342890537527020273L;

	
	@JsonProperty("engVisitProductId")
	private String engVisitProductId = null;
	
	@JsonProperty("gross")
	private String gross = null;

	@JsonProperty("net")
	private String net = null;

	@JsonProperty("vat")
	private String vat = null;

	/**
	 * @param gross
	 * @return
	 */
	public PriceForHardware gross(String gross) {
		this.gross = gross;
		return this;
	}

	/**
	 * Gross value of the item
	 * 
	 * @return gross
	 **/
	@ApiModelProperty(value = "Gross value of the item")

	public String getGross() {
		return gross;
	}

	public void setGross(String gross) {
		this.gross = gross;
	}

	/**
	 * @param net
	 * @return
	 */
	public PriceForHardware net(String net) {
		this.net = net;
		return this;
	}

	/**
	 * Net value of the item
	 * 
	 * @return net
	 **/
	@ApiModelProperty(value = "Net value of the item")

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	/**
	 * @param vat
	 * @return
	 */
	public PriceForHardware vat(String vat) {
		this.vat = vat;
		return this;
	}

	/**
	 * VAT component of the item price
	 * 
	 * @return vat
	 **/
	@ApiModelProperty(value = "VAT component of the item price")

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getEngVisitProductId() {
		return engVisitProductId;
	}

	public void setEngVisitProductId(String engVisitProductId) {
		this.engVisitProductId = engVisitProductId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PriceForHardware price = (PriceForHardware) o;
		return Objects.equals(this.gross, price.gross) && Objects.equals(this.net, price.net)
				&& Objects.equals(this.vat, price.vat);
	}

	@Override
	public int hashCode() {
		return Objects.hash(gross, net, vat);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Price {\n");

		sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
		sb.append("    net: ").append(toIndentedString(net)).append("\n");
		sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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
