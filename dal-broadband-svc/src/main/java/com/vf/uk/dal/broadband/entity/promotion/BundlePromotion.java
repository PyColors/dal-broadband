package com.vf.uk.dal.broadband.entity.promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BundlePromotion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")

public class BundlePromotion   {
  @JsonProperty("bundleId")
  private String bundleId = null;

  @JsonProperty("dataAllowances")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> dataAllowances = null;

  @JsonProperty("entertainmentPacks")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> entertainmentPacks = null;

  @JsonProperty("freeAccessory")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareAccessory> freeAccessory = null;

  @JsonProperty("freeExtras")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareExtras> freeExtras = null;

  @JsonProperty("planCouplingPromotions")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> planCouplingPromotions = null;

  @JsonProperty("promotions")
  @Valid
  private List<Cataloguepromotions> promotions = null;

  @JsonProperty("sash")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareSash> sash = null;

  @JsonProperty("secureNet")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> secureNet = null;

  public BundlePromotion bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
  **/
  @ApiModelProperty(value = "")


  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public BundlePromotion dataAllowances(List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> dataAllowances) {
    this.dataAllowances = dataAllowances;
    return this;
  }

  public BundlePromotion addDataAllowancesItem(CataloguepromotionqueriesForBundleAndHardwareDataAllowances dataAllowancesItem) {
    if (this.dataAllowances == null) {
      this.dataAllowances = new ArrayList<>();
    }
    this.dataAllowances.add(dataAllowancesItem);
    return this;
  }

  /**
   * Get dataAllowances
   * @return dataAllowances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> getDataAllowances() {
    return dataAllowances;
  }

  public void setDataAllowances(List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> dataAllowances) {
    this.dataAllowances = dataAllowances;
  }

  public BundlePromotion entertainmentPacks(List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> entertainmentPacks) {
    this.entertainmentPacks = entertainmentPacks;
    return this;
  }

  public BundlePromotion addEntertainmentPacksItem(CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks entertainmentPacksItem) {
    if (this.entertainmentPacks == null) {
      this.entertainmentPacks = new ArrayList<>();
    }
    this.entertainmentPacks.add(entertainmentPacksItem);
    return this;
  }

  /**
   * Get entertainmentPacks
   * @return entertainmentPacks
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> getEntertainmentPacks() {
    return entertainmentPacks;
  }

  public void setEntertainmentPacks(List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> entertainmentPacks) {
    this.entertainmentPacks = entertainmentPacks;
  }

  public BundlePromotion freeAccessory(List<CataloguepromotionqueriesForBundleAndHardwareAccessory> freeAccessory) {
    this.freeAccessory = freeAccessory;
    return this;
  }

  public BundlePromotion addFreeAccessoryItem(CataloguepromotionqueriesForBundleAndHardwareAccessory freeAccessoryItem) {
    if (this.freeAccessory == null) {
      this.freeAccessory = new ArrayList<>();
    }
    this.freeAccessory.add(freeAccessoryItem);
    return this;
  }

  /**
   * Get freeAccessory
   * @return freeAccessory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareAccessory> getFreeAccessory() {
    return freeAccessory;
  }

  public void setFreeAccessory(List<CataloguepromotionqueriesForBundleAndHardwareAccessory> freeAccessory) {
    this.freeAccessory = freeAccessory;
  }

  public BundlePromotion freeExtras(List<CataloguepromotionqueriesForBundleAndHardwareExtras> freeExtras) {
    this.freeExtras = freeExtras;
    return this;
  }

  public BundlePromotion addFreeExtrasItem(CataloguepromotionqueriesForBundleAndHardwareExtras freeExtrasItem) {
    if (this.freeExtras == null) {
      this.freeExtras = new ArrayList<>();
    }
    this.freeExtras.add(freeExtrasItem);
    return this;
  }

  /**
   * Get freeExtras
   * @return freeExtras
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareExtras> getFreeExtras() {
    return freeExtras;
  }

  public void setFreeExtras(List<CataloguepromotionqueriesForBundleAndHardwareExtras> freeExtras) {
    this.freeExtras = freeExtras;
  }

  public BundlePromotion planCouplingPromotions(List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> planCouplingPromotions) {
    this.planCouplingPromotions = planCouplingPromotions;
    return this;
  }

  public BundlePromotion addPlanCouplingPromotionsItem(CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions planCouplingPromotionsItem) {
    if (this.planCouplingPromotions == null) {
      this.planCouplingPromotions = new ArrayList<>();
    }
    this.planCouplingPromotions.add(planCouplingPromotionsItem);
    return this;
  }

  /**
   * Get planCouplingPromotions
   * @return planCouplingPromotions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> getPlanCouplingPromotions() {
    return planCouplingPromotions;
  }

  public void setPlanCouplingPromotions(List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> planCouplingPromotions) {
    this.planCouplingPromotions = planCouplingPromotions;
  }

  public BundlePromotion promotions(List<Cataloguepromotions> promotions) {
    this.promotions = promotions;
    return this;
  }

  public BundlePromotion addPromotionsItem(Cataloguepromotions promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<>();
    }
    this.promotions.add(promotionsItem);
    return this;
  }

  /**
   * This List consists of all Promotions applicable to Bundle
   * @return promotions
  **/
  @ApiModelProperty(value = "This List consists of all Promotions applicable to Bundle")

