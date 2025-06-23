package Tasks.Coding_Challenge.java_oops_Exception;
//Vehicle Inheritance Hierarchy
//Create a Vehicle base class with start() method.
// Create Car and Bike subclasses that override the start() method.
public class Vehicle_Inheritance_Hierarchy {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        Vehicle bike = new Bike();
        bike.start();
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicle Start");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car drive");
    }
}

class Bike extends Vehicle {
    @Override
    void start(){
        System.out.println("Bike Ride");
    }
}

