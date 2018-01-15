package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * MediaLink.
 */

public class MediaLink   {
  
  /** The id. */
  private String id = null;

  /** The value. */
  private String value = null;

  /** The type. */
  private String type = null;
  
  /** The promo category. */
  private String promoCategory = null;
  
  /** The offer code. */
  private String offerCode = null;
  
  /** The description. */
  private String description;
	
	/** The discount id. */
	private String discountId;
	
	/** The priority. */
	private Integer priority = null;
	
	/** The package type. */
	private List<String> packageType = new ArrayList<>();

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
	 * Gets the priority.
	 *
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
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
	 * Gets the description.
	 *
	 * @return the description
	 */
	@JsonIgnore
  public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the discount id.
	 *
	 * @return the discount id
	 */
	@JsonIgnore
	public String getDiscountId() {
		return discountId;
	}

	/**
	 * Sets the discount id.
	 *
	 * @param discountId the new discount id
	 */
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

/**
 * Id.
 *
 * @param id the id
 * @return the media link
 */
public MediaLink id(String id) {
    this.id = id;
    return this;
  }

   /**
    * Unique id given for this link which provide a reference for UI to place this on the screen.
    *
    * @return id
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
   * Value.
   *
   * @param value the value
   * @return the media link
   */
  public MediaLink value(String value) {
    this.value = value;
    return this;
  }

   /**
    * URL Link from the content site for the media.
    *
    * @return value
    */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value.
   *
   * @param value the new value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Type.
   *
   * @param type the type
   * @return the media link
   */
  public MediaLink type(String type) {
    this.type = type;
    return this;
  }

   /**
    * Will provide UI information on the type of the link (like URL).
    *
    * @return type
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
   * Promo category.
   *
   * @param promoCategory the promo category
   * @return the media link
   */
  public MediaLink promoCategory(String promoCategory) {
	    this.promoCategory = promoCategory;
	    return this;
	  }
	 
  /**
   * Gets the promo category.
   *
   * @return the promo category
   */
  @JsonIgnore
  public String getPromoCategory() {
  	return promoCategory;
  }

  /**
   * Sets the promo category.
   *
   * @param promoCategory the new promo category
   */
  public void setPromoCategory(String promoCategory) {
  	this.promoCategory = promoCategory;
  }
  
  /**
   * Offer code.
   *
   * @param offerCode the offer code
   * @return the media link
   */
  public MediaLink offerCode(String offerCode) {
	    this.offerCode = offerCode;
	    return this;
	  }
  
  /**
   * Gets the offer code.
   *
   * @return the offer code
   */
  @JsonIgnore
  public String getOfferCode() {
  	return offerCode;
  }

  /**
   * Sets the offer code.
   *
   * @param offerCode the new offer code
   */
  public void setOfferCode(String offerCode) {
  	this.offerCode = offerCode;
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
		MediaLink mediaLink = (MediaLink) o;
		return Objects.equals(this.id, mediaLink.id) && Objects.equals(this.value, mediaLink.value)
				&& Objects.equals(this.type, mediaLink.type)
				&& Objects.equals(this.promoCategory, mediaLink.promoCategory)
				&& Objects.equals(this.offerCode, mediaLink.offerCode)
				&& Objects.equals(this.description, mediaLink.description)
				&& Objects.equals(this.discountId, mediaLink.discountId)
				&& Objects.equals(this.priority, mediaLink.priority)
				&& Objects.equals(this.packageType, mediaLink.packageType);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, value, type, promoCategory, offerCode, priority, packageType);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MediaLink {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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

