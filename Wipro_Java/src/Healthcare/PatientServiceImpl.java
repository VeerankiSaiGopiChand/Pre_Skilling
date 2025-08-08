package Healthcare;

public class PatientServiceImpl implements PatientService {

    private Patient[] patients;
    private int count;

    public PatientServiceImpl(int size) {
        patients = new Patient[size];
        count = 0;
    }

    @Override
    public void registerPatient(Patient patient) {
        if (count < patients.length) {
            patients[count] = patient;
            count++;
            System.out.println("Patient registered: " + patient.getPatientName());
        } else {
            System.out.println("Patient list is full. Cannot register more.");
        }
    }

    @Override
    public void showPatients() {
        System.out.println("\nRegistered Patients:");
        for (int i = 0; i < count; i++) {
            Patient p = patients[i];
            System.out.println("-----------------------");
            System.out.println("ID: " + p.getPatientId());
            System.out.println("Name: " + p.getPatientName());
            System.out.println("Age: " + p.getPatientAge());
            System.out.println("Illness: " + p.getIllness());
        }
    }
}
