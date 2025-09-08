package Healthcare;

public class GeneralDoctor extends Doctor {

    public GeneralDoctor(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void diagnose(Patient patient) {
        System.out.println("\nDoctor " + name + " (" + specialization + ") is diagnosing patient " + patient.getPatientName());
        System.out.println("Illness reported: " + patient.getIllness());
        System.out.println("Advice: Take proper rest and follow medication.");
    }
}
