package encapsulation_and_polyphorphism.vehicle_rental_system;

// Main class to test the system
public class VehicleRentalSystem {

    public static void calculateAndPrintCosts(Vehicle[] vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
            }

            double totalCost = rentalCost + insuranceCost;

            // Display details
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + totalCost);

            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }

        }
    }

    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("MPO4", "Car", 100, "CAR123");
        vehicles[1] = new Bike("UKO7", "Bike", 50, "BIKE456");
        vehicles[2] = new Truck("UP09", "Truck", 200);

        calculateAndPrintCosts(vehicles, 4);
    }
}
