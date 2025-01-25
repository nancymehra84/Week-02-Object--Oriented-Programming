package hierarchical_inheritance.school_system;

// Subclass: Student
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student, Grade: " + grade);
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}

