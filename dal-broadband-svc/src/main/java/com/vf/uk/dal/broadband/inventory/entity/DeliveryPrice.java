package com.vf.uk.dal.broadband.inventory.entity;

import java.util.Objects;

/**
 * Price.
 */

public class DeliveryPrice {
	
	/** The gross. */
	private Double gross = null;

	/** The net. */
	private Double net = null;

	/** The vat. */
	private Double vat = null;

	/**
	 * Gross.
	 *
	 * @param gross the gross
	 * @return the delivery price
	 */
	public DeliveryPrice gross(Double gross) {
		this.gross = gross;
		return this;
	}

	/**
	 * Gross value of the item.
	 *
	 * @return gross
	 */
	public Double getGross() {
		return gross;
	}

	/**
	 * Sets the gross.
	 *
	 * @param gross the new gross
	 */
	public void setGross(Double gross) {
		this.gross = gross;
	}

	/**
	 * Net.
	 *
	 * @param net the net
	 * @return the delivery price
	 */
	public DeliveryPrice net(Double net) {
		this.net = net;
		return this;
	}

	/**
	 * Net value of the item.
	 *
	 * @return net
	 */
	public Double getNet() {
		return net;
	}

	/**
	 * Sets the net.
	 *
	 * @param net the new net
	 */
	public void setNet(Double net) {
		this.net = net;
	}

	/**
	 * Vat.
	 *
	 * @param vat the vat
	 * @return the delivery price
	 */
	public DeliveryPrice vat(Double vat) {
		this.vat = vat;
		return this;
	}

	/**
	 * VAT component of the item price.
	 *
	 * @return vat
	 */
	public Double getVat() {
		return vat;
	}

	/**
	 * Sets the vat.
	 *
	 * @param vat the new vat
	 */
	public void setVat(Double vat) {
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
		DeliveryPrice price = (DeliveryPrice) o;
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
}

