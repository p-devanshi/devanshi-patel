package inheritance_exercise;

public class Rectangle {
	private int l,b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int AreaRectangle()
	{
		return l*b;
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + "]";
	}
	

}
