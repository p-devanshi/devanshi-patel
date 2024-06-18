package userdefinedexception;
import java.util.*;
public class MainUserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colorname;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Color name=");
		colorname=sc.nextLine();
		
		color c=new color();
		c.setColorname(colorname);
		System.out.println(c);

	}

}
