package encapsulation_and_polyphorphism.vehicle_rental_system;

// Bike class
class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05;
    private String insurancePolicyNumber;

    // Constructor
    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber + ", Rate: 5%";
    }
}
