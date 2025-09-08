package Healthcare;

public class Patient {

    private int patientId;
    private String patientName;
    private int patientAge;
    private String illness;

    public Patient(int id, String name, int age, String illness) {
        this.patientId = id;
        this.patientName = name;
        this.patientAge = age;
        this.illness = illness;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public String getIllness() {
        return illness;
    }
}
