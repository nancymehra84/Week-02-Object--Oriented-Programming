package single_inheritance.library_management;

//super class
class Book{
    //attribute
    String title;
    int publicationYear;

    //constructor
    Book(String title , int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    //method
    public void displayInfo(){
        System.out.println("Title of Book:"+title+"\n"+"Publication year:"+publicationYear);
    }

}

