package Day9;

import java.util.TreeSet;

public class AppointmentManager {
	public static void main(String[] args) {

		TreeSet<String> appointments = new TreeSet<>();

		appointments.add("2025-08-04 11:00 - Bob");
		appointments.add("2025-08-05 10:30 - Alice");
		appointments.add("2025-08-05 10:30 - Charlie");
		appointments.add("2025-08-06 09:00 - David");

		System.out.println("Scheduled Appointments (Chronological Order):");
		for (String a : appointments) {
			System.out.println(a);
		}

		System.out.println("\nFirst Appointment: " + appointments.first());
		System.out.println("Last Appointment: " + appointments.last());
	}
}
