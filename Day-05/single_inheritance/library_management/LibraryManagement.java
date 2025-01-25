package single_inheritance.library_management;

//main class
public class LibraryManagement {
    public static void main(String[] args){
        Author author=new Author("Harry Potter",2003,"Robert","Great Author!");
        System.out.println("Book and Its Author details:");
        author.displayInfo();
    }
}

