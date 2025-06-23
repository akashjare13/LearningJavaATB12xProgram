package Tasks.Coding_Challenge.java_oops_Exception;
//Multiple Interface Implementation
//Create interfaces "Flyable" and "Swimmable" with appropriate methods.
// Implement both in a "Duck" class.
public class Multiple_Interface_Implementation {
    public static void main(String[] args) {
        Duck dk = new Duck();
        dk.fly();
        dk.swim();
    }
}

interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();

}
class Duck implements Flyable, Swimmable{
   @Override
    public void fly(){
       System.out.println("Duck Fly");
    }
    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
