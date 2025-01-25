package multilevel_inheritance.online_retail_order_management;

// Base class
class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return the order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    // Display common order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

