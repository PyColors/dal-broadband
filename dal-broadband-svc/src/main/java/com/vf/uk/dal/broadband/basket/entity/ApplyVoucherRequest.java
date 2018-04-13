package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;
/**
 * ApplyVoucherRequest
 */

public class ApplyVoucherRequest   {
  private String voucherCode = null;

  private Boolean removeVoucherCode = null;

  

   /**
   * voucher code  specified by the customer
   * @return voucherCode
  **/
  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }

 

   /**
   *  remove the voucher code  specified by the customer if you pass true we will remove the voucher from basket
   * @return removeVoucherCode
  **/
  public Boolean getRemoveVoucherCode() {
    return removeVoucherCode;
  }

  public void setRemoveVoucherCode(Boolean removeVoucherCode) {
    this.removeVoucherCode = removeVoucherCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyVoucherRequest applyVoucherRequest = (ApplyVoucherRequest) o;
    return Objects.equals(this.voucherCode, applyVoucherRequest.voucherCode) &&
        Objects.equals(this.removeVoucherCode, applyVoucherRequest.removeVoucherCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherCode, removeVoucherCode);
  }

  
}

