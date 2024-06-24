package CRUDoperations;

import java.sql.*;

public class InsertClass {
	Connection cn;
	public InsertClass() {
		cn=ConnectionClass.getConnection();
	}

	public void insertRecord(int id,String name,String stream)
	{
		
		try {
			String sql="INSERT INTO student VALUES("+id+",'"+name+"','"+stream+"')";
			Statement statement =cn.createStatement();
			int rows=statement.executeUpdate(sql);
			if(rows>0)
			{
				System.out.println("Data Inserted....");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
