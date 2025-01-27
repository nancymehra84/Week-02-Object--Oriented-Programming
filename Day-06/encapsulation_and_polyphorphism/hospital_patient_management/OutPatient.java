package encapsulation_and_polyphorphism.hospital_patient_management;

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private StringBuilder medicalRecords;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return medicalRecords.toString();
    }
}
