package com.vf.uk.dal.broadband.entity.promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BundlePromotion.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")

public class BundlePromotion   {
  
  /** The bundle id. */
  @JsonProperty("bundleId")
  private String bundleId = null;

  /** The data allowances. */
  @JsonProperty("dataAllowances")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> dataAllowances = null;

  /** The entertainment packs. */
  @JsonProperty("entertainmentPacks")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> entertainmentPacks = null;

  /** The free accessory. */
  @JsonProperty("freeAccessory")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareAccessory> freeAccessory = null;

  /** The free extras. */
  @JsonProperty("freeExtras")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareExtras> freeExtras = null;

  /** The plan coupling promotions. */
  @JsonProperty("planCouplingPromotions")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> planCouplingPromotions = null;

  /** The promotions. */
  @JsonProperty("promotions")
  @Valid
  private List<Cataloguepromotions> promotions = null;

  /** The sash. */
  @JsonProperty("sash")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareSash> sash = null;

  /** The secure net. */
  @JsonProperty("secureNet")
  @Valid
  private List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> secureNet = null;

  /**
   * Bundle id.
   *
   * @param bundleId the bundle id
   * @return the bundle promotion
   */
  public BundlePromotion bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId.
   *
   * @return bundleId
   */
  @ApiModelProperty(value = "")


  public String getBundleId() {
    return bundleId;
  }

  /**
   * Sets the bundle id.
   *
   * @param bundleId the new bundle id
   */
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  /**
   * Data allowances.
   *
   * @param dataAllowances the data allowances
   * @return the bundle promotion
   */
  public BundlePromotion dataAllowances(List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> dataAllowances) {
    this.dataAllowances = dataAllowances;
    return this;
  }

  /**
   * Adds the data allowances item.
   *
   * @param dataAllowancesItem the data allowances item
   * @return the bundle promotion
   */
  public BundlePromotion addDataAllowancesItem(CataloguepromotionqueriesForBundleAndHardwareDataAllowances dataAllowancesItem) {
    if (this.dataAllowances == null) {
      this.dataAllowances = new ArrayList<>();
    }
    this.dataAllowances.add(dataAllowancesItem);
    return this;
  }

  /**
   * Get dataAllowances.
   *
   * @return dataAllowances
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> getDataAllowances() {
    return dataAllowances;
  }

  /**
   * Sets the data allowances.
   *
   * @param dataAllowances the new data allowances
   */
  public void setDataAllowances(List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> dataAllowances) {
    this.dataAllowances = dataAllowances;
  }

  /**
   * Entertainment packs.
   *
   * @param entertainmentPacks the entertainment packs
   * @return the bundle promotion
   */
  public BundlePromotion entertainmentPacks(List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> entertainmentPacks) {
    this.entertainmentPacks = entertainmentPacks;
    return this;
  }

  /**
   * Adds the entertainment packs item.
   *
   * @param entertainmentPacksItem the entertainment packs item
   * @return the bundle promotion
   */
  public BundlePromotion addEntertainmentPacksItem(CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks entertainmentPacksItem) {
    if (this.entertainmentPacks == null) {
      this.entertainmentPacks = new ArrayList<>();
    }
    this.entertainmentPacks.add(entertainmentPacksItem);
    return this;
  }

  /**
   * Get entertainmentPacks.
   *
   * @return entertainmentPacks
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> getEntertainmentPacks() {
    return entertainmentPacks;
  }

  /**
   * Sets the entertainment packs.
   *
   * @param entertainmentPacks the new entertainment packs
   */
  public void setEntertainmentPacks(List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> entertainmentPacks) {
    this.entertainmentPacks = entertainmentPacks;
  }

  /**
   * Free accessory.
   *
   * @param freeAccessory the free accessory
   * @return the bundle promotion
   */
  public BundlePromotion freeAccessory(List<CataloguepromotionqueriesForBundleAndHardwareAccessory> freeAccessory) {
    this.freeAccessory = freeAccessory;
    return this;
  }

  /**
   * Adds the free accessory item.
   *
   * @param freeAccessoryItem the free accessory item
   * @return the bundle promotion
   */
  public BundlePromotion addFreeAccessoryItem(CataloguepromotionqueriesForBundleAndHardwareAccessory freeAccessoryItem) {
    if (this.freeAccessory == null) {
      this.freeAccessory = new ArrayList<>();
    }
    this.freeAccessory.add(freeAccessoryItem);
    return this;
  }

  /**
   * Get freeAccessory.
   *
   * @return freeAccessory
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareAccessory> getFreeAccessory() {
    return freeAccessory;
  }

  /**
   * Sets the free accessory.
   *
   * @param freeAccessory the new free accessory
   */
  public void setFreeAccessory(List<CataloguepromotionqueriesForBundleAndHardwareAccessory> freeAccessory) {
    this.freeAccessory = freeAccessory;
  }

  /**
   * Free extras.
   *
   * @param freeExtras the free extras
   * @return the bundle promotion
   */
  public BundlePromotion freeExtras(List<CataloguepromotionqueriesForBundleAndHardwareExtras> freeExtras) {
    this.freeExtras = freeExtras;
    return this;
  }

