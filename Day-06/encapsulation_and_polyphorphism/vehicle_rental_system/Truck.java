package encapsulation_and_polyphorphism.vehicle_rental_system;

// Truck class
class Truck extends Vehicle {
    // Constructor
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }
}
