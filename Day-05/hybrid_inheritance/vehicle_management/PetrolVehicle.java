package hybrid_inheritance.vehicle_management;

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity; // Fuel capacity in liters

    public PetrolVehicle(int maxSpeed, String model, double fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling . Fuel capacity: " + fuelCapacity + " liters.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Fuel Capacity: " + fuelCapacity + " liters";
    }
}
