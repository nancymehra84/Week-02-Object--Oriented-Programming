package single_inheritance.smart_home_devices;

//super class
class Device{
    //Attribute
    int deviceId;
    String status;

    //constructor
    Device(String status , int deviceId){
        this.deviceId=deviceId;
        this.status=status;
    }

    //Method
    public void displayStatus(){
        System.out.println("Device ID:"+deviceId+"\n"+"Device Status:"+status);
    }

}
