package CRUDoperations;
import java.sql.*;
import javax.sql.*;
public class UpdateClass {
	Connection cn;
	
	public UpdateClass() {
		cn=ConnectionClass.getConnection();
	}

	public void UpdateOperation(int sid,String name,String Stream)
	{
		String sql="UPDATE student SET sname='"+name+"' WHERE id="+sid+"";
		
		try {
			Statement st=cn.createStatement();
			int r=st.executeUpdate(sql);
			if(r>0)
			{
				System.out.println("Record updated...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
