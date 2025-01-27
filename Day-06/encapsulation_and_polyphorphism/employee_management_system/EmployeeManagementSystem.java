package encapsulation_and_polyphorphism.employee_management_system;

// Main class to test the system
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        // FullTimeEmployee instance
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Nancy", 50000);
        fullTimeEmployee.assignDepartment("Developer");

        // PartTimeEmployee instance
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Muskaan", 0, 20, 25);
        partTimeEmployee.assignDepartment("Traniee");

        // Adding employees to the array
        employees[0] = fullTimeEmployee;
        employees[1] = partTimeEmployee;

        // Displaying employee details using polymorphism
        for (Employee employee : employees) {
            employee.displayDetails();
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }

        }
    }
}
