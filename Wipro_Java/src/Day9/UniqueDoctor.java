package Day9;

import java.util.HashSet;
import java.util.Scanner;

class Doctor {
	String name;
	String department;
	int licenseNumber;

	Doctor(String name, String department, int licenseNumber) {
		this.name = name;
		this.department = department;
		this.licenseNumber = licenseNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Doctor))
			return false;
		Doctor doctor = (Doctor) obj;
		return licenseNumber == doctor.licenseNumber;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(licenseNumber);
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Department: " + department + ", License Number: " + licenseNumber;
	}
}

public class UniqueDoctor {
	public static void main(String[] args) {
		HashSet<Doctor> doctorSet = new HashSet<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Hospital Doctor Registration ---");
			System.out.println("1. Add New Doctor");
			System.out.println("2. Show All Registered Doctors");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Doctor Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Department: ");
				String department = sc.nextLine();

				System.out.print("Enter License Number (Integer): ");
				int licenseNumber = sc.nextInt();
				sc.nextLine();

				Doctor doctor = new Doctor(name, department, licenseNumber);

				if (doctorSet.add(doctor)) {

					System.out.println("Doctor registered successfully!");
				} else {

					System.out.println("Doctor already registered (Duplicate license number).");
				}
				break;

			case 2:
				System.out.println("\n--- Registered Doctors ---");
				if (doctorSet.isEmpty()) {
					System.out.println("No doctors registered yet.");
				} else {
					for (Doctor d : doctorSet) {
						System.out.println(d);
					}
				}
				break;

			case 3:
				System.out.println("Exiting system...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
