package Tasks.Task_12thJune.Method_Overriding_Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound();
        dog.makeSound();
    }
}
