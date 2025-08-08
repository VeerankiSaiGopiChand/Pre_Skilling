package Day8;

import java.util.LinkedList;
import java.util.Scanner;

class Patient4 {
	String id;
	String name;

	public Patient4(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "[ID: " + id + ", Name: " + name + "]";
	}
}

public class SmartHospitalQueue {
	public static void main(String[] args) {
		LinkedList<Patient4> patientQueue = new LinkedList<>();
		Scanner sc = new Scanner(System.in); 
		int choice;

		do {
			System.out.println("\nSmart Hospital Queue System");
			System.out.println("1. Add normal patient");
			System.out.println("2. Add emergency patient");
			System.out.println("3. Cancel patient (by ID)");
			System.out.println("4. View all patients");
			System.out.println("5. Check next patient");
			System.out.println("6. Check last patient");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter patient ID: ");
				String id1 = sc.nextLine();
				if (isDuplicateID(patientQueue, id1)) {
					System.out.println("Patient ID already exists.");
					break;
				}
				System.out.print("Enter patient name: ");
				String name1 = sc.nextLine();
				patientQueue.addLast(new Patient4(id1, name1));
				System.out.println("Patient added to queue.");
				break;

			case 2:
				System.out.print("Enter patient ID: ");
				String id2 = sc.nextLine();
				if (isDuplicateID(patientQueue, id2)) {
					System.out.println("Patient ID already exists.");
					break;
				}
				System.out.print("Enter patient name: ");
				String name2 = sc.nextLine();
				patientQueue.addFirst(new Patient4(id2, name2));
				System.out.println("Emergency patient added to FRONT.");
				break;

			case 3:
				System.out.print("Enter patient ID to cancel: ");
				String cancelID = sc.nextLine();
				boolean removed = false;

				for (int i = 0; i < patientQueue.size(); i++) {
					if (patientQueue.get(i).id.equals(cancelID)) {
						patientQueue.remove(i);
						removed = true;
						System.out.println("Patient " + cancelID + " removed.");
						break;
					}
				}

				if (!removed) {
					System.out.println("Patient not found.");
				}
				break;

			case 4:
				if (patientQueue.isEmpty()) {
					System.out.println("No patients in queue.");
				} else {
					System.out.println("Current Patients:");
					for (Patient4 p : patientQueue) {
						System.out.println(p);
					}
				}
				break;

			case 5:
				if (!patientQueue.isEmpty()) {
					System.out.println("Next patient: " + patientQueue.getFirst());
				} else {
					System.out.println("Queue is empty.");
				}
				break;

			case 6:
				if (!patientQueue.isEmpty()) {
					System.out.println("Last patient: " + patientQueue.getLast());
				} else {
					System.out.println("Queue is empty.");
				}
				break;

			case 7:
				System.out.println("Exiting... Stay healthy!");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 7);

		sc.close();
	}

	static boolean isDuplicateID(LinkedList<Patient4> queue, String id) {
		for (Patient4 p : queue) {
			if (p.id.equals(id)) {
				return true;
			}
		}
		return false;
	}
}
