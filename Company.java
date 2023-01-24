package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class Company extends Customer{
	
	private static String customerType = "company";
	private List<Account> accounts = new ArrayList<>();

	public Company(String name, String address) {
		super(name, address, customerType);
	}

	@Override
	public void chargeAllAccounts(double amount) {
		for(Account eachAccount : getAccounts()) {
			if(eachAccount instanceof CheckingAccount) {
				eachAccount.balance -= amount;
			}else {
				eachAccount.balance -= (amount * 2);
			}
				
		}
	}
}