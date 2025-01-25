package assisted_problem.employee_management_system;

class Intern extends Employee{
    String InternCourse;

    Intern(String name,int id,double salary,String InternCourse){
        super(name, id, salary);
        this.InternCourse=InternCourse;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Intern Course");
    }
}

