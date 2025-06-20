// Superclass (Parent Class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child Class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test the inheritance
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Inherited method from Animal
        myDog.eat();

        // Method from Dog class
        myDog.bark();
    }
}
