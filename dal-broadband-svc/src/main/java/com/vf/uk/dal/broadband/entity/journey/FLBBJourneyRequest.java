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

package com.vf.uk.dal.broadband.entity.journey;

import java.util.Objects;

/**
 * FLBBJourneyRequest
 */
public class FLBBJourneyRequest {
	private FLBBJourneyDetails flbbJourneyDetails = null;

	/**
	 * @param flbbJourneyDetails
	 * @return
	 */
	public FLBBJourneyRequest flbbJourneyDetails(FLBBJourneyDetails flbbJourneyDetails) {
		this.flbbJourneyDetails = flbbJourneyDetails;
		return this;
	}

	/**
	 * Get flbbJourneyDetails
	 * 
	 * @return flbbJourneyDetails
	 **/
	public FLBBJourneyDetails getFlbbJourneyDetails() {
		return flbbJourneyDetails;
	}

	public void setFlbbJourneyDetails(FLBBJourneyDetails flbbJourneyDetails) {
		this.flbbJourneyDetails = flbbJourneyDetails;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FLBBJourneyRequest flBBJourneyRequest = (FLBBJourneyRequest) o;
		return Objects.equals(this.flbbJourneyDetails, flBBJourneyRequest.flbbJourneyDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(flbbJourneyDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FLBBJourneyRequest {\n");

		sb.append("    flbbJourneyDetails: ").append(toIndentedString(flbbJourneyDetails)).append("\n");
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
