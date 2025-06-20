package Tasks.Task_15thJune;
//Autoboxing and Unboxing
//Description: Demonstrates automatic conversion between primitives and
// their wrapper classes.
public class Autoboxing_and_Unboxing {
    public static void main(String[] args) {
        //AutoBoxing means Primitive to Wrapper class
        int a = 20;
        Integer b = a;

        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + a);
        System.out.println("Wrapped Integer: " + b);

        // Unboxing: wrapper to primitive
        Integer c = Integer.valueOf(10);
        int d = c;  // Java automatically unboxes Integer to int

        System.out.println("Unboxing:");
        System.out.println("Wrapped Integer: " + c);
        System.out.println("Primitive int: " + d);
    }
}
