package banking_transaction_system;

public class SavingAccount extends Account {

	

	

	public SavingAccount(double balance, double depositeLimit, double widthrawLimit, double minimumBalance) {
		super(balance, depositeLimit, widthrawLimit, minimumBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(double amt) {
		if(amt>=depositeLimit)
		{
			System.out.println("Deposit amount exceeds the deposit limit of " + depositeLimit);
		}
		else
		{
			balance+=amt;
			System.out.println("amount deposited = "+amt+". New after deposite Balance ="+balance);
		}
		
	}

	@Override
	public void withdraw(double amt) {
		
		if (amt > widthrawLimit) {
            System.out.println("Withdrawal amount exceeds the withdraw limit of " + widthrawLimit);
        } else if (canWithdraw(amt)) {
            balance -= amt;
            System.out.println("Withdrew " + amt + " from Savings Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account to maintain minimum balance of " + minimumBalance);
        }
		
	}

	private boolean canWithdraw(double amt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBalance() {
		return balance;
		
	}
	

}
