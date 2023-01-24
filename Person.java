package com.fdmgroup.bankDesignProject;

public class Person extends Customer{


	private static String customerType = "person";

	public Person(String name, String address) {
		super(name, address, customerType);
	}

	@Override
	public void chargeAllAccounts(double amount) {
		for(Account eachAccount : getAccounts()) {
			eachAccount.balance -= amount;
		}
	}
	
}