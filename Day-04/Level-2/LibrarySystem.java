import java.util.ArrayList;
import java.util.Scanner;

//book class
class Book {
    private String title;
    private String author;

    //constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //method to display book details
    public void displayDetails() {
        System.out.println("Title:" + title + " Autor:" + author);
    }
}
class Library{
    private String name;
    private ArrayList<Book>books;

    //constructor
    public Library(String name){
        this.name=name;
        this.books=new ArrayList<>();
    }

    //method to add books in library
    public void addBook(Book book){
        books.add(book);
    }

    //method to display all books
    public void displayBooks(){
        System.out.println("Library:"+name);
        for(Book book: books){
            book.displayDetails();
        }
    }
}
public class LibrarySystem {
    public static void main(String[] args){
        Book book1=new Book("Harry Potter","Robert");
        Book book2=new Book("Honey Comb","Einstein");
        Book book3=new Book("World Travel","Javerb");

        //create libraries
        Library library1=new Library("Read Library");
        Library library2=new Library("Educate");

        //add books in library
        library1.addBook(book1);
        library2.addBook(book2);
        library1.addBook(book3);

        //display book in each library
        library1.displayBooks();
        library2.displayBooks();
    }
}
