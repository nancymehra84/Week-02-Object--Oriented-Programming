package assisted_problem.employee_management_system;

class Developer extends Employee{
    String programmingLanguage;

    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language:"+programmingLanguage);
    }
}
