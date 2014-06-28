package com.imancha.array;

import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts;

	public Bank() {
		accounts = new ArrayList<BankAccount>();
	}

	public void addAccount(BankAccount a) {
		accounts.add(a);
	}

	public double getTotalBalance() {
		double total = 0;

		for (BankAccount a : accounts)
			total += a.getBalance();

		return total;
	}

	public int countBalancesAtLeast(double atLeast) {
		int matches = 0;

		for (BankAccount a : accounts)
			if (a.getBalance() >= atLeast)
				matches++;

		return matches;
	}

	public BankAccount find(int accountNumber) {
		for (BankAccount a : accounts)
			if (a.getAccountNumber() == accountNumber)
				return a;

		return null;
	}

	public BankAccount getMaximum() {
		if (accounts.size() == 0)
			return null;

		BankAccount largestYet = accounts.get(0);

		for (int i = 1; i < accounts.size(); i++) {
			BankAccount a = accounts.get(i);
			if (a.getBalance() > largestYet.getBalance())
				largestYet = a;
		}

		return largestYet;
	}
}
