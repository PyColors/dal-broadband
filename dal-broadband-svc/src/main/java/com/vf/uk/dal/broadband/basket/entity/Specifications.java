package com.vf.uk.dal.broadband.basket.entity;

/**
 * Specifications
 */

public class Specifications   {
  private String name = null;

  private String value = null;

  private String specPriority = null;

  private String comparable = null;

  private String iskey = null;

  private String valueType = null;

  private String valueUOM = null;

  private String footnote = null;

  private String description = null;

 

   /**
   *  Value of the Descriptions - \"Worldwide cover (30 days)\",\"Theft\",\"Loss\"
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
   /**
   * Value of the Descriptions - \"Yes\",\"No\"
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



   /**
   *  - priporty of the specfication
   * @return specPriority
  **/
  public String getSpecPriority() {
    return specPriority;
  }

  public void setSpecPriority(String specPriority) {
    this.specPriority = specPriority;
  }

 

   /**
   *  value of Comparable -\"Yes\" , \"No\"
   * @return comparable
  **/
  public String getComparable() {
    return comparable;
  }

  public void setComparable(String comparable) {
    this.comparable = comparable;
  }


   /**
   *  is the key sample value are -\"Yes\" , \"No\"
   * @return iskey
  **/
  public String getIskey() {
    return iskey;
  }

  public void setIskey(String iskey) {
    this.iskey = iskey;
  }



   /**
   * Value of types--\"boolean\"
   * @return valueType
  **/
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }



   /**
   * Unit of measurement for value
   * @return valueUOM
  **/
  public String getValueUOM() {
    return valueUOM;
  }

  public void setValueUOM(String valueUOM) {
    this.valueUOM = valueUOM;
  }



   /**
   * footNote
   * @return footnote
  **/
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }



   /**
   *  Specfication Description 
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


}

