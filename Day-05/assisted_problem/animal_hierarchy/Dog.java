package assisted_problem.animal_hierarchy;

//sub classes
class Dog extends Animal{
    public Dog (String name,int age){
        super (name ,age);
    }

    //override method

    @Override
    public void makeSound() {
        System.out.println("Bhawwoo Bhawwoo!");
    }
}
