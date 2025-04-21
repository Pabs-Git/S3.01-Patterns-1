package interfaces;

public interface AgendaFactory {
	Address createAddress(String country, String city, String street, String zipCode);
	PhoneNumber createPhoneNumber(String phonePrefix, String number);
}
