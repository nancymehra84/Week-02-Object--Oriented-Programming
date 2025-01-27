package encapsulation_and_polyphorphism.ecommerce_platform;

// Main class
public class ECommercePlatform {

    public static void calculateAndPrintFinalPrice(Product[] products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double finalPrice = product.getPrice() + tax - discount;

            // Display details
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Base Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }

        }
    }

    public static void main(String[] args) {
        // Create instances of products
        Product[] products = new Product[3];

        products[0] = new Electronics(2, "Laptop", 1000);
        products[1] = new Clothing(2, "T-Shirt", 50);
        products[2] = new Groceries(3, "Apples", 30);

        // Calculate and print final price for all products
        calculateAndPrintFinalPrice(products);
    }
}

