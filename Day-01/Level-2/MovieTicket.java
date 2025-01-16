public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Assigned"; // Default value
        this.price = 0.0;                 // Default value
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (seatNumber != null && !seatNumber.isEmpty() && price > 0) {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Invalid seat number or price. Ticket booking failed.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Harry Potter");

        ticket.displayTicketDetails(); // Display initial details
        ticket.bookTicket("A1", 150); // Book the ticket
        ticket.displayTicketDetails(); // Display updated details
    }
}
