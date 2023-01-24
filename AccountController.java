package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;


public class AccountController {

	private List<Customer> customers; 
	private List<Account> accounts;
	
	public AccountController() {
		customers = new ArrayList<>();
		accounts = new ArrayList<>();
	}
	
	public Customer createCustomer(String name, String address, String customerType) {
		Customer customer;
		if(customerType.equals("person")) {
			customer = new Person(name, address);
		}else {
			customer = new Company(name, address);
		}
		customers.add(customer);
		return customer;
}

	public Account createAccount(Customer customer, String accountType) {
		Account account;
		if(accountType.equals("checking")) {
			account = new CheckingAccount();
		}else {
			account = new SavingsAccount();
		}
		accounts.add(account); //accountController’s list of accounts 
		customer.addAccount(account);
		return account;
	}



	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		for (Account account : customer.getAccounts()) {
	        this.accounts.remove(account);
	    }
		
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
		customers.stream().filter(cust -> 
			cust.getAccounts().contains(account)).forEach( cust -> cust.getAccounts().remove(account));
//		account.getCustomer().removeAccount(account); //another option to remove account
		
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
}