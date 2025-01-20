public class Patient {
    // Static variable 
    static String hospitalName = "City Health Hospital";

    // Static variable 
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;
    final String patientID; 

    // Constructor 
    public Patient(String name, int age, String ailment, String patientID) {
    this.name = name;
    this.age = age;
    this.ailment = ailment;
    this.patientID = patientID;
    totalPatients++;
    }

    // Static method to display total number of patients admitted
    public static void getTotalPatients() {
    System.out.println("Total number of patients admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
    
    if (this instanceof Patient) {
    System.out.println("Hospital Name: " + hospitalName);
    System.out.println("Patient Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Ailment: " + ailment);
    System.out.println("Patient ID: " + patientID);
    }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient("Nancy", 21, "Migrain", "ABC");
        Patient patient2 = new Patient("Mehra", 20, "Fever", "DEF");

        // Display patient details for both patients
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}
