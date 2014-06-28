package com.imancha.array;

import java.util.ArrayList;

public class BankAccountTester {

	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

		for (int i = 0; i < 10; i++)
			accounts.add(new BankAccount(1000 + i));

		accounts.remove(0);

		BankAccount first = accounts.get(0);
		BankAccount last = accounts.get(accounts.size() - 1);

		System.out.println("Size : " + accounts.size());
		System.out.println("First account number : " + first.getAccountNumber());
		System.out.println("Last account number  : " + last.getAccountNumber());
	}
}
