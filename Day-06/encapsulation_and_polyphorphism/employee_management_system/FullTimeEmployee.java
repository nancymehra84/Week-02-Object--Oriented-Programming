package encapsulation_and_polyphorphism.employee_management_system;

class FullTimeEmployee extends Employee implements Department {
    private String departmentName;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Assuming a fixed base salary for full-time employees
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

