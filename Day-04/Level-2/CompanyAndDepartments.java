import java.util.ArrayList;

class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

class Department {
    String name;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    // Method to display department details
    public void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getName());
        }
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Method to add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (departmentName.equals(department.name)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found!");
    }

    // Method to display company details
    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDetails();
        }
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Capgemini");

        // Add departments to the company
        company.addDepartment("Engineering");
        company.addDepartment("Commerce");
        company.addDepartment("MBA");

        // Add employees to departments
        company.addEmployeeToDepartment("Engineering", "Nancy");
        company.addEmployeeToDepartment("MBA", "Muskan");
        company.addEmployeeToDepartment("Commerce", "Shrishti");
        company.addEmployeeToDepartment("MBA", "Rishika");

        // Display company details
        company.displayCompanyDetails();

        // Simulate deleting the company
        System.out.println("\nDeleting the company...");
        // All departments and employees are inherently deleted (due to composition).
        company = null;
        System.out.println("Company, its departments, and employees are deleted.");
    }
}

