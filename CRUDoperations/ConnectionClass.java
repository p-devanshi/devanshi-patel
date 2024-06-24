package CRUDoperations;

import java.sql.*;
import javax.sql.*;


public class ConnectionClass {
	public static final String username="root";
	public static final  String password="devu@1910";
	public static final  String url = "jdbc:mysql://localhost:3306/stud";
	public static Connection getConnection() {
		  Connection cn = null;	
		try {
			//ste2 : load the drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn = DriverManager.getConnection(url,username,password);
			System.out.println(cn);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
		return cn;
			
		}


}
