package hybrid_inheritance.restaurant_management_system;

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private String shift;

    public Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties: Serving customers during the " + shift + " shift.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Shift: " + shift;
    }
}

