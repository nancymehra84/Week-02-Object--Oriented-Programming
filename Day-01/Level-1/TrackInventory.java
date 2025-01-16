//Creating Items Class
class Items{
        int ItemCode;
        String ItemName;
        int price;

       //Consructor
       Items(int ItemCode, String ItemName, int price){
        this.ItemCode=ItemCode;
        this.ItemName=ItemName;
        this.price=price;
       }
      
       //method to display details
       void displayDetails(){
        System.out.println("Code of Item:"+ItemCode);
        System.out.println("Name of Item:"+ItemName);
        System.out.println("Price of Item:"+price);        
       }

       //method to calculate total price
       public int CalculatePrice(int Quantity){
       return Quantity*price;
       }
}

// main class
       public class TrackInventory{
       public static void main(String[] args){

       //Display details of code
       Items item=new Items(2132, "Kinder Joy", 50);
       item.displayDetails();

       //Display total price for given Quantity
       int Quantity=4;
       int TotalCost=item.CalculatePrice(Quantity);
       System.out.println("The Total cost for " + Quantity +" is "+ TotalCost);
       } 
    
}