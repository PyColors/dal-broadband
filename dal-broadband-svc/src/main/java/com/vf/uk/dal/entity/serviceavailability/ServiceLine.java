package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceLine.
 */

public class ServiceLine {
	
	/** The product code. */
	@JsonProperty("productCode")
	private String productCode = null;

	/** The product name. */
	@JsonProperty("productName")
	private String productName = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	/** The line speeds. */
	@JsonProperty("lineSpeeds")
	private LineSpeeds lineSpeeds = null;

	/** The line treatment. */
	@JsonProperty("lineTreatment")
	private List<ServiceLineTreatment> lineTreatment = new ArrayList<>();

	/** The misc reference. */
	@JsonProperty("miscReference")
	private MiscReference miscReference = null;

	/**
	 * Product code.
	 *
	 * @param productCode the product code
	 * @return the service line
	 */
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

	/**
	 * Sets the product code.
	 *
	 * @param productCode the new product code
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Product name.
	 *
	 * @param productName the product name
	 * @return the service line
	 */
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

	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Classification code.
	 *
	 * @param classificationCode the classification code
	 * @return the service line
	 */
	public ServiceLine classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * The category the technical product falls into.
	 *
	 * @return classificationCode
	 */
	public String getClassificationCode() {
		return classificationCode;
	}

	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	/**
	 * Line speeds.
	 *
	 * @param lineSpeeds the line speeds
	 * @return the service line
	 */
	public ServiceLine lineSpeeds(LineSpeeds lineSpeeds) {
		this.lineSpeeds = lineSpeeds;
		return this;
	}

	/**
	 * Get lineSpeeds.
	 *
	 * @return lineSpeeds
	 */
	public LineSpeeds getLineSpeeds() {
		return lineSpeeds;
	}

	/**
	 * Sets the line speeds.
	 *
	 * @param lineSpeeds the new line speeds
	 */
	public void setLineSpeeds(LineSpeeds lineSpeeds) {
		this.lineSpeeds = lineSpeeds;
	}

	/**
	 * Line treatment.
	 *
	 * @param lineTreatment the line treatment
	 * @return the service line
	 */
	public ServiceLine lineTreatment(List<ServiceLineTreatment> lineTreatment) {
		this.lineTreatment = lineTreatment;
		return this;
	}

	/**
	 * Adds the line treatment item.
	 *
	 * @param lineTreatmentItem the line treatment item
	 * @return the service line
	 */
	public ServiceLine addLineTreatmentItem(ServiceLineTreatment lineTreatmentItem) {
		this.lineTreatment.add(lineTreatmentItem);
		return this;
	}

	/**
	 * Get lineTreatment.
	 *
	 * @return lineTreatment
	 */
	public List<ServiceLineTreatment> getLineTreatment() {
		return lineTreatment;
	}

	/**
	 * Sets the line treatment.
	 *
	 * @param lineTreatment the new line treatment
	 */
	public void setLineTreatment(List<ServiceLineTreatment> lineTreatment) {
		this.lineTreatment = lineTreatment;
	}

	/**
	 * Misc reference.
	 *
	 * @param miscReference the misc reference
	 * @return the service line
	 */
	public ServiceLine miscReference(MiscReference miscReference) {
		this.miscReference = miscReference;
		return this;
	}

	/**
	 * Get miscReference.
	 *
	 * @return miscReference
	 */
	public MiscReference getMiscReference() {
		return miscReference;
	}

	/**
	 * Sets the misc reference.
	 *
	 * @param miscReference the new misc reference
	 */
	public void setMiscReference(MiscReference miscReference) {
		this.miscReference = miscReference;
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
		ServiceLine serviceLine = (ServiceLine) o;
		return Objects.equals(this.productCode, serviceLine.productCode)
				&& Objects.equals(this.productName, serviceLine.productName)
				&& Objects.equals(this.classificationCode, serviceLine.classificationCode)
				&& Objects.equals(this.lineSpeeds, serviceLine.lineSpeeds)
				&& Objects.equals(this.lineTreatment, serviceLine.lineTreatment)
				&& Objects.equals(this.miscReference, serviceLine.miscReference);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(productCode, productName, classificationCode, lineSpeeds, lineTreatment, miscReference);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
