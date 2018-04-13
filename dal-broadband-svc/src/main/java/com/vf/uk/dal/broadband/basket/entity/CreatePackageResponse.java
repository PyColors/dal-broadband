package com.vf.uk.dal.broadband.basket.entity;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;



/**
 * 
 * @author sahil.monga
 *
 */
public class CreatePackageResponse   {
  private String packageId = null;

  //Change for 3912
  private String accountCategory = null;

  
  @JsonIgnore
  private Basket basket;


	private Integer sequence = null;

	private String packageType = null;

	private Boolean removable = null;

	private List<String> dependentOn = new ArrayList<>();

	private Bundle bundle = null;

	private List<Hardware> hardwares = new ArrayList<>();

	private List<Service> services = new ArrayList<>();

	private List<Discount> discounts = new ArrayList<>();

	private PriceDetails priceDetails = null;

	private boolean isChanged;
	
	private String voucherCode = null;

	//start for 6774
	@JsonIgnore
	CompatiblityResponse compatiblityResponse;
	
	//End
 
   public String getVoucherCode() {
		return voucherCode;
	}

	

	public CompatiblityResponse getCompatiblityResponse() {
	return compatiblityResponse;
}



public void setCompatiblityResponse(CompatiblityResponse compatiblityResponse) {
	this.compatiblityResponse = compatiblityResponse;
}



	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

/**
   * Get packageId
   * @return packageId
  **/
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }
  public Boolean getIsChanged() {
		return isChanged;
	}

	public void setIsChanged(Boolean isChanged) {
		this.isChanged = isChanged;
	}

public String getAccountCategory() {
	return accountCategory;
}

public void setAccountCategory(String accountCategory) {
	this.accountCategory = accountCategory;
}

public Integer getSequence() {
	return sequence;
}

public void setSequence(Integer sequence) {
	this.sequence = sequence;
}

public String getPackageType() {
	return packageType;
}

public void setPackageType(String packageType) {
	this.packageType = packageType;
}

public Boolean getRemovable() {
	return removable;
}

public void setRemovable(Boolean removable) {
	this.removable = removable;
}

public List<String> getDependentOn() {
	return dependentOn;
}

public void setDependentOn(List<String> dependentOn) {
	this.dependentOn = dependentOn;
}

public Bundle getBundle() {
	return bundle;
}

public void setBundle(Bundle bundle) {
	this.bundle = bundle;
}

public List<Hardware> getHardwares() {
	return hardwares;
}

public void setHardwares(List<Hardware> hardwares) {
	this.hardwares = hardwares;
}

public List<Service> getServices() {
	return services;
}

public void setServices(List<Service> services) {
	this.services = services;
}

public List<Discount> getDiscounts() {
	return discounts;
}

public void setDiscounts(List<Discount> discounts) {
	this.discounts = discounts;
}

public PriceDetails getPriceDetails() {
	return priceDetails;
}

public void setPriceDetails(PriceDetails priceDetails) {
	this.priceDetails = priceDetails;
}

public Basket getBasket() {
	return basket;
}

public void setBasket(Basket basket) {
	this.basket = basket;
}


}

