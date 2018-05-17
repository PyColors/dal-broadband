package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ImageURL
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")

public class ImageURL   {
  @JsonProperty("imageName")
  private String imageName = null;

  @JsonProperty("imageURL")
  private String imageURL = null;

  public ImageURL imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * Get imageName
   * @return imageName
  **/
  @ApiModelProperty(value = "")


  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public ImageURL imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  /**
   * Get imageURL
   * @return imageURL
  **/
  @ApiModelProperty(value = "")


  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(imageName, imageURL);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

