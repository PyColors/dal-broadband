package com.vf.uk.dal.broadband.journey.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CryptogramRequest.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T07:23:46.167Z")

public class CryptogramRequest   {
  
  /** The cryptogram. */
  @JsonProperty("cryptogram")
  private String cryptogram = null;

  /**
   * Cryptogram.
   *
   * @param cryptogram the cryptogram
   * @return the cryptogram request
   */
  public CryptogramRequest cryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
    return this;
  }

   /**
    * Encrypted datagram string.
    *
    * @return cryptogram
    */
  public String getCryptogram() {
    return cryptogram;
  }

  /**
   * Sets the cryptogram.
   *
   * @param cryptogram the new cryptogram
   */
  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
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
    CryptogramRequest cryptogramRequest = (CryptogramRequest) o;
    return Objects.equals(this.cryptogram, cryptogramRequest.cryptogram);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(cryptogram);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptogramRequest {\n");
    
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
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

