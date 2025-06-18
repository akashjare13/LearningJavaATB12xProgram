package Tasks.Task_9thJune;
// Car Class Constructor
//Define a Car class with brand, model, and price.
// Initialize using constructor and print car details.
public class Car {
    private String brand;
    private String model;
    private double price;
    Car(String brand, String model,double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void display() {
        System.out.println("Car Brand: "+brand);
        System.out.println("Car Model: "+model);
        System.out.println("Car Price: "+price);
    }
    public static void main(String[] args) {
        Car car = new Car("Maruti","Baleno",850000);
        car.display();
    }
}