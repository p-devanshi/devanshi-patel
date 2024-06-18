package Inheritance_exercise_28_may;

public class Manager extends Member {

	  private String department;

	    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
	        super(name, age, phoneNumber, address, salary);
	        this.department = department;
	    }

	    public String getDepartment() {
	        return department;
	    }

		@Override
		public String toString() {
			return "Manager [department=" + department + ", name=" + name + ", age=" + age + ", phoneNumber="
					+ phoneNumber + ", address=" + address + ", salary=" + salary + "]";
		}
	    
}
