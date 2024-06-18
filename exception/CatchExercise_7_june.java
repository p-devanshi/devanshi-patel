package exception;
/*
 Write a java program using multiple catch blocks. Create a class CatchExercise inside the try block declare an array
 a[] and initialize with value a[5] =30/5; . In each catch block show Arithmetic exception and ArrayIndexOutOfBoundsException.

 */
public class CatchExercise_7_june {
	public static void main(String args[])
	{
		try
		{
			int a[]= new int[5];
			a[5]=30/5;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
