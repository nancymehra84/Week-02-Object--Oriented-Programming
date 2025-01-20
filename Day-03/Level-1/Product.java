public class Product {
    // Static variable 
    static double discount = 20.0; 

    // Static method 
    public static void updateDiscount(double newDiscount) {
    discount = newDiscount;
    System.out.println("Updated discount: " + discount + "%");
    }

    // Instance variables
    String productName;
    double price;
    int quantity;
    final String productID; 

    // Constructor 
    public Product(String productName, double price, int quantity, String productID) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    this.productID = productID;
    }

    // Method to display product 
    public void displayProductDetails() {
    if (this instanceof Product) {
    System.out.println("Product Name: " + productName);
    System.out.println("Product ID: " + productID);
    System.out.println("Price: $" + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Discount: " + discount + "%");
    System.out.println("Total Price after Discount: $" + calculateTotalPrice());
    }
    }

    public double calculateTotalPrice() {
    return price * quantity * (1 - discount / 100);
    }

    // Main method to test the class
    public static void main(String[] args) {
    // Create objects
    Product product1 = new Product("Laptop", 9999.99, 1, "ABC");
    Product product2 = new Product("Phone", 499.99, 2, "DEF");

    // Display product details for both products
    product1.displayProductDetails();
    product2.displayProductDetails();

    // Update the discount
    Product.updateDiscount(15.0); 

    // Display product details again after the discount update
    product1.displayProductDetails();
    product2.displayProductDetails();
    }
}
