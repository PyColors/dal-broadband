package com.vf.uk.dal.broadband.entity.promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CataloguepromotionqueriesForBundleAndHardwareDataAllowances
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")

public class CataloguepromotionqueriesForBundleAndHardwareDataAllowances {
	@JsonProperty("description")
	private String description = null;

	@JsonProperty("footNotes")
	@Valid
	private List<String> footNotes = null;

	@JsonProperty("freeData")
	private CataloguepromotionqueriesForBundleAndHardwareFreeData freeData = null;

	@JsonProperty("label")
	private String label = null;

	@JsonProperty("packageType")
	@Valid
	private List<String> packageType = null;

	@JsonProperty("priority")
	private String priority = null;

	@JsonProperty("promotionMedia")
	private String promotionMedia = null;

	@JsonProperty("tag")
	private String tag = null;

	@JsonProperty("type")
	private String type = null;

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances footNotes(List<String> footNotes) {
		this.footNotes = footNotes;
		return this;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances addFootNotesItem(String footNotesItem) {
		if (this.footNotes == null) {
			this.footNotes = new ArrayList<String>();
		}
		this.footNotes.add(footNotesItem);
		return this;
	}

	/**
	 * Get footNotes
	 * 
	 * @return footNotes
	 **/
	@ApiModelProperty(value = "")

	public List<String> getFootNotes() {
		return footNotes;
	}

	public void setFootNotes(List<String> footNotes) {
		this.footNotes = footNotes;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances freeData(
			CataloguepromotionqueriesForBundleAndHardwareFreeData freeData) {
		this.freeData = freeData;
		return this;
	}

	/**
	 * Get freeData
	 * 
	 * @return freeData
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public CataloguepromotionqueriesForBundleAndHardwareFreeData getFreeData() {
		return freeData;
	}

	public void setFreeData(CataloguepromotionqueriesForBundleAndHardwareFreeData freeData) {
		this.freeData = freeData;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Get label
	 * 
	 * @return label
	 **/
	@ApiModelProperty(value = "")

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances packageType(List<String> packageType) {
		this.packageType = packageType;
		return this;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances addPackageTypeItem(String packageTypeItem) {
		if (this.packageType == null) {
			this.packageType = new ArrayList<String>();
		}
		this.packageType.add(packageTypeItem);
		return this;
	}

	/**
	 * Get packageType
	 * 
	 * @return packageType
	 **/
	@ApiModelProperty(value = "")

	public List<String> getPackageType() {
		return packageType;
	}

	public void setPackageType(List<String> packageType) {
		this.packageType = packageType;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances priority(String priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get priority
	 * 
	 * @return priority
	 **/
	@ApiModelProperty(value = "")

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances promotionMedia(String promotionMedia) {
		this.promotionMedia = promotionMedia;
		return this;
	}

	/**
	 * Get promotionMedia
	 * 
	 * @return promotionMedia
	 **/
	@ApiModelProperty(value = "")

	public String getPromotionMedia() {
		return promotionMedia;
	}

	public void setPromotionMedia(String promotionMedia) {
		this.promotionMedia = promotionMedia;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances tag(String tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get tag
	 * 
	 * @return tag
	 **/
	@ApiModelProperty(value = "")

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public CataloguepromotionqueriesForBundleAndHardwareDataAllowances type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CataloguepromotionqueriesForBundleAndHardwareDataAllowances cataloguepromotionqueriesForBundleAndHardwareDataAllowances = (CataloguepromotionqueriesForBundleAndHardwareDataAllowances) o;
		return Objects.equals(this.description, cataloguepromotionqueriesForBundleAndHardwareDataAllowances.description)
				&& Objects.equals(this.footNotes, cataloguepromotionqueriesForBundleAndHardwareDataAllowances.footNotes)
				&& Objects.equals(this.freeData, cataloguepromotionqueriesForBundleAndHardwareDataAllowances.freeData)
				&& Objects.equals(this.label, cataloguepromotionqueriesForBundleAndHardwareDataAllowances.label)
				&& Objects.equals(this.packageType,
						cataloguepromotionqueriesForBundleAndHardwareDataAllowances.packageType)
				&& Objects.equals(this.priority, cataloguepromotionqueriesForBundleAndHardwareDataAllowances.priority)
				&& Objects.equals(this.promotionMedia,
						cataloguepromotionqueriesForBundleAndHardwareDataAllowances.promotionMedia)
				&& Objects.equals(this.tag, cataloguepromotionqueriesForBundleAndHardwareDataAllowances.tag)
				&& Objects.equals(this.type, cataloguepromotionqueriesForBundleAndHardwareDataAllowances.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, footNotes, freeData, label, packageType, priority, promotionMedia, tag, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CataloguepromotionqueriesForBundleAndHardwareDataAllowances {\n");

		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    footNotes: ").append(toIndentedString(footNotes)).append("\n");
		sb.append("    freeData: ").append(toIndentedString(freeData)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    promotionMedia: ").append(toIndentedString(promotionMedia)).append("\n");
		sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
