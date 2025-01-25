package hybrid_inheritance.restaurant_management_system;

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties: Preparing " + specialty + " dishes.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialty: " + specialty;
    }
}

