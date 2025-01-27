package encapsulation_and_polyphorphism.ride_hailing_system;

// Main class
public class RideHailingApplication {

    public static void processRides(Vehicle[] vehicles, double[] distances) {
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            double distance = distances[i];

            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gpsEnabled = (GPS) vehicle;
                gpsEnabled.updateLocation("Updated Location for Ride " + (i + 1));
                System.out.println("Current Location: " + gpsEnabled.getCurrentLocation());
            }

        }
    }

    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("V1", "Nancy Mehra", 15.0);
        vehicles[1] = new Bike("V2", "Muskan Gupta", 8.0);
        vehicles[2] = new Auto("V3", "Rishika Bisht", 12.0);

        double[] distances = {10.5, 5.0, 7.2};

        // Process rides
        processRides(vehicles, distances);
    }
}
