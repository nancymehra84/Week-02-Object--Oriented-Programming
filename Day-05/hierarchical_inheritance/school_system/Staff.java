package hierarchical_inheritance.school_system;

// Subclass: Staff
class Staff extends Person {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff, Position: " + position);
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: " + position;
    }
}
