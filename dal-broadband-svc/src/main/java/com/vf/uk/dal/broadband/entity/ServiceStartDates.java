package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceStartDates.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class ServiceStartDates {
	
	/** The dates. */
	@JsonProperty("dates")
	private List<String> dates = null;

	/**
	 * Dates.
	 *
	 * @param dates the dates
	 * @return the service start dates
	 */
	public ServiceStartDates dates(List<String> dates) {
		this.dates = dates;
		return this;
	}

	/**
	 * Adds the dates item.
	 *
	 * @param datesItem the dates item
	 * @return the service start dates
	 */
	public ServiceStartDates addDatesItem(String datesItem) {
		if (this.dates == null) {
			this.dates = new ArrayList<>();
		}
		this.dates.add(datesItem);
		return this;
	}

	/**
	 * Array of possible service start dates within the requested range of
	 * working days - FORMAT - \"dd-MMM-yyyy\".
	 *
	 * @return dates
	 */
	@ApiModelProperty(value = "Array of possible service start dates within the requested range of working days - FORMAT - \"dd-MMM-yyyy\"")

	public List<String> getDates() {
		return dates;
	}

	/**
	 * Sets the dates.
	 *
	 * @param dates the new dates
	 */
	public void setDates(List<String> dates) {
		this.dates = dates;
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
		ServiceStartDates serviceStartDates = (ServiceStartDates) o;
		return Objects.equals(this.dates, serviceStartDates.dates);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dates);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceStartDates {\n");

		sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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
