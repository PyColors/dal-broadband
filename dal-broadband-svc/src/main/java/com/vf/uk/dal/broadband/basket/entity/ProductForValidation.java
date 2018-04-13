package com.vf.uk.dal.broadband.basket.entity;

/**
 * ProductForValidation
 */

public class ProductForValidation   {
  private String productId = null;

  private String productName = null;

  private String packageLineId = null;

  private Integer packageSequence = null;



   /**
   * Service request date specified by the customer
   * @return productId
  **/
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


   /**
   * Name of the product
   * @return productName
  **/
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }



   /**
   * Service request date specified by the customer
   * @return packageLineId
  **/
  public String getPackageLineId() {
    return packageLineId;
  }

  public void setPackageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
  }

 

   /**
   * Package sequence number as available in get basket operation
   * @return packageSequence
  **/
  public Integer getPackageSequence() {
    return packageSequence;
  }

  public void setPackageSequence(Integer packageSequence) {
    this.packageSequence = packageSequence;
  }

}

