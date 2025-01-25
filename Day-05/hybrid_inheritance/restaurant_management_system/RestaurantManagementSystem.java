package hybrid_inheritance.restaurant_management_system;

// Demonstration
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create a Chef
        Chef chef = new Chef("Arman", 101, "Italian ");
        System.out.println(chef);
        chef.performDuties();

        // Create a Waiter
        Waiter waiter = new Waiter("Rishika", 202, "Evening");
        System.out.println(waiter);
        waiter.performDuties();
    }
}

