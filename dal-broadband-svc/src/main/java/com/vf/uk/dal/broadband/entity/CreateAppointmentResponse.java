package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateAppointmentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T15:53:15.171Z")

public class CreateAppointmentResponse   {
  @JsonProperty("applicationId")
  private String applicationId = null;

  /**
   * 
   * @param applicationId
   * @return
   */
  public CreateAppointmentResponse applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Unique Id created by TIL on confirmation of appointment
   * @return applicationId
  **/
  @ApiModelProperty(value = "Unique Id created by TIL on confirmation of appointment")


  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppointmentResponse createAppointmentResponse = (CreateAppointmentResponse) o;
    return Objects.equals(this.applicationId, createAppointmentResponse.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppointmentResponse {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

