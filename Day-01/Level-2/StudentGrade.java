// Creating Class Student
class Student{
     private String name;
     private int rollNumber;
     private double marks;

     //Constructor
     Student(String name, int rollNumber, double marks){
     this.name=name;
     this.rollNumber=rollNumber;
     this.marks=marks;
     }

     //Method to Calculate grade
     public String CalculateGrade(){
     if(marks>90){
     return "A";
     }else if(marks>80){
     return "B";
     }else if(marks>70){
     return "C";
     }else if(marks>60){
     return "D";
     }else {
     return "Fail";
     }
    }
     
    //Method to display detail
    void DisplayDetail(){
    System.out.println("Name of Student:"+name);
    System.out.println("Roll Number of Student:"+rollNumber);
    System.out.println("Marks of Student:"+marks);
    }
}

public class StudentGrade{
    public static void main(String[] args){
    
    Student student= new Student("Nancy Mehra", 100, 87);
    student.DisplayDetail();

    String Grade=student.CalculateGrade();
    System.out.println("The Grade of the Student : "+Grade);
    }
}