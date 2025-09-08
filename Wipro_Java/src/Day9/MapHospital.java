package Day9;

import java.util.HashMap;
import java.util.Objects;

class PatientY {
    int id;
    String name;
    int age;
    String disease;

    public PatientY(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PatientY)) return false;
        PatientY p = (PatientY) obj;
        return this.id == p.id && this.name.equals(p.name) && this.age == p.age && this.disease.equals(p.disease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, disease);
    }

} 

public class MapHospital {

    public static void main(String[] args) {
        HashMap<Integer, PatientY> patientMap = new HashMap<>();

        
        patientMap.put(101, new PatientY(101, "Gopi", 22, "Fever"));
        patientMap.put(102, new PatientY(102, "Goku", 34, "Cold"));
        patientMap.put(103, new PatientY(103, "Gojo", 33, "Aura"));
        patientMap.put(104, new PatientY(104, "Zoro", 24, "Fracture"));

        
        System.out.println("\nGet Patient by ID:");
        System.out.println("Retrieved: " + patientMap.get(102));

        
        int searchId = 105;
        System.out.println("\nCheck if key exists:");
        System.out.println("Contains ID 105? " + patientMap.containsKey(searchId));

        
        PatientY checkPatient = new PatientY(103, "Gojo", 33, "Aura");
        System.out.println("Contains Gojo as value? " + patientMap.containsValue(checkPatient));

        
        System.out.println("\nRemove Patient by ID:");
        PatientY removed = patientMap.remove(101);
        System.out.println("Removed: " + removed);

        
        System.out.println("\nAll Values:");
        for (PatientY p : patientMap.values()) {
            System.out.println(p);
        }

        
        System.out.println("\nSize of patientMap: " + patientMap.size());

        
        System.out.println("Is patientMap empty? " + patientMap.isEmpty());

        
        System.out.println("\nReplacing entry for key 104");
        patientMap.replace(104, new PatientY(104, "Zoro", 25, "Recovery"));
        System.out.println("Updated: " + patientMap.get(104));

        
        System.out.println("\nClearing all entries...");
        patientMap.clear();
        System.out.println("Is map empty after clear? " + patientMap.isEmpty());
    }
}
