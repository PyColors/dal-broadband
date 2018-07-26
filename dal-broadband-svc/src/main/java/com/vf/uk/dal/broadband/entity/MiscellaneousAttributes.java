package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MiscellaneousAttributes.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-27T18:08:29.266Z")

public class MiscellaneousAttributes   {
  
  /**  plan callout. */
  @JsonProperty("planCallOut")
  private String planCallOut = null;
  
  /** The speed. */
  @JsonProperty("speed")
  private String speed = null;

  /** The max cap speed. */
  @JsonProperty("MaxCapSpeed")
  private String maxCapSpeed = null;

  /** The min cap speed. */
  @JsonProperty("MinCapSpeed")
  private String minCapSpeed = null;

  /**
   * Speed.
   *
   * @param speed the speed
   * @return the miscellaneous attributes
   */
  public MiscellaneousAttributes speed(String speed) {
    this.speed = speed;
    return this;
  }

   /**
    * Speed of the FLBB Plan.
    *
    * @return speed
    */

  

  public String getSpeed() {
    return speed;
  }

  	/**
	   * Gets the plan call out.
	   *
	   * @return the plan call out
	   */
	  public String getPlanCallOut() {
		return planCallOut;
	}
	
	/**
	 * Sets the plan call out.
	 *
	 * @param planCallOut the new plan call out
	 */
	public void setPlanCallOut(String planCallOut) {
		this.planCallOut = planCallOut;
	}
	
	/**
	 * Plan call out.
	 *
	 * @param planCallOut the plan call out
	 * @return the miscellaneous attributes
	 */
	public MiscellaneousAttributes planCallOut(String planCallOut) {
	    this.planCallOut = planCallOut;
	    return this;
	  }

/**
   * Sets the speed.
   *
   * @param speed the new speed
   */
  public void setSpeed(String speed) {
    this.speed = speed;
  }

  /**
   * Max cap speed.
   *
   * @param maxCapSpeed the max cap speed
   * @return the miscellaneous attributes
   */
  public MiscellaneousAttributes maxCapSpeed(String maxCapSpeed) {
    this.maxCapSpeed = maxCapSpeed;
    return this;
  }

   /**
    * Max Speed of the FLBB Plan.
    *
    * @return maxCapSpeed
    */


  public String getMaxCapSpeed() {
    return maxCapSpeed;
  }

  /**
   * Sets the max cap speed.
   *
   * @param maxCapSpeed the new max cap speed
   */
  public void setMaxCapSpeed(String maxCapSpeed) {
    this.maxCapSpeed = maxCapSpeed;
  }

  /**
   * Min cap speed.
   *
   * @param minCapSpeed the min cap speed
   * @return the miscellaneous attributes
   */
  public MiscellaneousAttributes minCapSpeed(String minCapSpeed) {
    this.minCapSpeed = minCapSpeed;
    return this;
  }

   /**
    * Min Speed of the FLBB Plan.
    *
    * @return minCapSpeed
    */


  public String getMinCapSpeed() {
    return minCapSpeed;
  }

  /**
   * Sets the min cap speed.
   *
   * @param minCapSpeed the new min cap speed
   */
  public void setMinCapSpeed(String minCapSpeed) {
    this.minCapSpeed = minCapSpeed;
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
    MiscellaneousAttributes miscellaneousAttributes = (MiscellaneousAttributes) o;
    return Objects.equals(this.planCallOut, miscellaneousAttributes.planCallOut) &&
    	Objects.equals(this.speed, miscellaneousAttributes.speed) &&
        Objects.equals(this.maxCapSpeed, miscellaneousAttributes.maxCapSpeed) &&
        Objects.equals(this.minCapSpeed, miscellaneousAttributes.minCapSpeed);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(planCallOut, speed, maxCapSpeed, minCapSpeed);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousAttributes {\n");
    
    sb.append("    planCallOut: ").append(toIndentedString(planCallOut)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    maxCapSpeed: ").append(toIndentedString(maxCapSpeed)).append("\n");
    sb.append("    minCapSpeed: ").append(toIndentedString(minCapSpeed)).append("\n");
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

