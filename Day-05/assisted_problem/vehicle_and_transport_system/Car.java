package assisted_problem.vehicle_and_transport_system;

//sub classes
class Car extends Vehicle{
    int seatCapacity;

    Car(double maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity:"+seatCapacity);
    }
}

