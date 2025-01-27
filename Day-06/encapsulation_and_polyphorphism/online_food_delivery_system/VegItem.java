package encapsulation_and_polyphorphism.online_food_delivery_system;

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount;

    // Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
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
