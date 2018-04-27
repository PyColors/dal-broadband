package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ListOfEligibleChannel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class ListOfEligibleChannel   {
  @JsonProperty("channelName")
  private String channelName = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  public ListOfEligibleChannel channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * Get channelName
   * @return channelName
  **/
  @ApiModelProperty(value = "")


  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public ListOfEligibleChannel startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ListOfEligibleChannel endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOfEligibleChannel listOfEligibleChannel = (ListOfEligibleChannel) o;
    return Objects.equals(this.channelName, listOfEligibleChannel.channelName) &&
        Objects.equals(this.startDate, listOfEligibleChannel.startDate) &&
        Objects.equals(this.endDate, listOfEligibleChannel.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelName, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfEligibleChannel {\n");
    
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

