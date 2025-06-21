package Tasks.Coding_Challenge;
//Operator Precedence and Type Casting
//Write a program that demonstrates operator precedence and type casting in Java.
//**Requirements:**
//- Show operator precedence with complex expressions
//- Demonstrate implicit and explicit type casting
//- Print results with explanations

public class Operator_Precedence_And_Casting {
    public static void main(String[] args) {
        // Operator precedence: 5 + 2*3 + 4*3 = 5 + 6 + 12 = 23
        int result = 5 + 2 * 3 + 4 * 3;
        System.out.println("Expression result: " + result); // 23

        // Implicit casting: int to double
        int intVal = 13;
        double implicitCast = intVal + 0.5; // 13 + 0.5 = 13.5
        System.out.println("Implicit casting: " + implicitCast); // 13.5

        // Explicit casting: double to int (decimal part is discarded)
        double doubleVal = 13.9;
        int explicitCast = (int) doubleVal; // Truncates to 13
        System.out.println("Explicit casting: " + explicitCast); // 13
    }
}