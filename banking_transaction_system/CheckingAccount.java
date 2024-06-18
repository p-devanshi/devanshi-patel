package banking_transaction_system;

public class CheckingAccount extends Account {

	public CheckingAccount(double balance, double depositeLimit, double widthrawLimit, double minimumBalance) {
		super(balance, depositeLimit, widthrawLimit, minimumBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(double amt) {
		balance+=amt;
		System.out.println("amount deposited = "+amt+". New after deposite Balance ="+balance);
		
	}

	@Override
	public void withdraw(double amt) {
		if(balance>=amt)
		{
			balance-=amt;
			System.out.println("amount widthrow = "+amt+". New Balance after widthraw="+balance);
		}
		else
		{
			System.out.println("Insufficient balance for withrow");
		}
		
	}

	@Override
	public double getBalance() {
		return balance;
		
	}

}
