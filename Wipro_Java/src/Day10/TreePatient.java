package Day10;

import java.util.*;

class Patient {
	int id;
	String name;
	int time;

	public Patient(int id, String name, int time) {
		this.id = id;
		this.name = name;
		this.time = time;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Time: " + time;
	}
}

public class TreePatient {
	public static void main(String[] args) {
		TreeMap<Integer, Patient> appointments = new TreeMap<>(); // Key: Time, Value: Patient
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Patient Appointment Scheduler ---");
			System.out.println("1. Add Appointment");
			System.out.println("2. View All Appointments");
			System.out.println("3. Remove Appointment");
			System.out.println("4. Reschedule Appointment");
			System.out.println("5. View Next Appointment");
			System.out.println("6. View Last Appointment");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Patient Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Appointment Time (e.g., 1030): ");
				int time = scanner.nextInt();
				scanner.nextLine();

				if (appointments.containsKey(time)) {
					System.out.println("Time slot already booked.");
				} else {
					appointments.put(time, new Patient(id, name, time));
					System.out.println("Appointment added.");
				}
				break;

			case 2:
				System.out.println("\nScheduled Appointments (Sorted by Time):");
				for (Map.Entry<Integer, Patient> entry : appointments.entrySet()) {
					System.out.println("Time: " + entry.getKey() + " -> " + entry.getValue());
				}
				break;

			case 3:
				System.out.print("Enter appointment time to remove: ");
				int removeTime = scanner.nextInt();
				if (appointments.remove(removeTime) != null) {
					System.out.println("Appointment removed.");
				} else {
					System.out.println("No appointment found at that time.");
				}
				break;

			case 4:
				System.out.print("Enter current appointment time to reschedule: ");
				int oldTime = scanner.nextInt();
				if (appointments.containsKey(oldTime)) {
					Patient p = appointments.remove(oldTime);
					System.out.print("Enter new time: ");
					int newTime = scanner.nextInt();
					if (appointments.containsKey(newTime)) {
						System.out.println("Time slot already booked. Try another.");
						appointments.put(oldTime, p); 
					} else {
						p.time = newTime;
						appointments.put(newTime, p);
						System.out.println("Appointment rescheduled.");
					}
				} else {
					System.out.println("No appointment found at that time.");
				}
				break;

			case 5:
				if (!appointments.isEmpty()) {
					Patient next = appointments.firstEntry().getValue();
					System.out.println("Next Appointment → " + next);
				} else {
					System.out.println("No appointments scheduled.");
				}
				break;

			case 6:
				if (!appointments.isEmpty()) {
					Patient last = appointments.lastEntry().getValue();
					System.out.println("Last Appointment → " + last);
				} else {
					System.out.println("No appointments scheduled.");
				}
				break;

			case 7:
				System.out.println("Exiting...");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
