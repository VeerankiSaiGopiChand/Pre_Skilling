package Day12;

import java.sql.*;

public class MultiplePatient {
	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root",
					"Gopichand@20");

			String sql = "INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";

			PreparedStatement pstmt = con.prepareStatement(sql);
			String[][] data = { { "Luffy", "22", "Fever" }, { "Zoro", "23", "Cold" }, { "Sanji", "22", "headche" },
					{ "Loki", "22", "Pain" } };
			for (String[] row : data) {
				pstmt.setString(1, row[0]); 
				pstmt.setInt(2, Integer.parseInt(row[1]));
				pstmt.setString(3, row[2]);
				pstmt.executeUpdate();
			}
			System.out.println(" All patients inserted successfully");
			con.close();     
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
