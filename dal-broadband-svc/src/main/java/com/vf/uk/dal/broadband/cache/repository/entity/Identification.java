package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Identification.
 */
public class Identification implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5148507109681131370L;
	
	/** The Constant ID. */
	private static final String ID = "id";
	
	/** The Constant CONTEXTID. */
	private static final String CONTEXTID = "contextId";
	
	/** The id. */
	@JsonProperty(ID)
	private String id;
	
	/** The context id. */
	@JsonProperty(CONTEXTID)
	private String contextId;
	
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
	 * Gets the context id.
	 *
	 * @return the context id
	 */
	public String getContextId() {
		return contextId;
	}
	
	/**
	 * Sets the context id.
	 *
	 * @param contextId the new context id
	 */
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contextId == null) ? 0 : contextId.hashCode());
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
		Identification other = (Identification) obj;
		if (contextId == null) {
			if (other.contextId != null)
				return false;
		} else if (!contextId.equals(other.contextId))
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
		return "Identification [id=" + id + ", contextId=" + contextId + "]";
	}
	
	
	
}
