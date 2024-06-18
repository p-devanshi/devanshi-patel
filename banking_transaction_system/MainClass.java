package banking_transaction_system;

public class MainClass {
	public static void main(String args[])
	{
		Bank b1=new Bank();
		Bank b2=new Bank();
		
		System.out.println("Total No of Bank Accounts = "+Bank.getTotalAccounts());
		
		SavingAccount sa=new SavingAccount(500,15000,10000,1000);
		CheckingAccount ca=new CheckingAccount(6000,15000,10000,1000);
		
		Transaction trans=new Transaction();
		
		System.out.println("For Saving account=");
		System.out.println("Account balance = "+sa.getBalance());
		trans.performTransaction(sa, 16000,true);
		trans.performTransaction(sa, 1000,false);
		
		System.out.println("\n\n\n");
		System.out.println("For Checking account=");
		System.out.println("Account balance = "+ca.getBalance());
		trans.performTransaction(ca, 100,true);
		trans.performTransaction(ca, 300,false);
		
		/*//Saving account 
		System.out.println("Account balance = "+sa.getBalance());
		sa.deposite(100);
		sa.withdraw(200);*/
		
	}

}
