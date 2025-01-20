public class Student {
    // Static variable 
    static String universityName = "TIT";

    // Static variable 
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;
    final String rollNumber; 

    // Constructor 
    public Student(String name, String rollNumber, String grade) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
    totalStudents++; 
    }

    // Static method 
    public static void displayTotalStudents() {
    System.out.println("Total students enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        
    if (this instanceof Student) {
    System.out.println("University Name: " + universityName);
    System.out.println("Student Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Grade: " + grade);
    }
    }

    public void updateGrade(String newGrade) {
     
        if (this instanceof Student) {
        this.grade = newGrade;
        System.out.println("Updated grade for " + name + ": " + newGrade);
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Nancy", "CS100", "A");
        Student student2 = new Student("Muskan", "CS99", "B");

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Display total number of students using the static method
        Student.displayTotalStudents();

        // Update grade for student1
        student1.updateGrade("A+");

        // Display updated details for student1
        student1.displayStudentDetails();
    }
}
