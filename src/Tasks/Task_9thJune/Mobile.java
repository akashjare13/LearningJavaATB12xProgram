package Tasks.Task_9thJune;

//Mobile Class with Constructor Overloading
//➤ Create a class Mobile
//Use constructor overloading:
//First constructor → takes only brand
//Second constructor → takes brand and price
public class Mobile {
    private String brand;
    private double price;
    Mobile(String brand) {
        this.brand=brand;
        this.price=0.0;
    }
    Mobile(String brand, double price) {
        this.brand=brand;
        this.price=price;
    }

    public void displayMobile() {
        System.out.println("Mobile Brand: "+brand);
        if(price > 0) {
            System.out.print("Mobile Price: Rs "+price);
        } else {
            System.out.println("Price: Not Specified");
        }
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Apple",55000);
        m1.displayMobile();
        m2.displayMobile();
    }
}
