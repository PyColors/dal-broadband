package com.vf.uk.dal.entity.serviceavailability;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LinePlant
 */
public class LinePlant {
	@JsonProperty("sparePairs")
	private BigDecimal sparePairs = null;

	@JsonProperty("workingLines")
	private BigDecimal workingLines = null;

	@JsonProperty("stoppedLines")
	private BigDecimal stoppedLines = null;

	public LinePlant sparePairs(BigDecimal sparePairs) {
		this.sparePairs = sparePairs;
		return this;
	}

	/**
	 * The number of spare pairs at the address.
	 * 
	 * @return sparePairs
	 **/
	public BigDecimal getSparePairs() {
		return sparePairs;
	}

	public void setSparePairs(BigDecimal sparePairs) {
		this.sparePairs = sparePairs;
	}

	public LinePlant workingLines(BigDecimal workingLines) {
		this.workingLines = workingLines;
		return this;
	}

	/**
	 * The number of working PSTN and MPF lines at the address.
	 * 
	 * @return workingLines
	 **/
	public BigDecimal getWorkingLines() {
		return workingLines;
	}

	public void setWorkingLines(BigDecimal workingLines) {
		this.workingLines = workingLines;
	}

	public LinePlant stoppedLines(BigDecimal stoppedLines) {
		this.stoppedLines = stoppedLines;
		return this;
	}

	/**
	 * The number of stopped PSTN and MPF lines at the address.
	 * 
	 * @return stoppedLines
	 **/
	public BigDecimal getStoppedLines() {
		return stoppedLines;
	}

	public void setStoppedLines(BigDecimal stoppedLines) {
		this.stoppedLines = stoppedLines;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LinePlant linePlant = (LinePlant) o;
		return Objects.equals(this.sparePairs, linePlant.sparePairs)
				&& Objects.equals(this.workingLines, linePlant.workingLines)
				&& Objects.equals(this.stoppedLines, linePlant.stoppedLines);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sparePairs, workingLines, stoppedLines);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinePlant {\n");

		sb.append("    sparePairs: ").append(toIndentedString(sparePairs)).append("\n");
		sb.append("    workingLines: ").append(toIndentedString(workingLines)).append("\n");
		sb.append("    stoppedLines: ").append(toIndentedString(stoppedLines)).append("\n");
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