  /**
   * Adds the free extras item.
   *
   * @param freeExtrasItem the free extras item
   * @return the bundle promotion
   */
  public BundlePromotion addFreeExtrasItem(CataloguepromotionqueriesForBundleAndHardwareExtras freeExtrasItem) {
    if (this.freeExtras == null) {
      this.freeExtras = new ArrayList<>();
    }
    this.freeExtras.add(freeExtrasItem);
    return this;
  }

  /**
   * Get freeExtras.
   *
   * @return freeExtras
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareExtras> getFreeExtras() {
    return freeExtras;
  }

  /**
   * Sets the free extras.
   *
   * @param freeExtras the new free extras
   */
  public void setFreeExtras(List<CataloguepromotionqueriesForBundleAndHardwareExtras> freeExtras) {
    this.freeExtras = freeExtras;
  }

  /**
   * Plan coupling promotions.
   *
   * @param planCouplingPromotions the plan coupling promotions
   * @return the bundle promotion
   */
  public BundlePromotion planCouplingPromotions(List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> planCouplingPromotions) {
    this.planCouplingPromotions = planCouplingPromotions;
    return this;
  }

  /**
   * Adds the plan coupling promotions item.
   *
   * @param planCouplingPromotionsItem the plan coupling promotions item
   * @return the bundle promotion
   */
  public BundlePromotion addPlanCouplingPromotionsItem(CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions planCouplingPromotionsItem) {
    if (this.planCouplingPromotions == null) {
      this.planCouplingPromotions = new ArrayList<>();
    }
    this.planCouplingPromotions.add(planCouplingPromotionsItem);
    return this;
  }

  /**
   * Get planCouplingPromotions.
   *
   * @return planCouplingPromotions
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> getPlanCouplingPromotions() {
    return planCouplingPromotions;
  }

  /**
   * Sets the plan coupling promotions.
   *
   * @param planCouplingPromotions the new plan coupling promotions
   */
  public void setPlanCouplingPromotions(List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> planCouplingPromotions) {
    this.planCouplingPromotions = planCouplingPromotions;
  }

  /**
   * Promotions.
   *
   * @param promotions the promotions
   * @return the bundle promotion
   */
  public BundlePromotion promotions(List<Cataloguepromotions> promotions) {
    this.promotions = promotions;
    return this;
  }

  /**
   * Adds the promotions item.
   *
   * @param promotionsItem the promotions item
   * @return the bundle promotion
   */
  public BundlePromotion addPromotionsItem(Cataloguepromotions promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<>();
    }
    this.promotions.add(promotionsItem);
    return this;
  }

  /**
   * This List consists of all Promotions applicable to Bundle.
   *
   * @return promotions
   */
  @ApiModelProperty(value = "This List consists of all Promotions applicable to Bundle")

  @Valid

  public List<Cataloguepromotions> getPromotions() {
    return promotions;
  }

  /**
   * Sets the promotions.
   *
   * @param promotions the new promotions
   */
  public void setPromotions(List<Cataloguepromotions> promotions) {
    this.promotions = promotions;
  }

  /**
   * Sash.
   *
   * @param sash the sash
   * @return the bundle promotion
   */
  public BundlePromotion sash(List<CataloguepromotionqueriesForBundleAndHardwareSash> sash) {
    this.sash = sash;
    return this;
  }

  /**
   * Adds the sash item.
   *
   * @param sashItem the sash item
   * @return the bundle promotion
   */
  public BundlePromotion addSashItem(CataloguepromotionqueriesForBundleAndHardwareSash sashItem) {
    if (this.sash == null) {
      this.sash = new ArrayList<>();
    }
    this.sash.add(sashItem);
    return this;
  }

  /**
   * Get sash.
   *
   * @return sash
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareSash> getSash() {
    return sash;
  }

  /**
   * Sets the sash.
   *
   * @param sash the new sash
   */
  public void setSash(List<CataloguepromotionqueriesForBundleAndHardwareSash> sash) {
    this.sash = sash;
  }

  /**
   * Secure net.
   *
   * @param secureNet the secure net
   * @return the bundle promotion
   */
  public BundlePromotion secureNet(List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> secureNet) {
    this.secureNet = secureNet;
    return this;
  }

  /**
   * Adds the secure net item.
   *
   * @param secureNetItem the secure net item
   * @return the bundle promotion
   */
  public BundlePromotion addSecureNetItem(CataloguepromotionqueriesForBundleAndHardwareSecureNet secureNetItem) {
    if (this.secureNet == null) {
      this.secureNet = new ArrayList<>();
    }
    this.secureNet.add(secureNetItem);
    return this;
  }

  /**
   * Get secureNet.
   *
   * @return secureNet
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> getSecureNet() {
    return secureNet;
  }

  /**
   * Sets the secure net.
   *
   * @param secureNet the new secure net
   */
  public void setSecureNet(List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> secureNet) {
    this.secureNet = secureNet;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(bundleId, dataAllowances, entertainmentPacks, freeAccessory, freeExtras, planCouplingPromotions, promotions, sash, secureNet);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

