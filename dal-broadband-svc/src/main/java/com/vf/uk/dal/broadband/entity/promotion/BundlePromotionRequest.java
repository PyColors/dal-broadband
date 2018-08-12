package com.vf.uk.dal.broadband.entity.promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BundlePromotionRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")

public class BundlePromotionRequest {
	
	/** The bundle id list. */
	@JsonProperty("bundleIdList")
	@Valid
	private List<String> bundleIdList = null;

	/** The journey type. */
	@JsonProperty("journeyType")
	private String journeyType = null;

	/**
	 * Bundle id list.
	 *
	 * @param bundleIdList the bundle id list
	 * @return the bundle promotion request
	 */
	public BundlePromotionRequest bundleIdList(List<String> bundleIdList) {
		this.bundleIdList = bundleIdList;
		return this;
	}

	/**
	 * Adds the bundle id list item.
	 *
	 * @param bundleIdListItem the bundle id list item
	 * @return the bundle promotion request
	 */
	public BundlePromotionRequest addBundleIdListItem(String bundleIdListItem) {
		if (this.bundleIdList == null) {
			this.bundleIdList = new ArrayList<>();
		}
		this.bundleIdList.add(bundleIdListItem);
		return this;
	}

	/**
	 * Get bundleIdList.
	 *
	 * @return bundleIdList
	 */
	@ApiModelProperty(value = "")

	public List<String> getBundleIdList() {
		return bundleIdList;
	}

	/**
	 * Sets the bundle id list.
	 *
	 * @param bundleIdList the new bundle id list
	 */
	public void setBundleIdList(List<String> bundleIdList) {
		this.bundleIdList = bundleIdList;
	}

	/**
	 * Journey type.
	 *
	 * @param journeyType the journey type
	 * @return the bundle promotion request
	 */
	public BundlePromotionRequest journeyType(String journeyType) {
		this.journeyType = journeyType;
		return this;
	}

	/**
	 * Get journeyType.
	 *
	 * @return journeyType
	 */
	@ApiModelProperty(value = "")

	public String getJourneyType() {
		return journeyType;
	}

	/**
	 * Sets the journey type.
	 *
	 * @param journeyType the new journey type
	 */
	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
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
		BundlePromotionRequest bundlePromotionRequest = (BundlePromotionRequest) o;
		return Objects.equals(this.bundleIdList, bundlePromotionRequest.bundleIdList)
				&& Objects.equals(this.journeyType, bundlePromotionRequest.journeyType);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(bundleIdList, journeyType);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BundlePromotionRequest {\n");

		sb.append("    bundleIdList: ").append(toIndentedString(bundleIdList)).append("\n");
		sb.append("    journeyType: ").append(toIndentedString(journeyType)).append("\n");
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