  @Valid

  public List<Cataloguepromotions> getPromotions() {
    return promotions;
  }

  public void setPromotions(List<Cataloguepromotions> promotions) {
    this.promotions = promotions;
  }

  public BundlePromotion sash(List<CataloguepromotionqueriesForBundleAndHardwareSash> sash) {
    this.sash = sash;
    return this;
  }

  public BundlePromotion addSashItem(CataloguepromotionqueriesForBundleAndHardwareSash sashItem) {
    if (this.sash == null) {
      this.sash = new ArrayList<>();
    }
    this.sash.add(sashItem);
    return this;
  }

  /**
   * Get sash
   * @return sash
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareSash> getSash() {
    return sash;
  }

  public void setSash(List<CataloguepromotionqueriesForBundleAndHardwareSash> sash) {
    this.sash = sash;
  }

  public BundlePromotion secureNet(List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> secureNet) {
    this.secureNet = secureNet;
    return this;
  }

  public BundlePromotion addSecureNetItem(CataloguepromotionqueriesForBundleAndHardwareSecureNet secureNetItem) {
    if (this.secureNet == null) {
      this.secureNet = new ArrayList<>();
    }
    this.secureNet.add(secureNetItem);
    return this;
  }

  /**
   * Get secureNet
   * @return secureNet
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> getSecureNet() {
    return secureNet;
  }

  public void setSecureNet(List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> secureNet) {
    this.secureNet = secureNet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundlePromotion bundlePromotion = (BundlePromotion) o;
    return Objects.equals(this.bundleId, bundlePromotion.bundleId) &&
        Objects.equals(this.dataAllowances, bundlePromotion.dataAllowances) &&
        Objects.equals(this.entertainmentPacks, bundlePromotion.entertainmentPacks) &&
        Objects.equals(this.freeAccessory, bundlePromotion.freeAccessory) &&
        Objects.equals(this.freeExtras, bundlePromotion.freeExtras) &&
        Objects.equals(this.planCouplingPromotions, bundlePromotion.planCouplingPromotions) &&
        Objects.equals(this.promotions, bundlePromotion.promotions) &&
        Objects.equals(this.sash, bundlePromotion.sash) &&
        Objects.equals(this.secureNet, bundlePromotion.secureNet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, dataAllowances, entertainmentPacks, freeAccessory, freeExtras, planCouplingPromotions, promotions, sash, secureNet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundlePromotion {\n");
    
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    dataAllowances: ").append(toIndentedString(dataAllowances)).append("\n");
    sb.append("    entertainmentPacks: ").append(toIndentedString(entertainmentPacks)).append("\n");
    sb.append("    freeAccessory: ").append(toIndentedString(freeAccessory)).append("\n");
    sb.append("    freeExtras: ").append(toIndentedString(freeExtras)).append("\n");
    sb.append("    planCouplingPromotions: ").append(toIndentedString(planCouplingPromotions)).append("\n");
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
    sb.append("    sash: ").append(toIndentedString(sash)).append("\n");
    sb.append("    secureNet: ").append(toIndentedString(secureNet)).append("\n");
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

