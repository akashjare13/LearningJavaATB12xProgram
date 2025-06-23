package Tasks.Coding_Challenge.java_oops_Exception;
//Animal Sound Polymorphism
//Create a class "Animal" and subclasses "Dog" and "Cat".
// Override a method to make each animal make a sound.
public class Animal_Sound_Polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.Sound();
        cat.Sound();
    }
}

class Animal {
    void Sound(){
        System.out.println("Animal make a Sound");
    }
}

class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    void Sound(){
        System.out.println("Cat Meow");
    }
}
