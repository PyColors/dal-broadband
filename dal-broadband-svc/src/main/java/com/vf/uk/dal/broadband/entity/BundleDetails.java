package com.vf.uk.dal.broadband.entity;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * BundleDetails.
 */

public class BundleDetails   {
  
  /** The plan list. */
  private List<BundleHeader> planList = new ArrayList<>();
  
  /** The message. */
  private String message=null;

  /**
	 * Plan list.
	 *
	 * @param planList
	 *            the plan list
	 * @return the bundle details
	 */
  public BundleDetails planList(List<BundleHeader> planList) {
    this.planList = planList;
    return this;
  }

  /**
	 * Adds the plan list item.
	 *
	 * @param planListItem
	 *            the plan list item
	 * @return the bundle details
	 */
  public BundleDetails addPlanListItem(BundleHeader planListItem) {
    this.planList.add(planListItem);
    return this;
  }

   /**
    * Get planList.
    *
    * @return planList
    */
  public List<BundleHeader> getPlanList() {
    return planList;
  }

  /**
	 * Sets the plan list.
	 *
	 * @param planList
	 *            the new plan list
	 */
  public void setPlanList(List<BundleHeader> planList) {
    this.planList = planList;
  }
  
  /**
	 * Gets the message.
	 *
	 * @return the message
	 */
  public String getMessage() {
	return message;
  }

  /**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
	 */
  public void setMessage(String message) {
	this.message = message;
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
    BundleDetails bundleDetails = (BundleDetails) o;
    return Objects.equals(this.planList, bundleDetails.planList);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(planList);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleDetails {\n");
    
    sb.append("    planList: ").append(toIndentedString(planList)).append("\n");
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

