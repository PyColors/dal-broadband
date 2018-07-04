package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ItemReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class ItemReference   {
  @JsonProperty("classificationCode")
  private String classificationCode = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  public ItemReference classificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
    return this;
  }

  /**
   * FThe line of products for which appointment is being booked LOV - LINE ADSL Fibre with Speed 38 Fibre with Speed 76 FTTP with speed 38 FTTP   with speed 76.
   * @return classificationCode
  **/
  @ApiModelProperty(value = "FThe line of products for which appointment is being booked LOV - LINE ADSL Fibre with Speed 38 Fibre with Speed 76 FTTP with speed 38 FTTP   with speed 76.")


  public String getClassificationCode() {
    return classificationCode;
  }

  public void setClassificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
  }

  public ItemReference typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * The type of product for which appointment is being booked When Broadband Network is Onnet and SubClassificationCode is ‘FTTCSim2’ or ‘Generic Ethernet Access’, select TypeCode as ‘NGAFTTC’ When Broadband Network is Offnet and SubClassificationCode is ‘FTTCSim2’ or ‘Generic Ethernet Access’, select TypeCode as ‘FTTC’ When Broadband Network is Onnet and SubClassificationCode is ‘Generic Ethernet Access - FTTP’, select TypeCode as ‘NGAFTTP’ ‘SMPF’, ‘MPF’, ‘SDSL’, ‘IPS’, ‘ADSL2+’– Applicable for Broadband but not supported. For future use only LOV - SMPF, MPF, SDSL, IPS, ADSL2+, FTTC, NGAFTTC, NGAFTTP.
   * @return typeCode
  **/
  @ApiModelProperty(value = "The type of product for which appointment is being booked When Broadband Network is Onnet and SubClassificationCode is ‘FTTCSim2’ or ‘Generic Ethernet Access’, select TypeCode as ‘NGAFTTC’ When Broadband Network is Offnet and SubClassificationCode is ‘FTTCSim2’ or ‘Generic Ethernet Access’, select TypeCode as ‘FTTC’ When Broadband Network is Onnet and SubClassificationCode is ‘Generic Ethernet Access - FTTP’, select TypeCode as ‘NGAFTTP’ ‘SMPF’, ‘MPF’, ‘SDSL’, ‘IPS’, ‘ADSL2+’– Applicable for Broadband but not supported. For future use only LOV - SMPF, MPF, SDSL, IPS, ADSL2+, FTTC, NGAFTTC, NGAFTTP.")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemReference itemReference = (ItemReference) o;
    return Objects.equals(this.classificationCode, itemReference.classificationCode) &&
        Objects.equals(this.typeCode, itemReference.typeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationCode, typeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReference {\n");
    
    sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

