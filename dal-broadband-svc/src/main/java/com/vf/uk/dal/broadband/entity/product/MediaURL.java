package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MediaURL
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class MediaURL   {
  @JsonProperty("mediaName")
  private String mediaName = null;

  @JsonProperty("mediaURL")
  private String mediaURL = null;

  public MediaURL mediaName(String mediaName) {
    this.mediaName = mediaName;
    return this;
  }

  /**
   * Get mediaName
   * @return mediaName
  **/
  @ApiModelProperty(value = "")


  public String getMediaName() {
    return mediaName;
  }

  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }

  public MediaURL mediaURL(String mediaURL) {
    this.mediaURL = mediaURL;
    return this;
  }

  /**
   * Get mediaURL
   * @return mediaURL
  **/
  @ApiModelProperty(value = "")


  public String getMediaURL() {
    return mediaURL;
  }

  public void setMediaURL(String mediaURL) {
    this.mediaURL = mediaURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaURL mediaURL = (MediaURL) o;
    return Objects.equals(this.mediaName, mediaURL.mediaName) &&
        Objects.equals(this.mediaURL, mediaURL.mediaURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaName, mediaURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaURL {\n");
    
    sb.append("    mediaName: ").append(toIndentedString(mediaName)).append("\n");
    sb.append("    mediaURL: ").append(toIndentedString(mediaURL)).append("\n");
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

