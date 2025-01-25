package assisted_problem.animal_hierarchy;

//super class
class Animal{
    //Attribute
    String name;
    int age;

    //constructor
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    //method
    public void makeSound(){
        System.out.println("Animal makes sound!");
    }
}

