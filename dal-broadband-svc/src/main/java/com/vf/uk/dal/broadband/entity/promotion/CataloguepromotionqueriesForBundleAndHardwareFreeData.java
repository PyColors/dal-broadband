package com.vf.uk.dal.broadband.entity.promotion;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CataloguepromotionqueriesForBundleAndHardwareFreeData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")

public class CataloguepromotionqueriesForBundleAndHardwareFreeData {
	@JsonProperty("uom")
	private String uom = null;

	@JsonProperty("value")
	private String value = null;

	public CataloguepromotionqueriesForBundleAndHardwareFreeData uom(String uom) {
		this.uom = uom;
		return this;
	}

	/**
	 * Get uom
	 * 
	 * @return uom
	 **/
	@ApiModelProperty(value = "")

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public CataloguepromotionqueriesForBundleAndHardwareFreeData value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "")

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CataloguepromotionqueriesForBundleAndHardwareFreeData cataloguepromotionqueriesForBundleAndHardwareFreeData = (CataloguepromotionqueriesForBundleAndHardwareFreeData) o;
		return Objects.equals(this.uom, cataloguepromotionqueriesForBundleAndHardwareFreeData.uom)
				&& Objects.equals(this.value, cataloguepromotionqueriesForBundleAndHardwareFreeData.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(uom, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CataloguepromotionqueriesForBundleAndHardwareFreeData {\n");

		sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
