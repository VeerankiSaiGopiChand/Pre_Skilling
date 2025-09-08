package Day12;

import java.sql.*;
import java.util.Scanner;

public class MysqlUsecase {
	public static void main(String[] args) {
		// JDBC connection details
		String jdbcURL = "jdbc:mysql://localhost:3306/hospital";
		String dbUser = "root";
		String dbPassword = "Gopichand@20";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver
			Scanner scanner = new Scanner(System.in);

			try {
				Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

				try {

//					String createTableQuery = "CREATE TABLE IF NOT EXISTS patientss ("
//					+ "id INT AUTO_INCREMENT PRIMARY KEY, "
//					+ "name VARCHAR(100) NOT NULL, "
//					+ "age INT NOT NULL, "
//					+ "disease VARCHAR(100) NOT NULL, "
//					+ "admission_date DATE NOT NULL, "
//					+ "doctor_assigned VARCHAR(100) NOT NULL"
//					+ ")";
//			
//			Statement stmt = conn.createStatement(); 
//			stmt.executeUpdate(createTableQuery);
//			System.out.println("Patientss table is ready.");
//			stmt.close();

					System.out.println("Choose an option:");
					System.out.println("1. Add Patient");
					System.out.println("2. Delete Patient by ID");
					System.out.println("3. Update Patient by ID");
					System.out.print("Enter choice (1-3): ");
					int choice = scanner.nextInt();
					scanner.nextLine(); // consume newline

					if (choice == 1) {
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
							System.out.println("Patient added successfully!");
						}

						pstmt.close();

					} else if (choice == 2) {
						System.out.print("Enter patient ID to delete: ");
						int idToDelete = scanner.nextInt();
						String deleteSQL = "DELETE FROM patientss WHERE id = ?";
						PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
						pstmt.setInt(1, idToDelete);

						int rowsDeleted = pstmt.executeUpdate();
						if (rowsDeleted > 0) {
							System.out.println("Patient deleted successfully!");
						} else {
							System.out.println("No patient found with ID: " + idToDelete);
						}

						pstmt.close();

					} else if (choice == 3) {
						System.out.print("Enter patient ID to update: ");
						int idToUpdate = scanner.nextInt();
						scanner.nextLine();

						System.out.print("Enter new name: ");
						String name = scanner.nextLine();

						System.out.print("Enter new age: ");
						int age = scanner.nextInt();
						scanner.nextLine();

						System.out.print("Enter new disease: ");
						String disease = scanner.nextLine();

						System.out.print("Enter new admission date (YYYY-MM-DD): ");
						String admissionDate = scanner.nextLine();

						System.out.print("Enter new doctor assigned: ");
						String doctor = scanner.nextLine();

						String updateSQL = "UPDATE patientss SET name = ?, age = ?, disease = ?, admission_date = ?, doctor_assigned = ? WHERE id = ?";
						PreparedStatement pstmt = conn.prepareStatement(updateSQL);
						pstmt.setString(1, name);
						pstmt.setInt(2, age);
						pstmt.setString(3, disease);
						pstmt.setDate(4, Date.valueOf(admissionDate));
						pstmt.setString(5, doctor);
						pstmt.setInt(6, idToUpdate);

						int rowsUpdated = pstmt.executeUpdate();
						if (rowsUpdated > 0) {
							System.out.println("Patient updated successfully!");
						} else {
							System.out.println("No patient found with ID: " + idToUpdate);
						}

						pstmt.close();

					} else {
						System.out.println("Invalid choice.");
					}

				} finally {
					conn.close();
				}

			} finally {
				scanner.close();
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
