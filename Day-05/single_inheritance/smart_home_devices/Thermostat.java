package single_inheritance.smart_home_devices;

//Sub Class
class Thermostat extends Device{
    double temperatureSetting;

    Thermostat(String status,int deviceId,double temperatureSetting){
        super(status, deviceId);
        this.temperatureSetting=temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Settings :"+temperatureSetting);
    }
}

