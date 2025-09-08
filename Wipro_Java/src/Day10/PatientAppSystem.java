package Day10;

import java.util.*;

class PatientAppointment {
	private String patientName;
	private int patientId;
	private String appointmentTime;
	private String appointmentReason;

	public PatientAppointment(String patientName, int patientId, String appointmentTime, String appointmentReason) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentReason = appointmentReason;
		this.appointmentTime = appointmentTime;
	}

	@Override
	public String toString() {
		return "Patient ID: " + patientId + ", Patient Name: " + patientName + ", Appointment Reason: "
				+ appointmentReason + ", Time: " + appointmentTime;
	}
}

public class PatientAppSystem {
	public static void main(String[] args) {
		TreeMap<Integer, PatientAppointment> appointments = new TreeMap<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n---- Patient Appointment System ----");
			System.out.println("1. Add Appointment");
			System.out.println("2. View All Appointments");
			System.out.println("3. Remove an Appointment");
			System.out.println("4. Check the Next and Last Appointment");
			System.out.println("5. Reschedule an Appointment");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				int patientId = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Enter Patient Name: ");
				String patientName = scanner.nextLine();

				System.out.print("Enter Appointment Reason: ");
				String appointmentReason = scanner.nextLine();

				System.out.print("Enter Appointment Time (HH:MM:SS): ");
				String appointmentTime = scanner.nextLine();

				if (appointments.containsKey(patientId)) {
					System.out.println("Patient already exists.");
				} else {
					PatientAppointment newAppointment = new PatientAppointment(patientName, patientId, appointmentTime,
							appointmentReason);
					appointments.put(patientId, newAppointment);
					System.out.println("Appointment registered successfully.");
				}
				break;

			case 2:
				if (appointments.isEmpty()) {
					System.out.println("There are no appointments.");
				} else {
					for (Map.Entry<Integer, PatientAppointment> entry : appointments.entrySet()) {
						System.out.println(entry.getValue());
					}
				}
				break;

			case 3:
				System.out.print("Enter Patient ID to remove: ");
				int removeId = scanner.nextInt();
				appointments.remove(removeId);
				System.out.println("Appointment removed (if existed).");
				break;

			case 4:
				if (!appointments.isEmpty()) {
					System.out.println("Next Appointment ID: " + appointments.firstKey());
					System.out.println("Last Appointment ID: " + appointments.lastKey());
				} else {
					System.out.println("No appointments scheduled.");
				}
				break;

			case 5:
				System.out.print("Enter Patient ID to reschedule: ");
				int rescheduleId = scanner.nextInt();
				scanner.nextLine();

				if (appointments.containsKey(rescheduleId)) {
					System.out.print("Enter Updated Patient Name: ");
					String updatedName = scanner.nextLine();

					System.out.print("Enter Updated Appointment Reason: ");
					String updatedReason = scanner.nextLine();

					System.out.print("Enter Updated Appointment Time (HH:MM:SS): ");
					String updatedTime = scanner.nextLine();

					PatientAppointment updatedAppointment = new PatientAppointment(updatedName, rescheduleId,
							updatedTime, updatedReason);
					appointments.put(rescheduleId, updatedAppointment);
					System.out.println("Appointment updated successfully.");
				} else {
					System.out.println("Invalid Patient ID.");
				}
				break;

			case 6:
				System.out.println("Exiting...");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
