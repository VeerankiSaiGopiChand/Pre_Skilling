package Day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.TreeSet;

class Appointment implements Comparable<Appointment> {
	private String patientName;
	private LocalDateTime dateTime;

	public Appointment(String patientName, LocalDateTime dateTime) {
		this.patientName = patientName;
		this.dateTime = dateTime;
	}

	public String getPatientName() {
		return patientName;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	@Override
	public int compareTo(Appointment other) {
		return this.dateTime.compareTo(other.dateTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Appointment))
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(dateTime, other.dateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateTime);
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		return "Appointment: " + patientName + " at " + dateTime.format(formatter);
	}
}

public class ScheduledAppointments {
	public static void main(String[] args) {
		TreeSet<Appointment> appointments = new TreeSet<>();

		appointments.add(new Appointment("Alice", LocalDateTime.of(2025, 8, 5, 10, 30)));
		appointments.add(new Appointment("Bob", LocalDateTime.of(2025, 8, 4, 11, 0)));
		appointments.add(new Appointment("Charlie", LocalDateTime.of(2025, 8, 5, 10, 30)));
		appointments.add(new Appointment("David", LocalDateTime.of(2025, 8, 6, 9, 0)));

		System.out.println("Scheduled Appointments (Chronological Order):");
		for (Appointment appointment : appointments) {
			System.out.println(appointment);
		}
	}
}
