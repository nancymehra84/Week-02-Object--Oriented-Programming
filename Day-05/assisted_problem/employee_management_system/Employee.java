package assisted_problem.employee_management_system;

//Base class
class Employee{
    //attribute
    String name;
    int id;
    double salary;

    //constructor
    Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    //method
    public void displayDetails(){
        System.out.println("Name of Employee:"+name +"\n"+"ID of Employee:"+id+"\n"+"Salary of Employee:"+salary);
    }
}
