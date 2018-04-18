/*
 * Journey APIs
 * Journey APIs for Authenticated Journeys
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vf.uk.dal.broadband.journey.entity;

import java.util.Objects;

/**
 * SiteNote
 */
public class SiteNote {
	private String notes = null;

	private String typeCode = null;

	public SiteNote notes(String notes) {
		this.notes = notes;
		return this;
	}

	/**
	 * Note for the engineer
	 * 
	 * @return notes
	 **/
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public SiteNote typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * Engineer
	 * 
	 * @return typeCode
	 **/
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
