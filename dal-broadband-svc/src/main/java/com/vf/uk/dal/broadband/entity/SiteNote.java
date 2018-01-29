package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SiteNote
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T20:55:40.172Z")

public class SiteNote {
	@JsonProperty("notes")
	private String notes = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	/**
	 * @param notes
	 * @return
	 */
	public SiteNote notes(String notes) {
		this.notes = notes;
		return this;
	}

	/**
	 * Note for the engineer
	 * 
	 * @return notes
	 **/
	@ApiModelProperty(value = "Note for the engineer")

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @param typeCode
	 * @return
	 */
	public SiteNote typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * Engineer
	 * 
	 * @return typeCode
	 **/
	@ApiModelProperty(value = "Engineer")

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SiteNote siteNote = (SiteNote) o;
		return Objects.equals(this.notes, siteNote.notes) && Objects.equals(this.typeCode, siteNote.typeCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(notes, typeCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SiteNote {\n");

		sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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
