package encapsulation_and_polyphorphism.ride_hailing_system;

// Interface GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String location);
}
