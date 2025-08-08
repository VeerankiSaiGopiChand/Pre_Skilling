package FileIOCase;

import java.io.*;
import java.util.*;

public class PatientManager {
	private static final String FILE_NAME = "patients.dat";

	// Patient class (Serializable)
	static class Patient implements Serializable {
		private static final long serialVersionUID = 1L;
		private String name, id, disease;
		private int age;

		public Patient(String name, String id, String disease, int age) {
			this.name = name;
			this.id = id;
			this.disease = disease;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Patient [ID=" + id + ", Name=" + name + ", Disease=" + disease + ", Age=" + age + "]";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Patient> patientList = loadPatientsFromFile();

		while (true) {
			System.out.println("\n--- Patient Records Menu ---");
			System.out.println("1. Add Patient");
			System.out.println("2. View All Patients");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				String id = sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Disease: ");
				String disease = sc.nextLine();
				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				sc.nextLine(); // consume newline

				Patient p = new Patient(name, id, disease, age);
				patientList.add(p);
				savePatientsToFile(patientList);
				System.out.println("✅ Patient added successfully!");
				break;

			case 2:
				System.out.println("\n--- All Patient Records ---");
				if (patientList.isEmpty()) {
					System.out.println("No patients found.");
				} else {
					for (Patient pat : patientList) {
						System.out.println(pat);
					}
				}
				break;

			case 3:
				System.out.println("👋 Exiting...");
				sc.close();
				return;

			default:
				System.out.println("❌ Invalid choice. Try again.");
			}
		}
	}

	// Serialize the patient list to file
	private static void savePatientsToFile(ArrayList<Patient> list) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("Error saving data: " + e.getMessage());
		}
	}

	// Deserialize the patient list from file
	@SuppressWarnings("unchecked")
	private static ArrayList<Patient> loadPatientsFromFile() {
		File file = new File(FILE_NAME);
		if (!file.exists())
			return new ArrayList<>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			return (ArrayList<Patient>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error loading data: " + e.getMessage());
			return new ArrayList<>();
		}
	}
}
