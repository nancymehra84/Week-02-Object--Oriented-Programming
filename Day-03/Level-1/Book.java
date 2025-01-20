public class Book {
    // Static variable to store the library name
    static String libraryName = "Central City Library";

    // Static method to display the library name
    public static void displayLibraryName() {
    System.out.println("Library Name: " + libraryName);
    }

    // Instance variables
    String title;
    String author;
    final String isbn; 

    // Constructor 
    public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    }

    // Method to display book details (instance method)
    public void displayBookDetails() {
        
    if (this instanceof Book) {
    System.out.println("Library Name: " + libraryName);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + isbn);
    }
    }

    // Main method to test the class
    public static void main(String[] args) {
        
    Book book1 = new Book("Harry Potter", "Robert", "1234");
    Book book2 = new Book("1984", "George Orwell", "5678");

    // Display details of both books
    book1.displayBookDetails();
    book2.displayBookDetails();

    // Display library name using the static method
    Book.displayLibraryName();
    }
}
