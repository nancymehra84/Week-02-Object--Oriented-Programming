package encapsulation_and_polyphorphism.library_management_system;

// Main class
public class LibraryManagementSystem {

    public static void displayItemDetails(LibraryItem[] items) {
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Reserved"));
                reservable.reserveItem();
                System.out.println("Availability after reservation: " + (reservable.checkAvailability() ? "Available" : "Reserved"));
            }

        }
    }

    public static void main(String[] args) {
        // Create instances of library items
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("01", "Harry Potter", "Shazam");
        items[1] = new Magazine("02", "The Giant Tree", "Robert");
        items[2] = new DVD("03", "Vande Matram", "Rabindranath");

        // Display details of library items
        displayItemDetails(items);
    }
}