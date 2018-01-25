package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Organisation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class Organisation {
	@JsonProperty("name")
	private String name = null;

	public Organisation name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the Organisation.
	 * 
	 * @return name
	 **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Organisation organisation = (Organisation) o;
		return Objects.equals(this.name, organisation.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Organisation {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
