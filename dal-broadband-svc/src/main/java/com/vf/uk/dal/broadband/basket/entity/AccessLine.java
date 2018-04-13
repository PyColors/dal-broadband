package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;


/**
 * AccessLine
 */

public class AccessLine   {
  private String id = null;

  private String channelId = null;

  public AccessLine id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for copper line. This field can be used as an alternative means of identifying a working line
   * @return id
  **/


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccessLine channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessLine accessLine = (AccessLine) o;
    return Objects.equals(this.id, accessLine.id) &&
        Objects.equals(this.channelId, accessLine.channelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

