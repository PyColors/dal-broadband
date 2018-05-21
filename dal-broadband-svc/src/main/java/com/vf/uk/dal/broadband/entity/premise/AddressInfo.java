package com.vf.uk.dal.broadband.entity.premise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddressInfo {

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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddressInfo addressInfo = (AddressInfo) o;
		return Objects.equals(this.addresses, addressInfo.addresses);
	}

	@Override
	public int hashCode() {
		return Objects.hash(addresses);
	}

}
