package Tasks.Coding_Challenge.java_oops_Exception;
//Calculator Method Overloading
//Write a program to demonstrate method overloading by
// creating multiple "add" methods with different parameters.
public class Calculator_Method_Overloading {

    public static void main(String[] args) {
        Calculator_Method_Overloading cal = new Calculator_Method_Overloading();
        int s = cal.add(10, 12);
        int d = cal.add(1,3,4);
        double f = cal.add(2.23,3.45);
        System.out.println(s);
        System.out.println(d);
        System.out.println(f);
    }
    public int add (int a, int b){
        return a + b;
    }
    public int add (int a, int b, int c){
        return a + b + c;
    }
    public double add (double a, double b){
        return a + b;
    }
}
