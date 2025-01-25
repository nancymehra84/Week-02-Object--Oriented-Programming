package multilevel_inheritance.online_retail_order_management;

// Main class
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create an instance of Order
        Order order = new Order("O123", "20-11-24");
        System.out.println(order.getOrderStatus());
        order.displayOrderDetails();

        System.out.println("\n");

        ShippedOrder shippedOrder = new ShippedOrder("O124", "26-11-24", "T789");
        System.out.println(shippedOrder.getOrderStatus());
        shippedOrder.displayOrderDetails();

        System.out.println("\n");

        DeliveredOrder deliveredOrder = new DeliveredOrder("O125", "28-11-24", "T456", "2025-01-22");
        System.out.println(deliveredOrder.getOrderStatus());
        deliveredOrder.displayOrderDetails();
    }
}
