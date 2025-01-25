package assisted_problem.animal_hierarchy;

public class AnimalHierarchy {
    public static void main(String[] args){
        Dog dog=new Dog("Bruno", 5);
        Cat cat=new Cat("Rinny", 4);
        Bird bird = new Bird("Charlie",7);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
