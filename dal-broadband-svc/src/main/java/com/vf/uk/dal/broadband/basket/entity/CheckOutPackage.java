package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * CheckOutPackage
 */

public class CheckOutPackage   {
  private String packageId = null;

  private String accountCategory = null;

  private Integer sequence = null;

  private String packageType = null;

  private List<String> dependentOn = new ArrayList<>();

  private CheckOutBundle bundle = null;

  private List<CheckOutHardware> hardwares = new ArrayList<>();

  private List<Service> services = new ArrayList<>();

  private PriceDetails priceDetails = null;

  private List<Discount> discounts = new ArrayList<>();

  

   /**
   * Unique ID for the package
   * @return packageId
  **/
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  

   /**
package com.vf.uk.dal.broadband.basket;
   * @return accountCategory
  **/

  public String getAccountCategory() {
    return accountCategory;
  }

  public void setAccountCategory(String accountCategory) {
    this.accountCategory = accountCategory;
  }



   /**
package com.vf.uk.dal.broadband.basket;
   * @return sequence
  **/

  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

 

   /**
   * Type of the package. Possible list is \"Acquisition\", \"Retention\", \"TariffMigration\", \"PreToPost\", \"Modify\"
   * @return packageType
  **/
  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

 

 

   /**
package com.vf.uk.dal.broadband.basket;
   * @return dependentOn
  **/

  public List<String> getDependentOn() {
    return dependentOn;
  }

  public void setDependentOn(List<String> dependentOn) {
    this.dependentOn = dependentOn;
  }



   /**
   * Get bundle
   * @return bundle
  **/
  public CheckOutBundle getBundle() {
    return bundle;
  }

  public void setBundle(CheckOutBundle bundle) {
    this.bundle = bundle;
  }



   /**
   * Get hardwares
   * @return hardwares
  **/
  public List<CheckOutHardware> getHardwares() {
    return hardwares;
  }

  public void setHardwares(List<CheckOutHardware> hardwares) {
    this.hardwares = hardwares;
  }

 

   /**
   * Get services
   * @return services
  **/
  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }



   /**
   * Get priceDetails
   * @return priceDetails
  **/
  public PriceDetails getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
  }





   /**
   * Get discounts
   * @return discounts
  **/
  public List<Discount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<Discount> discounts) {
    this.discounts = discounts;
  }

}

