//Creating Employee Class
class Employee{
        String name;
        int id;
        int salary;

       //Consructor
       Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
       }

       //method to display details
       void displayDetails(){
        System.out.println("Name of Employee:"+name);
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Salary:"+salary);        
       }
}

// main class
       public class EmployeeDetails{
       public static void main(String[] args){
       Employee employee=new Employee("Nancy",8461,35000);

       employee.displayDetails();
       } 
    
}