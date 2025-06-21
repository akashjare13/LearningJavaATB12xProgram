package Tasks.Coding_Challenge;
//Comparison and Logical Operators
//Write a program that demonstrates comparison and logical operators.
//**Requirements:**
  //      - Use comparison operators (==, !=, <, >, <=, >=)
//- Use logical operators (&&, ||, !)
//- Print boolean results with explanatory messages
public class Comparison_Logical {
    public static void main(String[] args) {


        int a = 10;
        int b = 5;

        System.out.println("Comparison Opeartor");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("Logical Operator");
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0): "+ ((a < b) || (a > 0)));
        System.out.println("!(a > b): "+ (!(a > b)));


    }
}
