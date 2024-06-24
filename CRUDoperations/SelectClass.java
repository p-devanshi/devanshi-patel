package CRUDoperations;
import java.sql.*;
import javax.sql.*; 
public class SelectClass {
	Connection cn;
	Statement st;
	public SelectClass() {
		cn=ConnectionClass.getConnection();
	}
	public void SelectOperation()
	{
		
		String sql="SELECT * FROM student";
		try {
			st=cn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

}
