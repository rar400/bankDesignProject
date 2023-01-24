package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
	
	private final long CUSTOMER_ID;
	private static long nextCustomerId = 2000000;
	private String name;
	private String address;
	private String customerType;
	private List<Account> accounts = new ArrayList<>();
	
	public Customer(String name, String address, String customerType) {
		super();
		this.name = name;
		this.address = address;
		this.customerType = customerType;
		this.CUSTOMER_ID = nextCustomerId;
		nextCustomerId +=7;
	}


	public void addAccount(Account account) {
		accounts.add(account); 
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	public abstract void chargeAllAccounts(double amount);
	
	public long getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Account> getAccounts() {
		return accounts;
	}

	
	
	public String getCustomerType() {
		return customerType;
	}


	@Override
	public String toString() {
		return "Customer [CUSTOMER_ID=" + CUSTOMER_ID + ", name=" + name + ", address=" + address + ", customerType="
				+ customerType;
	}


	
}
