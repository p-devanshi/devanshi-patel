package banking_transaction_system;
/*
 2. Abstract:
a. Create an abstract class Account with abstract methods like deposit(), withdraw(), and getBalance().

b. Implement concrete methods for common functionality in the Account class.

c. Create two subclasses, SavingsAccount and CheckingAccount, inheriting from the Account class.

d. Implement specific functionality for deposit, withdrawal, and balance retrieval in each subclass.

 */
abstract public class Account {
	protected double balance;
	protected double depositeLimit;
	protected double widthrawLimit;
	protected double minimumBalance;

	
	


	public Account(double balance, double depositeLimit, double widthrawLimit, double minimumBalance) {
		
		this.balance = balance;
		this.depositeLimit = depositeLimit;
		this.widthrawLimit = widthrawLimit;
		this.minimumBalance = minimumBalance;
	}
	public abstract void deposite(double amt);
	public abstract void withdraw(double amt);
	public abstract double getBalance();
	
	public boolean canWidthraw(double amt)
	{
		return (balance-amt) >= minimumBalance;
	}
	

}
