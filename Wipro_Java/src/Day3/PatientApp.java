package Day3;

public class PatientApp {
    public static void main(String[] args) {
        Patient p = new Patient();

        p.setName("Gopi");
        p.setAge(22);
        p.setProblem("Fever");

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Problem: " + p.getProblem());
    }
}
