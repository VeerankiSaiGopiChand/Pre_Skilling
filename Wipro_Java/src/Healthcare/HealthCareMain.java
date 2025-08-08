package Healthcare;

public class HealthCareMain {
    public static void main(String[] args) {
        PatientService service = new PatientServiceImpl(2); 
        
        Patient patient1 = new Patient(11, "Luffy", 22, "Fever");
        Patient patient2 = new Patient(77, "Zoro", 21, "Cold");

        service.registerPatient(patient1);
        service.registerPatient(patient2);


        service.showPatients();
        
        Doctor doctor = new GeneralDoctor("Chopper", "General Physician");
        Doctor cardiologist = new Cardiologist ("Dr.Law ", "Cardiologist");
        
        doctor.diagnose(patient1);
        doctor.diagnose(patient2);
        System.out.println();
        cardiologist.diagnose(patient2);
        
    }
}
