package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * UpdatePackage
 */

public class UpdatePackage   {
  private String packageType = null;

  private String accountCategory = null;
  
  private UpdateBundle bundle = null;

  

  private List<UpdateDevice> hardwares = new ArrayList<>();

  private List<UpdateService> services = new ArrayList<>();

 

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
   * @return accountCategory
  **/
  public String getAccountCategory() {
    return accountCategory;
  }

  public void setAccountCategory(String accountCategory) {
    this.accountCategory = accountCategory;
  }



   /**
   * Get hardwares
   * @return hardwares
  **/
  public List<UpdateDevice> getHardwares() {
    return hardwares;
  }

  public void setHardwares(List<UpdateDevice> hardwares) {
    this.hardwares = hardwares;
  }



   /**
   * Get services
   * @return services
  **/
  public List<UpdateService> getServices() {
    return services;
  }

  public void setServices(List<UpdateService> services) {
    this.services = services;
  }


public UpdateBundle getBundle() {
	return bundle;
}

public void setBundle(UpdateBundle bundle) {
	this.bundle = bundle;
}
}

