package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AvailabilityCheckRequest.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class AvailabilityCheckRequest {
	
	/** The line ref. */
	@JsonProperty("lineRef")
	private LineRef lineRef = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private List<String> classificationCode = null;

	/** The category. */
	@JsonProperty("category")
	private String category = null;

	/**
	 * Line ref.
	 *
	 * @param lineRef the line ref
	 * @return the availability check request
	 */

	public AvailabilityCheckRequest lineRef(LineRef lineRef) {
		this.lineRef = lineRef;
		return this;
	}

	/**
	 * Get lineRef.
	 *
	 * @return lineRef
	 */
	@ApiModelProperty(value = "")

	@Valid

	public LineRef getLineRef() {
		return lineRef;
	}

	/**
	 * Sets the line ref.
	 *
	 * @param lineRef the new line ref
	 */
	public void setLineRef(LineRef lineRef) {
		this.lineRef = lineRef;
	}

	/**
	 * Classification code.
	 *
	 * @param classificationCode the classification code
	 * @return the availability check request
	 */

	public AvailabilityCheckRequest classificationCode(List<String> classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * Adds the classification code item.
	 *
	 * @param classificationCodeItem the classification code item
	 * @return the availability check request
	 */
	public AvailabilityCheckRequest addClassificationCodeItem(String classificationCodeItem) {
		if (this.classificationCode == null) {
			this.classificationCode = new ArrayList<>();
		}
		this.classificationCode.add(classificationCodeItem);
		return this;
	}

	/**
	 * Get classificationCode.
	 *
	 * @return classificationCode
	 */
	@ApiModelProperty(value = "")

	/**
	 * 
	 * @return
	 */
	public List<String> getClassificationCode() {
		return classificationCode;
	}

	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */

	public void setClassificationCode(List<String> classificationCode) {
		this.classificationCode = classificationCode;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(String category) {
		this.category = category;
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
		AvailabilityCheckRequest availabilityCheckRequest = (AvailabilityCheckRequest) o;
		return Objects.equals(this.lineRef, availabilityCheckRequest.lineRef)
				&& Objects.equals(this.classificationCode, availabilityCheckRequest.classificationCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(lineRef, classificationCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AvailabilityCheckRequest {\n");

		sb.append("    lineRef: ").append(toIndentedString(lineRef)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
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
