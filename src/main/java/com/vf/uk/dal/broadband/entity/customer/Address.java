package com.vf.uk.dal.broadband.entity.customer;

import lombok.Data;

/**
 * The Class Address.
 */

@Data
public class Address {

	/**
	 * locationId -GCPL It's a reference to a
	 * LocationReference/LocationIdentification/ApplicationObjectKey/ID in GCPL
	 * response Unique identifier for the location of the party e.g. 1-13CIA
	 * Location id
	 */

	private String locationId;

	/**
	 * locationReferenceName-GCPL Unique name for the location of the party e.g.
	 * Victoria Embankment London
	 */

	private String locationReferenceName;

	/** Field Date dateMovedIn -GCPL Date the customer moved into Address. */

	private String dateMovedIn;

	/**
	 * Field boolean isMainAddress -GCPL Indicates Main address. Populated using
	 * Customer_Party_Account_Site_description
	 */

	private Boolean mainAddress;

	/**
	 * Field boolean isBillingAddress -GCPL Indicates Billing address. Populated
	 * using Customer_Party_Account_Site_description
	 */

	private Boolean billingAddress;

	/**
	 * Field boolean iasAccountShippingAddress -GCPL Indicates Shipping address.
	 * Populated using Customer_Party_Account_Site_description
	 */

	private Boolean iasAccountShippingAddress;

	/**
	 * Type of address which indicates if the address refers to a location
	 * inside UK or elsewhere. category -GCPL
	 */

	private String category;

	/**
	 * FAO -GCPL This refers to the person name with which the address should be
	 * referenced to. The FAO "For the Attention Of".
	 */

	private String FAO;

	/** lineOne -GCPL. */

	private String lineOne;

	/** lineTwo -GCPL. */

	private String lineTwo;

	/** lineThree -GCPL. */

	private String lineThree;

	/** lineFour -GCPL. */

	private String lineFour;

	/** buildingName -GCPL. */

	private String buildingName;

	/**
	 * cityName -GCPL The name, expressed as text, of the city, town or village
	 * of this address.
	 */

	private String cityName;

	/** countyName -GCPL. */

	private String countyName;

	/** countryCode -GCPL. */

	private String countryCode;

	/** postalCode -GCPL. */

	private String postalCode;

	/** emailAddress -GCPL location Email address. */

	private String emailAddress;

}
