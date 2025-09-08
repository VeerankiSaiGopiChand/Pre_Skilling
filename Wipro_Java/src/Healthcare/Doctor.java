package Healthcare;

public abstract class Doctor {
     String name;
     String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public abstract void diagnose(Patient patient);
}
