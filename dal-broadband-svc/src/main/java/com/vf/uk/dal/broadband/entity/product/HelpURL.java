package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * HelpURL.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class HelpURL   {
  
  /** The text. */
  @JsonProperty("text")
  private String text = null;

  /** The url. */
  @JsonProperty("url")
  private String url = null;

  /**
   * Text.
   *
   * @param text the text
   * @return the help URL
   */
  public HelpURL text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text.
   *
   * @return text
   */
  @ApiModelProperty(value = "")


  public String getText() {
    return text;
  }

  /**
   * Sets the text.
   *
   * @param text the new text
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Url.
   *
   * @param url the url
   * @return the help URL
   */
  public HelpURL url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url.
   *
   * @return url
   */
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  /**
   * Sets the url.
   *
   * @param url the new url
   */
  public void setUrl(String url) {
    this.url = url;
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
    HelpURL helpURL = (HelpURL) o;
    return Objects.equals(this.text, helpURL.text) &&
        Objects.equals(this.url, helpURL.url);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(text, url);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelpURL {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

