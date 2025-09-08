package Day9;

import java.util.*;

class Patient {
	private int id;
	private String name;
	private int age;
	private String disease;

	public Patient(int id, String name, int age, String disease) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDisease() {
		return disease;
	}

	@Override
	public String toString() {
		return "Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
	}
}

public class HashmapPatients {
	public static void main(String[] args) {
		HashMap<Integer, Patient> patientMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Hospital Patient Management ---");
			System.out.println("1. Add Patient");
			System.out.println("2. Retrieve Patient by ID");
			System.out.println("3. Remove Patient by ID");
			System.out.println("4. View All Patients");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				int id = sc.nextInt();
				sc.nextLine(); 

				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Patient Age: ");
				int age = sc.nextInt();

				sc.nextLine(); 
				System.out.print("Enter Disease: ");
				String disease = sc.nextLine();

				Patient p = new Patient(id, name, age, disease);
				patientMap.put(id, p);
				System.out.println("Patient added successfully!");
				break;

			case 2:
				System.out.print("Enter Patient ID to retrieve: ");
				int searchId = sc.nextInt();
				Patient found = patientMap.get(searchId);
				if (found != null) {
					System.out.println("Found: " + found);
				} else {
					System.out.println("No patient found with ID: " + searchId);
				}
				break;

			case 3:
				System.out.print("Enter Patient ID to remove: ");
				int removeId = sc.nextInt();
				Patient removed = patientMap.remove(removeId);
				if (removed != null) {
					System.out.println("Patient removed: " + removed);
				} else {
					System.out.println("No patient found with ID: " + removeId);
				}
				break;

			case 4:
				System.out.println("\nAll Patients:");
				if (patientMap.isEmpty()) {
					System.out.println("No patients registered.");
				} else {
					for (Patient patient : patientMap.values()) {
						System.out.println(patient);
					}
				}
				break;

			case 5:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 5);

		sc.close();
	}
}
