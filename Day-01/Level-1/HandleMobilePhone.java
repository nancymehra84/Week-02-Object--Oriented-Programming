//Creating Class Phone
class MobilePhone{
   String Brand;
   String Model;
   int Price;

//Constructor
   MobilePhone(String Brand, String Model, int Price){
   this.Brand=Brand;
   this.Model=Model;
   this.Price=Price;
   }

//Method to Display Details
  void DisplayDetails(){
  System.out.println("The Brand of Mobile phone is:"+Brand);
  System.out.println("The Model of Mobile phone is:"+Model);
  System.out.println("The Price of Mobile phone is:"+Price);
  }
}

//main class
public class HandleMobilePhone{
  public static void main(String[] args){
  
  MobilePhone mobilePhone=new MobilePhone("Iphone", "12 Pro", 150000);

  //Display Details
  mobilePhone.DisplayDetails();
  }
}