package HospitalOPD;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String contact;

    public Patient(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Contact: " + contact);
    }
}

public class PatientApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("\n---- OPD Patient Management ----");
            System.out.println("1. Register Patient");
            System.out.println("2. List All Patients");
            System.out.println("3. Search Patient by Name");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // consume leftover newline
                    System.out.print("Enter contact: ");
                    String contact = sc.nextLine();

                    Patient p = new Patient(name, age, contact);
                    patients.add(p);
                    System.out.println("Patient registered.\n");
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients today.\n");
                    } else {
                        System.out.println("Patient List:");
                        for (Patient pat : patients) {
                            pat.displayDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    String search = sc.nextLine();
                    boolean match = false;
                    for (Patient pat : patients) {
                        if (pat.getName().equalsIgnoreCase(search)) {
                            System.out.println("Patient Found:");
                            pat.displayDetails();
                            match = true;
                            break;
                        }
                    }
                    if (!match) {
                        System.out.println("Not found: " + search + "\n");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

