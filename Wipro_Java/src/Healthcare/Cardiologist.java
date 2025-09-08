package Healthcare;

public class Cardiologist extends Doctor {
    public Cardiologist(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void diagnose(Patient patient) {
        System.out.println(name + " (" + specialization + ") is diagnosing " + patient.getPatientName());
        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Diagnosis: " + patient.getIllness() + " - Treated with specialized heart care.");
        } else {
            System.out.println("Diagnosis: Not a heart-related issue. Refer to another specialist.");
        }
    }
}
