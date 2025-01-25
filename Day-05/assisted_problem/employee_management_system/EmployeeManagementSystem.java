package assisted_problem.employee_management_system;

public class EmployeeManagementSystem {
    public static void main(String[] args){
        Manager manager=new Manager("Nancy Mehra",0102, 150000,7);
        Developer developer=new Developer("Muskan Gupta",0121,145000, "Java Language");
        Intern intern=new Intern("Rishika Bisht",2345,76000,"Java Full stack");

        System.out.println("Manager Details :");
        manager.displayDetails();
        System.out.println("Developer Details:");
        developer.displayDetails();
        System.out.println("Intern Details:");
        intern.displayDetails();

    }
}

