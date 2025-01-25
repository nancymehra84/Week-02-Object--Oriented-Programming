package hierarchical_inheritance.school_system;

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher, Subject: " + subject);
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}


