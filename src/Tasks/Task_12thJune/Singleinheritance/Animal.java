package Tasks.Task_12thJune.Singleinheritance;

// 1. Single Inheritance Program
// Description: Create a class Animal with a method sound().
// Inherit it in Dog class and override the method.
 public  class Animal {

    void sound(){
        System.out.println("Animal Make sound");
    }

}

class Dog  extends Animal{

     @Override
    void sound(){
        System.out.println("Dog is bark");
    }
}

