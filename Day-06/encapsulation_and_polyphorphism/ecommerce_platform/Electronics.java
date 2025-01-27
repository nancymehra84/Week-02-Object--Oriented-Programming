package encapsulation_and_polyphorphism.ecommerce_platform;

// Electronics class
class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.15;

    // Constructor
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 10% discount on electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate for Electronics: 15%";
    }
}

