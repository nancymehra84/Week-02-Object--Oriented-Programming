package encapsulation_and_polyphorphism.ecommerce_platform;

// Clothing class
class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05;

    // Constructor
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 20% discount on clothing
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate for Clothing: 5%";
    }
}
