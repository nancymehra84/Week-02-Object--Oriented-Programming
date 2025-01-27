package encapsulation_and_polyphorphism.ecommerce_platform;

// Groceries class
class Groceries extends Product {
    // Constructor
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 5% discount on groceries
        return getPrice() * 0.05;
    }
}

