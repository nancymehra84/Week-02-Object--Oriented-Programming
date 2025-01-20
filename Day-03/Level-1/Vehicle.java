public class Vehicle {
    
    static double registrationFee = 150.0;  

    // Static method 
    public static void updateRegistrationFee(double newFee) {
    registrationFee = newFee;
    System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    // Instance variables
    String ownerName;
    String vehicleType;
    final String registrationNumber; 

    // Constructor 
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayRegistrationDetails() {
    
    if (this instanceof Vehicle) {
    System.out.println("Vehicle Owner: " + ownerName);
    System.out.println("Vehicle Type: " + vehicleType);
    System.out.println("Registration Number: " + registrationNumber);
    System.out.println("Registration Fee: $" + registrationFee);
    }
    }

    // Main method 
    public static void main(String[] args) {
        
    Vehicle vehicle1 = new Vehicle("Nancy", "Car", "MP04");
    Vehicle vehicle2 = new Vehicle("Muskan", "Truck", "MP03");

    // Display vehicle registration details
    vehicle1.displayRegistrationDetails();
    vehicle2.displayRegistrationDetails();

    // Update the registration fee
    Vehicle.updateRegistrationFee(200.0);  

    // Display updated registration details
    vehicle1.displayRegistrationDetails();
    vehicle2.displayRegistrationDetails();
    }
}
