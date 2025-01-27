package encapsulation_and_polyphorphism.hospital_patient_management;

// Main class
public class HospitalPatientManagement {

    public static void processPatients(Patient[] patients) {
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord recordable = (MedicalRecord) patient;
                recordable.addRecord("Initial check-up completed.");
                System.out.println("Medical Records: \n" + recordable.viewRecords());
            }

        }
    }

    public static void main(String[] args) {
        // Create instances of patients
        Patient[] patients = new Patient[2];

        patients[0] = new InPatient("P1", "Nancy Mehra", 21, 500, 5);
        patients[1] = new OutPatient("P2", "Muskan Gupta", 20, 200);

        // Process patients
        processPatients(patients);
    }
}
