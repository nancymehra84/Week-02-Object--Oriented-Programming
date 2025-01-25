package single_inheritance.library_management;

//Sub Class
class Author extends Book{
    String name;
    String bio;

    Author(String title,int pulicationYear,String name,String bio){
        super(title,pulicationYear);
        this.name=name;
        this.bio=bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name of Author:"+name+"\n"+"Bio:"+bio);
    }
}

