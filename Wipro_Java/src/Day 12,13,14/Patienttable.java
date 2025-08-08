package Day12;

import java.sql.*;

public class Patienttable {
	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root",
					"Gopichand@20");
			// System.out.println("Connected Successsfully");

			Statement stmt = con.createStatement();

			String sql = "CREATE TABLE IF NOT EXISTS patient(" + "id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(100)," + "age INT," + "disease VARCHAR(100))";

			stmt.executeUpdate(sql);
			System.out.println("Table 'patient' created successfully.");
			con.close();
		} catch (Exception e) {
			e.printStackTrace(); 

		}
	}
}


/*package JDBC;
 
import java.sql.*;
 
public class DBConnect
{
public static void main(String[] args)
	{
 
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "Mahasa@Guru");
		
		String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1, "Renu");
		pstmt.setInt(2, 30);
		pstmt.setString(3, "cold");
		
		int rowsInserted=pstmt.executeUpdate();
		if(rowsInserted>0)
		{
			System.out.println("Patient inserted successfully");
		}
		con.close();
	 }
	catch (Exception e)
	{
	e.printStackTrace();
			
	}
	}
}
 
 */
