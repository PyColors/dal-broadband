package com.vf.uk.dal.broadband.entity.premise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressInfo extends ResourceSupport{

	@JsonProperty("category")
	private String category;
	@JsonProperty("addresses")
	private List<Address> addresses = new ArrayList<>();

	public AddressInfo addresses(List<Address> addresses) {
		this.addresses = addresses;
		return this;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddressInfo addressInfo = (AddressInfo) o;
		return Objects.equals(this.addresses, addressInfo.addresses)
				&& Objects.equals(this.category, addressInfo.category);
	}

	@Override
	public int hashCode() {
		return Objects.hash(addresses, category);
	}

}
