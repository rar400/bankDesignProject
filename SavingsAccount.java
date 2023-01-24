package com.fdmgroup.bankDesignProject;


public class SavingsAccount extends Account{
	private double interestRate;

	public SavingsAccount() {
		super();
	}
	
	public void addInterest() {
		balance += (balance * interestRate / 100);
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
	
	@Override
	public double withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			return amount;
		}else {
			return 0;
		}
	}
}
