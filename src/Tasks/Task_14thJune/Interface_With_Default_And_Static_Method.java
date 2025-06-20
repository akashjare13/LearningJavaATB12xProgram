package Tasks.Task_14thJune;

// Interface with Default and Static Method
//🔶 Objective:
//Learn how to use default and static methods in interfaces (since Java 8).
//🔶 Steps:
//Create an interface Vehicle.
//Add a default method start() that prints "Vehicle started".
//Add a static method fuelType() that prints "Fuel type is Petrol".
//Create a class Car that implements Vehicle.
//In main(), create a Car object and call start().
//Call Vehicle.fuelType() without creating an object.
//🔶 Expected Output:
//Vehicle started
//Fuel type is Petrol
public class Interface_With_Default_And_Static_Method {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Vehicle.FuelType();
    }
}

interface Vehicle{
    default void start(){
        System.out.println("Vehicle Started");
    }
    static void FuelType(){
        System.out.println("Fuel type is petrol");
    }
}

class Car implements Vehicle{

}
