package Day3;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setSalary(50000);
        System.out.println("Employee Salary: ₹" + emp.getSalary());

        emp.setSalary(100000);
        System.out.println("Employee Salary: ₹" + emp.getSalary());
    }
}

