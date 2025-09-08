package Day5;

public class EmployeeSorter {
    public static void main(String[] args) {
        EmployeSort[] employees = {
            new EmployeSort("Aman", 50000),
            new EmployeSort("Bhanu", 60000),
            new EmployeSort("Charan", 45000),
            new EmployeSort("Dinesh", 55000)
        };

        
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].salary > employees[j + 1].salary) {
                    
                    EmployeSort temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        System.out.println("Employees sorted by salary (ascending):");
        for (EmployeSort e : employees) {
            System.out.println(e);
        }
    }
}
