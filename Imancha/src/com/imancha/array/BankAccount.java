package com.imancha.array;

public class BankAccount {
	private int accountNumber;
	private double balance;

	public BankAccount(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

}
