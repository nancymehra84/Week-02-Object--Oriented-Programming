package encapsulation_and_polyphorphism.hospital_patient_management;

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private StringBuilder medicalRecords;

    // Constructor
    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
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
