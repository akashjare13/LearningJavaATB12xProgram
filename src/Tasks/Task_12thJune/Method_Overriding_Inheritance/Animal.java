package Tasks.Task_12thJune.Method_Overriding_Inheritance;

public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Child)
class Dog extends Animal {
    // Method Overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
