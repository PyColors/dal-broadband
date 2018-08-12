package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ImageURL.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")

public class ImageURL   {
  
  /** The image name. */
  @JsonProperty("imageName")
  private String imageName = null;

  /** The image URL. */
  @JsonProperty("imageURL")
  private String imageURL = null;

  /**
   * Image name.
   *
   * @param imageName the image name
   * @return the image URL
   */
  public ImageURL imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * Get imageName.
   *
   * @return imageName
   */
  @ApiModelProperty(value = "")


  public String getImageName() {
    return imageName;
  }

  /**
   * Sets the image name.
   *
   * @param imageName the new image name
   */
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  /**
   * Image URL.
   *
   * @param imageURL the image URL
   * @return the image URL
   */
  public ImageURL imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  /**
   * Get imageURL.
   *
   * @return imageURL
   */
  @ApiModelProperty(value = "")


  public String getImageURL() {
    return imageURL;
  }

  /**
   * Sets the image URL.
   *
   * @param imageURL the new image URL
   */
  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
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
    ImageURL imageURL = (ImageURL) o;
    return Objects.equals(this.imageName, imageURL.imageName) &&
        Objects.equals(this.imageURL, imageURL.imageURL);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(imageName, imageURL);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageURL {\n");
    
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
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

