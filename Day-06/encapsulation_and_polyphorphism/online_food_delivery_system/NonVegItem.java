package encapsulation_and_polyphorphism.online_food_delivery_system;

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double ADDITIONAL_CHARGE = 20.0;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + ADDITIONAL_CHARGE) * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "%";
    }
}
