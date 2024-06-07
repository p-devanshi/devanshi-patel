package constructor;

public class MainClassStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        // Create a student with no name
		        Student student1 = new Student();
		        student1.printName(); // Should print "Unknown"

		        // Create a student with a name
		        Student student2 = new Student("devanshi");
		        student2.printName();

		       
		        Student student3 = new Student("vinay");
		        student3.printName(); 
		  
		


	}

}
