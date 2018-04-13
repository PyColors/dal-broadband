package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * ValidationResultDetails
 */

public class ValidationResultDetails   {
  private ProductForValidation subject = null;

  private List<ProductForValidation> incompatibleWith = new ArrayList<>();

 

   /**
   * Get subject
   * @return subject
  **/
  public ProductForValidation getSubject() {
    return subject;
  }

  public void setSubject(ProductForValidation subject) {
    this.subject = subject;
  }

 

  

   /**
   * Get incompatibleWith
   * @return incompatibleWith
  **/
  public List<ProductForValidation> getIncompatibleWith() {
    return incompatibleWith;
  }

  public void setIncompatibleWith(List<ProductForValidation> incompatibleWith) {
    this.incompatibleWith = incompatibleWith;
  }


}

