//Creating Book Class
class Book{
        String title;
        String author;
        int price;

       //Consructor
       Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
       }

       //method to display details
       void displayDetails(){
        System.out.println("Title of book:"+title);
        System.out.println("Author of Book:"+author);
        System.out.println("Price of Book:"+price);        
       }
}

// main class
       public class BookDetails{
       public static void main(String[] args){
       Book FamousBook=new Book("Harry Potter","JK Rowlin",2000);

       FamousBook.displayDetails();
       } 
    
}