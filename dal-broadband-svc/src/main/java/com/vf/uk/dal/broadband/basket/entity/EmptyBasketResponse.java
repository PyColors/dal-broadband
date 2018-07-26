package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * EmptyBasketResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class EmptyBasketResponse   {
  @JsonProperty("basketId")
  private String basketId = null;

  /**
   * 
   * @param basketId
   * @return
   */
  public EmptyBasketResponse basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

  /**
   * Get basketId
   * @return basketId
  **/
  @ApiModelProperty(value = "")


  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmptyBasketResponse emptyBasketResponse = (EmptyBasketResponse) o;
    return Objects.equals(this.basketId, emptyBasketResponse.basketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmptyBasketResponse {\n");
    
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
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

