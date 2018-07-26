package com.vf.uk.dal.broadband.entity.promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")

public class CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions {
	
	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The foot notes. */
	@JsonProperty("footNotes")
	@Valid
	private List<String> footNotes = null;

	/** The label. */
	@JsonProperty("label")
	private String label = null;

	/** The package type. */
	@JsonProperty("packageType")
	@Valid
	private List<String> packageType = null;

	/** The plancouple id. */
	@JsonProperty("plancoupleId")
	private String plancoupleId = null;

	/** The priority. */
	@JsonProperty("priority")
	private String priority = null;

	/** The promotion media. */
	@JsonProperty("promotionMedia")
	private String promotionMedia = null;

	/** The tag. */
	@JsonProperty("tag")
	private String tag = null;

	/** The type. */
	@JsonProperty("type")
	private String type = null;

	/**
	 * Description.
	 *
	 * @param description the description
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description.
	 *
	 * @return description
	 */
	@ApiModelProperty(value = "")

	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Foot notes.
	 *
	 * @param footNotes the foot notes
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions footNotes(List<String> footNotes) {
		this.footNotes = footNotes;
		return this;
	}

	/**
	 * Adds the foot notes item.
	 *
	 * @param footNotesItem the foot notes item
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions addFootNotesItem(String footNotesItem) {
		if (this.footNotes == null) {
			this.footNotes = new ArrayList<>();
		}
		this.footNotes.add(footNotesItem);
		return this;
	}

	/**
	 * Get footNotes.
	 *
	 * @return footNotes
	 */
	@ApiModelProperty(value = "")

	public List<String> getFootNotes() {
		return footNotes;
	}

	/**
	 * Sets the foot notes.
	 *
	 * @param footNotes the new foot notes
	 */
	public void setFootNotes(List<String> footNotes) {
		this.footNotes = footNotes;
	}

	/**
	 * Label.
	 *
	 * @param label the label
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Get label.
	 *
	 * @return label
	 */
	@ApiModelProperty(value = "")

	public String getLabel() {
		return label;
	}

	/**
	 * Sets the label.
	 *
	 * @param label the new label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Package type.
	 *
	 * @param packageType the package type
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions packageType(List<String> packageType) {
		this.packageType = packageType;
		return this;
	}

	/**
	 * Adds the package type item.
	 *
	 * @param packageTypeItem the package type item
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions addPackageTypeItem(
			String packageTypeItem) {
		if (this.packageType == null) {
			this.packageType = new ArrayList<>();
		}
		this.packageType.add(packageTypeItem);
		return this;
	}

	/**
	 * Get packageType.
	 *
	 * @return packageType
	 */
	@ApiModelProperty(value = "")

	public List<String> getPackageType() {
		return packageType;
	}

	/**
	 * Sets the package type.
	 *
	 * @param packageType the new package type
	 */
	public void setPackageType(List<String> packageType) {
		this.packageType = packageType;
	}

	/**
	 * Plancouple id.
	 *
	 * @param plancoupleId the plancouple id
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions plancoupleId(String plancoupleId) {
		this.plancoupleId = plancoupleId;
		return this;
	}

	/**
	 * Get plancoupleId.
	 *
	 * @return plancoupleId
	 */
	@ApiModelProperty(value = "")

	public String getPlancoupleId() {
		return plancoupleId;
	}

	/**
	 * Sets the plancouple id.
	 *
	 * @param plancoupleId the new plancouple id
	 */
	public void setPlancoupleId(String plancoupleId) {
		this.plancoupleId = plancoupleId;
	}

	/**
	 * Priority.
	 *
	 * @param priority the priority
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions priority(String priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get priority.
	 *
	 * @return priority
	 */
	@ApiModelProperty(value = "")

	public String getPriority() {
		return priority;
	}

	/**
	 * Sets the priority.
	 *
	 * @param priority the new priority
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * Promotion media.
	 *
	 * @param promotionMedia the promotion media
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions promotionMedia(String promotionMedia) {
		this.promotionMedia = promotionMedia;
		return this;
	}

	/**
	 * Get promotionMedia.
	 *
	 * @return promotionMedia
	 */
	@ApiModelProperty(value = "")

	public String getPromotionMedia() {
		return promotionMedia;
	}

	/**
	 * Sets the promotion media.
	 *
	 * @param promotionMedia the new promotion media
	 */
	public void setPromotionMedia(String promotionMedia) {
		this.promotionMedia = promotionMedia;
	}

	/**
	 * Tag.
	 *
	 * @param tag the tag
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions tag(String tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get tag.
	 *
	 * @return tag
	 */
	@ApiModelProperty(value = "")

	public String getTag() {
		return tag;
	}

	/**
	 * Sets the tag.
	 *
	 * @param tag the new tag
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * Type.
	 *
	 * @param type the type
	 * @return the cataloguepromotionqueries for bundle and hardware plan coupling promotions
	 */
	public CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type.
	 *
	 * @return type
	 */
	@ApiModelProperty(value = "")

	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
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
		CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions = (CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions) o;
		return Objects.equals(this.description,
				cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.description)
				&& Objects.equals(this.footNotes,
						cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.footNotes)
				&& Objects.equals(this.label, cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.label)
				&& Objects.equals(this.packageType,
						cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.packageType)
				&& Objects.equals(this.plancoupleId,
						cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.plancoupleId)
				&& Objects.equals(this.priority,
						cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.priority)
				&& Objects.equals(this.promotionMedia,
						cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.promotionMedia)
				&& Objects.equals(this.tag, cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.tag)
				&& Objects.equals(this.type, cataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions.type);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(description, footNotes, label, packageType, plancoupleId, priority, promotionMedia, tag,
				type);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions {\n");

		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    footNotes: ").append(toIndentedString(footNotes)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
		sb.append("    plancoupleId: ").append(toIndentedString(plancoupleId)).append("\n");
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
