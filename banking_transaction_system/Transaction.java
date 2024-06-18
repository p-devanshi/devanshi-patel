package banking_transaction_system;
/*
 3.Final:
a. Design a Transaction class with final methods such as performTransaction() to ensure that the transaction process is consistent across all instances.

b. Create a final variable transactionFee that represents a fixed fee for each transaction.

c. Demonstrate how the final methods and variables contribute to maintaining the integrity of the transaction process.

 */
public class Transaction {
	
	private final double transactionFee = 2;
	public final void performTransaction(Account acnt,double amount,boolean isDeposite)
	{
		if(isDeposite)
		{
			acnt.deposite(amount);
		}
		else
		{
			acnt.withdraw(amount+transactionFee);
		}
		System.out.println("Transaction Fees = "+transactionFee);
	}
	

}
