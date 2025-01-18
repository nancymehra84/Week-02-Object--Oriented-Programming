class Circle{
          //Attribute
          private double radius;

          //Default Constructor
          Circle(){
          radius=30.5;
          }

          //Parameterized Constructor
          Circle(int radius){
          this.radius=radius;
          }
          //Getters and setter

          public double getRadius(){
          return radius;
          }

          public void setRadius(double Radius){
          this.radius=radius;
          }


          //method to display details
          void displayDetails(){
          System.out.println("The radius of a circle:"+radius);
          }
         
//main Method

public static void main(String[] args){
      Circle circle=new Circle();
      circle.displayDetails();

      Circle BigCircle=new Circle(50);
      BigCircle.displayDetails();
}
}