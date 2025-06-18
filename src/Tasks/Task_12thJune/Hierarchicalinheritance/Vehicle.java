package Tasks.Task_12thJune.Hierarchicalinheritance;

//Hierarchical Inheritance Program
// Description: Create a base class Vehicle. Derive classes Car and Bike from it.
public class Vehicle {
    void start(){
        System.out.println("Engine Start");
    }

}
class Car extends Vehicle {
    void drive(){
        System.out.println("Car driving");
    }
}

class Bike extends Vehicle {
    void ride(){
        System.out.println("Bike riding");
    }

}
