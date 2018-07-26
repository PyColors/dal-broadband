package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class PendingOrder.
 */
public class PendingOrder implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7152366378366972739L;
	
	/** The Constant COMPLETIONDATE. */
	private static final String COMPLETION_DATE= "completionDate";
	
	/** The Constant TYPECODE. */
	private static final String TYPE_CODE= "typeCode";
	
	/** The Constant THIRDPARTYFLAG. */
	private static final String THIRDPARTY_FLAG= "thirdPartyFlag";
	
	/**
	 * Field completionDate - Date.
	 */
	@JsonProperty(COMPLETION_DATE)
	protected String completionDate;
	/**
	 * Field typeCode - String.
	 */
	@JsonProperty(TYPE_CODE)
	protected String typeCode;
	/**
	 * Field thirtyPartyFlag - Boolean.
	 */
	@JsonProperty(THIRDPARTY_FLAG)
	protected boolean thirdPartyFlag;

	/**
	 * This is PendingOrder default constructor.
	 */
	public PendingOrder() {
		super();
	}

	/**
	 * Gets the completion date.
	 *
	 * @return the completionDate
	 */
	public String getCompletionDate() {
		return completionDate;
	}

	/**
	 * Sets the completion date.
	 *
	 * @param completionDate the completionDate to set
	 */
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	/**
	 * Gets the type code.
	 *
	 * @return the typeCode
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 *
	 * @param typeCode the typeCode to set
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * Checks if is third party flag.
	 *
	 * @return the thirdPartyFlag
	 */
	public boolean isThirdPartyFlag() {
		return thirdPartyFlag;
	}

	/**
	 * Sets the third party flag.
	 *
	 * @param thirdPartyFlag the thirdPartyFlag to set
	 */
	public void setThirdPartyFlag(boolean thirdPartyFlag) {
		this.thirdPartyFlag = thirdPartyFlag;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((completionDate == null) ? 0 : completionDate.hashCode());
		result = prime * result + (thirdPartyFlag ? 1231 : 1237);
		result = prime * result + ((typeCode == null) ? 0 : typeCode.hashCode());
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
		PendingOrder other = (PendingOrder) obj;
		if (completionDate == null) {
			if (other.completionDate != null)
				return false;
		} else if (!completionDate.equals(other.completionDate))
			return false;
		if (thirdPartyFlag != other.thirdPartyFlag)
			return false;
		if (typeCode == null) {
			if (other.typeCode != null)
				return false;
		} else if (!typeCode.equals(other.typeCode))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PendingOrder [completionDate=" + completionDate + ", typeCode=" + typeCode + ", thirdPartyFlag="
				+ thirdPartyFlag + "]";
	}
	
}