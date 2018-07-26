package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Price.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class Price {
	
	/** The gross. */
	@JsonProperty("gross")
	private String gross = null;

	/** The net. */
	@JsonProperty("net")
	private String net = null;

	/** The vat. */
	@JsonProperty("vat")
	private String vat = null;

	/**
	 * Gross.
	 *
	 * @param gross the gross
	 * @return the price
	 */
	public Price gross(String gross) {
		this.gross = gross;
		return this;
	}

	/**
	 * Gross value of the item.
	 *
	 * @return gross
	 */
	@ApiModelProperty(value = "Gross value of the item")

	public String getGross() {
		return gross;
	}

	/**
	 * Sets the gross.
	 *
	 * @param gross the new gross
	 */
	public void setGross(String gross) {
		this.gross = gross;
	}

	/**
	 * Net.
	 *
	 * @param net the net
	 * @return the price
	 */
	public Price net(String net) {
		this.net = net;
		return this;
	}

	/**
	 * Net value of the item.
	 *
	 * @return net
	 */
	@ApiModelProperty(value = "Net value of the item")

	public String getNet() {
		return net;
	}

	/**
	 * Sets the net.
	 *
	 * @param net the new net
	 */
	public void setNet(String net) {
		this.net = net;
	}

	/**
	 * Vat.
	 *
	 * @param vat the vat
	 * @return the price
	 */
	public Price vat(String vat) {
		this.vat = vat;
		return this;
	}

	/**
	 * VAT component of the item price.
	 *
	 * @return vat
	 */
	@ApiModelProperty(value = "VAT component of the item price")

	public String getVat() {
		return vat;
	}

	/**
	 * Sets the vat.
	 *
	 * @param vat the new vat
	 */
	public void setVat(String vat) {
		this.vat = vat;
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
		Price price = (Price) o;
		return Objects.equals(this.gross, price.gross) && Objects.equals(this.net, price.net)
				&& Objects.equals(this.vat, price.vat);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(gross, net, vat);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
