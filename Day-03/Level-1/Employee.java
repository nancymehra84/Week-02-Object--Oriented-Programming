public class Employee {
    // Static variable 
    static String companyName = "Capgemini";
    static int totalEmployees = 0;

    // Instance variables
    String name;
    String designation;
    final String id;

    // Constructor 
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; 
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
    System.out.println("Total number of employees: " + totalEmployees);
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        
    if (this instanceof Employee) {
    System.out.println("Company Name: " + companyName);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee ID: " + id);
    System.out.println("Employee Designation: " + designation);
    }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create objects
        Employee emp1 = new Employee("Nancy", "Cse", "Software Engineer");
        Employee emp2 = new Employee("Mehra", "AIML", "Software Developer");

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Display total employees using the static method
        Employee.displayTotalEmployees();
    }
}
