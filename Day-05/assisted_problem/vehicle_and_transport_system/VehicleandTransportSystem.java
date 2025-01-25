package assisted_problem.vehicle_and_transport_system;

public class VehicleandTransportSystem {
    public static void main(String[] args){
        Truck truck=new Truck(50,"Diesel",5);
        Car car=new Car(70,"Petrol",4);
        Motorcycle motorcycle=new Motorcycle(70,"Petrol",2);

        System.out.println("Car Details:");
        car.displayInfo();
        System.out.println("Truck Details:");
        truck.displayInfo();
        System.out.println("Motorcycle Details:");
        motorcycle.displayInfo();
    }
}

