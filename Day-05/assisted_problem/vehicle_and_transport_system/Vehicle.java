package assisted_problem.vehicle_and_transport_system;

class Vehicle{
    //attribute
    double maxSpeed;
    String fuelType;

    //constructor
    Vehicle(double maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    //method
    public void displayInfo(){
        System.out.println("Max Speed:"+maxSpeed +"\n"+"Fuel Type:"+fuelType);
    }
}

