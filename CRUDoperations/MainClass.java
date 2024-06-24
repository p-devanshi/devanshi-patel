package CRUDoperations;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertClass ins=new InsertClass();
		//ins.insertRecord(4,"Devanshi","Commerse");
		
		
		SelectClass read=new SelectClass();
		read.SelectOperation();
		
		
		UpdateClass upd=new UpdateClass();
		upd.UpdateOperation(4,"Anjali","Arts");
		System.out.println("Records After Update...");
		read.SelectOperation();
		
		DeleteClass dlt=new DeleteClass();
		dlt.DeleteOperation(3);
		

	}

}
