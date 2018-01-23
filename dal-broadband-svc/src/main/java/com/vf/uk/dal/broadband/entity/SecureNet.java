package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class SecureNet.
 */
public class SecureNet {
	
	/** The bundle id. */
	private String bundleId;
	
	/** The flag. */
	private boolean flag;
	
	/** The label. */
	private String label;
	
	/** The type. */
	private String type;
	
	/** The priority. */
	private Integer priority = null;
	
	/** The package type. */
	public List<String> packageType = new ArrayList<>();
	
	/**
	 * Gets the priority.
	 *
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}
	
	
	
	/**
	 * Gets the package type.
	 *
	 * @return the package type
	 */
	public List<String> getPackageType() {
		return packageType;
	}
	
	/**
	 * Sets the package type.
	 *
	 * @param packageType the new package type
	 */
	public void setPackageType(List<String> packageType) {
		this.packageType = packageType;
	}
	
	/**
	 * Sets the priority.
	 *
	 * @param priority the new priority
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Sets the label.
	 *
	 * @param label the new label
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	/**
	 * Gets the bundle id.
	 *
	 * @return the bundle id
	 */
	public String getBundleId() {
		return bundleId;
	}
	
	/**
	 * Sets the bundle id.
	 *
	 * @param bundleId the new bundle id
	 */
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	
	/**
	 * Checks if is flag.
	 *
	 * @return true, if is flag
	 */
	public boolean isFlag() {
		return flag;
	}
	
	/**
	 * Sets the flag.
	 *
	 * @param flag the new flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
