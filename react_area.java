package workshop_java;
import java.util.*;
public class react_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		Scanner sc=new Scanner(System.in);
		double l,b;
		System.out.println("Enter Length=");
		l=sc.nextDouble();
		System.out.println("Enter Breath=");
		b=sc.nextDouble();
		
		a.setDim(l,b);
		System.out.println("Area of Rectangle = "+a.getDim());

	}

}
