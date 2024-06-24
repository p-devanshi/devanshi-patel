package CRUDoperations;
import java.sql.*;
import javax.sql.*;
public class DeleteClass {
	Connection cn;

	public DeleteClass() {
		cn=ConnectionClass.getConnection();
	}
	public void DeleteOperation(int sid)
	{
		String sql="DELETE from student WHERE id=+"+sid+"";
		try {
			Statement st=cn.createStatement();
			int r=st.executeUpdate(sql);
			if(r>0)
			{
				System.out.println("Record Deleted..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
