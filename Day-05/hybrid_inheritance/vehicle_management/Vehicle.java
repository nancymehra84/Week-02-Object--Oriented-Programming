package hybrid_inheritance.vehicle_management;

// Base class: Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Max Speed: " + maxSpeed + " km/h";
    }
}

