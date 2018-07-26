package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateAppointmentResponse.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T15:53:15.171Z")

public class CreateAppointmentResponse extends ResourceSupport   {
  
  /** The application id. */
  @JsonProperty("applicationId")
  private String applicationId = null;

  /**
   * Application id.
   *
   * @param applicationId the application id
   * @return the creates the appointment response
   */
  public CreateAppointmentResponse applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
    * Unique Id created by TIL on confirmation of appointment.
    *
    * @return applicationId
    */
  @ApiModelProperty(value = "Unique Id created by TIL on confirmation of appointment")


  public String getApplicationId() {
    return applicationId;
  }

  /**
   * Sets the application id.
   *
   * @param applicationId the new application id
   */
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  /* (non-Javadoc)
   * @see org.springframework.hateoas.ResourceSupport#equals(java.lang.Object)
   */
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

  /* (non-Javadoc)
   * @see org.springframework.hateoas.ResourceSupport#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(applicationId);
  }

  /* (non-Javadoc)
   * @see org.springframework.hateoas.ResourceSupport#toString()
   */
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

