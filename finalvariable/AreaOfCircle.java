package finalvariable;

public class AreaOfCircle {

	private final double PI=3.14;
	private double r;
	
	
	
	public double getR() {
		return r;
	}



	public void setR(double r) {
		this.r = r;
	}



	public double AreaCircle()
	{
		return (PI*r*r);
	}
	
}
