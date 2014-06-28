package com.imancha.array;

public class BankTester {

	public static void main(String[] args) {
		Bank firstBankOfJava = new Bank();

		for (int i = 0; i < 10; i++)
			firstBankOfJava.addAccount(new BankAccount(1000 + i, 10000 + i * 100));
		
		int count = firstBankOfJava.countBalancesAtLeast(10500);
		BankAccount account = firstBankOfJava.find(1005);		

		System.out.println("Count : " + count);

		if (account == null)
			System.out.println("No matching account");
		else
			System.out.println("Balance of matching account : "
					+ account.getBalance());
		
		System.out.println("Account with largest balance : "+firstBankOfJava.getMaximum().getAccountNumber());
	}

}
