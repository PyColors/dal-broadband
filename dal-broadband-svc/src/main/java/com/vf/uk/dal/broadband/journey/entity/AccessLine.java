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
 * AccessLine.
 */
public class AccessLine {
	
	/** The id. */
	private String id = null;

	/** The channel id. */
	private String channelId = null;

	/**
	 * Id.
	 *
	 * @param id the id
	 * @return the access line
	 */
	public AccessLine id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * A unique identifier for copper line. This field can be used as an
	 * alternative means of identifying a working line
	 * 
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Channel id.
	 *
	 * @param channelId the channel id
	 * @return the access line
	 */
	public AccessLine channelId(String channelId) {
		this.channelId = channelId;
		return this;
	}

	/**
	 * Get channelId.
	 *
	 * @return channelId
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * Sets the channel id.
	 *
	 * @param channelId the new channel id
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
		AccessLine accessLine = (AccessLine) o;
		return Objects.equals(this.id, accessLine.id) && Objects.equals(this.channelId, accessLine.channelId);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, channelId);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccessLine {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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
