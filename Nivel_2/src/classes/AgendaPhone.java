package classes;

import interfaces.PhoneNumber;

public class AgendaPhone implements PhoneNumber {

	private String phonePrefix, number;

	public AgendaPhone(String telephonePrefix, String number) {
		this.phonePrefix = telephonePrefix;
		this.number = number;
	}

	@Override
	public String getPhoneNumber() {
		return "+" + phonePrefix + " " + number;
	}
}
