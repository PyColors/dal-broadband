package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Basket
 */

public class BasketRequest {
	
	@JsonProperty("packageId")
	private String packageId;
	
	@JsonProperty("addBundle")
	private AddBundle addBundle;
	
	@JsonProperty("addHardware")
	private AddHardware addHardware;

	@JsonProperty("serviceIds")
	private List<String> serviceIds = new ArrayList<>();

	@JsonProperty("selectedPackageCode")
	private String selectedPackageCode = null;
	
	@JsonProperty("source")
	private String source = null;
	
	
	@JsonProperty("customerRequestedDate")
	private String customerRequestedDate = null;

	
	public List<String> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public String getSelectedPackageCode() {
		return selectedPackageCode;
	}

	public void setSelectedPackageCode(String selectedPackageCode) {
		this.selectedPackageCode = selectedPackageCode;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public AddBundle getAddBundle() {
		return addBundle;
	}

	public void setAddBundle(AddBundle addBundle) {
		this.addBundle = addBundle;
	}

	public AddHardware getAddHardware() {
		return addHardware;
	}

	public void setAddHardware(AddHardware addHardware) {
		this.addHardware = addHardware;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getCustomerRequestedDate() {
		return customerRequestedDate;
	}

	public void setCustomerRequestedDate(String customerRequestedDate) {
		this.customerRequestedDate = customerRequestedDate;
	}

}
