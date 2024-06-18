package exception;
import java.util.*;
public class divideByZeroExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,ans;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n1= ");
		n1=sc.nextInt();
		System.out.print("Enter n2= ");
		n2=sc.nextInt();
		try
		{
			ans=n1/n2;
			System.out.println("ANs = "+ans);
		}
		catch(Exception e)
		{
			System.out.println("no is Not divide By "+e.getMessage());
		}

	}

}
