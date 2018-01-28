package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AvailabilityCheckRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class AvailabilityCheckRequest {
	@JsonProperty("lineRef")
	private LineRef lineRef = null;

	@JsonProperty("journeyId")
	private String journeyId = null;

	@JsonProperty("classificationCode")
	private List<String> classificationCode = null;

	/**
	 * 
	 * @param lineRef
	 * @return
	 */

	public AvailabilityCheckRequest lineRef(LineRef lineRef) {
		this.lineRef = lineRef;
		return this;
	}

	/**
	 * Get lineRef
	 * 
	 * @return lineRef
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public LineRef getLineRef() {
		return lineRef;
	}

	public void setLineRef(LineRef lineRef) {
		this.lineRef = lineRef;
	}

	/**
	 * 
	 * @param journeyId
	 * @return
	 */

	public AvailabilityCheckRequest journeyId(String journeyId) {
		this.journeyId = journeyId;
		return this;
	}

	/**
	 * Existing journey id, for logged in customer journey id will not be null
	 * else null
	 * 
	 * @return journeyId
	 **/
	@ApiModelProperty(value = "Existing journey id, for logged in customer journey id will not be null else null")

	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * 
	 * @param journeyId
	 */

	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	/**
	 * 
	 * @param classificationCode
	 * @return
	 */

	public AvailabilityCheckRequest classificationCode(List<String> classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * 
	 * @param classificationCodeItem
	 * @return
	 */
	public AvailabilityCheckRequest addClassificationCodeItem(String classificationCodeItem) {
		if (this.classificationCode == null) {
			this.classificationCode = new ArrayList<String>();
		}
		this.classificationCode.add(classificationCodeItem);
		return this;
	}

	/**
	 * Get classificationCode
	 * 
	 * @return classificationCode
	 **/
	@ApiModelProperty(value = "")

	/**
	 * 
	 * @return
	 */
	public List<String> getClassificationCode() {
		return classificationCode;
	}

	/**
	 * 
	 * @param classificationCode
	 */

	public void setClassificationCode(List<String> classificationCode) {
		this.classificationCode = classificationCode;
	}

	
	
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
				&& Objects.equals(this.journeyId, availabilityCheckRequest.journeyId)
				&& Objects.equals(this.classificationCode, availabilityCheckRequest.classificationCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineRef, journeyId, classificationCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AvailabilityCheckRequest {\n");

		sb.append("    lineRef: ").append(toIndentedString(lineRef)).append("\n");
		sb.append("    journeyId: ").append(toIndentedString(journeyId)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
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
