package Day3;

import java.util.Scanner;

class Employee7 {
    String name;
    int id;

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee7 {
    void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}

class Developer extends Employee7 {
    void writeCode() {
        System.out.println(name + " is writing code.");
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Manager Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Enter Manager ID: ");
        int managerId = scanner.nextInt();
        scanner.nextLine();

        Manager m = new Manager();
        m.name = managerName;
        m.id = managerId;
        m.work();
        m.conductMeeting();

        System.out.print("Enter Developer Name: ");
        String developerName = scanner.nextLine();
        System.out.print("Enter Developer ID: ");
        int developerId = scanner.nextInt();

        Developer d = new Developer();
        d.name = developerName;
        d.id = developerId;
        d.work();
        d.writeCode();

        scanner.close();
    }
}

