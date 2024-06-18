package Inheritance_exercise_28_may;

public class Member {
	protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", salary=" + salary + "]";
	}
    

}
