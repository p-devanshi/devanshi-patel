package Inheritance_exercise_28_may;

public class Employee extends Member{
	private String specializarion;

	public Employee(String name, int age, String phoneNumber, String address, double salary, String specializarion) {
		super(name, age, phoneNumber, address, salary);
		this.specializarion = specializarion;
	}
	public String getSpecialization()
	{
		return specializarion;
	}
	@Override
	public String toString() {
		return "Employee [specializarion=" + specializarion + ", name=" + name + ", age=" + age + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", salary=" + salary + "]";
	}
	
	

}
