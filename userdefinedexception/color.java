package userdefinedexception;

public class color {
	private String colorname;

	public String getColorname() {
		return colorname;
	}

	public void setColorname(String colorname) {
		try
		{
			if(colorname != "red" && colorname != "green" && colorname != "white")
			{
				throw new CheckColor("Color name must be either red,green,white");
			}
			else
			{
			this.colorname = colorname;
			}
		}
		catch(CheckColor e)
		{
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "color [colorname=" + colorname + "]";
	}
	
	

}
