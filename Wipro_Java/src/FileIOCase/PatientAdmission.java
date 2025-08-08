package FileIOCase;

import java.io.*;
import java.util.Scanner;

class Patient45 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String disease;
	int age;

	public Patient45(int id, String name, String disease, int age) {
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.age = age;
	}

	public String toString() {
		return "\nID: " + id + "\nName: " + name + "\nDisease: " + disease + "\nAge: " + age;
	}
}

public class PatientAdmission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Patient Admission System ===");
		System.out.print("Enter Patient ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Patient Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Disease: ");
		String disease = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		Patient45 patient = new Patient45(id, name, disease, age);

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("patient.dat"));
			oos.writeObject(patient);
			oos.close();
			System.out.println("\nPatient information saved successfully.");
		} catch (IOException e) {
			System.out.println("Error saving patient information: " + e.getMessage());
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("patient.dat"));
			Patient45 savedPatient = (Patient45) ois.readObject();
			ois.close();

			System.out.println("\nRetrieved Patient Information:");
			System.out.println(savedPatient);
		} catch (Exception e) {
			System.out.println("Error reading patient information: " + e.getMessage());
		}

		sc.close();
	}
}
