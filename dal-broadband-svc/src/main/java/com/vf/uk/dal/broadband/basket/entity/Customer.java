package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Customer   {
  @JsonProperty("contactId")
  private String contactId = null;

  @JsonProperty("ownedAccounts")
  @Valid
  private List<String> ownedAccounts = null;

  /**
   * 
   * @param contactId
   * @return
   */
  public Customer contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

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
   * 
   * @param ownedAccounts
   * @return
   */
  public Customer ownedAccounts(List<String> ownedAccounts) {
    this.ownedAccounts = ownedAccounts;
    return this;
  }

  /**
   * 
   * @param ownedAccountsItem
   * @return
   */
  public Customer addOwnedAccountsItem(String ownedAccountsItem) {
    if (this.ownedAccounts == null) {
      this.ownedAccounts = new ArrayList<>();
    }
    this.ownedAccounts.add(ownedAccountsItem);
    return this;
  }

  /**
   * Get ownedAccounts
   * @return ownedAccounts
  **/
  @ApiModelProperty(value = "")


  public List<String> getOwnedAccounts() {
    return ownedAccounts;
  }

  public void setOwnedAccounts(List<String> ownedAccounts) {
    this.ownedAccounts = ownedAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.contactId, customer.contactId) &&
        Objects.equals(this.ownedAccounts, customer.ownedAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, ownedAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    ownedAccounts: ").append(toIndentedString(ownedAccounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

