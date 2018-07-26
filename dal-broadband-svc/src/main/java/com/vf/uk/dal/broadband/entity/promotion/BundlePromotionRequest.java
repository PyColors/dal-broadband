package com.vf.uk.dal.broadband.entity.promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BundlePromotionRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")

public class BundlePromotionRequest {
	@JsonProperty("bundleIdList")
	@Valid
	private List<String> bundleIdList = null;

	@JsonProperty("journeyType")
	private String journeyType = null;

	public BundlePromotionRequest bundleIdList(List<String> bundleIdList) {
		this.bundleIdList = bundleIdList;
		return this;
	}

	public BundlePromotionRequest addBundleIdListItem(String bundleIdListItem) {
		if (this.bundleIdList == null) {
			this.bundleIdList = new ArrayList<>();
		}
		this.bundleIdList.add(bundleIdListItem);
		return this;
	}

	/**
	 * Get bundleIdList
	 * 
	 * @return bundleIdList
	 **/
	@ApiModelProperty(value = "")

	public List<String> getBundleIdList() {
		return bundleIdList;
	}

	public void setBundleIdList(List<String> bundleIdList) {
		this.bundleIdList = bundleIdList;
	}

	public BundlePromotionRequest journeyType(String journeyType) {
		this.journeyType = journeyType;
		return this;
	}

	/**
	 * Get journeyType
	 * 
	 * @return journeyType
	 **/
	@ApiModelProperty(value = "")

	public String getJourneyType() {
		return journeyType;
	}

	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(bundleIdList, journeyType);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
