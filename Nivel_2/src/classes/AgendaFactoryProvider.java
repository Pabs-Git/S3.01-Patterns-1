package classes;

import interfaces.Address;
import interfaces.AgendaFactory;
import interfaces.PhoneNumber;

public class AgendaFactoryProvider implements AgendaFactory {
	@Override
	public Address createAddress(String country, String city, String street, String zipCode){
		return new AgendaAddress(country, city, street, zipCode);
	}
	@Override
	public PhoneNumber createPhoneNumber(String phonePrefix, String number){
		return new AgendaPhone(phonePrefix, number);
	}
}
