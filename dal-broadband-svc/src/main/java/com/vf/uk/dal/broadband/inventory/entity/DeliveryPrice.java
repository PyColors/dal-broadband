package com.vf.uk.dal.broadband.inventory.entity;

import java.util.Objects;

/**
 * Price
 */

public class DeliveryPrice {
	private Double gross = null;

	private Double net = null;

	private Double vat = null;

	/**
	 * @param gross
	 * @return
	 */
	public DeliveryPrice gross(Double gross) {
		this.gross = gross;
		return this;
	}

	/**
	 * Gross value of the item
	 * 
	 * @return gross
	 **/
	public Double getGross() {
		return gross;
	}

	/**
	 * @param gross
	 */
	public void setGross(Double gross) {
		this.gross = gross;
	}

	/**
	 * @param net
	 * @return
	 */
	public DeliveryPrice net(Double net) {
		this.net = net;
		return this;
	}

	/**
	 * Net value of the item
	 * 
	 * @return net
	 **/
	public Double getNet() {
		return net;
	}

	/**
	 * @param net
	 */
	public void setNet(Double net) {
		this.net = net;
	}

	/**
	 * @param vat
	 * @return
	 */
	public DeliveryPrice vat(Double vat) {
		this.vat = vat;
		return this;
	}

	/**
	 * VAT component of the item price
	 * 
	 * @return vat
	 **/
	public Double getVat() {
		return vat;
	}

	/**
	 * @param vat
	 */
	public void setVat(Double vat) {
		this.vat = vat;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeliveryPrice price = (DeliveryPrice) o;
		return Objects.equals(this.gross, price.gross) && Objects.equals(this.net, price.net)
				&& Objects.equals(this.vat, price.vat);
	}

	@Override
	public int hashCode() {
		return Objects.hash(gross, net, vat);
	}
}

