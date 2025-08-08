import java.util.Scanner;

class Employee {
    String name;
    int id;
    String department;
    double salary;

    void setDetails(String n, int i, String d, double s) {
        name = n;
        id = i;
        department = d;
        salary = s;
    }

    void displayDetails() {
        System.out.println("------ Employee Details ------");
        System.out.println("ID        : " + id);
        System.out.println("Name      : " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary    : " + salary);
        System.out.println("------------------------------");
    }

    String getDepartment() {
        return department;
    }
}

public class Emplyclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        emp.setDetails(name, id, dept, salary);
        emp.displayDetails();

        System.out.println("Department: " + emp.getDepartment());
        
        scanner.close();
    }
}
