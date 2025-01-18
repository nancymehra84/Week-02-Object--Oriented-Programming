class Book{
          //Attribute 
          private String Title;
          private String Author;
          private int Price;

          //Default Constructor
          Book(){
          Title="Harry Potter";
          Author="JK Rowlin";
          Price=1500;
          }

          //Parameterized Constructor
          Book(String Title, String Author, int Price){
          this.Title=Title;
          this.Author=Author;
          this.Price=Price;
          }
          //Getters and setters
          public String getTitle(){
          return Title;
          }

          public void setTitle(String Title){
          this.Title=Title;
          }

          public String getAuthor(){
          return Author;
          }

          public void setAuthor(String Author){
          this.Author=Author;
          }

          public int getPrice(){
          return Price;
          }

          public void setPrice(int Price){
          this.Price=Price;
          }


          //method to display details
          void displayDetails(){
          System.out.println("Title of book:"+Title);
          System.out.println("Author of Book:"+Author);
          System.out.println("Price of Book:"+Price);
          }
         
//main Method

public static void main(String[] args){
      Book book=new Book();
      book.displayDetails();

      Book book_one=new Book("Barbie","Rober M",200);
      book_one.displayDetails();
}
}