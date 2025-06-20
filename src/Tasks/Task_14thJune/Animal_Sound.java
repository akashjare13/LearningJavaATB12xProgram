package Tasks.Task_14thJune;
//Animal Sound - Abstract Method Implementation
//Description: Create an abstract class Animal with an abstract method makeSound().
// Extend it in Dog and Cat.
//🔶 Expected Output:
// Dog barks
//Cat meows
public class Animal_Sound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();


    }
}

abstract class Animal{
    abstract void makeSound();

}

 class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }

}
 class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat Meows");
    }
}


