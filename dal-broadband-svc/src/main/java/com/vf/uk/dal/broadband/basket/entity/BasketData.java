package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * BasketData
 */
public class BasketData {
	private List<ModelPackage> packages = new ArrayList<>();

	private BasketDataDelivery delivery = null;
	/**
	 * 
	 * @param packages
	 * @return
	 */
	public BasketData packages(List<ModelPackage> packages) {
		this.packages = packages;
		return this;
	}
	/**
	 * 
	 * @param packagesItem
	 * @return
	 */
	public BasketData addPackagesItem(ModelPackage packagesItem) {
		this.packages.add(packagesItem);
		return this;
	}

	/**
	 * Get packages
	 * 
	 * @return packages
	 **/
	public List<ModelPackage> getPackages() {
		return packages;
	}

	public void setPackages(List<ModelPackage> packages) {
		this.packages = packages;
	}
	/**
	 * 
	 * @param delivery
	 * @return
	 */
	public BasketData delivery(BasketDataDelivery delivery) {
		this.delivery = delivery;
		return this;
	}

	/**
	 * Get delivery
	 * 
	 * @return delivery
	 **/
	public BasketDataDelivery getDelivery() {
		return delivery;
	}

	public void setDelivery(BasketDataDelivery delivery) {
		this.delivery = delivery;
	}

	
}
