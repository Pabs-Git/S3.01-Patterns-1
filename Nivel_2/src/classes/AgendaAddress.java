package classes;

import interfaces.Address;

public class AgendaAddress implements Address {

	private String country, city, street, zipCode;

	public AgendaAddress(String country, String city, String street, String zipCode) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}

	@Override
	public String getAdress(){
		return street + "," + country + " in the city of " + city + " with zip code " + zipCode;
	}
}
