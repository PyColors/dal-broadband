package com.vf.uk.dal.broadband.entity.journey;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CryptogramRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T07:23:46.167Z")

public class CryptogramRequest {
	@JsonProperty("cryptogram")
	private String cryptogram = null;

	/**
	 * @param cryptogram
	 * @return
	 */
	public CryptogramRequest cryptogram(String cryptogram) {
		this.cryptogram = cryptogram;
		return this;
	}

	/**
	 * Encrypted datagram string
	 * 
	 * @return cryptogram
	 **/
	public String getCryptogram() {
		return cryptogram;
	}

	public void setCryptogram(String cryptogram) {
		this.cryptogram = cryptogram;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(cryptogram);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
