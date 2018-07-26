package com.vf.uk.dal.broadband.entity.premise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class AddressInfo.
 */
public class AddressInfo extends ResourceSupport{

	/** The category. */
	@JsonProperty("category")
	private String category;
	
	/** The addresses. */
	@JsonProperty("addresses")
	private List<Address> addresses = new ArrayList<>();

	/**
	 * Addresses.
	 *
	 * @param addresses the addresses
	 * @return the address info
	 */
	public AddressInfo addresses(List<Address> addresses) {
		this.addresses = addresses;
		return this;
	}

	/**
	 * Gets the addresses.
	 *
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * Sets the addresses.
	 *
	 * @param addresses the new addresses
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(String category) {
		this.category = category;
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
		AddressInfo addressInfo = (AddressInfo) o;
		return Objects.equals(this.addresses, addressInfo.addresses)
				&& Objects.equals(this.category, addressInfo.category);
	}

	/* (non-Javadoc)
	 * @see org.springframework.hateoas.ResourceSupport#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(addresses, category);
	}

}
