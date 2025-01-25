package hierarchical_inheritance.school_system;

// Base class: Person
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayRole() {
        System.out.println("This is a generic person.");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

