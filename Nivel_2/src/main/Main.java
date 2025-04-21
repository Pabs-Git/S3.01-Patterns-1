package main;

import classes.AgendaFactoryProvider;
import interfaces.Address;
import interfaces.PhoneNumber;

public class Main {

	public static void main(String[] args) {

		AgendaFactoryProvider SpainAgenda = new AgendaFactoryProvider();
		Address spainAddressExample = SpainAgenda.createAddress("Spain", "Barcelona", "Calle Valencia", "08015");
		PhoneNumber spainNumberExample = SpainAgenda.createPhoneNumber("34", "694 124 542");

		AgendaFactoryProvider USAgenda = new AgendaFactoryProvider();
		Address usaAddressExample = USAgenda.createAddress("USA", "New York", "5th Avenue", "10001");
		PhoneNumber usaNumberExample = USAgenda.createPhoneNumber("1", "212 555 1234");

		System.out.println("Address (Spain): " + spainAddressExample.getAdress());
		System.out.println("Phone Number (Spain): " + spainNumberExample.getPhoneNumber());

		System.out.println("Address (USA): " + usaAddressExample.getAdress());
		System.out.println("Phone Number (USA): " + usaNumberExample.getPhoneNumber());
	}
}