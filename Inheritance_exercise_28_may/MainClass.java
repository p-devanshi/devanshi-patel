package Inheritance_exercise_28_may;

public class MainClass {
	public static void main(String args[])
	{
		Employee emp=new Employee("Devanshi",21,"1234567890","Navapura",50000,"WEB development");
		System.out.println("Employee details=");
		System.out.println(emp);
		Manager mng=new Manager("Devanshi",21,"1234567890","Navapura",50000,"IT");
		System.out.println("Manager details=");
		System.out.println(mng);
	}

}
