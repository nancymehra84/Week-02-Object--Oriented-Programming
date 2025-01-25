package assisted_problem.vehicle_and_transport_system;

class Truck extends Vehicle{
    double Average;

    Truck(double maxSpeed, String fuelType,double Average) {
        super(maxSpeed, fuelType);
        this.Average=Average;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Average :"+Average);
    }
}

