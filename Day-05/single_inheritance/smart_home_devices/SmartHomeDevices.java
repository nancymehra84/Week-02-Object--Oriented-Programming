package single_inheritance.smart_home_devices;

//Main Class
public class SmartHomeDevices {
    public static void main(String[] args){
        Thermostat thermostat=new Thermostat("On",324,12.2);
        System.out.println("Device current Status:");
        thermostat.displayStatus();

    }
}
