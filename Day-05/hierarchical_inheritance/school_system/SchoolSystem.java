package hierarchical_inheritance.school_system;

// Demonstration
public class SchoolSystem {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = new Teacher("Muskan", 40, "Mathematics");
        teacher.displayRole();
        System.out.println(teacher);

        // Create a Student
        Student student = new Student("Nancy Mehra", 21, "12th Grade");
        student.displayRole();
        System.out.println(student);

        // Create a Staff
        Staff staff = new Staff("Reena", 35, "Priciple");
        staff.displayRole();
        System.out.println(staff);
    }
}
