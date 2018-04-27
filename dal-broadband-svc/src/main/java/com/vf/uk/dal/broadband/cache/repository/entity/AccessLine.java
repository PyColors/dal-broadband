package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class AccessLine.
 */
public class AccessLine implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7888301576209391612L;

	/** The Constant ID. */
	private static final String ID = "id";
	
	/** The Constant CHANNELID. */
	private static final String CHANNELID = "channelId";

	/** The id. */
	@JsonProperty(ID)
	private String id;
	
	/** The channel id. */
	@JsonProperty(CHANNELID)
	private String channelId;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
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
	 * Gets the channel id.
	 *
	 * @return the channel id
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channelId == null) ? 0 : channelId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccessLine other = (AccessLine) obj;
		if (channelId == null) {
			if (other.channelId != null)
				return false;
		} else if (!channelId.equals(other.channelId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccessLine [id=" + id + ", channelId=" + channelId + "]";
	}
	
	
	
}
