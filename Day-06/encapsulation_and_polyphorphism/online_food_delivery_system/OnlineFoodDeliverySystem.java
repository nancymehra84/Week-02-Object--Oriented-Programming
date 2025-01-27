package encapsulation_and_polyphorphism.online_food_delivery_system;

// Main class
public class OnlineFoodDeliverySystem {

    public static void processOrder(FoodItem[] foodItems) {
        for (FoodItem item : foodItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(10); // Apply 10% discount
                System.out.println(discountable.getDiscountDetails());
                System.out.println("Price after Discount: " + item.calculateTotalPrice());
            }

        }
    }

    public static void main(String[] args) {
        // Create instances of food items
        FoodItem[] foodItems = new FoodItem[2];

        foodItems[0] = new VegItem("Veg Burger", 3, 2);
        foodItems[1] = new NonVegItem("Chicken Pizza", 2, 1);

        // Process order
        processOrder(foodItems);
    }
}