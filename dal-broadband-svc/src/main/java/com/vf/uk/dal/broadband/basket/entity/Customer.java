package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
/**
 * Customer
 */

public class Customer   {
  private String contactId = null;

  private List<String> ownedAccounts = new ArrayList<>();



   /**
   * The contactId of the user building the order. Blank if anonymous
   * @return contactId
  **/
  @ApiModelProperty(value = "The contactId of the user building the order. Blank if anonymous")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }



   /**
   * Get ownedAccounts
   * @return ownedAccounts
  **/
  public List<String> getOwnedAccounts() {
    return ownedAccounts;
  }

  public void setOwnedAccounts(List<String> ownedAccounts) {
    this.ownedAccounts = ownedAccounts;
  }

  
}

