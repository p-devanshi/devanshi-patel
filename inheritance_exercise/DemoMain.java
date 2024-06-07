package inheritance_exercise;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square ob =new Square();
		
		ob.setL(2);
		ob.setB(3);
		System.out.println("Area of rectangl= "+ob.AreaRectangle());

		System.out.println("Area of square= "+ob.AreaOfSquare());

	}

}
