package hybrid_inheritance.vehicle_management;

// Demonstration
public class VehicleManagement {
    public static void main(String[] args) {
        // Create an ElectricVehicle instance
        ElectricVehicle electricVehicle = new ElectricVehicle(150, "Ather", 75);
        System.out.println(electricVehicle);
        electricVehicle.charge();

        // Create a PetrolVehicle instance
        PetrolVehicle petrolVehicle = new PetrolVehicle(180, "Tata", 50);
        System.out.println(petrolVehicle);
        petrolVehicle.refuel();
    }
}
