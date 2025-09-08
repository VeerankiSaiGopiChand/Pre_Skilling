package Day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class AppointmentPatients {
	private String patientName;
	private int id;
	private String docName;
	// private LocalDateTime time;
	private String time;

	public AppointmentPatients(String patientName, int id, String docName, String time) {
		this.patientName = patientName;
		this.id = id;
		this.docName = docName;
		this.time = time;
	}

	public AppointmentPatients(int rescheduleId, String newPatient, String newDoctor) {
	}

	@Override
	public String toString() {
		return "[ID: " + id + ", Patient: " + patientName + ", Doctor: " + docName + ", time: " + time + "]";
	}
}

public class SortTimeappointment {

	public static void main(String[] args) {
		TreeMap<Integer, AppointmentPatients> appointments = new TreeMap<>();
		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("\n--- Hospital Appointment Scheduler ---");
			System.out.println("1. Add Appointment");
			System.out.println("2. View All Appointments");
			System.out.println("3. Remove Appointment");
			System.out.println("4. Reschedule Appointment");
			System.out.println("5. View Next and Last Appointment");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm");
			LocalDateTime currentTime = LocalDateTime.now();

			switch (choice) {
			case 1:
				System.out.print("Enter ID:  ");
				int id = sc.nextInt();
				sc.nextLine();
				if (appointments.containsKey(id)) {
					System.out.println("ID Already exits.");
					break;
				}
				System.out.print("Enter Patient Name: ");
				String patientname = sc.nextLine();
				System.out.print("Enter Doctor Name: ");
				String docname = sc.nextLine();

				String format = currentTime.format(formatter);
				appointments.put(id, new AppointmentPatients(patientname, id, docname, format));
				System.out.println("Appotnment Added.");
				break;

			case 2:
				if (appointments.isEmpty()) {
					System.out.println("No appointments scheduled.");
				} else {
					System.out.println("\nScheduled Appointments:");
					for (Map.Entry<Integer, AppointmentPatients> p : appointments.entrySet()) {
						System.out.println(p.getValue());
					}
				}
				break;
			case 3:
				System.out.print("Enter Appointment ID to remove: ");
				int removeId = sc.nextInt();
				if (appointments.remove(removeId) != null) {
					System.out.println("Appointment removed.");
				} else {
					System.out.println("Appointment not found.");
				}
				break;
			case 4:
				System.out.print("Enter Appointment ID to reschedule: ");
				int rescheduleId = sc.nextInt();
				sc.nextLine();
				if (!appointments.containsKey(rescheduleId)) {
					System.out.println("Appointment ID not found.");
					break;
				}
				System.out.print("Enter New Patient Name: ");
				String newPatient = sc.nextLine();
				System.out.print("Enter New Doctor Name: ");
				String newDoctor = sc.nextLine();
				String format2 = currentTime.format(formatter);
				appointments.put(rescheduleId, new AppointmentPatients(newPatient, rescheduleId, newDoctor, format2));
				System.out.println("Appointment rescheduled.");
				break;
			case 5:
				if (appointments.isEmpty()) {
					System.out.println("No appointments scheduled.");
				} else {
					System.out.println("Next Appointment: " + appointments.firstEntry().getValue());
					System.out.println("Last Appointment: " + appointments.lastEntry().getValue());
				}
				break;
			case 6:
				System.out.println("Exiting......");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 6);

		sc.close();
	}
}
