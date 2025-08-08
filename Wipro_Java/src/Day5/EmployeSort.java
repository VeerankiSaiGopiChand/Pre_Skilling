package Day5;

public class EmployeSort {
    String name;
    double salary;

    public EmployeSort(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

//    @Override
    public String toString() {
        return name + ": ₹" + salary;
    }
}
