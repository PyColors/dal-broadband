package com.vf.uk.dal.broadband.basket.entity;

/**
 * MediaLink
 */

public class MediaLink   {
  private String id = null;

  private String value = null;

  private String type = null;

 

   /**
   * Unique id given for this link which provide a reference for UI to place this on the screen
   * @return id
  **/	
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

 

   /**
   * URL Link from the content site for the media
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

 

   /**
   * Will provide UI information on the type of the link (like URL)
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


}

