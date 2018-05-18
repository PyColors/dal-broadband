package com.vf.uk.dal.broadband.entity.promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CataloguepromotionqueriesForBundleAndHardwareSecureNet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")

public class CataloguepromotionqueriesForBundleAndHardwareSecureNet {
	@JsonProperty("description")
	private String description = null;

	@JsonProperty("footNotes")
	@Valid
	private List<String> footNotes = null;

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

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet description(String description) {
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

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet footNotes(List<String> footNotes) {
		this.footNotes = footNotes;
		return this;
	}

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet addFootNotesItem(String footNotesItem) {
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

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet label(String label) {
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

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet packageType(List<String> packageType) {
		this.packageType = packageType;
		return this;
	}

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet addPackageTypeItem(String packageTypeItem) {
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

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet priority(String priority) {
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

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet promotionMedia(String promotionMedia) {
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

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet tag(String tag) {
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

	public CataloguepromotionqueriesForBundleAndHardwareSecureNet type(String type) {
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
		CataloguepromotionqueriesForBundleAndHardwareSecureNet cataloguepromotionqueriesForBundleAndHardwareSecureNet = (CataloguepromotionqueriesForBundleAndHardwareSecureNet) o;
		return Objects.equals(this.description, cataloguepromotionqueriesForBundleAndHardwareSecureNet.description)
				&& Objects.equals(this.footNotes, cataloguepromotionqueriesForBundleAndHardwareSecureNet.footNotes)
				&& Objects.equals(this.label, cataloguepromotionqueriesForBundleAndHardwareSecureNet.label)
				&& Objects.equals(this.packageType, cataloguepromotionqueriesForBundleAndHardwareSecureNet.packageType)
				&& Objects.equals(this.priority, cataloguepromotionqueriesForBundleAndHardwareSecureNet.priority)
				&& Objects.equals(this.promotionMedia,
						cataloguepromotionqueriesForBundleAndHardwareSecureNet.promotionMedia)
				&& Objects.equals(this.tag, cataloguepromotionqueriesForBundleAndHardwareSecureNet.tag)
				&& Objects.equals(this.type, cataloguepromotionqueriesForBundleAndHardwareSecureNet.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, footNotes, label, packageType, priority, promotionMedia, tag, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CataloguepromotionqueriesForBundleAndHardwareSecureNet {\n");

		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    footNotes: ").append(toIndentedString(footNotes)).append("\n");
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
