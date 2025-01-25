package assisted_problem.vehicle_and_transport_system;

class Motorcycle extends Vehicle{
    int tyreNumber;
    Motorcycle(double maxSpeed, String fuelType,int tyreNumber){
        super(maxSpeed,fuelType);
        this.tyreNumber=tyreNumber;
    }
}
