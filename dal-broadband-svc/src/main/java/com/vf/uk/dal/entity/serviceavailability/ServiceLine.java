package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceLine
 */

public class ServiceLine {
	@JsonProperty("productCode")
	private String productCode = null;

	@JsonProperty("productName")
	private String productName = null;

	@JsonProperty("classificationCode")
	private String classificationCode = null;

	@JsonProperty("lineSpeeds")
	private LineSpeeds lineSpeeds = null;

	@JsonProperty("lineTreatment")
	private List<ServiceLineTreatment> lineTreatment = new ArrayList<>();

	@JsonProperty("miscReference")
	private MiscReference miscReference = null;

	public ServiceLine productCode(String productCode) {
		this.productCode = productCode;
		return this;
	}

	/**
	 * The code of the available product e.g. OF00022
	 * 
	 * @return productCode
	 **/
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public ServiceLine productName(String productName) {
		this.productName = productName;
		return this;
	}

	/**
	 * The name of the available product e.g. Offnet Single Play FTTC
	 * 
	 * @return productName
	 **/
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ServiceLine classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * The category the technical product falls into
	 * 
	 * @return classificationCode
	 **/
	public String getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	public ServiceLine lineSpeeds(LineSpeeds lineSpeeds) {
		this.lineSpeeds = lineSpeeds;
		return this;
	}

	/**
	 * Get lineSpeeds
	 * 
	 * @return lineSpeeds
	 **/
	public LineSpeeds getLineSpeeds() {
		return lineSpeeds;
	}

	public void setLineSpeeds(LineSpeeds lineSpeeds) {
		this.lineSpeeds = lineSpeeds;
	}

	public ServiceLine lineTreatment(List<ServiceLineTreatment> lineTreatment) {
		this.lineTreatment = lineTreatment;
		return this;
	}

	public ServiceLine addLineTreatmentItem(ServiceLineTreatment lineTreatmentItem) {
		this.lineTreatment.add(lineTreatmentItem);
		return this;
	}

	/**
	 * Get lineTreatment
	 * 
	 * @return lineTreatment
	 **/
	public List<ServiceLineTreatment> getLineTreatment() {
		return lineTreatment;
	}

	public void setLineTreatment(List<ServiceLineTreatment> lineTreatment) {
		this.lineTreatment = lineTreatment;
	}

	public ServiceLine miscReference(MiscReference miscReference) {
		this.miscReference = miscReference;
		return this;
	}

	/**
	 * Get miscReference
	 * 
	 * @return miscReference
	 **/
	public MiscReference getMiscReference() {
		return miscReference;
	}

	public void setMiscReference(MiscReference miscReference) {
		this.miscReference = miscReference;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServiceLine serviceLine = (ServiceLine) o;
		return Objects.equals(this.productCode, serviceLine.productCode)
				&& Objects.equals(this.productName, serviceLine.productName)
				&& Objects.equals(this.classificationCode, serviceLine.classificationCode)
				&& Objects.equals(this.lineSpeeds, serviceLine.lineSpeeds)
				&& Objects.equals(this.lineTreatment, serviceLine.lineTreatment)
				&& Objects.equals(this.miscReference, serviceLine.miscReference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productCode, productName, classificationCode, lineSpeeds, lineTreatment, miscReference);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceLine {\n");

		sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
		sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
		sb.append("    lineSpeeds: ").append(toIndentedString(lineSpeeds)).append("\n");
		sb.append("    lineTreatment: ").append(toIndentedString(lineTreatment)).append("\n");
		sb.append("    miscReference: ").append(toIndentedString(miscReference)).append("\n");
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
