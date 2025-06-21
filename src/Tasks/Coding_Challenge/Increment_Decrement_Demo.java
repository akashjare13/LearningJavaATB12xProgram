package Tasks.Coding_Challenge;

//Increment and Decrement Operators
// Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
//**Requirements:**
//- Show the difference between ++i and i++
//- Show the difference between --i and i--
//- Print values before and after operations

public class Increment_Decrement_Demo {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Original: " + i + " ");

        System.out.println("Pre-increment: " + (++i) + " ");
        System.out.println("Post-increment: " + (i++) + " (returned " + i + ") ");

        System.out.println("Pre-decrement: " + (--i) + " ");

        System.out.println("Post-decrement: " + (i--) + " (returned " + i + ")");
    }
}
