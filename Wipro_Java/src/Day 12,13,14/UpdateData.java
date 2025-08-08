package Day12;

import java.sql.*;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		// JDBC connection details
		String jdbcURL = "jdbc:mysql://localhost:3306/hospital";
		String dbUser = "root";
		String dbPassword = "Gopichand@20";

		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			Scanner scanner = new Scanner(System.in);

			try {

				Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

				try {
					
//					String createTableQuery = "CREATE TABLE IF NOT EXISTS patientss ("
//							+ "id INT AUTO_INCREMENT PRIMARY KEY, "
//							+ "name VARCHAR(100) NOT NULL, "
//							+ "age INT NOT NULL, "
//							+ "disease VARCHAR(100) NOT NULL, "
//							+ "admission_date DATE NOT NULL, "
//							+ "doctor_assigned VARCHAR(100) NOT NULL"
//							+ ")";
//					
//					Statement stmt = conn.createStatement();
//					stmt.executeUpdate(createTableQuery);
//					System.out.println("Patientss table is ready.");
//					stmt.close();

					String insertSQL = "INSERT INTO patientss (name, age, disease, admission_date, doctor_assigned) "
							+ "VALUES (?, ?, ?, ?, ?)";
					PreparedStatement pstmt = conn.prepareStatement(insertSQL);

					System.out.print("Enter patient name: ");
					String name = scanner.nextLine();

					System.out.print("Enter age: ");
					int age = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Enter disease: ");
					String disease = scanner.nextLine();

					System.out.print("Enter admission date (YYYY-MM-DD): ");
					String admissionDate = scanner.nextLine();

					System.out.print("Enter doctor assigned: ");
					String doctor = scanner.nextLine();

					pstmt.setString(1, name);
					pstmt.setInt(2, age);
					pstmt.setString(3, disease);
					pstmt.setDate(4, Date.valueOf(admissionDate));
					pstmt.setString(5, doctor);

					int rowsInserted = pstmt.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("Patientss added successfully!");
					}

					pstmt.close(); // close prepared statement
				} finally {
					conn.close(); // close connection
				}

			} finally {
				scanner.close(); // close scanner
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
