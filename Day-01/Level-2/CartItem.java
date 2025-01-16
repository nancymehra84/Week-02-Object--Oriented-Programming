public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for total cost
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to add items to the cart
    public void addItem(int quantityToAdd) {
        if (quantityToAdd > 0) {
            this.quantity += quantityToAdd;
            System.out.println(quantityToAdd + " items added to " + itemName + ". New quantity: " + this.quantity);
        } else {
            System.out.println("Quantity to add must be greater than zero.");
        }
    }

    // Method to remove items from the cart
    public void removeItem(int quantityToRemove) {
        if (quantityToRemove > 0 && quantityToRemove <= this.quantity) {
            this.quantity -= quantityToRemove;
            System.out.println(quantityToRemove + " items removed from " + itemName + ". Remaining quantity: " + this.quantity);
        } else if (quantityToRemove > this.quantity) {
            System.out.println("Cannot remove more than the available quantity.");
        } else {
            System.out.println("Quantity to remove must be greater than zero.");
        }
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + getTotalCost());
    }

    // Main method for testing
    public static void main(String[] args) {
        CartItem item = new CartItem("Seat Cover", 999, 2);

        item.displayItemDetails(); // Display initial item details

        item.addItem(3); // Add 3 more items to the cart
        item.displayItemDetails(); // Display updated item details

        item.removeItem(4); // Remove 4 items from the cart
        item.displayItemDetails(); // Display updated item details

        item.removeItem(5); // Attempt to remove more than available
    }
}
