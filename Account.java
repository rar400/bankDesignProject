package com.fdmgroup.bankDesignProject;

public abstract class Account {
	
	private final long ACCOUNT_ID;
	private static long nextAccountId = 1000;
	protected double balance;
	private Customer customer;
	
	public Account() {
		this.ACCOUNT_ID = nextAccountId;
		nextAccountId += 5;
	}

	public double withdraw(double amount) {
		this.balance -= amount;
		return amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void correctBalance(double amount) {
		this.balance = amount;
	}

	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}

	public double getBalance() {
		return this.balance;
	}
	

	public Customer getCustomer() {
		return customer;
	}

	@Override
	public String toString() {
		return "Account [ACCOUNT_ID=" + ACCOUNT_ID + ", balance=" + balance + ", customer=" + customer + "]";
	}
	
	
	
}