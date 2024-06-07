package constructor;

public class Student {

	
	    private String name;

	    // Constructor with no arguments
	    public Student() {
	        this.name = "Unknown";
	    }

	    // Constructor with name argument
	    public Student(String name) {
	        this.name = name;
	    }

	    // Method to print the student's name
	    public void printName() {
	        System.out.println(this.name);
	    }
	

}
