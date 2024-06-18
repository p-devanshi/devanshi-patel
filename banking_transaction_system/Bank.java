package banking_transaction_system;
/*
 Banking Transaction System

Objective: Design and implement a Banking Transaction System using Java, incorporating static, abstract, and final.

Instructions:

1.Static:

a. Implement a Bank class with a static variable totalAccounts to keep track of the total number of bank accounts.

b. Create a static method getTotalAccounts() that returns the current value of totalAccounts.

c. Utilize the static keyword to ensure that totalAccounts is shared among all instances of the Bank class

 */
public class Bank {
	private static int totalAccounts;
	
	public Bank() {
		totalAccounts++;
	}

	public static int getTotalAccounts()
	{
		return totalAccounts;
	}

}
