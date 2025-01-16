import java.util.Scanner;
//Creating circle class
class circle{
      double radius;
      
      //Constructor
      circle(double radius){
          this.radius=radius;
      }
     
     //Method to calculate area 
     public double calculateArea(){
     return Math.PI*radius*radius;
     }
     
     //Method to Calculate Circumference
     public double calculateCircumference(){
     return 2*Math.PI*radius;
     } 

     //Method to Display Details
     void DisplayDetails(){
     System.out.println("The area of the circle is:"+ calculateArea() );
     System.out.println("The circumference of the circle is:"+ calculateCircumference());
     }
}

//main class
public class CircleArea{
     public static void main(String[] args){
     Scanner sc=new Scanner(System.in);

     //Taking radius input
     Double radius=sc.nextDouble();

     //Creating object
     circle Circle=new circle(radius);
     
     Circle.DisplayDetails();

     sc.close();
     }
} 