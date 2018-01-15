/*
 * Pricing APIs
 * Bundle API service operations
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Auto-generated Javadoc
/**
 * MerchandisingPromotion.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-27T07:05:02.425Z")
public class MerchandisingPromotion {

	/** The tag. */
	@JsonProperty("tag")
	private String tag = null;

	/** The label. */
	@JsonProperty("label")
	private String label = null;

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The discount id. */
	@JsonProperty("discountId")
	private String discountId = null;

	/** The mp type. */
	@JsonProperty("mpType")
	private String mpType = null;

	/** The price established label. */
	@JsonProperty("priceEstablishedLabel")
	private String priceEstablishedLabel = null;

	/** The priority. */
	@JsonProperty("priority")
	private Integer priority = null;

	/** The package type. */
	@JsonProperty("packageType")
	private List<String> packageType = new ArrayList<>();

	/** The package type. */
	@JsonProperty("footNotes")
	private List<String> footNotes = new ArrayList<>();

	/** The promotion media. */
	@JsonProperty("promotionMedia")
	private String promotionMedia = null;

	/**
	 * Tag.
	 *
	 * @param promotionMedia
	 *            the promotion media
	 * @return the merchandising promotion
	 */
	public MerchandisingPromotion promotionMedia(String promotionMedia) {
		this.promotionMedia = promotionMedia;
		return this;
	}

	/**
	 * Gets the promotion media.
	 *
	 * @return the promotion media
	 */
	public String getPromotionMedia() {
		return promotionMedia;
	}

	/**
	 * Sets the promotion media.
	 *
	 * @param promotionMedia
	 *            the new promotion media
	 */
	public void setPromotionMedia(String promotionMedia) {
		this.promotionMedia = promotionMedia;
	}

	/**
	 * Gets the package type.
	 *
	 * @return the package type
	 */
	public List<String> getPackageType() {
		return packageType;
	}

	/**
	 * Sets the package type.
	 *
	 * @param packageType
	 *            the new package type
	 */
	public void setPackageType(List<String> packageType) {
		this.packageType = packageType;
	}

	/**
	 * Gets the priority.
	 *
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * Sets the priority.
	 *
	 * @param priority
	 *            the new priority
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * Tag.
	 *
	 * @param tag
	 *            the tag
	 * @return the merchandising promotion
	 */
	public MerchandisingPromotion tag(String tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Tag value of the merchandising promotion.
	 *
	 * @return tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * Sets the tag.
	 *
	 * @param tag
	 *            the new tag
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * Label.
	 *
	 * @param label
	 *            the label
	 * @return the merchandising promotion
	 */
	public MerchandisingPromotion label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Label value of the merchandising promotion.
	 *
	 * @return label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the label.
	 *
	 * @param label
	 *            the new label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Description.
	 *
	 * @param description
	 *            the description
	 * @return the merchandising promotion
	 */
	public MerchandisingPromotion description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Label value of the merchandising promotion.
	 *
	 * @return description
	 */

	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Discount id.
	 *
	 * @param discountId
	 *            the discount id
	 * @return the merchandising promotion
	 */
	public MerchandisingPromotion discountId(String discountId) {
		this.discountId = discountId;
		return this;
	}

	/**
	 * Discount skud Id, if applicable.
	 *
	 * @return discountId
	 */
	public String getDiscountId() {
		return discountId;
	}

	/**
	 * Sets the discount id.
	 *
	 * @param discountId
	 *            the new discount id
	 */
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	/**
	 * Mp type.
	 *
	 * @param mpType
	 *            the mp type
	 * @return the merchandising promotion
	 */
	public MerchandisingPromotion mpType(String mpType) {
		this.mpType = mpType;
		return this;
	}

	/**
	 * Discount type, the Possible values are full_duration, limited_tinme,
	 * Hardware_dicount.
	 *
	 * @return mpType
	 */

	public String getMpType() {
		return mpType;
	}

	/**
	 * Sets the mp type.
	 *
	 * @param mpType
	 *            the new mp type
	 */
	public void setMpType(String mpType) {
		this.mpType = mpType;
	}

	/**
	 * Price established label.
	 *
	 * @param footNotes
	 *            the foot notes
	 * @return the merchandising promotion
	 */
	public MerchandisingPromotion footNotes(List<String> footNotes) {
		this.footNotes = footNotes;
		return this;
	}

	/**
	 * Gets the foot notes.
	 *
	 * @return the footNotes
	 */
	public List<String> getFootNotes() {
		return footNotes;
	}

	/**
	 * Sets the foot notes.
	 *
	 * @param footNotes
	 *            the footNotes to set
	 */
	public void setFootNotes(List<String> footNotes) {
		this.footNotes = footNotes;
	}

	/**
	 * The Possible values are 'was, previously'.
	 *
	 * @return priceEstablishedLabel
	 */

	public String getPriceEstablishedLabel() {
		return priceEstablishedLabel;
	}

	/**
	 * Sets the price established label.
	 *
	 * @param priceEstablishedLabel
	 *            the new price established label
	 */
	public void setPriceEstablishedLabel(String priceEstablishedLabel) {
		this.priceEstablishedLabel = priceEstablishedLabel;
	}

	/**
	 * Price established label.
	 *
	 * @param priceEstablishedLabel
	 *            the price established label
	 * @return the merchandising promotion
	 */
	public MerchandisingPromotion priceEstablishedLabel(String priceEstablishedLabel) {
		this.priceEstablishedLabel = priceEstablishedLabel;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		MerchandisingPromotion merchandisingPromotion = (MerchandisingPromotion) o;
		return Objects.equals(this.tag, merchandisingPromotion.tag)
				&& Objects.equals(this.label, merchandisingPromotion.label)
				&& Objects.equals(this.description, merchandisingPromotion.description)
				&& Objects.equals(this.discountId, merchandisingPromotion.discountId)
				&& Objects.equals(this.mpType, merchandisingPromotion.mpType)
				&& Objects.equals(this.priceEstablishedLabel, merchandisingPromotion.priceEstablishedLabel)
				&& Objects.equals(this.priority, merchandisingPromotion.priority)
				&& Objects.equals(this.packageType, merchandisingPromotion.packageType)
				&& Objects.equals(this.footNotes, merchandisingPromotion.footNotes)
				&& Objects.equals(this.promotionMedia, merchandisingPromotion.promotionMedia);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(tag, label, description, discountId, mpType, priceEstablishedLabel, priority, packageType, footNotes, promotionMedia);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MerchandisingPromotion {\n");

		sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
		sb.append("    mpType: ").append(toIndentedString(mpType)).append("\n");
		sb.append("    priceEstablishedLabel: ").append(toIndentedString(priceEstablishedLabel)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
		sb.append("    footNotes: ").append(toIndentedString(footNotes)).append("\n");
		sb.append("    promotionMedia: ").append(toIndentedString(promotionMedia)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 *
	 * @param o
	 *            the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
