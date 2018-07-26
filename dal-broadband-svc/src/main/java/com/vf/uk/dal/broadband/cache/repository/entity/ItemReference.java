package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ItemReference.
 */
public class ItemReference implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 815255394624573030L;
	
	/** The Constant IDENTIFICATIONID. */
	private static final String IDENTIFICATION_ID = "identificationId";
	
	/** The Constant NAME. */
	private static final String NAME = "name";
	
	/** The Constant CLASSIFICATIONCODE. */
	private static final String CLASSIFICATION_CODE = "classificationCode";
	
	/** The identification id. */
	@JsonProperty(IDENTIFICATION_ID)
	private String identificationId;
	
	/** The name. */
	@JsonProperty(NAME)
	private String name;
	
	/** The classification code. */
	@JsonProperty(CLASSIFICATION_CODE)
	private String classificationCode;
	
	/**
	 * Gets the identification id.
	 *
	 * @return the identification id
	 */
	public String getIdentificationId() {
		return identificationId;
	}
	
	/**
	 * Sets the identification id.
	 *
	 * @param identificationId the new identification id
	 */
	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the classification code.
	 *
	 * @return the classification code
	 */
	public String getClassificationCode() {
		return classificationCode;
	}
	
	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classificationCode == null) ? 0 : classificationCode.hashCode());
		result = prime * result + ((identificationId == null) ? 0 : identificationId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ItemReference other = (ItemReference) obj;
		if (classificationCode == null) {
			if (other.classificationCode != null)
				return false;
		} else if (!classificationCode.equals(other.classificationCode))
			return false;
		if (identificationId == null) {
			if (other.identificationId != null)
				return false;
		} else if (!identificationId.equals(other.identificationId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemReference [identificationId=" + identificationId + ", name=" + name + ", classificationCode="
				+ classificationCode + "]";
	}
	
	
	
}
