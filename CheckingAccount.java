package com.fdmgroup.bankDesignProject;
public class CheckingAccount extends Account{
	
	private int nextCheckNumber = 1;
	
	public CheckingAccount() {
		super();
	}

	public int getNextCheckNumber() {
		return nextCheckNumber++;
	}
}