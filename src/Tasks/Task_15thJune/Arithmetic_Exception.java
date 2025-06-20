package Tasks.Task_15thJune;
//Create a Program for Arithmetic Exception
//Description: Demonstrates catching ArithmeticException when division by zero occurs.

public class Arithmetic_Exception {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;


        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}