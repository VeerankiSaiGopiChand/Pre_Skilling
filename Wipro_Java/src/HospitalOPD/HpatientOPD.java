package HospitalOPD;

import java.util.ArrayList;
import java.util.Scanner;

class Patient1 {
	private String name;
	private int age;
	private String disease;

	public Patient1(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public void displayDetails() {
		System.out.println("Name:" + name + " \nAge :" + age + "\nDisease:" + disease);
	}
}

public class HpatientOPD {
	public static void main(String[] args) {

		ArrayList<Patient1> patientList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		patientList.add(new Patient1("Gopi Chand", 22, "fever"));
		patientList.add(new Patient1("Ram Charan", 30, "Cough"));
		patientList.add(new Patient1("Pavan Kalyan", 60, "Cold"));

		while (true) {

			System.out.println("\n Hospital OPD Menu :");
			System.out.println("1. Add New Patient:");
			System.out.println("2. Display All Patients");
			System.out.println("3. Search Patient by Name");
			System.out.println("4. Search Patient by Index");
			System.out.println("5. Update Patient disease");
			System.out.println("6. Remove Patient by Index");
			System.out.println("7. Remove Patient by Name");
			System.out.println("8. Count Total Patients");
			System.out.println("9. Clear All Records");
			System.out.println("10. Check if List is Empty");
			System.out.println("11. Exit");
			System.out.println("Enter your choice :");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter patient name :");
				String name = scanner.nextLine();

				System.out.println("Enter patient age:");
				int age = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Enter disease:");
				String disease = scanner.nextLine();

				patientList.add(new Patient1(name, age, disease));
				System.out.println("Patient added successfully !");
				break;

			case 2:
				System.out.println("All Registered Patients:");
				for (Patient1 p : patientList) {
					p.displayDetails();
				}
				break;

			case 3:
				System.out.println("Enter patient name to search:");
				String searchName = scanner.nextLine();
				boolean found = false;

				for (Patient1 p : patientList) {
					if (p.getName().equalsIgnoreCase(searchName)) {
						p.displayDetails();
						found = true;
					}
				}
				if (!found) {
					System.out.println("No patient found with name :" + searchName);
				}
				break;

			case 4:
				System.out.print("Enter index of patient to search: ");
				int index = scanner.nextInt();
				scanner.nextLine();
				if (index >= 0 && index < patientList.size()) {
					patientList.get(index).displayDetails();
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 5:
				System.out.print("Enter index to update disease: ");
				int updateIndex = scanner.nextInt();
				scanner.nextLine();
				if (updateIndex >= 0 && updateIndex < patientList.size()) {
					System.out.print("Enter new disease: ");
					String newDisease = scanner.nextLine();
					patientList.get(updateIndex).setDisease(newDisease);
					System.out.println("Disease updated.");
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 6:
				System.out.print("Enter index of patient to remove: ");
				int removeIndex = scanner.nextInt();
				scanner.nextLine();
				if (removeIndex >= 0 && removeIndex < patientList.size()) {
					patientList.remove(removeIndex);
					System.out.println("Patient removed successfully.");
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 7:
				System.out.print("Enter patient name to remove: ");
				String nameToRemove = scanner.nextLine();
				 boolean found2 = false;
				for (int i = 0; i < patientList.size(); i++) {
					if (patientList.get(i).getName().equalsIgnoreCase(nameToRemove)) {
						patientList.remove(i);
						System.out.println("Patient removed.");
						found2 = true;
						break;
					}
					 if (!found2) {
					        System.out.println("Patient not found.");
					    }
				}
				break;

			case 8:
				System.out.println("Total number of registered patients: " + patientList.size());
				break;

			case 9:
				patientList.clear();
				System.out.println("All records cleared.");
				break;

			case 10:
				System.out.println(patientList.isEmpty() ? "List is empty." : "List is not empty.");
				break; 

			case 11:
				System.out.println("Exiting...");
				scanner.close();
				return;

			}
		}
	}
}
