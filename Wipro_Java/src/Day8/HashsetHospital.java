package Day8;

import java.util.HashSet;
import java.util.Scanner;

public class HashsetHospital {
	public static void main(String[] args) {
		HashSet<String> registeredPatientIds = new HashSet<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Hospital Registration Menu ---");
			System.out.println("1. Register Patient");
			System.out.println("2. View Registered Patient IDs");
			System.out.println("3. Remove Patient by ID");
			System.out.println("4. Exit");
			System.out.print("Choose option: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				String id = sc.nextLine();

				if (registeredPatientIds.contains(id)) {
					System.out.println("Patient with this ID is already registered.");
				} else {
					registeredPatientIds.add(id);
					System.out.println("Patient registered successfully.");
				}
				break;

			case 2:
				if (registeredPatientIds.isEmpty()) {
					System.out.println("No patients registered yet.");
				} else {
					System.out.println("\nRegistered Patient IDs:");
					for (String pid : registeredPatientIds) {
						System.out.println("Patient ID: " + pid);
					}
				}
				break;

			case 3:
				System.out.print("Enter Patient ID to remove: ");
				String removeId = sc.nextLine();

				if (registeredPatientIds.remove(removeId)) {
					System.out.println("Patient ID " + removeId + " removed successfully.");
				} else {
					System.out.println("No such Patient ID found.");
				}
				break;

			case 4:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid option. Try again.");
				sc.close();
			}
		}
	}
}
